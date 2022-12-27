package reno;

public class Robot {

	//atributos
	private String nombre;
	private int puntosVida=100;
	private int ataque = (int)(Math.random()*100+1);
	private int defensa = (int)(Math.random()*40+1);
	
	//constructor
	public Robot (String nombre, int puntosVida) {
		this.nombre = nombre;
		this.puntosVida = puntosVida;
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	//toString
	@Override
	public String toString() {
		return "Robot [nombre=" + nombre + ", puntosVida=" + puntosVida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", getNombre()=" + getNombre() + ", getPuntosVida()=" + getPuntosVida() + ", getAtaque()="
				+ getAtaque() + ", getDefensa()=" + getDefensa() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
