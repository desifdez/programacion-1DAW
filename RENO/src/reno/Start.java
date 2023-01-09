package reno;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//robots
		Robot robotSona = new Robot("Sona", 100);
		Robot robotMarvin = new Robot("Marvin", 100);
		
		//imprimir
		System.out.println(robotSona);
		System.out.println(robotMarvin);
		
		//batalla
		//se inicia la lucha mientras que ambos robots tengas puntos de vida
		while (robotSona.getPuntosVida() > 0 && robotMarvin.getPuntosVida() > 0) {
			/* Es el turno del primer robot, 
			 * se inicia si sus puntos de vida es mayor a 0
			 */
			while (robotSona.getPuntosVida() > 0) {
					//si Sona ataca con mas fuerza que con la que se defiende Marvin	
					if (robotSona.getAtaque() > robotMarvin.getDefensa()) {
							robotMarvin.puntosVida -= robotSona.getAtaque();
					}
					//si Sona ataca con menos fuerza que con la que se defiende Marvin	
					if (robotSona.getAtaque() < robotMarvin.getDefensa()) {
						robotSona.puntosVida -= robotMarvin.getDefensa();
					}
					//si Sona ataca con la misma fuerza que con la que se defiende Marvin	
					if (robotSona.getAtaque() == robotMarvin.getDefensa()) {
						
					}
					//lo que quiero imprimir por pantalla
					System.out.println("____________________________________________________________________________");
					System.out.println ("TURNO DE SONA");
					System.out.println ("El robot Sona ha atacado: "+ robotSona.getAtaque());		
					System.out.println ("El robot Marvin se ha defendido: "+ robotMarvin.getDefensa());	
					System.out.println ("El robot Sona tiene una vida de: "+ robotSona.getPuntosVida());					
					System.out.println ("El robot Marvin tiene vida: "+ robotMarvin.getPuntosVida());					
			}
			/* Es el turno del sengundo robot, 
			 * se inicia si sus puntos de vida es mayor a 0
			 */
			while (robotMarvin.getPuntosVida() > 0)	{	
					//si Marvin ataca con mas fuerza que con la que se defiende Sona	
					if (robotMarvin.getAtaque() > robotSona.getDefensa()) {
						robotSona.puntosVida -= robotMarvin.getAtaque();				
					}
					//si Marvin ataca con menos fuerza que con la que se defiende Sona
					if (robotMarvin.getAtaque() < robotSona.getDefensa()) {
						robotMarvin.puntosVida -= robotSona.getDefensa();
					}
					//si Marvin ataca con la misma fuerza que con la que se defiende Sona
					if (robotMarvin.getAtaque() == robotSona.getDefensa()) {
						
					}
					//lo que quiero imprimir por pantalla
					System.out.println("____________________________________________________________________________");
					System.out.println ("TURNO DE MARVIN");
					System.out.println ("El robot Marvin ha atacado: "+ robotMarvin.getAtaque());		
					System.out.println ("El robot Sona se ha defendido: "+ robotSona.getDefensa());	
					System.out.println ("El robot Marvin tiene una vida de: "+ robotMarvin.getPuntosVida());					
					System.out.println ("El robot Sona tiene vida: "+ robotSona.getPuntosVida());
			}
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("FIN DE LA BATALLA");
		System.out.println ("El robot Sona tiene una vida de = "+ robotSona.getPuntosVida());
		System.out.println ("El robot Marvin tiene una vida de = "+ robotMarvin.getPuntosVida());
		System.out.println("------------------------------------------------------------------------------");
	}

}
