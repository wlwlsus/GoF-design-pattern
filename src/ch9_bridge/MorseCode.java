package ch9_bridge;

public class MorseCode {

    private MorseCodeFunction morseCodeFunction;

    public MorseCode(MorseCodeFunction morseCodeFunction) {
        this.morseCodeFunction = morseCodeFunction;
    }


    public void setMorseCodeFunction(MorseCodeFunction morseCodeFunction) {
        this.morseCodeFunction = morseCodeFunction;
    }

//   delegate
    public void dot() {
        morseCodeFunction.dot();
    }

    public void dash() {
        morseCodeFunction.dash();
    }

    public void space() {
        morseCodeFunction.space();
    }

}
