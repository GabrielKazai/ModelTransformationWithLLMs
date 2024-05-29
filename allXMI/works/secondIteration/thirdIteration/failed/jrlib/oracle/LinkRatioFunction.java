import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9381d7c6-1851-43eb-91c9-9c1ca847fa46")
public interface LinkRatioFunction extends SelectableMethod<T> {
    @objid ("59ef0632-3727-4bde-b192-99b9d7362870")
    void fit(final LinkRatio lr);

    @objid ("6f51ee11-9db7-4ef5-9879-18cce080b879")
    double getValue(final int development);

}
