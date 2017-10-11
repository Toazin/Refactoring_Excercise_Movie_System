package mx.jzab.edu.refactoring.movies.movie;

public class NewRelease extends AMovie{

	public NewRelease(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAmount(Integer daysRented) {
		// TODO Auto-generated method stub
		return (double)daysRented * 3;
	}

}
