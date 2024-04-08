import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("911e93c7-c220-4481-9275-3e9e9669d7c4")
public class Bank {
    @objid ("093ba438-5840-4ab2-a1a8-3f8788d9e799")
    public String name;

    @objid ("00c46321-eb0f-4990-9468-0a79063fbc61")
    public List<User> user = new ArrayList<User> ();

}
