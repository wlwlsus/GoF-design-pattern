package ch10_decorator;

public class Main {
    public static void main(String[] args) {

        Display display = new DisplayDecorator(new RoadDisplay());
        display.draw();

        System.out.println("\n\n");

        Display display1 = new LaneDecorator(new RoadDisplay());
        display1.draw();

        System.out.println("\n");

        Display display2 = new TrafficDecorator(new RoadDisplay());
        display2.draw();

        System.out.println("\n");

        Display display3 = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
        display3.draw();
    }
}
