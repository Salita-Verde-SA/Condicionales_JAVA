import java.util.Scanner;

public class Ejercicio6_Joa {
    //Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
//    ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
//    hábitos saludables basada en estos datos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cuantas horas al dia duerme ( Hrs ): ");
        int horasDormir = sc.nextInt();
        System.out.println();

        System.out.print("Ingrese cuantas horas al dia hace ejercicio ( Hrs ): ");
        int horasEjercicio = sc.nextInt();
        System.out.println();

        System.out.print("ingrese cuantas comidas saludables consume al dia: ");
        int comidasSaludables = sc.nextInt();
        System.out.println();

        String horasMimir = horasDeDormir(horasDormir);
        System.out.println(horasMimir);

        String horasEjerc = horasDeEjercicio(horasEjercicio);
        System.out.println(horasEjerc);

        String comid = ComidasSaludabless(comidasSaludables);
        System.out.println(comid);



    }
    public static String horasDeDormir (int horasdomir){
        if (horasdomir >= 7){
            System.out.println("BUENISIMO! Estas Durmiendo lo suficiente :D ");
        } else if (horasdomir >= 5) {
            System.out.println("Estas durmiendo bien pero deberias dormir un poco mas!");   
        } else{
            System.out.println("Estas durmiendo demasiado poco... D: ");
        }
        return "<<<...>>>";
    }
    public static String horasDeEjercicio (int horasejercicio){
        if (horasejercicio >= 2){
            System.out.println("Perfecto, Estas haciendo el ejercicio necesario!");
        } else if (horasejercicio == 1) {
            System.out.println("Buenisimo, te estas ejercitando bien pero podrias ejercitarte aun mas");
        } else {
            System.out.println("Deberias hacer ejercicio");
        }
        return "<<<...>>>";
    }
    public static String ComidasSaludabless (int ComidasSaludabless){
        if (ComidasSaludabless >= 4){
            System.out.println("Perfecto, Estas comiendo muy SALUDABLE!");
        } else if (ComidasSaludabless == 2) {
            System.out.println("Buenisimo, estas comiendo bien pero podrias comer mejor");
        } else {
            System.out.println("Deberias comer mas sano");
        }
        return "<<<...>>>";
    }
}

