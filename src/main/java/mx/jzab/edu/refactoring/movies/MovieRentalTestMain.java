package mx.jzab.edu.refactoring.movies;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import mx.jzab.edu.refactoring.movies.customer.Customer;
import mx.jzab.edu.refactoring.movies.movie.AMovie;
import mx.jzab.edu.refactoring.movies.movie.Childrens;
import mx.jzab.edu.refactoring.movies.movie.NewRelease;
import mx.jzab.edu.refactoring.movies.movie.Regular;
import mx.jzab.edu.refactoring.movies.rental.Rental;

public class MovieRentalTestMain {
	
		private Customer customer;
		private Regular mRegular;
		private Childrens mChildren;
		private NewRelease mNewRelease;
		private Rental rental;

		public MovieRentalTestMain(){
			
		}
		
		@BeforeTest
		public void before(){
			customer = new Customer("John");
			mRegular = new Regular("Star Wars");
			rental = new Rental( mRegular, 4 );
			//mChildren = new Childrens("Pooh");
			//mNewRelease = new NewRelease("Flash");
			
		}
		
		@Test
		public void	 testCustomerName(){
			customer = new Customer("John");
			mRegular = new Regular("Star Wars");
			rental = new Rental( mRegular, 4 );
			Assert.assertEquals(customer.getCustomerName() , "John","Incorrect Name - Customer");
		}
		
		
		@Test
		public void	 testMovieName(){
			customer = new Customer("John");
			mRegular = new Regular("Star Wars");
			rental = new Rental( mRegular, 4 );
			Assert.assertEquals(mRegular.getTitle() , "Star Wars" ,"Incorrect Name - Movie");
		}
		
		@Test
		public void	 testRentalDays(){
			customer = new Customer("John");
			mRegular = new Regular("Star Wars");
			rental = new Rental( mRegular, 4 );
			Assert.assertEquals(rental.getDaysRented() ,4,"Incorrect days - Rental");
		}
		
		@Test
		public void	 testRentalMovie(){
			customer = new Customer("John");
			mRegular = new Regular("Star Wars");
			rental = new Rental( mRegular, 4 );
			Assert.assertEquals(rental.getMovieTitle() ,"Star Wars","Incorrect movie - Rental");
		}
		
		@Test
		public void testRentalAmount_regular_moreThan2(){
			customer = new Customer("John");
			mRegular = new Regular("Star Wars");
			rental = new Rental( mRegular, 3 );
			Assert.assertEquals(rental.getMovieAmount() ,3.5,"Incorrect Amount - Rental");
		}
		
		@Test
		public void testRentalAmount_regular_lessThan2(){
			customer = new Customer("John");
			mRegular = new Regular("Star Wars");
			rental = new Rental( mRegular, 2 );
			Assert.assertEquals(rental.getMovieAmount() ,2.0,"Incorrect Amount - Rental");
		}
		
		@Test
		public void testRentalAmount_children_moreThan3(){
			customer = new Customer("John");
			mChildren = new Childrens("Star Wars");
			rental = new Rental( mChildren, 4 );
			Assert.assertEquals(rental.getMovieAmount() ,3.0,"Incorrect Amount - Rental");
		}
		
		@Test
		public void testRentalAmount_children_lessThan3(){
			customer = new Customer("John");
			mChildren = new Childrens("Star Wars");
			rental = new Rental( mChildren, 3 );
			Assert.assertEquals(rental.getMovieAmount() ,1.5,"Incorrect Amount - Rental");
		}
		
		@Test
		public void testRentalAmount_newRelease(){
			customer = new Customer("John");
			mNewRelease = new NewRelease("Star Wars");
			rental = new Rental( mNewRelease, 3 );
			Assert.assertEquals(rental.getMovieAmount() ,9.0,"Incorrect Amount - Rental");
		}
		
		
}