package Day57_Interface_Polymorphism.Abstract_VS_Interface;

import java.io.Serializable;

public interface InterfaceB extends InterfaceA, Serializable, Cloneable {

 // Interface only can extends other Interfaces, Not other abstract or normal classes

}
