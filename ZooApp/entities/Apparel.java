package entities;

public class Apparel {
	
   private String name; 
   private String id;
   private int price; 
   
   public String getName() {
      return name; 
   } 
   public String getId() { 
      return id; 
   } 
   public int getPrice() { 
      return price; 
   } 
   
   public Apparel(String name, String id, int price){ 
		this.name = name;
		this.id = id;
		this.price = price; 
    } 
	
   @Override 
   public String toString() {     
      return ("Shirt size: " + this.getName() + "\n" +             
              "Size ID: " + this.getId() +  "\n" +                   
              "Price: " + this.getPrice() + "\n"); 
   }
}