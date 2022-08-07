package a0_para_borrar;

public class App1 implements Cloneable {
    String name;

    public App1(String name) {
        this.name = name;
    }


    public static void main(String[] args) throws CloneNotSupportedException {



        String a=new String("b");
        String b=new String("b");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

}
