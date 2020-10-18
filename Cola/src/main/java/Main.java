public class Main<main>
{
    public static void main(String[] args)
    {
        Cola<Integer> q = new QueueImpl<Integer>(5);

        try
        {
            q.push(1);
            System.out.println(q.size());
            q.push(2);
            System.out.println(q.size());
            q.push(3);
            System.out.println(q.size());
            q.push(4);
            System.out.println(q.size());
            q.push(5);
            System.out.println(q.size());  //Dice el tamaño de cola   //q.pop vacia una posicion

            int uno = q.pop();
            System.out.println("Valor cola"+ uno);
            System.out.println(q.size());
        }
        catch (FullQueueException fullExp)
            {
                System.out.println("Excepcion");
                fullExp.printStackTrace();
            }
        catch (EmptyQueueException e)
        {
            e.printStackTrace();
        }
    }
}
