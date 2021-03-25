import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Chapter5{
	
	
	public static void main(String... args){
		
		
		Scanner userInput = new Scanner(System.in);
		String userNaam;
		
		System.out.println("\nPlaats je naam: ");
		userNaam = userInput.nextLine();  
		
		StringBuilder loading = new StringBuilder();
		for (int i = 0; i < 5; i++){ 
		loading.append("loading. . .\n");
		}
		String waitForNoting = loading.toString();
		System.out.println(waitForNoting);
		System.out.println("Hallo, " + userNaam.toUpperCase());
		
		//Scanner userInput = new Scanner(System.in);
		System.out.println("\nGraag alle student gegevens invullen voor onze administratie");

		System.out.println();
		
		gegevens();
		unaGegevens();
		tentamenSchema();
		randomLokaal();
		userInput.close();
	}
	
	public static void gegevens(){
		String voornaam, achternaam;
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.println("********************************");
		System.out.println("Persoonlijke gegevens:	");
		System.out.println("********************************");
		
		System.out.println("Voornaam: ");
		voornaam = userInput.nextLine();
		
		System.out.println("Achternaam: ");
		achternaam = userInput.nextLine();
		
		
	}
	
	public static void unaGegevens(){
		Scanner userInput = new Scanner(System.in);
		int startJaar, jaarCode, studentNummer;
		String richtingCode, richting;
		
		System.out.println("\n********************************");
		System.out.println("UNASAT-SOI student gegevens: ");
		System.out.println("********************************");
		
		System.out.println("Richting: (BI/SNE/SE)");
		richtingCode = userInput.nextLine();
		
		System.out.println("Start jaar: ");
		startJaar = userInput.nextInt();
		
		System.out.println("Jaar code: (e.g. 1116/1117/1118)");
		jaarCode = userInput.nextInt();
		
		System.out.println("Studentnummer: ");
		studentNummer = userInput.nextInt();
		
		StringBuilder studNummer = new StringBuilder().append(richtingCode.toUpperCase()).append("/");
		studNummer.append(jaarCode).append("/").append(studentNummer);
		
		System.out.println("\nVolledig studentnummer: " + studNummer);
		System.out.println("Is je studentnummer correct? (y/n)");
		Scanner userInput2 = new Scanner(System.in);
		String input = userInput2.nextLine();
		boolean keuze = input.equalsIgnoreCase("y") ? true : false;
		if (keuze){
			System.out.println("yes");
		}else{
			System.out.println("Contact onze administratie: 430490 / 494772\n");
		}
	}	
	
	public static void randomLokaal(){
		String [] array ={"lokaal 11", "lokaal 12", "lokaal 13", "lokaal 14", "lokaal 15"};
      	Random lokaal = new Random();        
      	int random = lokaal.nextInt(array.length);
		System.out.println("\n Tentamen lokaal: "+array[random]);
      	
	}
	
	public static void tentamenSchema(){
		
		var tentamen = new ArrayList<String>();
		tentamen.add("1.BI : 	SEM3 - Agile/Prince2");
		tentamen.add("2.SE : 	SEM3 - Software Eng.1/Database2");
		tentamen.add("3.SNE:	SEM3 - Windows Infra./Network Eng.");
		tentamen.add("4.BI :	SEM5 - Lean/Innovationmanagement");
		tentamen.add("5.SE : 	SEM5 - JavaScript");
		tentamen.add("6.SNE: 	SEM5 - Operating Systems");
		for (int i = 0; i < tentamen.size(); i++) {
			System.out.println(tentamen.get(i));
		}
		
		int tentamenKeuze;
		System.out.println("\nGeef het nummer op voor registratie: ");
		Scanner userInput = new Scanner(System.in);
		tentamenKeuze = userInput.nextInt();
		if (tentamenKeuze == 1){
			System.out.print("Agile/Prince2 tentamen wordt gemaakt op 10 maart 2021 om 6pm");
		}else if (tentamenKeuze == 2){
			System.out.print("Software Eng.1/Database2 tentamen wordt gemaakt op 10 maart 2021 om 6pm");
		}else if (tentamenKeuze == 3){
			System.out.print("Windows Infra./Network Eng. tentamen wordt gemaakt op 10 maart 2021 om 6pm");
		}else if (tentamenKeuze == 4){
			System.out.print("Lean/Innovationmanagement tentamen wordt gemaakt op 12 maart 2021 om 6pm");
		}else if (tentamenKeuze == 5){
			System.out.print("JavaScript tentamen wordt gemaakt op 12 maart 2021 om 6pm");
		}else if (tentamenKeuze == 6){
			System.out.print("Operating Systems tentamen wordt gemaakt op 12 maart 2021 om 6pm");
		}
		System.out.print("\n-------S U C C E S S!-------");
	}
	
	
	

}