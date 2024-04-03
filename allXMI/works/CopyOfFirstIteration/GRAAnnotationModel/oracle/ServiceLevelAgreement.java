import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("57f318ac-d8c1-4ac9-8e5e-0c253ac48bab")
public class ServiceLevelAgreement {
    @objid ("24a79690-ee82-46fc-a8da-6f5e86133b42")
    public List<Agreement> ApplicableContract = new ArrayList<Agreement> ();

    @objid ("cf0f1c50-c080-4e90-a528-4240e8b57687")
    public List<Agreement> Agreement = new ArrayList<Agreement> ();

    @objid ("920bb06c-8541-4653-9bf9-cd1eadfca149")
    public Agreement LicensingAgreement;

    @objid ("4fd5eb8d-2091-4471-937b-683d15e6e92d")
    public List<Agreement> UmbrellaAgreement = new ArrayList<Agreement> ();

    @objid ("e4046a96-1b18-4696-a91f-eb1b3f2e9aae")
    public AmountType UsageCostAmount;

    @objid ("f1c23e36-18c3-42b7-bcff-0aeec368d7f0")
    public AmountType UsageUnitCostAmount;

    @objid ("8445d12d-38c9-4e8f-9db1-80497ba30186")
    public AmountType CreationCostAmount;

}
