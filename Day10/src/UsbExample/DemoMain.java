package UsbExample;

public class DemoMain {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();
        //准备一个鼠标供电脑使用
        Mouse usbMouse = new Mouse();
        //首先先向上转型
        USB usb = usbMouse;
        //参数是USB类型，传递进去的就是USB鼠标
        computer.useDevice(usbMouse);
         Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数是USB类型，传递进去的是实现类对象
         computer.useDevice(keyboard);//正确写法！也发生了向上转型
        computer.useDevice(new Keyboard());

        computer.powerOff();
    }
}
