import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2913b449-b330-47c5-8d3a-fd1913ec0f5a")
abstract class P_BMM_TYPE extends P_BMM_CLASSIFIER {
    @objid ("61e61d51-ef03-4b16-adf1-f43889140714")
    public BMM_TYPE bmm_type;

    @objid ("9b3606e5-cee9-4229-bbf2-85124f253152")
    public abstract void create_bmm_type(final BMM_SCHEMA a_schema, final BMM_CLASS a_class_def);

}
