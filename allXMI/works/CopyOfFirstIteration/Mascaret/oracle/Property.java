import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2cd55204-0b97-4c10-a209-3d29fd874c70")
public class Property extends Feature {
    @objid ("14eddc30-f830-44ce-9b3c-0092b095bf9c")
    public boolean isComposite;

    @objid ("1466aa97-1b30-4ce0-ad88-e8b208efa649")
    public boolean isNavigable;

    @objid ("9a1a9a3e-6c89-44ef-a6d7-d3e89bb49161")
    public boolean isReadOnly;

    @objid ("c2d6af81-7e35-47c6-914e-bebd8f8c5f88")
    public boolean isDerived;

    @objid ("a20e8512-70de-4aea-aaad-a28048d2a79d")
    public boolean isOrdered;

    @objid ("4a55103f-b12f-4018-8d25-3f295da624d2")
    public boolean isUnique;

    @objid ("94934fe5-9e2a-497c-87ad-f18293ae2cf3")
    public int minimumNumber;

    @objid ("d1fed957-c76a-4419-8217-c31898475de7")
    public int maximumNumber;

    @objid ("54d5c9f9-d745-4f9d-8bfe-2ec9c3e59f24")
    public Classifier type;

    @objid ("90d5f603-7288-4a52-a540-e43eb6e3a2d5")
    public Classifier classifier;

    @objid ("ea786689-48c0-428a-baa4-1a800f5a2bd1")
    public Property opposite;

    @objid ("1fad44c9-a381-4c45-b363-5b7c3cc1e2fc")
    public ValueSpecification defaultValue;

    @objid ("f60572b6-00f9-4743-a9f5-4696f57cbc3e")
    public DomainSpecification domain;

}
