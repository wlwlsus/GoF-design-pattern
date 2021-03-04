package ch7_builder;

public class Main {
    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();
        factory.setBluePrint(new LgGramBlueprint());
        System.out.println(factory.getComputer().toString());

        factory.make();

        System.out.println(factory.getComputer().toString());

//        Computer computer = new Computer("i7-8700k","16GB","500 SSD, 1TB HDD");

//        System.out.println(computer);
    }
}
