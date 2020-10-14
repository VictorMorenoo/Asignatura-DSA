import javax.swing.*;
import java.awt.color.ProfileDataException;
import java.util.*;

public class GestorImp implements Gestor
{
    List<Product> products; // Contenedor de productos *hay que inicializar
    Queue<Order> orders;
    HashMap<String, User> users;

    @Override
    public void addUser(String idUser, String name) {

        this.users.put(idUser, new User(idUser, name));

        //Excepcion -- NullPointerException
    }

    public GestorImp() //Para inicializar
    {
        this.users = new HashMap<String, User>();
        this.products = new ArrayList<Product>();
       // this.orders = new Micola<Order>(15);  //HACER COLA, QUE NO SEA MAS DE 15 Y QUE AVISE
        this.orders = new LinkedList<>();
    }

    public User getUser (String idUser)
    {
        User user = this.users.get(idUser);
        return user;
    }

    @Override
    public void addProduct(String name, String description, double prize) {

        this.products.add(new Prduct(name, description, prize));
    }



    /**
     *  Order:
     *  -3 cafe con leche
     *  -1 donut
     *  -1 chocolatina
     *  user: Vic // nif...
     * @param o
     */

    @Override
    public void addOrder(Order o) {
        this.orders.add(o);

    }

    @Override
    public Order getOrder() {
        Order o = this.orders.poll();
        process(o);
        //
       // User user = o.getUser();

        //user.addOrder(o);

        return o;
    }

    private void process(Order o)    //Para nosotros actualizar numero de ventas
    {
        for(Item i: o.items())
        {
            q = i.q;
            product = i.p;

            product.numVentas(q);
        }
    }


    @Override
    public List<Order> orderByUser(String idUser) {

        return null;
    }

    @Override
    public List<Product> productByPrize() {
        //sort{}

        Collection.sort(this.products , new Comparator<Product>());  //Ordenar con ese criterio
        {
            @Override
            public int compare(Product o1, Product o2)
            {
                return (int) (o1.getPrize()-o2.getPrize()); //Para orden inverso multiplicar por *-1
            }
        }

        return this.products;
    }


    @Override
    public List<Product> productsySales()
    {
        //short{};
        Collection.sort(this.products , new Comparator<Product>());  //Ordenar con ese criterio
        {
            @Override
            public int compare  (Product o1, Product o2)
            {
                return (int) (o1.getNumVentas()-o2.getNumVentas()); //Para orden inverso multiplicar por *-1
            }
        }
        return this.products;
    }


    public static <Product> void main(String[] args)
    {
        Gestor g = new GestorImpl();
        g.addUser( "50199508A","Jose");
        User u = g.getUser("50199508A");
        System.out.println(u.getName());

        g.addProduct("cafe","aa","2");
        g.addProduct("chocolate","ese","5");
        g.addProduct("bocadillo","vaya","4");

        List<Product> Lista = g.productByPrize();

        for (Product p: Lista)
        {
            System.out.println(p);
        }
    }
}
