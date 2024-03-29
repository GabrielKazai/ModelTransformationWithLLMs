import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1673efae-dd82-40fb-8789-14177018d72c")
public class MyClass {
    @objid ("6b309393-9213-4bde-9f8a-87f23a25064c")
    public String myAttribute;

    @objid ("b99b7264-c71b-43b7-bc04-dfee1b1e2134")
    public MyEnumeration mySecondAttribute;

    @objid ("6de63c2e-5297-45bf-96ca-fe931a77f3b8")
    public MySecondEnumeration myThirdAttribute;

    @objid ("370842b7-b606-4c31-8267-f0dd2800855d")
    public MyEnumeration myFourthAttribute;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("19852aca-ed4e-4bb5-86ce-f04f0133dbf9")
public enum MyEnumeration {
    VALUE_A,
    VALUE_B;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("73541682-2e40-448a-829f-5aee67d5d341")
public enum MySecondEnumeration {
    VALUE_A;
}

