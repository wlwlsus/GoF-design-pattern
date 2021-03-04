package ch8_abstractfactory;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
//        ComputerFactory computerFactory = new ComputerFactory();
//        computerFactory.createComputer("LG");
            FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
            factoryOfComputerFactory.createComputer("LG");
    }
}
//
//
interface Keyboard{
}
//
//class KeyboardFactory{
//    public Keyboard createKeyboard(String type){
//        Keyboard keyboard = null;
//        switch (type){
//            case "LG":
//                keyboard = new LGKeyboard();
//                break;
//            case "Samsung":
//                keyboard = new SamsungKeyboard();
//                break;
//        }
//        return keyboard;
//    }
//}
//
class LGKeyboard implements Keyboard{
    public LGKeyboard() {
        System.out.println("LG 키보드 생성");
    }
}


class SamsungKeyboard implements Keyboard{
    public SamsungKeyboard() {
        System.out.println("Samsung 키보드 생성");
    }
}

class LGMouse implements Mouse {
    public LGMouse(){
        System.out.println("LG 마우스 생성");
    }
}
class SamsungMouse implements Mouse {
    public SamsungMouse(){
        System.out.println("Samsung 마우스 생성");
    }
}
interface Mouse {
}
//
//class MouseFactory {
//    public Mouse createMouse(String type){
//        Mouse mouse = null;
//        switch (type){
//            case "LG":
//                mouse = new LGMouse();
//                break;
//
//            case "Samsung":
//                mouse = new SamsungMouse();
//                break;
//        }
//
//        return mouse;
//    }
//}
//
//class ComputerFactory{
//    public void createComputer(String type){
//        KeyboardFactory keyboardFactory = new KeyboardFactory();
//        MouseFactory mouseFactory = new MouseFactory();
//
//        keyboardFactory.createKeyboard(type);
//        mouseFactory.createMouse(type);
//        System.out.println(type+" 컴퓨터 완성!!");
//    }
//}
//

interface ComputerFactory{
    public Keyboard createKeyboard();
    public Mouse createMouse();
}

class SamsungComputerFactory implements ComputerFactory{

    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }
}

class LGComputerFactory implements ComputerFactory{

    @Override
    public Keyboard createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new LGMouse();
    }
}

class FactoryOfComputerFactory {
    public void createComputer(String type){
        ComputerFactory computerFactory= null;
        switch (type){
            case "LG":
                computerFactory = new LGComputerFactory();
                break;

            case "Samsung":
                computerFactory = new SamsungComputerFactory();
                break;
        }

        computerFactory.createKeyboard();
        computerFactory.createMouse();
        System.out.println("완성~_~");
    }
}