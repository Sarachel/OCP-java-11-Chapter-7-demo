import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class Schedule{
	
	public static void hello(){
		Scanner userInput = new Scanner(System.in);
		String userName;
			
		System.out.println("Enter naam: "); 
		userName = userInput.nextLine();   
		System.out.println("Welkom " + userName + ", dit is je Bootcamp 2021 schema indeling: ");
	}
	
	public static void main(String[]args){
		Scanner userInput = new Scanner(System.in);
		boolean exit = false;
		int keuze;
		
		LocalDate myObj = LocalDate.now(); 
		LocalTime myObj2 = LocalTime.now();
		
		
		System.out.println(" ");
		System.out.println("----------------BOOTCAMP 2021----------------");
		
		
		System.out.println(" ");
		System.out.println("Datum: \n" + myObj);
		System.out.println("Tijd: \n" + myObj2);
		System.out.println(" ");
		
		hello();
		schedule();
		
	}
	
	public static void schedule(){
		Scanner userInput = new Scanner(System.in);
		int keuze, huidigeChapter;
		boolean exit = false;
		int huidigeWeek;
		int weekDemo = 3,  weekNu = 4; 
		int start = 0;
		
	
		
		
		do{
			
			System.out.println("1. Dag");
			System.out.println("2. Week");
			System.out.println("3. Maand");
			System.out.println("4. Status");
			System.out.println("5. Exit\n");
			keuze = userInput.nextInt();
			
			switch(keuze){
				case 1 : System.out.println("De vaste schedule per dag: ");
					System.out.println("1. Dagelijks: Standups 9am\n");
					System.out.println("2. Elke maandag: Demo 2am\n");
					break;
				case 2 : System.out.println("Chapter indeling per week: ");
					var chapter = new ArrayList<String>(); 
					chapter.add("Week 1: Chapter 1");
					chapter.add("Week 2: Chapter 2 & 3");
					chapter.add("Week 3: Chapter 4 & 5");
					chapter.add("Week 4: Chapter 5 & 6");
					chapter.add("Week 5: Chapter 6 & 7");
					chapter.add("Week 6: Chapter 7 & 8");
					chapter.add("Week 7: Chapter 9 & 10");
					chapter.add("Week 8: Chapter 11");
					chapter.add("Week 9: Chapter 12 & 13");
					chapter.add("Week 10: Chapter 14");
					chapter.add("Week 11: Chapter 15");
					chapter.add("Week 12: Chapter 16 & 17");
					chapter.add("Week 13: Chapter 18");
					chapter.add("Week 14: Chapter 19 & 20");
					chapter.add("Week 15: Chapter 21 & 22");
					for (int i = 0; i < chapter.size(); i++) {
						System.out.println(chapter.get(i));
					}
					break;
				case 3 : System.out.println("Chapter indeling per maand: ");
					int maand = 0;
					int gekozenMaand = 0;
					String chosenMonth;
					System.out.println( "Kies maand 1, 2, 3 of enter voor alle maanden: " );
					Scanner input = new Scanner(System.in);
					chosenMonth = input.nextLine();
					
					if(chosenMonth.equalsIgnoreCase("")){ 
						 chosenMonth = "All";
					}else{
						System.out.println(chosenMonth);
						gekozenMaand = Integer.parseInt(chosenMonth);
					}
					
					String chapterArray[][] = {{"Chapter 1", "Chapter 2", "Chapter 3"}, {"Chapter 4", "Chapter 5", "Chapter 6", "Chapter 7", "Chapter 8", "Chapter 9", "Chapter 10"}, {"Chapter 11", "Chapter 12", "Chapter 13", "Chapter 14", "Chapter 15", "Chapter 16", "Chapter 17", "Chapter 18", "Chapter 19", "Chapter 20", "Chapter 21", "Chapter 22"} };
					CHAPTER_LOOP: for (int x = start; x < chapterArray.length; x++) {
						maand++;
						if (chosenMonth.equalsIgnoreCase("All") || maand == gekozenMaand){
							String subArray[] = chapterArray[x]; 
							System.out.println( "Aantal chapters van maand " + maand + ": " + subArray.length );
							MONTH_LOOP: for (int y = start; y < subArray.length; y++) {
							String chap = subArray[y];
							System.out.println( "  Maand " + maand + ": " + chap );
							}	
						}else{
							continue;
						}
						
					}
					break;
				case 4 : System.out.println("Toets je huidige week nummer in: ");
					huidigeWeek = userInput.nextInt();
					if (huidigeWeek == weekDemo){
						System.out.println("Je hebt vandaag Demo Chapter 4");
					}else if (huidigeWeek == weekNu){
						System.out.println("Je bent op schema.");
					}else if (huidigeWeek > weekNu){
						System.out.println("Je bent voor. Vergeet geen demo's te maken na ELKE chapter, though.");
					}
					break;
				case 5 : exit = true;
					break;
				default : System.out.println("Sorry, optie niet mogelijk");
					break;
			}
			System.out.print("\n---------------------------------------\n");
		}while (!exit); 
	}
}