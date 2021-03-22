package service;

import java.util.function.Predicate;
import java.util.function.*;
import java.util.*;
import entities.Apparel;
import app.ZooApp;

public class ZooService{
	
	ZooApp zooApp = new ZooApp();
	
	public void mainMenu(){
			
		Scanner firstInput = new Scanner(System.in);		
        int choice; 
		boolean exit = false;
		
		do{
			System.out.print("---------------- Main Menu ----------------\n");
			System.out.print("1. Animals\n");
			System.out.print("2. Store\n");
			System.out.print("3. Exit\n");
			System.out.print("\nMake a decision: ");
			choice = firstInput.nextInt();
			
			switch(choice){
				case 1 : zooMenu();				
				break;
				
				case 2 : shopMenu();
				break;
				
				case 3 : System.exit(0);
				break;
				
				default : System.out.print("\nUser error: non-existing choice\n");
				break;			
			}			
		}while (!exit);
		
	}
	
	public void zooMenu(){
		Scanner secondInput = new Scanner(System.in);
		int menu;
		boolean exit = false;
		
		
		do{
			System.out.print("\n---------------- Animal Menu ----------------\n");
			System.out.print("1. Animal list\n");
			System.out.print("2. Animal Information\n");
			System.out.print("3. Remove from list\n");
			System.out.print("4. Back to main Menu\n");						
			System.out.print("Make a choice: ");
			menu = secondInput.nextInt();
		
			List <String> animals = new ArrayList<>();
			animals.add("panda");
			animals.add("cow");
			animals.add("chicken");
			animals.add("flamingo");
			animals.add("sloth");
			animals.add("clownfish");
		
			switch(menu){
				
				case 1 : System.out.print("\nList of all our Zoo animals:\n");
				//comparant() & consumer()
				System.out.print("\nAlphabetical order: \n");
				Comparator<String> sortAnimal = (s1,s2) -> (s1.compareTo(s2));
				animals.sort(sortAnimal);
				Consumer <String> allAnimals = (s) -> System.out.print((s) + "\n");
				animals.forEach(allAnimals);
				break;
				
				case 2 : System.out.print("\nAnimal Information\n");
				System.out.print("panda: ");
				System.out.print("pandas are fat and cute, move on.\n");
				System.out.print("cow: ");
				System.out.print("cows give us beef and milk.\n");
				System.out.print("chicken: ");
				System.out.print("chickens are most decilious when fried. Trust me.\n");
				System.out.print("clownfish: ");
				System.out.print("You can just call me Nemo.\n");
				System.out.print("flamingo: ");
				System.out.print("Are pink. And proud of it.\n");
				System.out.print("sloth: ");
				System.out.print("The slowest of them ALL.\n");
				break;
				
				case 3 : System.out.print("\n");
				System.out.print("Animal seen: ");
				Scanner animalInput = new Scanner(System.in);
				String seenAnimal = animalInput.nextLine();
				
				Predicate<String> removeAnimal = s1 -> (s1.equals(seenAnimal));
				animals.removeIf(removeAnimal);
				animals.forEach((s) -> System.out.print("Animals left to explore: " + (s + "\n")));
				break;
				
				case 4 : mainMenu();
				break;	
			
				default : System.out.print("\nUser error: non-existing choice\n");
				break;				
			}
		}while (!exit);
		
	}
	
	
	public void shopMenu(){
		Scanner thirdInput = new Scanner(System.in);
		int storeMenu;
		int smallPrice = 15;
		int mediumPrice = 20;
		int largePrice = 25;
		int extraSmallPrice = 12;
		int extraLargePrice = 30;
		boolean exit = false;
		
		do{
			System.out.print("\n---------------- Zoo Store ----------------\n");
			System.out.print("Currently, we only have shirts...\n");
			System.out.print("1. All shirts\n");
			System.out.print("2. Sort: small -> large\n");
			System.out.print("3. Sort: large -> small\n");
			System.out.print("4. Sort: cheap -> expensive\n");
			System.out.print("5. Sort: expensive -> cheap\n");
			System.out.print("6. Back to Main Menu\n");
			System.out.print("Make a choice: ");
			storeMenu = thirdInput.nextInt();
			
			List <Apparel> apparellist = new ArrayList<Apparel>();
			apparellist.add(new Apparel("small", "s", smallPrice)); 
			apparellist.add(new Apparel("medium", "m", mediumPrice)); 
			apparellist.add(new Apparel("large", "l", largePrice)); 
			apparellist.add(new Apparel("extra small", "xs", extraSmallPrice)); 
			apparellist.add(new Apparel("extra large", "xl", extraLargePrice));
			
			switch(storeMenu){
				case 1 : System.out.print("\nAll available shirts:\n"); 
				apparellist.forEach((s) -> System.out.print(s + "\n"));
				break;
				
				case 2 : System.out.print("\nSorting by size small -> large:\n");       
				Comparator<Apparel> comparatorSmallToLarge = (Apparel s1, Apparel s2) -> s2.getId().compareTo(s1.getId());
				apparellist.sort(comparatorSmallToLarge);				
				apparellist.forEach((s) -> System.out.print(s + "\n"));
				break;
				
				case 3 : System.out.print("\nSorting by size large -> small:\n");   
				Comparator<Apparel> comparatorLargeToSmall = (Apparel s1, Apparel s2) -> s1.getId().compareTo(s2.getId());					
				apparellist.sort(comparatorLargeToSmall); 
				apparellist.forEach((s) -> System.out.print(s + "\n"));
				break;
				
				case 4 : System.out.print("\nSorting by price cheap -> expensive:\n"); 
				Comparator<Apparel> comparatorCheapToExpensive = (Apparel s1, Apparel s2) -> s1.getPrice()-(s2.getPrice());
				apparellist.sort(comparatorCheapToExpensive); 
				apparellist.forEach((s) -> System.out.print(s + "\n")); 
				break;
				
				case 5 : System.out.print("\nSorting by price expensive -> cheap:\n");       
				Comparator<Apparel> comparatorExpensiveToCheap = (Apparel s1, Apparel s2) -> s2.getPrice()-(s1.getPrice());
				apparellist.sort(comparatorExpensiveToCheap); 
				apparellist.forEach((s) -> System.out.print(s + "\n")); 
				break;
				
				case 6 : mainMenu();
				break;
				
				default : System.out.print("\nUser error: non-existing choice\n");
				break;	
			}
		}while (!exit);
		
	}	
}
