import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9c7744f2-fe9a-4abf-a89f-2040a67914b3")
public interface LinkRatioSE extends CalculationData {
    @objid ("5d5eb84d-0d2d-4748-b0e7-4aa85e681fe3")
    LinkRatioScale getSourceLRScales();

    @objid ("6fc2845f-e699-4a79-92a0-6d63dab4af3c")
    int getDevelopmentCount();

    @objid ("d190c8b6-8d31-4b99-a5b2-10f80613365c")
    double getValue(final int development);

    @objid ("2e18a6f0-8870-43ff-aa21-397d864b21ba")
    double[] toArray();

}
