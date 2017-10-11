package mx.jzab.edu.refactoring.movies.rental;

import mx.jzab.edu.refactoring.movies.movie.AMovie;
import mx.jzab.edu.refactoring.movies.movie.NewRelease;

/**
 *
 * @author jzab
 * @refactored Toatzin, monserrat y toledo
 */
public class Rental implements IRental{

  private AMovie movie;
  private int daysRented;

  public Rental(AMovie movie, int daysRented ) {
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public int getDaysRented() {
    return this.daysRented;
  }

  public String getMovieTitle() {
    return this.movie.getTitle();
  }
  
  public double getMovieAmount(){
	  return this.movie.getAmount(daysRented);
  }
  
  public boolean twoDayBonusNewRelease(){
	  return (this.movie instanceof  NewRelease) && daysRented > 1;
  }
  
  public Class<? extends AMovie> getMovieType(){
	  return this.movie.getClass();
  }
}
