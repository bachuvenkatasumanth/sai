 package com.revature.fsd.pixott.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.fsd.pixott.model.Movie;

public class Moviedao {
	
	
	public static void topfivemovie() {
		String sql =  "select * from movie join top5movies where top5movieid=movie.id";
		List<Movie> movies = new ArrayList<>();
		try (Connection connection = Util.getConnection(); PreparedStatement stmt = connection.prepareStatement(sql);) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Movie movie = new Movie();
				movie.setId(rs.getInt("id"));
				movie.setName(rs.getString("name"));
				movie.setGenre(rs.getString("genre"));
				movie.setYear(rs.getInt("year"));
				movies.add(movie);
			}
		} catch (SQLException e) {
			Util.displayMessage(e);
		
		}
		movies.forEach(System.out::println);
		
	}
	
	public static void searchmovie(String search) {
		String ari="%";
		String sql = String.format("select * from movie where name like '%s%s%s';",ari,search,ari);
		ArrayList<Movie> movies = new ArrayList<>();
		try (Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);)
		{
		//	stmt.setString(1, search);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Movie movie = new Movie();
				movie.setId(rs.getInt("id"));
				movie.setName(rs.getString("name"));
				movie.setGenre(rs.getString("genre"));
				movie.setYear(rs.getInt("year"));
				movies.add(movie);
			}
			movies.forEach(System.out::println);

		} catch (SQLException e) {
			Util.displayMessage(e);
		
		}

		
	}
	}


