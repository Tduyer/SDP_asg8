public class TaxVisitor implements ProductVisitor {

    @Override
    public void visit(Electronics e) {
        System.out.println("Tax for " + e.name + ": $" + (e.price * 0.15));
    }

    @Override
    public void visit(Clothing c) {
        System.out.println("Tax for " + c.name + ": $" + (c.price * 0.08));
    }

    @Override
    public void visit(Food f) {
        System.out.println("Tax for " + f.name + ": No tax");
    }
}
