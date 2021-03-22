package service;

import java.util.function.Predicate;
import java.util.function.*;
import java.util.*;
import entities.Yakuza;
import app.GameApp;

public class GameService{
	
	GameApp gameApp = new GameApp();
	
	public void menu(){
		
		Scanner input = new Scanner(System.in);		
        int choice; 
		boolean exit = false;
		
		do{
			System.out.print("\n---------------- Game Options ----------------\n");
			System.out.print("1. Game\n");
			System.out.print("2. Yakuza Info\n");
			System.out.print("3. Kills per round\n");
			System.out.print("4. Exit\n");
			System.out.print("\nJust pick something: ");
			choice = input.nextInt();
			
			switch(choice){
				case 1 : gameOne();				
				break;
				
				case 2 : yakuzaInfo();
				break;
				
				case 3 : kills();
				break;
				
				case 4 : System.exit(0);
				break;
				
				default : System.out.print("\nUser error: non-existing choice\n");
				break;			
			}			
		}while (!exit);
		
	}
	
	

	public void yakuzaInfo() {
		
		Scanner input = new Scanner(System.in);
		int filter;
		boolean exit = false;
		
		do{
			System.out.print("\n---------------- Quick Search ----------------\n");
			System.out.print("1. Display all Yakuza versions\n");
			System.out.print("2. Release year\n");
			System.out.print("3. Console\n");
			System.out.print("4. Computer\n");
			System.out.print("5. Back to menu\n");						
			System.out.print("Search: ");
			filter = input.nextInt();
			
			
			List <Yakuza> yakuzalist = new ArrayList<Yakuza>();
			yakuzalist.add(new Yakuza("Yakuza", 2006, "PS2 || PS3 || Wii U", "N/A")); 
			yakuzalist.add(new Yakuza("Yakuza 2", 2008, "PS2 || PS3 || Wii U", "N/A"));
			yakuzalist.add(new Yakuza("Yakuza 3", 2010, "PS3 || PS4 || Xbox One", "Microsoft Windows"));
			yakuzalist.add(new Yakuza("Yakuza 4", 2011, "PS3 || PS4 || Xbox One", "Microsoft Windows"));
			yakuzalist.add(new Yakuza("Yakuza: Dead Souls", 2012, "PS3", "N/A"));
			yakuzalist.add(new Yakuza("Yakuza 5", 2015, "PS3 || PS4 || Xbox One", "Microsoft Windows"));
			yakuzalist.add(new Yakuza("Yakuza 0", 2017, "PS3 || PS4 || Xbox One", "Microsoft Windows"));
			yakuzalist.add(new Yakuza("Yakuza Kiwami", 2017, "PS3 || PS4 || Xbox One", "Microsoft Windows"));
			yakuzalist.add(new Yakuza("Yakuza 6: The Song of Life", 2018, "PS4 || Xbox One", "Microsoft Windows"));
			yakuzalist.add(new Yakuza("Yakuza Kiwami 2", 2018, "PS4 || Xbox One", "Microsoft Windows"));
			yakuzalist.add(new Yakuza("Yakuza: Like a Dragon", 2020, "PS4 || PS5 || Xbox One || Xbox Series X/S", "Microsoft Windows"));
			
			switch(filter){
				
				case 1 : System.out.print("\nAll Yakuza game versions:\n"); 
				Consumer <Yakuza> allVersions = (s) -> System.out.print((s) + "\n");
				yakuzalist.forEach(allVersions);
				break;
				
				case 2 : System.out.print("\nRelease year:\n");
				Consumer <Yakuza> years = (s) -> System.out.print((s).getTitle() + ": " + (s).getYear() + "\n");
				yakuzalist.forEach(years); 
				break;
				
				case 3 : System.out.print("\nConsole:\n");
				Consumer <Yakuza> allConsoles = (s) -> System.out.print((s).getTitle() + ": " + (s).getConsole() + "\n");
				yakuzalist.forEach(allConsoles);
				break;
				
				case 4 : System.out.print("\nComputer:\n");
				Consumer <Yakuza> allComputers = (s) -> System.out.print((s).getTitle() + ": " + (s).getComputer() + "\n");
				yakuzalist.forEach(allComputers);
				break;
				
				case 5 :menu();
				break;
				
				default : System.out.print("\nUser error: non-existing choice\n");
				break;
			}
		}while (!exit);
		
	}
	
	public void kills(){
		
		final int killCount;
		int addCount;
		killCount = 10;
		Scanner input = new Scanner(System.in);	
		System.out.print("Add your kills per round from minimum(1) - maximum(10) : ");
		addCount = input.nextInt();
		
		if (addCount >= 11){
			System.out.print("Don't be that person. Max kills per round = " + killCount + "\n");
		}else if (addCount == 0){
			System.out.print("Try again. Come on, kill something."); 
		}else {
			System.out.print("Kills: " + addCount + "\n");
			System.out.print("G o o d   J o b!\n");
		}		
	}
	
	public void gameOne(){
		
		String original, reverse = ""; 
		Scanner input = new Scanner(System.in);   
		System.out.println("Enter a word or set of numbers");  
		original = input.nextLine();   
		int length = original.length();   
		  
		for ( int i = length - 1; i >= 0; i-- )  
		reverse = reverse + original.charAt(i);  
		  
		if (original.equals(reverse)){
			System.out.println(reverse);
			System.out.println("This is a palindrome.");  
		}else{  
			System.out.println(reverse);
			System.out.println("This isn't a palindrome. A palindrome is a word, phrase, number or sequence of words that reads the same backward as forward");   
		}
	}
	
}

