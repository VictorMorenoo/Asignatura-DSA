package Figuras;

public abstract class figura implements  Comparable<figura>  // Por jerarquia

{
    public abstract double Area();

    public int compareTo (figura f)
    /* Tres posibilidades
        <0;  0 ; >0
     */

    {
        return (int) (this.Area() - f.Area());
    }
}
