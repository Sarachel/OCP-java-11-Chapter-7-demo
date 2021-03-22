import java.time.LocalDate;
import java.util.ArrayList;

public class Chapter2{
	
	public static void main(String[] args) {
		
		LocalDate myObj = LocalDate.now(); 
		System.out.println(" ");
		
		System.out.println("Today: " + myObj);
		
		System.out.println("Our ice cream selection: " );
		var ice = new ArrayList<String>(); //array using var
		ice.add("1: Vani77a");
		ice.add("2: ¢h0colat3");
		ice.add("3: Pi$ta¢hi0");
		ice.add("4: ¢0¢0nut");
		ice.add("5: Rum_Rai$in");
		for (int i = 0; i < ice.size(); i++) {
			System.out.println(ice.get(i));
		}
		System.out.println(" ");
		
		String size1 = "Small ";
		int price1 = 5;
		String size2 = "Medium ";
		double price2 = 7.5;
		String size3 = "Large ";
		short price3 = 10;
		System.out.println("Sizes: ");
		System.out.println(size1 + price1);
		System.out.println(size2 + price2);
		System.out.println(size3 + price3);
		
		
	}
}