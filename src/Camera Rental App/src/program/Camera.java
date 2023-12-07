package program;

public class Camera { 
	 
	  	private int id;  
	  	private String brand;  
	  	private String model;  
	  	private double price;  
	  	private boolean available;  
	  	public Camera(int id, String brand, String model, double price, boolean available) {  
	  		this.id = id;  
	  		this.brand = brand;  
	  		this.model = model;  
	  		this.price = price;  
	  		this.available = available;  
	  }  
	  // Getters and setters  
	  	public int getId() {  
	  		return id;  
	  }  
	  	public String getBrand() {  
	  		return brand;  
	  }  
	  	public String getModel() {  
	  		return model;  
	  }  
	  	public double getPrice() {  
	  		return price;  
	  }  
	  	public boolean isAvailable() {  
	  		return available;  
	}  
	  	public void setAvailable(boolean available) {  
	  		this.available = available;  
	}  
	} 
