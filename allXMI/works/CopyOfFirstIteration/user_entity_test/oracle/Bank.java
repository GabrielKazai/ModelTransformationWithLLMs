import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("54dc7daa-cf98-4032-9b81-80b7abc7926a")
public class Bank {
    @objid ("892f99d7-10e3-4dfa-8d0d-50004fe56b05")
    public String name;

    @objid ("a737d233-a337-495e-ab44-1866cc4df7b7")
    public List<User> user = new ArrayList<User> ();

}
