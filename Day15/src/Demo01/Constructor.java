package Demo01;

public class Constructor {
    public String name;
    public int count;

    public Constructor() {
    }

    public Constructor(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        System.out.println(c1.name+" "+c1.count);
        Constructor c = new Constructor("kobe",81);
        System.out.println(c.name);
        System.out.println(c.count);
    }
}
