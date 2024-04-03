import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fff4b42d-35d5-4285-bbef-91a49a250ad2")
public class Resource extends Asset {
    @objid ("c53ec948-bcda-4f00-b867-a37979ceaecb")
    public List<FixedAsset> providingFixedAsset = new ArrayList<FixedAsset> ();

    @objid ("82a0d7ac-4d63-454b-9041-6609ce040e81")
    public List<Liability> claimingLiability = new ArrayList<Liability> ();

    @objid ("ae4e5bb0-3fb3-40e6-b017-5df7db15777b")
    public List<Offering> requiringOffering = new ArrayList<Offering> ();

}
