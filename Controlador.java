//Controlador.java

import java.util.*;

public class Controlador{
	miRadio radio = new RadioN();
	Scanner scan = new Scanner(System.in);

	public void iniciarListas(){

	}
	public void accion(int valor){
		switch(valor){ 													//Cada caso depende de lo que el usuario ingreso
			case 1:
			if(radio.estado()){											//Usa la funcion estado, para recibir si esta encendido o apagado (true significa que esta encendido)
				System.out.println("\n \nEl radio ya esta encendido\n \n");		//Si es true, no hace nada
			}
			else{
				System.out.println("\n \nEl radio se ha encendido\n \n");			//Si es false, utiliza onOff para cambiar el estado a encendido
				radio.onOff();
			}
			 break;


			case 2:
			System.out.println("\n \nUsted ha cambiado de frecuencia\n \n");		//Se muestra mensaje, luego se usa cambiarFrecuencia y se muestra la estacion actual
			radio.cambiarFrecuencia();
			System.out.println(radio.estacionActual());
			 break;


			case 3:
			radio.avanzar();											//Usa avanzar, y luego muestra la estacion actual
			System.out.println(radio.estacionActual());
			 break;


			case 4:
			System.out.println("\n \nEn que numero lo desea guardar?");		//Le pide el numero del usuario, y se manda a la funcion guardar
			int num = scan.nextInt();
			radio.guardar(num);
			 break;


			case 5:
			System.out.println("\n \nQue numero de estacion quiere usar?");	//Se le pide el numero de estacion que quiere y luego se manda a la funcion seleccionarEmisora
			int num2 = scan.nextInt();
			radio.seleccionarEmisora(num2);
			 break;


			case 6:
			if(radio.estado()){											//Usa la funcion estado, para saber si esta encendido
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