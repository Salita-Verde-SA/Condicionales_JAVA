import javax.swing.*;
import java.sql.SQLOutput;

public class Ejercicio3_Joa {
    //Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
    //ciencia ficción) y luego recomiende un libro basado en su elección.
    public static void main(String[] args) {

        String categoria = JOptionPane.showInputDialog("Ingrese su categoria de libros favorito: \n1- Fantasia\n2- Misterio\n3- Romance\n4- Ciencia Ficcion");
        int categoriaInt = Integer.parseInt(categoria);

        switch (categoriaInt){
            case 1:
               JOptionPane.showMessageDialog(null, "Libro recomendado de la categoria FANTASIA: \n << El Asesinato de Roger Ackroyd de Agatha Christie >> ");
               break;
            case 2:
               JOptionPane.showMessageDialog(null, "Libro recomendado de la categoria MISTERIO: \n << El Perro de los Baskerville de Arthur Conan Doyle >> ");
               break;
            case 3:
               JOptionPane.showMessageDialog(null, "Libro recomendado de la categoria ROMANCE: \n << Orgullo y Prejuicio de Jane Austen >> ");
               break;
            case 4:
               JOptionPane.showMessageDialog(null, "Libro recomendado de la categoria CIENCIA FICCION: \n << 1984 de George Orwell >> ");
               break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opcion VALIDA");
        }
    }
}
