import LinkRatio;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("07cb5ca0-3695-4fc6-a3df-c8b686ab73dd")
public interface LinkRatioScale extends CalculationData {
    @objid ("52a67d1e-db93-4d05-9e2e-10bfcbffb357")
    LinkRatio getSourceLinkRatios();

    @objid ("93d60511-acbe-4add-9295-bba7d4b7b324")
    int getDevelopmentCount();

    @objid ("b4943f54-6ae9-4683-9f31-d3737ee7d08b")
    double getValue(final int development);

    @objid ("2d275f33-b5cb-4536-be3d-0f605f83e4cf")
    double[] toArray();

}
