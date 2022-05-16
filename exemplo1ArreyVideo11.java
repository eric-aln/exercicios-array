package Array;

import java.util.Scanner;

public class exemplo1ArreyVideo11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
		int[] arrayUm = {12,3,5,68,9,73,44,456,65,321};
		int[] arrayDois = {43,42,4,8,55,21,2,45};
		
		float[] nota=new float[5];
		
		//Tamanho do array
		if (arrayDois.length >8) {
		System.out.println ("tamanho do arrayDois - Maior que 8!");
		}
		else {
			System.out.println("Tamanho do arrayDois - Menor que 8!");
		}
		System.out.println("\nTamanho do arrayUm = "+arrayUm.length);
		
		//Utilização do for-each
		String[] cars = {"Volvo", "","Ford", "Mazda"};
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		//Populando um array
		for(int i=0;i<5;i++) {
			System.out.println("\nEntre com uma nota: ");
			nota[i]=entrada.nextFloat();
		}
		//apresentando um array
		for(int i=0;i<5;i++) {
			System.out.println("Nota "+i+1+"="+nota[i]);
		}

	}

}
