import FactorTriangle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("756375cc-0787-46f1-8b2f-7de803e2842a")
public interface LinkRatio extends CalculationData {
    @objid ("051358cb-f40d-4859-be61-be3b3f2770a2")
    FactorTriangle getSourceFactors();

    @objid ("b5117ddf-853c-4596-ab00-6932760d75eb")
    int getDevelopmentCount();

    @objid ("99c26556-5743-442c-b7de-fb69b202d007")
    double getValue(final int development);

    @objid ("99f08e8a-cd9a-429a-9286-7487e422a574")
    double[] toArray();

    @objid ("03338b6b-c1ed-4380-bdaf-baa541e95639")
    double getfWeight(final int accident, final int development);

    @objid ("3d2c69b8-f3c3-4203-8e78-00098a2bf26d")
    double getMackAlpha(final int development);

}
