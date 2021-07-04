package Replit_And_Practice_Tasks.OOP_Tasks;

/**
 * You have two classes `Main` and `Atts`. Do not touch the `Main` class. Finish the `Atts` class to have attributes:
 *   - Strings: `name`, `color`
 *   - int: `amount`
 *   - Method: asString() (returns String in format shown below)
 * > All attributes should be public
 *
 * Example:
 *
 * ```
 *    Atts a = new Atts();
 *    a.name = "table";
 *    a.color = "brown";
 *    a.amount = 1;
 *
 *    System.out.println(a.asString());
 * ```
 *
 * Output
 *
 * ```
 * name: table color: brown amount: 1
 */
public class PrintAttribute {
    String name;
    String color;
    int amount;
    public String asString(){
        return "name: " + name +" color: " + color +" amount: " + amount;
    }
}
