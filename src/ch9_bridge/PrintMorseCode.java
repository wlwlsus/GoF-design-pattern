package ch9_bridge;

public class PrintMorseCode extends MorseCode{
    public PrintMorseCode(MorseCodeFunction morseCodeFunction) {
        super(morseCodeFunction);
    }

    // won jun
    PrintMorseCode w() {
        dash();dash();
        return this;
    }

    PrintMorseCode o() {
        dot();dash();
        return this;
    }

    PrintMorseCode n() {
        dash();dash();dash();dot();
        return this;
    }

    PrintMorseCode j() {
        dot();dot();dot();
        return this;
    }

    PrintMorseCode u() {
        dash();dot();dash();dot();
        return this;
    }

}
