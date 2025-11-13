public interface ProductVisitor {
    void visit(Electronics e);
    void visit(Clothing c);
    void visit(Food f);
}
