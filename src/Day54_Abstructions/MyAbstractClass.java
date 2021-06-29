package Day54_Abstructions;

public abstract class MyAbstractClass {
    int num = 55;
    public void learn() {
        System.out.println("Learning");
    }

    public abstract void close();
}

class Sub extends MyAbstractClass{
    public void close(){
        System.out.println("why we exist abstract?");
    }

}

class MyObjects {
    public static void main(String[] args) {

        // MyAbstractClass mac = new MyAbstractClass();
        Sub sub = new Sub();
        sub.learn();
        sub.num = 100;
        System.out.println(sub);
    }

}
