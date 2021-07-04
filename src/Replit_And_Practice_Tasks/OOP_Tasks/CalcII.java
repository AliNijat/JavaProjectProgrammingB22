package Replit_And_Practice_Tasks.OOP_Tasks;

/**
 * This assignment is another calculator class, but it will be encapsulated.
 *
 * > Attributes
 *
 *   - int: x, y, result
 *
 * **Attributes should be encapsulated**
 *
 *
 * >Instance Methods:
 *
 *    - getResult() - getter method for private `result`
 *    - setY(int y) - setter method for private `y`
 *    - setX(int x) - setter method for private `x`
 *    - void plus() - adds x and y (x+y) values and assigns to result
 *    - void minus() - subtracts x and y(x-y) values and assigns to result
 *
 *
 *
 * Example:
 *
 * ```
 *   Calc a = new Calc();
 *   a.setX(10);
 *   a.setY(5);
 *   a.minus();
 *
 *   System.out.println(a.getResult());
 *   prints: 5
 *
 *   a.plus();
 *   System.out.println(a.getResult());
 *   prints: 15
 */
public class CalcII {

    private int x;
    private int y;
    private int result;


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void plus(){
        result = x + y;
    }

    void minus(){
        result = x - y;
    }

    public int getResult() {
        return result;
    }

}
