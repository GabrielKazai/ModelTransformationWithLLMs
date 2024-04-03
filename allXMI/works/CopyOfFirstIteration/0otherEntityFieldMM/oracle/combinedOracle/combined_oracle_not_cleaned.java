import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6f527246-a6a2-41da-9bd4-73a5d673188f")
public class Owner {
    @objid ("00f89ed1-a10e-4c5c-9d00-dd61a1057a20")
    public List<NotOwner> notOwner(otherOwner) = new ArrayList<NotOwner> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4b8677f7-e25d-475b-9148-4d31968f31d6")
public class NotOwner {
}

