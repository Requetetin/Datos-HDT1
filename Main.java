//Main.java

import java.util.*;

public class Main{
	public static void main(String[] args){
		Controlador control = new Controlador();
		Scanner scan = new Scanner(System.in);
		int ingreso = 0;
		control.iniciarListas();
		while(ingreso != 10){
			System.out.println("\n \nBienvenido a la radio, ingrese la opcion que desea\n1. Encender radio\n2. Cambiar de frecuencia\n3. Avanzar de estacion\n4. Guardar una emisora\n5. Escoger emisora guardada\n6. Apagar el radio");
			ingreso = scan.nextInt();
			control.accion(ingreso);
		}


	}
}