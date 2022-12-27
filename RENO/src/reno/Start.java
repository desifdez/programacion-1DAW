package reno;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//robots
		Robot robotSona = new Robot();
		robotSona.setNombre("Sona");
		robotSona.setPuntosVida(100);
		robotSona.setAtaque(60);
		robotSona.setDefensa(40);
		
		Robot robotMarvin = new Robot();
		robotMarvin.setNombre("Marvin");
		robotMarvin.setPuntosVida(0);
		robotMarvin.setAtaque(40);
		robotMarvin.setDefensa(60);
		
		//imprimir
		System.out.println(robotSona);
		System.out.println(robotMarvin);
	}

}
