import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c1acdc20-90ac-4e39-b322-cc8be275169b")
public class Department {
    @objid ("81f988fc-c43d-4c9e-b6f8-9351ca16c80c")
    private long departmentId;

    @objid ("4373f32e-007a-44ad-9a91-d99b612b1662")
    private String departmentName;

    @objid ("6d584173-8deb-49fd-ab36-712dbfbb87a8")
    private Location location;

    @objid ("73b1f6a9-4a53-463e-b1a9-12b07f656d03")
    public List<Employee> employee = new ArrayList<Employee> ();

}
