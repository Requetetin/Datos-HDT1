/*
Controlador.java
Recibe los datos ingresados por el usuario y decide que hacer con ellos
*/

import java.util.*;

public class Controlador{
	miRadio radio = new RadioN();
	Scanner scan = new Scanner(System.in);

	public void iniciarListas(){

	}
	public void accion(int valor){
		if(radio.estado() || valor == 1){
		switch(valor){//Cada caso depende de lo que el usuario ingreso
			
		
			case 1:
			if(radio.estado()==true ){											//Usa la funcion estado, para recibir si esta encendido o apagado (true significa que esta encendido)
				System.out.println("\n \nEl radio ya esta encendido\n \n");		//Si es true, no hace nada
			}
			else{
				System.out.println("\n \nEl radio se ha encendido\n ");			//Si es false, utiliza onOff para cambiar el estado a encendido
				radio.onOff();
				System.out.println("Estas en la estacion: 87.9");
			}
			 break;


			case 2:
			System.out.println("\n \nUsted ha cambiado de frecuencia\n \n");		//Se muestra mensaje, luego se usa cambiarFrecuencia y se muestra la estacion actual
			radio.cambiarFrecuencia();
			 break;


			case 3:
			radio.avanzar();											//Usa avanzar, y luego muestra la estacion actual
			System.out.println("Estas en la estacion: ");
			System.out.println(radio.estacionActual());
			 break;


			case 4:
			System.out.println("\n \nEn que boton lo desea guardar? (1-12)");		//Le pide el numero del usuario, y se manda a la funcion guardar
			int num = scan.nextInt();
			radio.guardar(num);
			 break;


			case 5:
			System.out.println("\n \nQue boton de su radio quiere usar?");	//Se le pide el numero de estacion que quiere y luego se manda a la funcion seleccionarEmisora
			int num2 = scan.nextInt();
			radio.seleccionarEmisora(num2);
			 break;


			case 6:
			if(radio.estado()== true){											//Usa la funcion estado, para saber si esta encendido
				System.out.println("\n \nSe ha apagado el radio\n \n");			//Si es true, usa onOff para cambiar el estado
				radio.onOff();
			}
			else{
				System.out.println("\n \nEl radio ya esta apagado\n \n");			//Si es false, no hace nada
			}
			 break;
		}
	}
	}
}
