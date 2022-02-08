import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
        double nivel = tank.getDepositoNivel();
        assertEquals(0.0,nivel);
	}

	@Test
	void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
        double nivelMax = tank.getDepositoMax();
        assertEquals(40.0,nivelMax);

	}

	@Test
	void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
        boolean nivel = tank.estaVacio();
        assertTrue(nivel);

	}

	@Test
	void testEstaLleno() {
		fail("Not yet implemented");
	}

	@Test
	void testFill() {
		fail("Not yet implemented");
	}

	@Test
	void testConsumir() {
		fail("Not yet implemented");
	}

}
