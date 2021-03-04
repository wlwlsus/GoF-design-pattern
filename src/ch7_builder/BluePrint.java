package ch7_builder;

public abstract class BluePrint {

    public abstract void setCPU();
    public abstract void setRAM();
    public abstract void setStorage();
    public abstract Computer getComputer();
}
