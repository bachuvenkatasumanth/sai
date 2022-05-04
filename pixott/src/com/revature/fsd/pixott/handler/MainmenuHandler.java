package com.revature.fsd.pixott.handler;
import java.util.*;

public class MainmenuHandler {

	public static void display() {
		//Scanner scan = new Scanner(System.in);
		System.out.println("Main Menu");
		System.out.println("=========");
		System.out.println("1.Signup");
		System.out.println("2.Login");
		System.out.println("3.exit");
		System.out.println("enter option");
		int option = Integer.parseInt(App.scanner.nextLine());
		System.out.println(option);
		if(option==1) {
			SignupHandler.display();
		}
		else if(option==2) {
			LogingHandler.display();
		}
		else {
			System.out.println("thanks come again");
		}
	}

}