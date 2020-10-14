public class Product {

    private String name , description;
    private double prize;
    private int NumVentas;

    public Product(String name, String description, double prize)
    {
        this.name = name;
        this.description = description;
        this.prize = prize;
        this.NumVentas = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getNumVentas() {
        return NumVentas;
    }

    public void setNumVentas(int numVentas) {
        this.NumVentas = numVentas;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + this.name + '\'' +
                ", description='" + this.description + '\'' +
                ", prize=" + this.prize +
                '}';
    }
}
