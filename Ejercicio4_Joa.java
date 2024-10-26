import java.util.Scanner;

public class Ejercicio4_Joa {

    //Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
    //calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
    //peso, peso normal, sobrepeso, obesidad)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso ( Kg ): ");
        double peso = scanner.nextDouble();

        System.out.println();
        System.out.print("Ingrese su altura ( Mts ): ");
        double Altura = scanner.nextDouble();

        double IMC = peso / (Altura * Altura);

        System.out.println("Su indice de masa corporal es: " + IMC);

        if (IMC < 18.5) {
            System.out.println("Estas en la categoria de Bajo Peso");
        } else if (18.5 <= IMC && IMC < 24.9) {
            System.out.println("Estas en la categoria de Peso Normal");
        } else if (25 <= IMC && IMC < 29.9) {
            System.out.println("Estas en la categoria de Sobrepeso");
        } else if (IMC >= 30) {
            System.out.println("Estas en la categoria de Obesidad");
        }
    }
}
