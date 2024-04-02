import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c75241ec-ce3e-4997-89de-caad678a9b7b")
public interface LinkRatioSEFunction extends SelectableMethod<T> {
    @objid ("e0e0de7b-678c-41dd-9081-982acbb28260")
    void fit(final LinkRatioSE ses);

    @objid ("b834a697-2cd9-46a9-a431-bbd9e6472cfd")
    double getValue(final int development);

}
