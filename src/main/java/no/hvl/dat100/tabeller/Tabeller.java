package no.hvl.dat100.tabeller;
//test

public class Tabeller {
	
	
	

	// a)
	public static void skrivUt(int[] tabell) {

		for(int e: tabell) {
			System.out.println(e);
		}
		
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		StringBuilder tilStreng = new StringBuilder();
		String resultat;
		
		tilStreng.append("[");
		
		for(int i = 0; i < tabell.length; i++) {
			
			tilStreng.append(tabell[i]);
			
			if(i < tabell.length - 1) {
				tilStreng.append(",");
			}	
			
		
		}
		tilStreng.append("]");
		
		resultat = tilStreng.toString();
		
		return resultat;
		
	}

	// c)
	public static int summer(int[] tabell) {
		
		int resultat = 0;
		
		for(int e : tabell) {
			
			resultat += e;
			
		}
		
		return resultat;
	
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		
		for(int i = 0; i < tabell.length; i++) {
			
			if(tabell[i] == tall) {
				funnet = true;
				
			}
			
		}
		
		return funnet;
		

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		boolean funnet = false;
		int posisjon = -1;
		int i = 0;
		
		while( i < tabell.length && !funnet) {
			
			if(tabell[i] == tall) {
				posisjon = i;
				funnet = true;
			}
			
			i++;
		}
		
		return posisjon;

		
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int[] reversert = new int[tabell.length];
		int pos = tabell.length-1;
		
		for(int i = 0; i < tabell.length; i++) {
			
			reversert[i] = tabell[pos];
			pos--;
			
		}
		

		
		
		
		return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		

		int i = tabell.length - 1;
		
		while(i > 0) {
			
			if(tabell[i] < tabell[i-1]) {
				return false;
			}
			i--;
		}
		
		
		
		return true;


	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sattSammen = new int[tabell1.length + tabell2.length];
		int s = tabell1.length;
		
		for(int i = 0; i < tabell1.length; i++) {
			
			sattSammen[i] = tabell1[i];
			
		}
		for(int j = 0; j < tabell2.length; j++) {
			
			sattSammen[s] = tabell2[j];
			s++;
		}
		
		return sattSammen;

	}
}
