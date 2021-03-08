package factory001;

public class Server extends Computer {
    private String ram;
    private String cpu;
    private String storage;

    public Server(String ram, String cpu, String storage) {
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String getStorage() {
        return this.storage;
    }
}
