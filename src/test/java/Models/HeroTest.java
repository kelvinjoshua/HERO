package Models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void instantiatesCorrectly_true() throws Exception{
        Hero testSup = new Hero("A-train",26,"SuperSpeed","compoundV","Rapid healing");
        assertTrue(testSup instanceof Hero);
    }
}
