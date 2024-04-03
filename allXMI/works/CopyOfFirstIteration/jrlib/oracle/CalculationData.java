import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("de12f097-0874-4f97-88a4-af2cd17d97b3")
public interface CalculationData extends Changeable {
    @objid ("d64e91a9-d1b8-49db-af9d-63c2b64d6e0f")
    void recalculate();

    @objid ("a62ceb01-aa7a-476a-a88a-503116c452ee")
    void detach();

}
