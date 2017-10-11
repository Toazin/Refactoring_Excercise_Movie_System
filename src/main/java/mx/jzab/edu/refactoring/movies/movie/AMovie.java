package mx.jzab.edu.refactoring.movies.movie;

/**
*
* @author jzab
* @refactored Toatzin, monserrat y toledo
*/

public abstract class AMovie implements IMovie {
	private String _title;
	private int _priceCode;

	public AMovie( String title ) {
	    _title = title;
	}

	 public String getTitle() {
		    return _title;
	}

	abstract public double getAmount(Integer daysRented);

}
