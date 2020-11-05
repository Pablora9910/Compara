package es.studium.Comparar;

import java.util.Scanner;

public class Comparar
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		System.out.println( "Dame un numero" );
		numero1=teclado.nextInt();
		System.out.println( "Dame un numero" );
		numero2=teclado.nextInt();
		if (numero1 == numero2)
		{
			System.out.println( numero1 + " es igual " + numero2 );
		}
		else
		{
			if (numero1 <= numero2)
			{
				System.out.println( numero2 + " es mayor " + numero1 );
			}
			else 
			{
				System.out.println( numero2 + " es menor " + numero1 );
			}
		}
		teclado.close();

	}

}


/*
 
 PROGRAMA ejercicio7
VARIABLES
	ENTERO a,b
INICIO
	ESCRIBIR "Introduce el primer número"
	LEER a
	ESCRIBIR "Introduce el segundo número"
	LEER b
	SI a=b ENTONCES
			ESCRIBIR a +"="+ b 
		SINO 
			SI a>b ENTONCES
				EESCRIBIR a +"Es mayor que "+ b
			SINO
				ESCRIBIR b +"Es mayor que "+ b
			FINSI
		FINSI
FIN
*/