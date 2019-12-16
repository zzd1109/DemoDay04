package Demo02;

public class DemoMain {
    public static void main(String[] args) {
        ComputerMain computerMain = new ComputerMain();
        computerMain.powerOn();
        Mouse mouse = new Mouse();
        computerMain.useDevice(mouse);
        Computer computer = new Computer();
        computerMain.useDevice(computer);
        computerMain.powerOff();

    }
}
