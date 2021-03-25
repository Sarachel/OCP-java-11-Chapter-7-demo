import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;

public class Chapter3
{
    public static void main(String args[])
    {
        double a, b, res;
        char choice, ch;
        Scanner scan = new Scanner(System.in);
		boolean exit = false;
		LocalDate myObj = LocalDate.now(); 
		LocalTime myObj2 = LocalTime.now();

		
		System.out.println(" ");
		System.out.println("Datum: \n" + myObj);
		System.out.println("Tijd: \n" + myObj2);
		System.out.println(" ");
		
        do
        {
            System.out.println("1. Optellen\n");
            System.out.println("2. Aftellen\n");
            System.out.println("3. Vermenigvuldigen\n");
            System.out.println("4. Delen\n");
			System.out.println("5. Modulus\n");
            System.out.println("6. Uitchakelen\n\n");
            System.out.println("Kies een reken optie : ");
            choice = scan.next().charAt(0);
            switch(choice)
            {
                case '1' : System.out.println("Plaats twee cijfers : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a + b;
                    System.out.println("Antwoord  = " + res);
					System.out.println(a + " is opgeteld met " + b);
                    break;
                case '2' : System.out.println("Plaats twee cijfers : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a - b;
                    System.out.println("Antwoord = " + res);
					System.out.println(a + " is afgetrokken met " + b);
					if (a < b){
						System.out.println("Het antwoord is negatief omdat je een klein getal hebt afgetrokken met een groot getal");
					}
                    break;
                case '3' : System.out.print("Plaats twee cijfers : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a * b;
                    System.out.println("Antwoord = " + res);
					System.out.println(a + " is vermenigvuldigd met " + b);
                    break;
                case '4' : System.out.println("Plaats twee cijfers : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a / b;
                    System.out.println("Antwoord = " + res);
					System.out.println(a + " is gedeeld met " + b);           
                    break;
				case '5' : System.out.println("Plaats twee cijfers : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a % b;
                    System.out.println("Antwoord = " + res);
					System.out.println(a + " is gedeeld met " + b + " en " + res + " is over als restant");
                    
                    break;
                case '6' : exit = true; //System.exit(0);
                    break;
                default : System.out.println("Sorry, optie niet mogelijk");
                    break;
            }
            System.out.print("\n---------------------------------------\n");
        }while (!exit); //(choice != 6);       
		
		
    }
}