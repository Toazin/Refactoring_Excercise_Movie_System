package mx.jzab.edu.refactoring.movies.customer;

import java.util.Enumeration;
import java.util.Vector;

import mx.jzab.edu.refactoring.movies.movie.AMovie;
import mx.jzab.edu.refactoring.movies.rental.Rental;


/**
*
* @author jzab
* @refactored Toatzin, monserrat y toledo
*/
public class Customer implements ICustomer {

  private String _name;
  private Vector<Rental> _rentals = new Vector<Rental>();

  public Customer( String name ) {
    _name = name;
  }

  public void addRental( AMovie movie, Integer days ) {
    _rentals.addElement( new Rental(movie, days) );
  }

  public String getCustomerName() {
    return _name;
  }
  
  public double getTotalAmount(){
	  double totalAmount = 0;
	  for (Rental rent : _rentals) {
		  double rentalAmount = rent.getMovieAmount();
		  totalAmount += rentalAmount;
	  }
	  return totalAmount;
  }
  
  public int getFrequentRenterPoints(){
	  int frequentRenterPoints = 0;
	  for (Rental rent : _rentals) {
		  frequentRenterPoints++;
		  if(rent.twoDayBonusNewRelease()) frequentRenterPoints++;
	  }
	  return frequentRenterPoints;
  }

  public String generateStatement() {
    double totalAmount = getTotalAmount();
    int frequentRenterPoints = getFrequentRenterPoints();
    
    String result = "Rental Record for " + getCustomerName() + "\n";
    for (Rental rent : _rentals) {
		result += "\t" + rent.getMovieTitle() + "\t"
                + String.valueOf( rent.getMovieAmount() ) + "\n";
    }
    
    result += "Amount owed is " + String.valueOf( totalAmount ) + "\n";
    result += "You earned " + String.valueOf( frequentRenterPoints )
              + " frequent renter points";
    return result;
  }


}
