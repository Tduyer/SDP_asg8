public class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
