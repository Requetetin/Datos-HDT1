/*
RadioN.java
RadioN implementa la interfaz miRadio y define como se haran las diversas operaciones
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;
public class RadioN implements miRadio{
	
	DecimalFormat df = new DecimalFormat("#00.#");
	
	
	private boolean estado = false ;
	private double estacionActual = 87.9;
	private String estacionActualp;
	private String frecuenciaActual = "FM" ;
	private int guardadas;

	
	
	ArrayList<String> guardadasFM = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" ));
	ArrayList<String> guardadasAM = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" ));
	
	
	
	public String estacionActual(){

		return estacionActualp;
	}
	
	
	public boolean estado(){
		return estado;

		
	}
	public void onOff(){
		if(estado==true) {
			estado = false;
		}
		else {
			estado = true;
		}

	}
	public void cambiarFrecuencia(){
		if (frecuenciaActual == "FM") {
			frecuenciaActual = "AM";
			estacionActual = 530;
			estacionActualp =df.format(estacionActual);
			System.out.println("Ahora estas en AM");
			
		}
		else {
			frecuenciaActual = "FM";
			estacionActual = 87.9;
			estacionActualp = df.format(estacionActual);
			System.out.println("Ahora estas en FM");
			
		}
		
		

	}
	public void avanzar(){
		if (frecuenciaActual.equals("FM")) {
			estacionActual= estacionActual +0.2;
			estacionActualp = df.format(estacionActual);
			if(estacionActual > 108){
				estacionActual = 87.9;
				estacionActualp = df.format(estacionActual);
			}
		}
		
		if (frecuenciaActual.equals("AM")) {
			estacionActual= estacionActual + 10;
			estacionActualp = df.format(estacionActual);
			if(estacionActual > 1615){
				estacionActual = 530;
				estacionActualp = df.format(estacionActual);
			}
		}
		
		
		
		}

	
	public void guardar(int boton){
		if (boton > 12) {
			System.out.println ("Solo hay 12 botones.");
		}
		else if (guardadas == 12) {
			System.out.println("Solo puedes guardas hasta 12.");
		}
		
			
		
		
		
		
		if (frecuenciaActual.equals("FM")){
			guardadasFM.set(boton-1, " "+estacionActual);
		}
		
		else if (frecuenciaActual.equals("AM")) {
			guardadasAM.set(boton-1, " "+estacionActual);
		}
	}
		
		
		
		
		
		
		
		
		

	
	public void seleccionarEmisora(int boton){
		if (frecuenciaActual.equals("FM")) {
			System.out.println("En este boton esta guardada la siguiente emisora: ");
			System.out.println(guardadasFM.get(boton-1));
		}
		else if (frecuenciaActual.equals("AM")) {
			System.out.println("En este boton esta guardada la siguiente emisora: ");
			System.out.println(guardadasAM.get(boton-1));
		}
		
		

	}
	

	
	
	
	
	
	
	
	}
	
