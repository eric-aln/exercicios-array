package Array;

import java.util.Scanner;

public class Arrey2Intro {

	public static void main(String[] args) {
		
		//Programa que leia num[2][3] e mostre se Maior/Menor que 10
		
		final int linha=2,coluna=3;
		int[][] numeros = new int [linha][coluna];
		int contMaior10=0,contMenor10=0,l,i;
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<2;l++)
		{
			for(i=0;i<3;i++)
			{
				System.out.println("\nEntre com um número: ");
				numeros[l][i] = leia.nextInt();
			}
		}
		for(l=0;l<2;l++)
		{
			for(i=0;i<3;i++)
			{
				if (numeros[l][i]>10)
				{
					contMaior10++;
					System.out.println("\n"+numeros[l][i]+" <--Maior que 10");
				}
				else if(numeros[l][i]<10)
				{
					contMenor10++;
					System.out.println("\n"+numeros[l][i]+" <--Menor que 10");
				}
			}
			
		}

	}

}
