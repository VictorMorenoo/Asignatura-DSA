import Figuras.Circulo;
import Figuras.Rectangulo;
import Figuras.Cuadrado;
import Figuras.figura;

import java.util.Arrays;


public class GestorClasses {

    public static void sort (figura[] a)
    {
        Arrays.sort(a); //ordena un array de objetos
    }

    public static double suma (figura[] a)
    {
        double ret = 0;
        for(figura f: a)        //otra manera: figura f= null; for(int i=0; i<a.length; i++){ f = a[i] ; f.Area} ;
        {
          //  System.out.println(f);
            ret += f.Area();
        }
        return ret;
    }

    public static void main(String[] args)
    {
        figura[] a = new figura[3];
        a[0] = new Circulo(3);
        a[1] = new Rectangulo(4,2);
        a[2] = new Cuadrado(10);

        double radio = GestorClasses.suma(a);

        System.out.print(radio);

        System.out.println(Arrays.asList(a)); // Pintar antes de ordenar
        GestorClasses.sort(a);  // Nos ordena por areas de menor a mayor
        System.out.println(Arrays.asList(a)); // Pintar despues de ordenar por tamaños de area
    }
}
