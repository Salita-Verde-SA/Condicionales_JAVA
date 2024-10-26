import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ejercicio1_Joa {

    // Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama, ciencia ficción) y luego recomiende una película basada en su elección.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su genero de pelicula favorito (comedia, terror, ciencia ficcion, drama): ");
        String pelicula = sc.nextLine().toLowerCase();

        if (pelicula.equals("comedia")){
            System.out.println("Pelicula de comedia recomendada: Proyecto X");
        } else if (pelicula.equals("terror")) {
            System.out.println("Pelicula de terror recomendada: hereditary");
        } else if (pelicula.equals("ciencia ficcion")) {
            System.out.println("Pelicula de ciencia ficcion recomendada: Blade Runner");
        } else if (pelicula.equals("drama")) {
            System.out.println("Pelicula drama recomendada: Interestelar");
        } else {
            System.out.println("Disculpa, genero irreconocible");
        }

        sc.close();
    }
}
