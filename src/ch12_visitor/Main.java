package ch12_visitor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Visitable> visiTables= new ArrayList<Visitable>();
        visiTables.add(new VisitableA(1));
        visiTables.add(new VisitableA(2));
        visiTables.add(new VisitableA(3));
        visiTables.add(new VisitableA(4));
        visiTables.add(new VisitableA(5));

        Visitor visitor = new VisitorA();
        for(Visitable visitable : visiTables){
            visitable.accept(visitor);
        }
        System.out.println(((VisitorA) visitor).getAgeSum());
    }
}
