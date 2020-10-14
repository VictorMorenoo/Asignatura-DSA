import java.util.Queue;

public class MiSuperCola<E> implements Cola<E>
{
    private E[] data;
    int p;

    public MiSuperCola(int len)
    {
        this.data = //Object(len)
    }

    @Override
    public void push (E e) throws FullQueueException
    {
        if(this.Estallena()) throw new FullQueueException();
        this.data[this.p++] = e;  //Primera poscion vacia p
    }

    @Override
    public E pop () throws EmptyQueueException {
        if(this.Estavacia()) throw new EmptyQueueException();

        E primero = this.data[0];

        //lshift();
        return primero;

    }

    @Override
    public int size () {
        return this.p;

    }
    }

    public static void main(String[] args) {
        //
    }


}
