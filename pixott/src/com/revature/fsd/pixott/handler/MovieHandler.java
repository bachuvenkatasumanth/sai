package com.revature.fsd.pixott.handler;

import com.revature.fsd.pixott.dao.Moviedao;

public class MovieHandler {
	public static void displaymovie() {
		System.out.println("");
		System.out.println("movie Menu");
		System.out.println("=========");
		System.out.println("1.view top 5 movies");
		System.out.println("2.search movies");
		System.out.println("3.logout");
		int option = Integer.parseInt(App.scanner.nextLine());
		System.out.println(option);
		if (option==1) {
			Moviedao.topfivemovie();
		}
		else if (option==2) {
			System.out.println("Enter Movie Name ");
			String search=App.scanner.nextLine();
			Moviedao.searchmovie(search);
		
		}
	}
}
