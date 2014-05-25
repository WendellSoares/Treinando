

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AgenciaDeTurismoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AgenciaDeTurismoTest
{
    /**
     * Default constructor for test class AgenciaDeTurismoTest
     */
    public AgenciaDeTurismoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void GetSet()
    {
        AgenciaDeTurismo agencia1 = new AgenciaDeTurismo();
        agencia1.setNome("CVC");
        agencia1.setNumeroEstrelas(3);
        assertEquals("CVC", agencia1.getNome());
        assertEquals(3, agencia1.getNumeroEstrelas());
    }

    @Test
    public void duasAgencias()
    {
        AgenciaDeTurismo agencia1 = new AgenciaDeTurismo();
        agencia1.setNome("CVC");
        agencia1.setNumeroEstrelas(5);
        AgenciaDeTurismo agencia2 = new AgenciaDeTurismo();
        agencia2.setNome("Classic");
        agencia2.setNome("Classic");
        agencia2.setNumeroEstrelas(3);
        assertEquals("CVC", agencia1.getNome());
        assertEquals(5, agencia1.getNumeroEstrelas());
        assertEquals("Classic", agencia2.getNome());
        assertEquals(3, agencia2.getNumeroEstrelas());
    }
}


