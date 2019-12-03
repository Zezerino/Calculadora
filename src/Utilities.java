import java.util.Scanner;

public class Utilities {

	private double firstValue;
	private double secondValue;

	public double sum(double firstValue, double secondValue){

		return 0;
	}

	public void chooseOperation(){
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		scanner.nextLine();
		switch(option){

		case 1:
			System.out.println("Digite dois numeros para somar: ");
			double firstValue = scanner.nextDouble();
			double secondValue = scanner.nextDouble();
			System.out.println("Total: "+sum(firstValue, secondValue));
		}
	}

}
