package ComplexExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        desglosaPalabras("hello world");
    }

    public static void desglosaPalabras(String palabra){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
      //  palabra = scanner.next();

        List separador = new ArrayList<>();
        for (int i = 0; i < palabra.length(); i++) {
            separador.add(palabra.charAt(i));
           // System.out.println(separador);
        }
        System.out.println(separador);
    }
}
