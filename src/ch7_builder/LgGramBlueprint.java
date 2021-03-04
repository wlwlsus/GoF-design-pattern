package ch7_builder;

public class LgGramBlueprint extends BluePrint{
    private Computer computer;

    public LgGramBlueprint() {
        computer = new Computer("default","default","default");
    }

    @Override
    public void setCPU() {
        computer.setCpu("LG C i9");
    }

    @Override
    public void setRAM() {
        computer.setRam("LG R 16GB");
    }

    @Override
    public void setStorage() {
        computer.setStorage("LG S 500GB");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}