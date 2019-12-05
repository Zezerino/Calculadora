import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


class BrunoTest {

	Utilities calc;
	
	@Nested
	@DisplayName("quando testamos a subtra��o, ")
	class Subt{
		
		@Test
		@DisplayName("test result positivo")
		public void primeiroTest() {
			assertEquals(5, calc.subtrair(10, 5), "O resultado deve ser igual a subtra��o dos argumentos");
	
		}
		
		@Test
		@DisplayName("teste result = 0")
		public void segundoTest() {
			assertEquals(0, calc.subtrair(5, 5), "O resultado deve ser igual a subtra��o dos argumentos");
		}
		
		@Test
		@DisplayName("teste result negativo")
		public void terceiroTest() {
			assertEquals(-5, calc.subtrair(5, 10), "O resultado deve ser igual a subtra��o dos argumentos");
		}
		
	}
	
	
	@Nested
	@DisplayName("quando testamos a multiplica��o, ")
	class Mult{
		
		@Test
		@DisplayName("1�test result positivo")
		public void positivo() {
			assertEquals(10, calc.multiplicar(5, 2), "O resultado deve ser igual a multiplica��o dos argumentos");
	
		}
		
		@Test
		@DisplayName("2�test result positivo")
		public void positivo2() {
			assertEquals(10, calc.multiplicar(-5, -2), "O resultado deve ser igual a multiplica��o dos argumentos");
	
		}
		
		@Test
		@DisplayName("1�teste result = 0")
		public void igualZero() {
			assertEquals(0, calc.multiplicar(19028390, 0), "O resultado deve ser igual a multiplica��o dos argumentos");
		}
		
		@Test
		@DisplayName("2�teste result = 0")
		public void igualZero2() {
			assertEquals(0, calc.multiplicar(0, 0), "O resultado deve ser igual a multiplica��o dos argumentos");
		}
		
		@Test
		@DisplayName("1�teste result negativo")
		public void negativo() {
			assertEquals(-50, calc.multiplicar(-5, 10), "O resultado deve ser igual a multiplica��o dos argumentos");
		}
		
		@Test
		@DisplayName("1�teste result negativo")
		public void negativo2() {
			assertEquals(-50, calc.multiplicar(5, -10), "O resultado deve ser igual a multiplica��o dos argumentos");
		}
		
	}
	
	
	@BeforeEach
	public void initialize() {
		System.out.println("Iniciando novo teste...");
		calc = new Utilities();
	}

}
