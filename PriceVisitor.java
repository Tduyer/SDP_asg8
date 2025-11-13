public class PriceVisitor implements ProductVisitor {

    @Override
    public void visit(Electronics e) {
        double finalPrice = e.price * 1.1;
        System.out.println(e.name + " (Electronics): $" + finalPrice);
    }

    @Override
    public void visit(Clothing c) {
        double finalPrice = c.price * 0.9;
        System.out.println(c.name + " (Clothing): $" + finalPrice);
    }

    @Override
    public void visit(Food f) {
        System.out.println(f.name + " (Food): $" + f.price);
    }
}
