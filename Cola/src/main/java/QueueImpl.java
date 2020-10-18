public class QueueImpl<E> implements Cola<E>
{
    int posicion;
    E[] datos;

    public QueueImpl(int len)
    {
        this.posicion = 0;
        this.datos= (E[]) new Object[len];
    }

    private boolean ColaLLena()
    {
        return this.posicion>=this.datos.length;
    }

    public void push (E e) throws FullQueueException
    {
        if (this.ColaLLena()) throw new FullQueueException();
        this.datos[this.posicion++] = e;
    }

    private boolean ColaVacia()
    {
        return this.posicion==0;
    }

    private void lshift()
    {
        for(int i =0; i<this.posicion; i++)
        {
            this.datos[i]=this.datos[i+1];
        }
        this.posicion--;
    }

     public E pop() throws EmptyQueueException
     {
         if(this.ColaVacia()) throw new EmptyQueueException();

         E e = this.datos[0];
         lshift();
         return e;
     }

     public int size()
     {
         return this.posicion;
     }
}

