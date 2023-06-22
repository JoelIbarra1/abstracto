import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
public abstract class Figura {
    List<Punto> listaPuntos = new ArrayList<>();

    public abstract double calcularPerimetro();

    public abstract double calcularArea();

    public void ingresarpuntos(){
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese la componente x del punto ");
        double x = sc.nextDouble();
        System.out.println("ingrese la componente y del punto ");
        double y = sc.nextDouble();
        System.out.println("ingrese la componente z del punto " );
        double z = sc.nextDouble();
        listaPuntos.add(new Punto(x,y,z));


    }

    public double calcularDistancia(int indice1, int indice2){
        return Math.sqrt(Math.pow(listaPuntos.get(indice1).getX()-listaPuntos.get(indice2).getX(),2)+
                Math.pow(listaPuntos.get(indice1).getY()-listaPuntos.get(indice2).getY(),2)+
                Math.pow(listaPuntos.get(indice1).getZ()-listaPuntos.get(indice2).getZ(),2));
    }





}
