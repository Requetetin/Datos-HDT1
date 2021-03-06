/*
miRadio.java
Interfaz miRadio que define las funciones a utilizar
*/

public interface miRadio{
	public String estacionActual();
	public boolean estado();
	public void onOff();
	public void cambiarFrecuencia();
	public void avanzar();
	public void guardar(int boton);
	public void seleccionarEmisora(int boton);
}