public interface Cola<E>
{
    /**
     * Metodo que te permite añadir /o poner en cola a un nuevo elemento
     * *@param *e el elemento a poner en cola
     * *@throws *FullQueueException lanza la la excepcion en caso de que la cola este llena
     */
    public void push(E e) throws FullQueueException;
    public E pop() throws EmptyQueueException;
    public int size();
}
