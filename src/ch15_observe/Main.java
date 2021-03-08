package ch15_observe;

public class Main {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setOnClickListener(new ButtonClick());

        btn.onClick();


    }
}

class ButtonClick implements Button.OnClickListener{

    @Override
    public void onClick(Button button) {
        System.out.println(button.toString());
    }
}