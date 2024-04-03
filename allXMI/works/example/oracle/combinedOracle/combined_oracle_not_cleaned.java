import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("15f4731c-fee9-4cd5-83e5-c2cded9962a9")
public abstract class Student {
    @objid ("56b2268b-c2f9-4523-8b16-2f0d0d86c201")
    public String name;

    @objid ("ae2a2c47-da02-477c-8023-08568154c5a9")
    public int age;

    @objid ("abc28ef4-39b9-498a-bb7d-b003077065d6")
    public String getName() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("a48c292a-103b-46d9-9142-2ec23972bac1")
    public void setName(final String name) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("50ccec5f-bd34-41ff-bbed-0f6d71975e85")
public class Professor {
    @objid ("44de6c8e-4083-4526-a8eb-e8a692511616")
    public String name;

    @objid ("716e6a0e-63f2-4018-831b-da932b848150")
    public String department;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6ad5b69e-8a1f-4202-8601-51c9a7cfc147")
public class Enrollment {
    @objid ("717392fb-2d04-4070-8579-1d276b02ee95")
    public int id;

    @objid ("093ce836-a291-404b-b530-3fd14e013c13")
    public String date;

}

