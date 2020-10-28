package PrimeGenerator;

import java.util.LinkedList;
import java.util.List;

public class Math {
	public List<Integer> PrimeNumberGenerato(Integer x) {
		List<Integer> lista = new LinkedList<Integer>();
		for(Integer tmp = 1; tmp <= x; tmp++) {
			if(isPrime(tmp))
				lista.add(tmp);
		}
		return lista;
	}
	
	public boolean isPrime(Integer x) {
		for(Integer tmp = 2; tmp<=x/2; tmp++) {
			if(x % tmp == 0)	
				return false;
		}
		return true;
	}
}
