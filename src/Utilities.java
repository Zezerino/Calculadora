import java.util.Scanner;

public class Utilities {

	private double firstValue;
	private double secondValue;

	private double soma(double firstValue, double secondValue){

		return firstValue + secondValue;
	}

	private double subtrair(double firstValue, double secondValue){

		return firstValue - secondValue;
	}

	private double multiplicar(double firstValue, double secondValue){

		return firstValue * secondValue;
	}

	private double dividir(double firstValue, double secondValue){

		if(secondValue==0){
			System.out.println("Numero invalido");
			return -1;
		}
		return firstValue / secondValue;
	}

	public void Operation(){
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		scanner.nextLine();

		double firstValue, secondValue;

		switch(option){

			case 1:
				System.out.println("Digite dois numeros para somar: ");
				firstValue = scanner.nextDouble();
				secondValue = scanner.nextDouble();
				System.out.println("Total: "+soma(firstValue, secondValue));
				break;

			case 2:
				System.out.println("Digite dois numeros para subtrair: ");
				firstValue = scanner.nextDouble();
				secondValue = scanner.nextDouble();
				System.out.println("Total: "+subtrair(firstValue, secondValue));
				break;

			case 3:
				System.out.println("Digite dois numeros para multiplicar: ");
				firstValue = scanner.nextDouble();
				secondValue = scanner.nextDouble();
				System.out.println("Total: "+multiplicar(firstValue, secondValue));
				break;

			case 4:
				System.out.println("Digite dois numeros para dividir: ");
				firstValue = scanner.nextDouble();
				secondValue = scanner.nextDouble();
				System.out.println("Total: "+dividir(firstValue, secondValue));
				break;

		}

	}

}
