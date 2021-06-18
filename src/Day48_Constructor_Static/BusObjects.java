package Day48_Constructor_Static;

public class BusObjects {
    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.driver = new driver("Shaghulam");
        bus.engine = new engine(10);

        System.out.println(bus);

        Bus metroBus = new Bus();
        metroBus.driver = new driver("Aziz");
        metroBus.engine = new engine(15);

        System.out.println(metroBus);



    }
}
