import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1a1c4517-7c34-421c-b0f9-d4535fd0fa3c")
public class MyClass {
    @objid ("b3d545c7-aa52-455a-a87d-2e6471859ad8")
    public String myAttribute;

    @objid ("bd71a3b3-70a9-486e-8ede-90ad78dd70af")
    public MyEnumeration mySecondAttribute;

    @objid ("d348a464-7df0-4b13-b55f-ae498c4f089f")
    public MySecondEnumeration myThirdAttribute;

    @objid ("28cb6525-41c6-40ed-a20a-6a7fa3db9ecd")
    public MyEnumeration myFourthAttribute;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("04e73f46-fe41-409b-84fe-abcb4449222a")
public enum MyEnumeration {
    ,
    VALUE_B;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4ddb85f9-2e7c-47f9-b34e-d4fdcd9746a5")
public enum MySecondEnumeration {
    VALUE_A;
}

