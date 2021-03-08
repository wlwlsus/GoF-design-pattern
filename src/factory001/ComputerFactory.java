package factory001;

public class ComputerFactory {

    public static Computer getComputer(String type, String cpu, String ram, String storage){
        if("PC".equalsIgnoreCase(type))
            return new PC(ram, storage, cpu);
        else if("Server".equalsIgnoreCase(type))
            return new Server(ram, storage, cpu);

        return null;
    }
}
