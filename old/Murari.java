

public class Murari {
    public static void main(String[] args) {
       Murari1 m = new Murari1();
    }
}

class Murari1{
   Murari1(){
    System.out.println("hii");
    print();
    }
    static void print(){
        System.out.println("happy ramzan murari bhaii sabbb");
    }
}

class New extends Murari1{
    public void New1(){
        System.out.println("modda gudu");
        print();
    }
    public static void main(String[] args) {
        New m = new New();
        m.New1();
     }
}

