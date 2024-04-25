import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("117221bb-99df-46a8-ab6b-9c627f5aa7e3")
public interface LinkRatioScaleEstimator extends SelectableMethod<T> {
    @objid ("40fcfb39-fbc1-406e-a97d-0ebf74ce2c54")
    void fit(final LinkRatioScale scales);

    @objid ("d8e095a1-7cca-43ec-a090-8bf8cef5fc78")
    double getValue(final int development);

}
