public class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
