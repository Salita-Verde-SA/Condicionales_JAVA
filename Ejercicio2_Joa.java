import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.zip.ZipFile;

public class Ejercicio2_Joa {

    //Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
    //(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
    //15% para jubilados. Imprime el precio final después del descuento.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        Float precioProducto = sc.nextFloat();

        System.out.println("Precio de lista: $" + precioProducto + " Pesos");
        System.out.println();
        System.out.println("A continuacion Ingrese su <<Categoria de cliente>>\n1- Estudiante\n2- Adulto\n3- Jubilado");
        int categoriaCliente = sc.nextInt();


        if (categoriaCliente == 1) {
            double diezPorCiento = precioProducto * 0.10;
            double descuento = precioProducto - diezPorCiento;
            System.out.println("Por ser Estudiante tenes un descuento del 10%!! \nPrecio con descuento: " + descuento);
        } else if (categoriaCliente == 2) {
            double cincoPorCiento = precioProducto * 0.05;
            double descuento = precioProducto - cincoPorCiento;
            System.out.println("Por ser Adulto tenes un descuento del 5%!! \nPrecio con descuento: " + descuento);
        } else if (categoriaCliente == 3) {
            double quincePorCiento = precioProducto * 0.15;
            double descuento = precioProducto - quincePorCiento;
            System.out.println("Por ser Jubilado tenes un descuento del 15%!! \nPrecio con descuento: " + descuento);
        } else {
            System.out.println("Opcion irreconocible");
        }

        sc.close();
    }
}
