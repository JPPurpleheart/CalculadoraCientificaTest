package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calculadoracientifica.CalculadoraCientifica;

/*a) Al menos 2 pruebas unitarias con la anotaci�n @Test V
 * b) Una prueba unitaria con @Test usando expected. V
 * c) Una prueba unitaria con @Test usando el time V
 * d) M�todo con @Before V
 * e) M�todo con @After V
 * f) M�todo con @BeforeClass V
 * g) M�todo con @AfterClass V
 * h) Alguna Clase parametrizada.
 * i) La creaci�n de una TestSuit.
 */

public class CalculadoraCientificaTest {

	static CalculadoraCientifica calccient;
	
	@Before
	public void before() {
		System.out.println("Creando calculadora cient�fica");
		calccient = new CalculadoraCientifica();
	}
	
	@BeforeClass
	public static void beforeClass() {
		Double a = 9.0;
		Double b = 3.0;
		if (a > b && a % b == 0)
			System.out.println("La divisi�n es exacta y su resto es cero");
		Double resultado = calccient.calcDiv(a, b);
		Double esperado = 3.0;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testSum() {
		Double a = 4.0;
		Double b = 5.0;
		Double resultado = calccient.calcSum(a, b);
		Double esperado = a + b;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testRes() {
		Double a = 4.0;
		Double b = 5.0;
		Double resultado = calccient.calcRes(a, b);
		Double esperado = a - b;
		assertEquals(esperado, resultado);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testMult() {
		Double resultado = calccient.calcMult(0.0, Double.POSITIVE_INFINITY);
	}
	
	@Test(timeout = 1)
	public void testDiv() {
		Double a = 30.0 * (10^70);
		Double b = 40.0 * (10^80);
		Double resultado = calccient.calcDiv(a, b);
		Double esperado = a/b;
		assertEquals(esperado, resultado);
	}
	
	@AfterClass
	public static void afterClass() {
		Double resultado = calccient.calcMult(3.0, 2.0);
		Double esperado = 6.0;
		assertEquals(esperado, resultado);
		System.out.println("Test finalizado con �xito");
	}
	
	@After
	public void after() {
		calccient.menu(true, true);
		System.out.println("Cerrando el Menu");
	}

}
