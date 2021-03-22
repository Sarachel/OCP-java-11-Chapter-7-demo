package app;

import java.util.function.Predicate;
import java.util.*;
import service.GameService;

public class GameApp{
	
	private static GameService gameService = new GameService();
	
	public static void main(String[]args){
	
		int option;
		
		System.out.print("---------------- hoi hoi ----------------\n");
		
		gameService.menu();		
	}	
}

//javac app/*.java entities/*.java service/*.java
// java app/GameApp	