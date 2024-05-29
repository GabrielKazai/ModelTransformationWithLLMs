import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("65342d0a-9e4a-4a44-aca4-36cf7998fa69")
public interface Changeable {
    @objid ("e4e43d06-3147-430b-a1a4-5a9522f6c677")
    void addChangeListener(final ChangeListener listener);

    @objid ("d73f3569-7e3f-4a2f-8746-a31601b1d850")
    void removeChangeListener(final ChangeListener listener);

}
