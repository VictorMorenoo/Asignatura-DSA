import java.util.List;

public interface Gestor
{
    //
    public void addUser(String idUser, String name);
    public User getUser(String idUser);
    public void addProduct(String name, String description, double prize);
    //

    public List<Product> productByPrize();
    public void addOrder(Order o); //
    public Order getOrder();
    public List<Order> orderByUser(String idUser);
    public List<Product> productsySales();

}
