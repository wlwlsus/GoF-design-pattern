package factory001;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getCPU();
    public abstract String getStorage();

    @Override
    public String toString() {
        return "Computer{"
                +"CPU : "+this.getCPU()
                +"RAM : "+this.getRAM()
                +"Storage : "+this.getStorage()+"}";
    }
}
