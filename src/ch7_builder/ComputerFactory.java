package ch7_builder;

public class ComputerFactory {
    private BluePrint bluePrint;

    public void make() {
        bluePrint.setCPU();
        bluePrint.setRAM();
        bluePrint.setStorage();
    }

    public void setBluePrint(BluePrint bluePrint) {
        this.bluePrint = bluePrint;
    }


    public Computer getComputer() {
        return bluePrint.getComputer();
    }
}
