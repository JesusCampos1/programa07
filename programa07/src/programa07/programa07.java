package programa07;

import java.util.Scanner;

public class programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c;
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese los grados farenheit");
		double f = leer.nextDouble();
		c=(f-32)/8;
		System.out.println("La cantidad en grados farenheit es: "+f);
		System.out.println("La cantidad en grados centigrados es: "+c);

	}

}
