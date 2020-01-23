/*
Main.java
Martin Amado - 19020
Luis Pedro Garcia - 19344
Programa main, envia datos recibidos al controlador
*/

import java.util.*;

public class Main{
	public static void main(String[] args){
		Controlador control = new Controlador();
		Scanner scan = new Scanner(System.in);
		int ingreso = 0;
		control.iniciarListas();
		System.out.println("Bienvenido a la radio");
		while(ingreso != 10){
			System.out.println("\n \nIngrese la opcion que desea\n1. Encender radio\n2. Cambiar de frecuencia\n3. Avanzar de estacion\n4. Guardar emisora actual\n5. Escoger emisora guardada\n6. Apagar el radio");
			ingreso = scan.nextInt();
			control.accion(ingreso);
		}


	}
}