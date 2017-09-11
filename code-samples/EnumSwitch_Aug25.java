import java.util.Scanner;

class Main {
	
	public static enum StringComparison {
		SMALL_NUMBER,
		BIG_NUMBER,
		REALLY_BIG_NUMBER
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = scanner.nextInt();
		StringComparison answer;
		if (input < 5){
			answer = StringComparison.SMALL_NUMBER;
		} else if(input >= 5 && input < 9){
			answer = StringComparison.BIG_NUMBER;
		} else {
			answer = StringComparison.REALLY_BIG_NUMBER;
		}
		
		switch (answer){
			case SMALL_NUMBER:
				System.out.println("small Number");
				break;
			case BIG_NUMBER:
				System.out.println("Big number");
				break;
			case REALLY_BIG_NUMBER:
				System.out.println("really big number");
				
		}
		
	}
}
