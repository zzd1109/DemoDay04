public class Person02 {
    private String name;
    private String age;
    public void setName(String name){
        if (name.length() > 6 || name.length()<1){
            System.out.println("设置错误");
            return;
        }else{
            this.name = name;
        }
    }
    public String getName(){
        return this.name;
    }
   /*public void setAge(int age){
        if (age > 100 || age<0){
            System.out.println("数据错误");
            return;
        }else{
            this.age = age;
        }
    }
    public int getAge(){
        return this.age;
    }*/
}
