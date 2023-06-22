// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("que figura desea");
        System.out.println("1=cuadrado 2=triangulo 3=ciculo");


        System.out.println("Por favor, ingresa un número del 1 al 3:");
        Scanner opcion = new Scanner(System.in);

        if (1 == opcion) {
            System.out.println("Has seleccionado la opción 1.");
            Scanner sc = new Scanner(System.in);
            Punto[] punto = new Punto[4];
            for (int i = 0; i <5; i++) {
                System.out.println("Ingrese la componente X punto "+i+" : ");
                double x=sc.nextDouble();
                System.out.println("Ingrese la componente Y punto "+i+" : ");
                double y=sc.nextDouble();
                System.out.println("Ingrese la componente Z punto "+i+" : ");
                double z=sc.nextDouble();
                punto[i]= new Punto(x,y,z);
            }
        } else if (opcion == 2) {
            System.out.println("Has seleccionado la opción 2.");
            Scanner sc = new Scanner(System.in);
            Punto[] punto = new Punto[3];
            for (int i = 0; i <4; i++) {
                System.out.println("Ingrese la componente X punto "+i+" : ");
                double x=sc.nextDouble();
                System.out.println("Ingrese la componente Y punto "+i+" : ");
                double y=sc.nextDouble();
                System.out.println("Ingrese la componente Z punto "+i+" : ");
                double z=sc.nextDouble();
                punto[i]= new Punto(x,y,z);
            }
        } else if (opcion == 3) {
            System.out.println("Has seleccionado la opción 3.");
            Scanner sc = new Scanner(System.in);
            Punto[] punto = new Punto[1];
            for (int i = 0; i <1; i++) {
                System.out.println("Ingrese la componente X punto "+i+" : ");
                double x=sc.nextDouble();
                System.out.println("Ingrese la componente Y punto "+i+" : ");
                double y=sc.nextDouble();
                System.out.println("Ingrese la componente Z punto "+i+" : ");
                double z=sc.nextDouble();
                punto[i]= new Punto(x,y,z);
                System.out.println("Ingrese el radio :");
                double r=sc.nextDouble();

            }
        } else {
            System.out.println("Opción inválida. Debes ingresar un número del 1 al 3.");
        }


    }
}