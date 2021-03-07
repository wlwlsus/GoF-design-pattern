package ch13_visitor;

public interface Visitable {
    public void accept(Visitor visitor);
}
