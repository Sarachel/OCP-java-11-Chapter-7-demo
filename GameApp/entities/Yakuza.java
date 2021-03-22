package entities;

public class Yakuza{
	
   private String title; 
   private int year;
   private String console;
   private String computer; 
   
   public String getTitle() {
      return title; 
   } 
   public int getYear() { 
      return year; 
   }
   public String getConsole() { 
      return console; 
   } 
   public String getComputer() { 
      return computer; 
   } 
    
   
   public Yakuza(String title, int year, String console, String computer){ 
		this.title = title;
		this.year = year;
		this.console = console;
		this.computer = computer; 
    } 
	
   @Override 
   public String toString() {     
      return ("Game Title: " + this.getTitle() + "\n" +             
              "Release: " + this.getYear() +  "\n" +                   
              "Available console: " + this.getConsole() + "\n" +
			  "Available computer: " + this.getComputer() +  "\n"); 
   }
}