import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6dac9801-7b9c-4e86-a7ba-a69118b2c3d7")
public class Attribute {
    @objid ("90fdded2-23e3-477e-8940-efc39de9f81e")
    private String name;

    @objid ("9e27d964-1f66-47e2-ad46-af756858872d")
    private String value;

    @objid ("9abe8a52-cdd2-4e54-a530-4faf4016721d")
    private List<Element> refs = new ArrayList<Element> ();

}
