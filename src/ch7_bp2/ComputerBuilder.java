package ch7_bp2;

public class ComputerBuilder {
    Computer computer;

    public ComputerBuilder(){
        computer = new Computer("default","default","default");
    }

    public static ComputerBuilder start(){
        return new ComputerBuilder();
    }

    public static ComputerBuilder startWithCpu(String str){
        ComputerBuilder builder = new ComputerBuilder();
        builder.computer.setCpu(str);
        return builder;
    }

    public ComputerBuilder setCpu(String string) {
        computer.setCpu(string);
        return this;
    }

    public ComputerBuilder setRam(String string) {
        computer.setRam(string);
        return this;
    }

    public ComputerBuilder setStorage(String string){
        computer.setStorage(string);
        return this;
    }

    public Computer build() {
        return this.computer;
    }
}
