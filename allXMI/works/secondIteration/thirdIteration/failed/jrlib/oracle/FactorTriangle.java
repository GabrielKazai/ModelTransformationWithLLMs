import Triangle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("aba214ae-9726-43fb-99ee-215969e2a749")
public interface FactorTriangle extends Triangle {
    @objid ("26fd496c-60e4-4510-a074-f486a83f9914")
    Triangle getSourceTriangle();

}
