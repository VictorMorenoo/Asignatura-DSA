package Figuras;

public class Rectangulo extends figura
{
    private double lado1;
    private double lado2;

    public Rectangulo (double lado1, double lado2)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double Area()
    {
        return this.lado1 + this.lado2;
    }

    public double getLado1()
    {
        return lado1;
    }

    public double getLado2()
    {
        return lado2;
    }

    @Override
    public String toString()
    {
        return "Rectangulo con lado1 = " + this.lado1 + " , lado2 = " + this.lado2 + " y con area de = ((" + this.Area() + "))";
    }
}
