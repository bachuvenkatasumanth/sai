package com.revature.fsd.pixott.model;

public class Movie {
		private int id;
		private String name;
		private String genre;
		private int sales;
		private int year;
		
		public Movie() {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public int getSales() {
			return sales;
		}

		public void setSales(int sales) {
			this.sales = sales;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((genre == null) ? 0 : genre.hashCode());
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + sales;
			result = prime * result + year;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Movie other = (Movie) obj;
			if (genre == null) {
				if (other.genre != null)
					return false;
			} else if (!genre.equals(other.genre))
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (sales != other.sales)
				return false;
			if (year != other.year)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return String.format("%-20s %-40s %-40s %d",id,name,genre,year);
		}
		
		

}
