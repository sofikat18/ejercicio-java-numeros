import java.util.Scanner;
public class EjercicioNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Debe diseñar un programa que reciba 3 números por consola y determine 
		 * cual de los 3 números es el mayor.
			Plus: Imprimir los números ordenados de mayor a menor.
			Plus: Imprimir los números ordenados de menor a mayor.
		 */
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe tu primer número: ");
		int num1 = leer.nextInt();
		
		System.out.println("Escribe tu segundo número: ");
		int num2 = leer.nextInt();
		
		System.out.println("Escribe tu tercer y último número: ");
		int num3 = leer.nextInt();
		
		System.out.println("El mayor de los números que ingresaste es:");
		System.out.println(numMayor(num1, num2, num3));
		int [] arrNuevo = mayorAMenor(num1, num2, num3);
		
		System.out.println("El orden de mayor a menor de tus números es: ");
		//Se necesita el ciclo for para acceder a cada uno de los index del array
		for (int i = 0; i < arrNuevo.length; i++) {
			System.out.println(arrNuevo[i]);
		}
		
		leer.close();
		
	}
	
	public static int numMayor (int num1, int num2, int num3) {
		int mayor = 0;
		
		if (num1 > num2 && num2 > num3) {
			mayor = num1;
		} else if (num1 < num2 && num2 > num3) {
			mayor = num2;
		} else {
			mayor = num3;
		}
		
		return mayor; 
	}
	/*
	*Recordar que para devolver un arreglo, el método/función tiene que incluir
	*los corchetes en la declaración inicial
	*/
	public static int[] mayorAMenor (int num1, int num2, int num3) {
		int mayor = 0;
		int medio = 0;
		int menor = 0;
		
		
		if (num1 > num2) {
			mayor = num1;
			if (num2 > num3) {
				medio = num2;
				menor = num3;
			} else {
				medio = num3;
				menor = num2;
			}
			
		} else if (num1 < num2 && num2 > num3) {
			mayor = num2;
			if (num1 > num3) {
				medio = num1;
				menor = num3;
			} else {
				medio = num3;
				menor = num1;
			}
		} else {
			mayor = num3;
			if (num1 > num2) {
				medio = num1;
				menor = num2;
				
			} else {
				medio = num2;
				menor = num1;
				
			}
			
		}
		
		//Se declara al final el arreglo, para que guarde los nuevos valores
		int [] arreglo = {mayor, medio, menor};
		return arreglo;
	}
	

}
