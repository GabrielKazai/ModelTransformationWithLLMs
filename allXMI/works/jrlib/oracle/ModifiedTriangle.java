import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("419e3961-71bf-4826-99e6-60b345ef1b21")
public interface ModifiedTriangle extends Triangle {
    @objid ("6ea89ef6-e93e-4c41-9269-209673590120")
    Triangle getSourceTriangle();

}
