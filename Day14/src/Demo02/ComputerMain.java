package Demo02;

public class ComputerMain {
    public void powerOn(){
        System.out.println("打开电脑");
    }
    public void powerOff(){
        System.out.println("关闭电脑");
    }
    public void useDevice(USB usb){
        usb.Open();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if(usb instanceof Computer){
            Computer computer = (Computer) usb;
            computer.type();
        }
        usb.Close();
    }
}
