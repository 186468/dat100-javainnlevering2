package no.hvl.dat100.matriser;

public class Matriser {
	

	// a)
	public static void skrivUt(int[][] matrise) {
		
		
		
		for(int rad[] : matrise) {
			System.out.print("[");
			for(int e : rad ) {
				
				System.out.print(e);
				
				
			}
			
			System.out.println("]");
		}
		
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		StringBuilder tilStreng = new StringBuilder();
		String resultat = null;
		
		
		for(int rad[] : matrise) {
			for(int e : rad ) {
				
				tilStreng.append(e + " ");
				
				
			}
			tilStreng.append("\n");
			
			
			
		}
		resultat = tilStreng.toString();
		
		return resultat;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
