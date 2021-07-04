package Replit_And_Practice_Tasks.OOP_Tasks;

/**
 * The `Db` class will have two private instance variables. Create those variables and provide public getters and setters for them.
 * Note: A constructor is provided.
 *
 * >Instance variables:
 *
 *    - data (String)
 *    - name: yint (int)
 *
 * > Methods:
 *
 *     - getData()
 *     - getYint()
 *     - setData()
 *     - setYint()
 *
 * Example:
 *
 * ```
 *  Db db = new Db("aaa",123);
 *
 *  System.out.println(db.getData());//aaa
 *  System.out.println(db.getYint());//123
 *
 *  db.setData("zzz");
 *  db.setYint(200);
 *
 *  System.out.println(db.getData());//zzz
 *  System.out.println(db.getYint());//200
 * ```
 */
public class GetterAndSetter {

    private String name;
    private int data;

    public GetterAndSetter(String name, int data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}


