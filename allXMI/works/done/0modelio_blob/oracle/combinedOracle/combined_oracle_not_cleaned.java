import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c2ae1fc9-d9e9-4e03-8548-a79368ca82ac")
public class MyClass {
    @objid ("3439d656-1ab7-4f4f-b91b-508ff6ca9de4")
    public ImageBlob myAttribute;

    @objid ("d551581b-4ea5-421b-ab75-1cb6979a615a")
    public Blob myAttribute2;

    @objid ("086187a2-ec48-4bcc-95d4-c4a9fe879da8")
    public AnyBlob myAttribute3;

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("2c9e7349-3104-487f-8090-44e6224a9e8e")
public class ImageBlob {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("9a3d4bc8-f164-4182-8492-c08bfcf37448")
public class Blob {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("88775a98-a37f-4210-9f4f-c68f99b6d50b")
public class AnyBlob {
}

