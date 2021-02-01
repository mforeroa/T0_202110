package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo 
{
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() 
	{
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() 
	{
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}

	@Test
	public void testModelo() 
	{
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano() 
	{
		// TODO
		setUp2();
		int tamanio = modelo.darTamano();
		assertEquals("No concuerda el tamaño",CAPACIDAD,tamanio);
	}

	@Test
	public void testAgregar() 
	{
		// TODO Completar la prueba
		modelo.agregar(""+0);
		String buscado= modelo.buscar(""+0);
		assertNotNull(buscado);
		assertEquals(1,modelo.darTamano());
	}

	@Test
	public void testBuscar() 
	{
		setUp2();
		// caso de prueba 1
		assertNotNull(modelo.buscar(""+5));
		// Caso de prueba 2
		assertNull("No deberia encontar el elemento",modelo.buscar("x"));
		// TODO Completar la prueba
	}

	@Test
	public void testEliminar() 
	{
		setUp2();
		
		String resultado = modelo.eliminar(""+6);
		assertEquals( "Debió eliminar el elemento", ""+6,resultado );
		assertNull( "El elemento no deberia existir", modelo.buscar(""+6) );
		// TODO Completar la prueba
		
	}

}
