package no.hvl.dat100;

public class Matrise {

	public static void main(String[] args) {
		
	//a)
	skrivUt(tabell);
	
	//b)
    String strengTabell = tilStreng(tabell);
    System.out.println(posisjonTall(tabell, 9));
    
    //c)
    System.out.println(summerFor(tabell));
    System.out.println(summerWhile(tabell));
    System.out.println(summerUtvidetFor(tabell));
    
    //d)
    System.out.println("Finnest tallet?" + finnesTall(tabell, 5));
    
    //e)
    System.out.println("Tallet har posisjonen: " + posisjonTall(tabell, 9));
    
    //f)
    int [] revers;
    revers = reverser(tabell);
    skrivUt(revers);
    
    //g)
    System.out.println(erSortert(tabell));
    
    //h)
    int [] ssTab = settSammen(tabell, tabell2);
    skrivUt(ssTab);
	}
	
	
	private static int [] tabell = {1, 3, 5, 7, 9};
	private static int [] tabell2 = {2, 4, 6, 8};

	//a)
	private static void skrivUt (int[] tabell) {
		for(int v : tabell) {
			System.out.print(v + " ");
		}
		System.out.println();
	}
	
	//b)
	private static String tilStreng (int[] tabell) {
		String tabellTekst = "[";
		for(int v = 0; v < tabell.length; v++) {
		tabellTekst = tabellTekst + Integer.toString(tabell[v]);
		if (v<tabell.length-1) {
			tabellTekst += ",";}
		}		
		tabellTekst += "]";
		return tabellTekst;
	}
	
	//c)
	public static int summerFor (int[] tabell) {
		int sum = 0;
		for (int v = 0; v<tabell.length; v++) {
			sum += tabell[v];
		}
		return sum;
	}
	public static int summerWhile (int[] tabell) {
		int sum = 0;
		int v = 0;
		while (v < tabell.length) {
			sum += tabell[v];
			v++;
		}
		return sum;
	}
	public static int summerUtvidetFor (int[] tabell) {
		int sum = 0;
		for (int v : tabell) {
			sum += v;
		}
		return sum;
	}
	
	//d)
	public static boolean finnesTall (int[] tabell, int tall) {
		
		boolean finnes = false;
		for (int v : tabell) {
			if (v==tall) {
				finnes = true;
			}
		}
		return finnes;
	}
	
	//e)
	public static int posisjonTall (int[] tabell, int tall) {
		int returTall = -1;
		for (int v=0; v<tabell.length; v++) {
			if( tabell[v] == tall) {
				returTall = v;
			}
		}
		return returTall;
		}
	
	
	//f)
	public static int[] reverser(int[] tabell) {
		int[] nyTabell = new int[tabell.length];
		int x = tabell.length-1;
		for(int v = 0; v<tabell.length; v++) {
			nyTabell[x] = tabell[v];
			x--;
		}
		return nyTabell;
	}
	
	//g)
	public static boolean erSortert (int[] tabell) {
		boolean sortert = false;
		for(int v = 1; v<tabell.length; v++) {
			if (tabell[v-1] > tabell[v]) {
				return sortert;
			}
		}
		sortert = true;
		return sortert;
	}
	
	//h)
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int[] nytabell = new int[tabell1.length + tabell2.length];
		for(int v = 0; v < tabell1.length; v++) {
			nytabell[v] = tabell1[v];
		}
		for(int x = 0; x < tabell2.length; x++) {
			nytabell[x + tabell1.length] = tabell2[x];
		}
		return nytabell;
	}
	
	}
	    	

