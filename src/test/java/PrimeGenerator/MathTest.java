package PrimeGenerator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.*;

public class MathTest {
	private static Math math;
	
	@BeforeClass
    public static void prepareAll() {
        System.out.println("before class");
        math = new Math();
    }
    @Test
    public void NumeroPrimoGeneratorWorks() {
        assertEquals(new LinkedList<Integer>(), math.PrimeNumberGenerato(1));
        assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), math.PrimeNumberGenerato(20));
    }
    @Test
    public void isPrimeWorks() {
        assertFalse(math.isPrime(9));
        assertFalse(math.isPrime(1));
        assertTrue(math.isPrime(2));
        List<Integer> primes = Arrays.asList(11,13,17,19,25);
        for(int prime: primes) {
            assertTrue(math.isPrime(prime));
        }
    }

}
