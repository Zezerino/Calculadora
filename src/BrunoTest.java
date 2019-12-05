import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


class BrunoTest {

	Utilities calc;
	
	@Nested
	@DisplayName("quando testamos a subtração, ")
	class Subt{
		
		@Test
		@DisplayName("test result positivo")
		public void primeiroTest() {
			assertEquals(5, calc.subtrair(10, 5), "O resultado deve ser igual a subtração dos argumentos");
	
		}
		
		@Test
		@DisplayName("teste result = 0")
		public void segundoTest() {
			assertEquals(0, calc.subtrair(5, 5), "O resultado deve ser igual a subtração dos argumentos");
		}
		
		@Test
		@DisplayName("teste result negativo")
		public void terceiroTest() {
			assertEquals(-5, calc.subtrair(5, 10), "O resultado deve ser igual a subtração dos argumentos");
		}
		
	}
	
	
	
	@BeforeEach
	public void initialize() {
		System.out.println("Iniciando novo teste...");
		calc = new Utilities();
	}

}
