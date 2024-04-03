package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("21497187-b49d-4fd6-bb29-a22068b79ece")
public class ServiceLevelAgreement {
    @objid ("0ce4e1af-29d3-48d6-bb37-d9021da241a3")
    public List<Agreement> ApplicableContract = new ArrayList<Agreement> ();

    @objid ("c07d827b-edef-49b6-93c5-252c0a47bb2a")
    public List<Agreement> Agreement = new ArrayList<Agreement> ();

    @objid ("4a4c54ba-8b6e-4fb8-b814-009880d5662c")
    public Agreement LicensingAgreement;

    @objid ("3ac74bff-719c-459b-8f0f-5d854591c5e7")
    public List<Agreement> UmbrellaAgreement = new ArrayList<Agreement> ();

    @objid ("95077c7b-710c-4e11-a30b-df1c3f3bb315")
    public AmountType UsageCostAmount;

    @objid ("670e4476-6b4f-4fdb-99e5-c1a8a204bef3")
    public AmountType UsageUnitCostAmount;

    @objid ("26f3bf41-3680-44f6-a4ce-6aec4ea6209f")
    public AmountType CreationCostAmount;

}
