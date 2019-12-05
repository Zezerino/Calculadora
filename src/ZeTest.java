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

	
	Utilities somaTest; 
	
	@BeforeEach
	public void init() {
		System.out.println("Primeiro");
		somaTest = new Utilities();		
	}
	
	@Nested
	@DisplayName("Quando testamos a Soma")
	class Soma{
		@Test
		@DisplayName("com numeros positivos")
		public void positivo() {
			System.out.println("Iniciar o teste da Soma");
			assertEquals(10, somaTest.soma(5, 5), "Tem de ser a Soma entre os dois valores");
			assertEquals(3, somaTest.soma(2, 1), "Tem de ser a Soma entre os dois valores");


		}
		
		@Test
		@DisplayName("com numeros negativos")
		public void negativo() {
			System.out.println("Iniciar o teste da Soma");
			assertEquals(-311, somaTest.soma(-200, -111), "Tem de ser a Soma entre os dois valores");


		}
		@Test
		@DisplayName("com numeros negativos e positivos")
		public void negativoPositivo() {
			System.out.println("Iniciar o teste da Soma");
			assertEquals(-100, somaTest.soma(-200, 100), "Tem de ser a Soma entre os dois valores");

		}
		
	}
	
	
	
	
	
}
