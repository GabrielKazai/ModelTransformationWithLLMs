import FactorTriangle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4df313ee-17ab-49b8-9008-02d04d7a440a")
public interface LinkRatioMethod extends SelectableMethod<T> {
    @objid ("d7de9910-9adb-4200-9e1b-95f5b1302faf")
    void fit(final FactorTriangle factors);

    @objid ("e620102f-93a6-4ad2-90f2-79e444eaa984")
    double getValue(final int development);

    @objid ("3fe909f9-a04b-44f8-a913-3f49e1cc4e4a")
    double getWeight(final int accident, final int development);

    @objid ("03802e7a-59fd-4607-b3f4-5f993f7da497")
    double getMackAlpha();

}
