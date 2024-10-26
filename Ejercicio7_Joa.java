import java.util.Scanner;

public class Ejercicio7_Joa {
    //Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
    //recomiende una actividad basada en su estado de ánimo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su estado de animo: \n1- Feliz\n2- Triste\n3- Energetico\n4- Relajado");
        int estadoDeAnimo = sc.nextInt();

        if (estadoDeAnimo == 1) {
            System.out.println("ESTAS FELIZ! Es perfecto para poder pasar tiempo en familia y con amigos, tambien para hacer ejercicio\n o practicar algun hobby :D");
        } else if (estadoDeAnimo == 2) {
            System.out.println("ESTAS TRISTE D:! Algunas actividades que puedes hacer son:\n1- Hablar con alguien de confianza\n2- Escribir un diario\n3- Hacer ejercicio\n4- Meditar o practicar mindfulness");
        } else if (estadoDeAnimo == 3) {
            System.out.println("ES UN BUEN DIA PARA SER ENERGETICO! Puedes hacer estas actividades para aprovechar la energia: Hacer Ejercicio, Completar Tareas pendientes y por que no! APRENDER ALGO NUEVO");
        } else if (estadoDeAnimo == 4) {
            System.out.println("RELAJADISIMO! podrias leer un buen libro, escuchar musica relajante o incluso PASAR TIEMPO EN LA NATURALEZA!!");
        } else {
            System.out.println("Ingrese su estado de animo por favor");
        }
    }
}