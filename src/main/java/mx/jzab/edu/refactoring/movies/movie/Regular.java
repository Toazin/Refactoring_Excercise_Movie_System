package mx.jzab.edu.refactoring.movies.movie;

public class Regular extends AMovie{

	public Regular(String title) {
		super(title);
	}

	@Override
	public double getAmount(Integer daysRented) {
		double amount = 2;
		if(daysRented > 2){
			amount += (daysRented - 2 ) * 1.5;
		}
		return amount;
	}

}
