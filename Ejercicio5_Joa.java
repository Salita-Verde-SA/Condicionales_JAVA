//import java.net.PortUnreachableException;
//import java.util.ArrayList;
//import java.util.List;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_Joa {
    //Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
    //elige una opción al azar y determina quién gana. Imprime el resultado del juego.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] PiedraPapelTijera = {"piedra", "papel", "tijera"};

        System.out.println("Ingrese: \n> Piedra\n> Papel\n> Tijera");
        String JugadaPlayer1 = sc.nextLine().toLowerCase();

        if (!esOpcionValidaa(JugadaPlayer1, PiedraPapelTijera)) {
            System.out.println("Opción no válida. Por favor, elige entre piedra, papel o tijera.");
            return;
        }


        String CPU_Player = PiedraPapelTijera[random.nextInt(PiedraPapelTijera.length)];

        if (CPU_Player.equals("tijera") && JugadaPlayer1.equals("piedra")) {
            System.out.println("CPU PLAYER: " + CPU_Player + "\nPLAYER 1: " + JugadaPlayer1);
            System.out.println("Ganaste!");
        } else if (CPU_Player.equals("papel") && JugadaPlayer1.equals("tijera")) {
            System.out.println("CPU PLAYER: " + CPU_Player + "\nPLAYER 1: " + JugadaPlayer1);
            System.out.println("Ganaste!");
        } else if (CPU_Player.equals("piedra") && JugadaPlayer1.equals("papel")) {
            System.out.println("CPU PLAYER: " + CPU_Player + "\nPLAYER 1: " + JugadaPlayer1);
            System.out.println("Ganaste!");
        } else if (CPU_Player.equals("tijera") && JugadaPlayer1.equals("papel")) {
            System.out.println("CPU PLAYER: " + CPU_Player + "\nPLAYER 1: " + JugadaPlayer1);
            System.out.println("Perdiste!");
        } else if (CPU_Player.equals("papel") && JugadaPlayer1.equals("piedra")) {
            System.out.println("CPU PLAYER: " + CPU_Player + "\nPLAYER 1: " + JugadaPlayer1);
            System.out.println("Perdiste!");
        } else if (CPU_Player.equals("piedra") && JugadaPlayer1.equals("tijera")) {
            System.out.println("CPU PLAYER: " + CPU_Player + "\nPLAYER 1: " + JugadaPlayer1);
            System.out.println("Perdiste!");
        } else if (JugadaPlayer1.equals(CPU_Player)) {
            System.out.println("CPU PLAYER: " + CPU_Player + "\nPLAYER 1: " + JugadaPlayer1);
            System.out.println("Empate!"    );
        }
    }

    private static boolean esOpcionValidaa(String eleccion, String[] opciones) {
        for (String opcion : opciones) {
            if (opcion.equals(eleccion)) {
                return true;
            }
        }
        return false;
    }

}


