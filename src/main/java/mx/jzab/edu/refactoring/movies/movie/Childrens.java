package mx.jzab.edu.refactoring.movies.movie;

public class Childrens extends AMovie{

	public Childrens(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAmount(Integer daysRented) {
		// TODO Auto-generated method stub
		double thisAmount = 1.5;
        if( daysRented > 3 ) {
          thisAmount += ( daysRented - 3 ) * 1.5;
        }
		return thisAmount;
	}

}
