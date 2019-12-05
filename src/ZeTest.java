import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ZeTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	
	Utilities calc1; 
	
	@BeforeEach
	public void init() {
		System.out.println("Primeiro");
		calc1 = new Utilities();		
	}
	
	@Nested
	@DisplayName("Quando testamos a Soma")
	class Soma{
		@Test
		@DisplayName("com numeros positivos")
		public void positivo() {
			System.out.println("Iniciar o teste da Soma");
			assertEquals(10, calc1.soma(5, 5), "Tem de ser a Soma entre os dois valores");
			assertEquals(3, calc1.soma(2, 1), "Tem de ser a Soma entre os dois valores");


		}
		
		@Test
		@DisplayName("com numeros negativos")
		public void negativo() {
			System.out.println("Iniciar o teste da Soma");
			assertEquals(-311, calc1.soma(-200, -111), "Tem de ser a Soma entre os dois valores");


		}
		@Test
		@DisplayName("com numeros negativos e positivos")
		public void negativoPositivo() {
			System.out.println("Iniciar o teste da Soma");
			assertEquals(-100, calc1.soma(-200, 100), "Tem de ser a Soma entre os dois valores");

		}
		
	}
	
	//DIVISAO-------------------------------------------------------------------------
	
	@Nested
	@DisplayName("Quando testamos a Divisao")
	class Divisao{
		@Test
		@DisplayName("com numeros positivos")
		public void positivo() {
			System.out.println("Iniciar o teste de Divisao");
			assertEquals(3.5, calc1.dividir(7, 2), "Tem de ser a Divisao entre os dois valores DOUBLE");
			assertEquals(10, calc1.dividir(50, 5), "Tem de ser a Divisao entre os dois valores DOUBLE2");


		}
		
		@Test
		@DisplayName("com numeros negativos")
		public void negativo() {
			System.out.println("Iniciar o teste de Divisao");
			assertEquals(10, calc1.dividir(-500, -50), "Tem de ser a Divisao entre os dois valores DOUBLE3");


		}
		@Test
		@DisplayName("com numeros negativos e positivos")
		public void negativoPositivo() {
			System.out.println("Iniciar o teste de Divisao");
			assertEquals(-2, calc1.dividir(-200, 100), "Tem de ser a Divisao entre os dois valores DOUBLE");

		}
		
		@Test
		@DisplayName("com numeros 0")
		public void numeroZero() {
			System.out.println("Iniciar o teste de Divisao");
			assertEquals(-1, calc1.dividir(2, 0), "NAO SE PODE DIVIDIR POR 0");

//			assertThrows(ArithmeticException.class, () -> calc1.dividir(2, 0));
//			assertThrows(ArithmeticException.class, () -> calc1.dividir(0, 2));
		}
		
	}
	
	
	
	
}
