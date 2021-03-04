package ch7_bp2;

public class Main {
    public static void main(String[] args) {

        Computer computer = ComputerBuilder
                .startWithCpu("i7")
//                .start()
//                .setCpu("i7")
                .setRam("32gb")
                .setStorage("500gb")
                .build();

        System.out.println(computer.toString());
    }
}
