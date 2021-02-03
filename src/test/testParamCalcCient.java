package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import calculadoracientifica.CalculadoraCientifica;

@RunWith(value = Parameterized.class)
public class testParamCalcCient {

	@Parameters
	public static Iterable<Object[]> getDatos(){
		List<Object[]> parametrosResta = new ArrayList<>();
		parametrosResta.add(new Object[] {3, 2, 1});
		parametrosResta.add(new Object[] {4, 2, 2});
		parametrosResta.add(new Object[] {5, 2, 3});
		parametrosResta.add(new Object[] {6, 2, 4});
		parametrosResta.add(new Object[] {7, 2, 5});
		return parametrosResta;
	}
	
	public Double a, b, expected;

	public void CalculadoraParametro(Double a, Double b, Double expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test
	public void testRes() {
		Double resultado = CalculadoraCientifica.calcRes(a, b);
		Double expected = a + b;
		assertEquals(expected, resultado);
	}
}
