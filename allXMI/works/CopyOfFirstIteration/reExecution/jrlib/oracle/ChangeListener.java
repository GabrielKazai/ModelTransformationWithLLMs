import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("994e6bb9-f74e-4e04-a0c8-38a62193dfc6")
public interface ChangeListener extends EventListener {
    @objid ("303bdda2-ee47-4040-8290-d30f55fcdfbc")
    void stateChanged(ChangeEvent e);

}
