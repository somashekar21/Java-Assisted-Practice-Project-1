package rail;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RailCrossing")
public class RailCrossing extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String dbUrl = "jdbc:mysql://localhost:3306/railway";
	private String dbUsername = "root";
	private String dbPassword = "shekar@123";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("Name");
		String address = request.getParameter("Address");
		String landmark = request.getParameter("Landmark");
		String trainSchedule = request.getParameter("Trainschedule");
		String personInCharge = request.getParameter("pname");
		String status = request.getParameter("status");
		RailCross railCrossing = new RailCross(name, address, landmark, trainSchedule, personInCharge, status);
		String result = insertRailCrossing(railCrossing);
		response.getWriter().print(result);
	}

	private String insertRailCrossing(RailCross railCrossing) {
		try {
			Class.forName(dbDriver);
			Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			String sql = "INSERT INTO adminhome (Name, Address, Landmark, Trainschedule, pname, status) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, railCrossing.getName());
			statement.setString(2, railCrossing.getAddress());
			statement.setString(3, railCrossing.getLandmark());
			statement.setString(4, railCrossing.getTrainSchedule());
			statement.setString(5, railCrossing.getPersonInCharge());
			statement.setString(6, railCrossing.getStatus());

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				return "Data inserted successfully";
			}

			else {
				return "Failed to insert data";
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return "Error: " + e.getMessage();
		}
	}
}
