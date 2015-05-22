import java.lang.System;

public class mainClass {

	static void stampaSimboli(char simbolo, int lunghezza)
	{
		for(int i=0; i<lunghezza ; i++)
			System.out.print(simbolo);
	}
	
	static void messaggio(String ilMessaggio, char simbolo, int lunghezza)     //ilMessaggio è il parametro formale
	{
	//	stampaSimboli(simbolo,lunghezza);
		

		System.out.println(clona(simbolo,lunghezza));
		
		System.out.println("\n\n" + ilMessaggio + "\n");
		
		clona(simbolo,lunghezza);
		
		System.out.println(clona(simbolo,lunghezza));
		
	//	stampaSimboli(simbolo,lunghezza);
	}
	
	static String clona(char simbolo, int lunghezza)
	{
		String riga="";
		for(int i=0 ; i<lunghezza ; i++)
			riga += simbolo;			
		return riga;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double percentualeInteresse = 2.5; //percentuale di interesse annuale
//		double sommaDepositata = 1000; //in euro
//		
//		//dopo un anno
//		float f = 3.5555f;
//		
//        float fmaxvalue= Float.MAX_VALUE;
//		
//		String cognome = "toscano";
//		boolean controllaCognome = cognome.endsWith("no");
//		
//		System.out.println(controllaCognome);
//		

messaggio("ciao ciao", '#', 50);   // "ciao ciao" è il parametro attuale

		
		
	}

}
