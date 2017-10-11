package mx.jzab.edu.refactoring.movies.customer;

import mx.jzab.edu.refactoring.movies.movie.AMovie;
import mx.jzab.edu.refactoring.movies.rental.Rental;

public interface ICustomer {

	public void addRental(AMovie movie, Integer days);
	public String getCustomerName();
	public String generateStatement();
	public double getTotalAmount();
	public int getFrequentRenterPoints();
}
