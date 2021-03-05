package ch9_bridge;

public class Main {
    public static void main(String[] args) {
        PrintMorseCode code = new PrintMorseCode(new DefaultMCF());
        code.w()
            .o()
            .n()
            .j()
            .u()
            .n();
    }
}
