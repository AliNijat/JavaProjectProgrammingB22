package Replit_And_Practice_Tasks.OOP_Tasks;

public class OOP_Test {
    public static void main(String[] args) {

        Person1 person = new Person1();
        System.out.println(person.toString());
        person.setFirstName("Fatima");
        person.setLastName("Nijat");
        person.setAge(4);
        System.out.println(person.toString());

        System.out.println();

        PrintAttribute a = new PrintAttribute();
        a.name = "table";
        a.color = "brown";
        a.amount = 1;
        System.out.println(a.asString());

        System.out.println();

        LameCalculator calculator = new LameCalculator();
        System.out.println(calculator.plus(2, 2));
        System.out.println(calculator.minus(4, 2));
        System.out.println(calculator.multiply(3, 2));
        System.out.println(calculator.dividable(10, 2));

        System.out.println();

        GetterAndSetter db = new GetterAndSetter("ALi", 444);
        db.setData(555);
        db.setName("Nijat");
        System.out.println(db.getName());

        System.out.println();

        CalcII calcII = new CalcII();
        calcII.setX(10);
        calcII.setY(5);
        calcII.minus();
        System.out.println(calcII.getResult());
    }
}
