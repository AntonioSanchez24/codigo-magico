package paquete;

import java.util.Scanner;

public class CodigoMagico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce texto, se imprimir�n las primeras cuatro letras");
		String texto = sc.next();
		System.out.println(texto.substring(0, 4));
		/*El substring deber�a ser (0, 4) en vez de (1, 4)*/
		sc.close();
	}
}
