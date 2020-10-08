package Figuras;

public class Circulo extends figura

{
    private  double radio;

    public Circulo (double radio)
    {
        this.radio = radio;
    }

    public double Area()
    {
        return Math.PI * Math.pow(this.radio, 2) ;
    }

    @Override
    public String toString()
    {
        return  "Circulo con radio = " + this.radio +" y area de = ((" + this.Area() + "))" ;
    }

}
