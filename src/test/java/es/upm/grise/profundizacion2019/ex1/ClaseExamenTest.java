package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises;

public class ClaseExamenTest {

	ClaseExamen test = new ClaseExamen();
	
	@Test // 1, 3, 4, 6
	public void test1() {
		float output_values[] = { 0, test.metodoAProbar(1, 1) }; // { Expected output, Actual output }
		assertEquals(output_values[0], output_values[1], 0.001*output_values[1]);
	}

	@Test // 1, 2, 1, 3, 5, 6
	public void test2() {
		float output_values[] = { 0, test.metodoAProbar(1, 0) }; // { Expected output, Actual output }
		assertEquals(output_values[0], output_values[1], 0.001*output_values[1]);
	}
	

}
