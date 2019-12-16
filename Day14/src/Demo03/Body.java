package Demo03;

public class Body {
    public class Heart{
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫"+name);
        }
    }
    private String name;
    public void methodBody(){
        System.out.println("外部类的方法");
        Heart heart = new Heart();
        heart.beat();
    }
}
