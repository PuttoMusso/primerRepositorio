package procesos;

import java.io.IOException;
import java.util.Scanner;

public class Scanner {

	public static void main(String[] args) throws IOException {
		
		/*
		 * la clase scanner se usa para la entrada de datos (input) se encuentra en el paquete java.util
		 * para usar la clase, crea un objeto de clase scanner y usar cualquiera de sus metodos. 
		 * por ejemplo .nextLine() se usa para introducir Strings.
		 */
		
		/*
		 * Metodos:
		 * 
		 * .nextBoolean()	lee un boleano del usuario.
		 * .nextByte()		lee un valor byte del usuario.
		 * .nextDouble()	lee un doble del usuario.
		 * .nextFloat()		lee un float del usuario.
		 * .nextInt()		lee un int del usuario.
		 * .nextLine()		lee un Sting del usuario.
		 * .nextLong()		lee un long del usuario.
		 * .nextShort()		lee un short del usuario. 
		 */
		
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce tu nombre, edad y salario: ");
		
		String nombre = escaner.nextLine();
		int edad = escaner.nextInt();
		double salario = escaner.nextDouble();
		
		System.out.println("Tu Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Salario: " + salario);
		
		escaner.close();
		
	}
}
