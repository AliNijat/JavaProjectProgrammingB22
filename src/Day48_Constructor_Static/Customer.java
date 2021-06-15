package Day48_Constructor_Static;

public class Customer {
   private String name;
    private int id = 0;


    public Customer(){
        //System.out.println("Constructor without parameter");
        name = "New Customer";
        id = -1;
    }

    public Customer(String name, int id){
       // System.out.println("Constructor with parameters");
        System.out.println();
        this.name = name;
        setId(id);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer Name and Id: {" + name +", " + id+"}";
    }
}
