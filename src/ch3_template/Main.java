package ch3_template;

import ch3_template.security.AbstGameConnectHelper;
import ch3_template.security.DefaultGameConnectHelper;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Template");
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();
        
        helper.requestConnection("아이디 암호 등 접속 정보");
    }
}
