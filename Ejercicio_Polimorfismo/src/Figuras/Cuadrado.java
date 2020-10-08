package Figuras;

public class Cuadrado extends Rectangulo
{

    public Cuadrado (double lado)
    {
       super (lado, lado);
    }

    @Override
    public String toString()
    {
        return "Cuadrado con lado de = " + this.getLado1() + " y area de = " + super.Area();
    }
}
