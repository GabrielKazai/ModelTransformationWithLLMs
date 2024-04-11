import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("82ec8007-8467-4f94-a732-97372e193792")
public interface Arbiter {
    @objid ("5b22fc7a-f797-41f3-b962-e866098d0012")
    Verdict getVerdict();

    @objid ("448cf41c-2e48-4840-babd-4f760a71b1a4")
    void setVerdict(final Verdict v);

}
