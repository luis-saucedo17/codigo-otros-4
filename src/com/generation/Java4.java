package com.generation;

// Importar Scanner
import java.util.Scanner;

public class Java4 {
    public static void main(String[] args) {
    	//Faltaba el argumento del método Scanner
        Scanner s = new Scanner(System.in);
        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        // Turno del jugador 2
        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        Scanner s2 = new Scanner(System.in);
        //No se hacía uso de la variable s2
        String j2 = s2.nextLine();
        
        // En lugar de hacer la comparación, usar el método equals
        // Faltaban los break en algunos case
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    // No tenia la llave que cerraba el bloque
                    break;
                // El case debe ser tijeras 
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Gana el jugador " + g);
        }
    }
}