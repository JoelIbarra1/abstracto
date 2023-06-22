public abstract class Cuadrado extends Figura{

    double l1;
    double l2;
    double l3;
    double l4;


    @Override
    public double calcularPerimetro(){
        double l1 = calcularDistancia(0,1);
        double l2 = calcularDistancia(0,2);
        double l3 = calcularDistancia(1,3);
        double l4 = calcularDistancia(2,3);
        return l1+l2+l3+l4;
    }

    @Override
    public double calcularArea(){
        double a = l1+l2+l3+l4;
        return a;
    }

}
