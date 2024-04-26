import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("15640e52-2c58-465d-8f91-78bfbce1331d")
abstract class P_BMM_PROPERTY {
    @objid ("a8ebe418-de56-4b55-bcb0-8983ea150a5d")
    public String name;

    @objid ("7ea959ba-0f87-4c6e-9b62-b31659c1e043")
    public Boolean is_mandatory;

    @objid ("de244753-0914-4caa-96e4-fa3b8834bb46")
    public Boolean is_computed;

    @objid ("a6f875b0-7b4a-4e4c-862e-285d8b0dabd9")
    public BMM_PROPERTY bmm_property_definition;

    @objid ("e38e9091-67ec-41bb-8ebc-a2c2e11a8188")
    public Boolean is_im_infrastructure;

    @objid ("35eafdf6-5ce0-4ff1-9c64-34a00406b8a0")
    public Boolean is_im_runtime;

    @objid ("a4d152c6-0334-4a3a-83df-e38feda41a43")
    public abstract void create_bmm_property_definition();

    @objid ("b58160cf-1ea1-4489-9282-7057570b3a9d")
    public abstract P_BMM_TYPE type_def();

}
