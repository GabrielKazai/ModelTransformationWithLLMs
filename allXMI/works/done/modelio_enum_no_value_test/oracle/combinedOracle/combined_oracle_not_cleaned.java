import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("27247929-d000-4777-9549-deddba47db1c")
public class MyClass {
    @objid ("903567a2-8d04-4b1e-949e-1f9967228902")
    public String myAttribute;

    @objid ("22625639-ef96-401c-82c1-d723ec587253")
    public MyEnumeration mySecondAttribute;

    @objid ("6245ffca-f950-4e79-bc72-a4108e35eb62")
    public MySecondEnumeration myThirdAttribute;

    @objid ("9eb9d38e-c73a-43a2-9eed-9bfd79cc6645")
    public MyEnumeration myFourthAttribute;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d4ff6f25-15b1-414f-a29d-25000b5ca90b")
public enum MyEnumeration {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a3d2f307-ca4f-43d9-9f2e-575ebb2b62c6")
public enum MySecondEnumeration {
    VALUE_A;
}

