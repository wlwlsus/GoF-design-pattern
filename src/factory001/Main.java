package factory001;

public class Main {
    public static void main(String[] args) {

        Computer c1 = new PC("16GB "," i7"," 1TB SSD ");
        Computer c2 = new Server("32GB "," i5"," 500GB SSD ");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
