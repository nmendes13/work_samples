package FizzBuzz;

public class FizzBuzz {

	private final int fizzMultiple = 3;
	private final int buzzMultiple = 5;
	private final int fizzBuzzMultiple = 15;
	
	private int minVal;
	private int maxVal;
	private int nrFizz;
	private int nrBuzz;
	private int nrFizzBuzz;
	private int nrLucky;
	private int nrInteger;
	
	public FizzBuzz(int minVal, int maxVal) {
		this.minVal = minVal;
		this.maxVal = maxVal;
		this.nrFizz=0;
		this.nrBuzz=0;
		this.nrFizzBuzz=0;
		this.nrLucky=0;
		this.nrInteger=0;
	}
	
	public void RunFizzBazz(){
		for(int i=minVal; i <= maxVal; i++){
			if(isLucky(i))
				nrLucky = printLucky(nrLucky);
			else if(isFizz(i) && !isBuzz(i) && !isFizzBuzz(i))
				nrFizz = printFizz(nrFizz);
			else if (isBuzz(i) && !isFizzBuzz(i))
				nrBuzz = printBuzz(nrBuzz);
			else if (isFizzBuzz(i))
				nrFizzBuzz = printFizzBuzz(nrFizzBuzz);
			else
				nrInteger = printInteger(nrInteger, i);
		}
	}

	public void printRunResume() {
		System.out.println("\r\nfizz: " + nrFizz);
		System.out.println("buzz: " + nrBuzz);
		System.out.println("fizzbuzz: " + nrFizzBuzz);
		System.out.println("lucky: " + nrLucky);
		System.out.println("integer: " + nrInteger);
	}

	private int printLucky(int nrLucky) {
		nrLucky++;
		System.out.print("lucky ");
		return nrLucky;
	}
	private int printFizz(int nrFizz) {
		nrFizz++;
		System.out.print("fizz ");
		return nrFizz;
	}
	private int printBuzz(int nrBuzz) {
		nrBuzz++;
		System.out.print("buzz ");
		return nrBuzz;
	}
	private int printFizzBuzz(int nrFizzBuzz) {
		nrFizzBuzz++;
		System.out.print("fizzbuzz ");
		return nrFizzBuzz;
	}
	private int printInteger(int nrInteger, int i) {
		nrInteger++;
		System.out.print(i + " ");
		return nrInteger;
	}

	public boolean isFizz(int i) {
		if((i % fizzMultiple)== 0)
			return true;
		else
			return false;
	}
	
	public boolean isBuzz(int i) {
		if((i % buzzMultiple)== 0)
			return true;
		else
			return false;
	}
	
	public boolean isFizzBuzz(int i) {
		if((i % fizzBuzzMultiple)== 0)
			return true;
		else
			return false;
	}
	
	public boolean isLucky(int i) {
		if((i+"").contains("3"))
			return true;
		else
			return false;
	}
}
