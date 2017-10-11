package mx.jzab.edu.refactoring.movies;

import java.util.HashMap;

import mx.jzab.edu.refactoring.movies.customer.Customer;
import mx.jzab.edu.refactoring.movies.movie.AMovie;
import mx.jzab.edu.refactoring.movies.movie.Childrens;
import mx.jzab.edu.refactoring.movies.movie.Regular;
import mx.jzab.edu.refactoring.movies.movie.NewRelease;
import mx.jzab.edu.refactoring.movies.rental.Rental;


/**
 *
 * @author jzab
 * @refactored Toatzin, monserrat y toledo
 */
public class Main {
	
	public static void main( String[] args ) {
		Customer customer1 = new Customer("Juan");
		Customer customer2 = new Customer("Paco");
		Customer customer3 = new Customer("Pedro");
		
		Regular movie1 = new Regular("Star Wars");
		Childrens movie2 = new Childrens("Pooh");
		NewRelease movie3 = new NewRelease("Flash");

		customer1.addRental(movie1, 5);
		customer1.addRental(movie2, 2);
		customer1.addRental(movie3, 10);
		String statement1 = customer1.generateStatement();
		
		System.out.println( statement1 );
		
		customer2.addRental(movie2, 2);
		customer2.addRental(movie1, 4);
		customer2.addRental(movie3, 6);
		String statement2 = customer2.generateStatement();

		System.out.println( statement2 );
		
		customer3.addRental(movie3, 2);
		customer3.addRental(movie2, 6);
		customer3.addRental(movie1, 1);
		String statement3 = customer3.generateStatement();

		System.out.println( statement3 );
	    
	
	}
	
	
	
	

}
