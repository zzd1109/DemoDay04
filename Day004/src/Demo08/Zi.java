package Demo08;


public class Zi extends Fu {
    int num = 20;
    public Zi(){
        this(123);
    }
    public Zi(int n){

    }
    public void showNum(){
        int num = 10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    public void methodA(){
        System.out.println("AAA");
    }
    public void methodB(){
        this.methodA() ;
        System.out.println("BBB");
    }
}
