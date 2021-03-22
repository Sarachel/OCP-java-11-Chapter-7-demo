package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.*;
import service.ZooService;


public class ZooApp{
	
	private static ZooService zooService = new ZooService();
	private static String seenAnimal;
	private static final DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static void main(String[]args){
		
		System.out.print("---------------- Welcome to the Zoo ----------------\n");
		
		Supplier<String> s = () -> newFormat.format(LocalDateTime.now());
        String time = s.get();
        System.out.print("Today: \n" + time + "\n" );
		
		zooService.mainMenu();
		
	}
	
	
}

//javac app/*.java entities/*.java service/*.java
// java app/ZooApp	