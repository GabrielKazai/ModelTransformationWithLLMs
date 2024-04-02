import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("889711d8-169f-4e1c-afaf-97484756cc94")
public interface Triangle extends CalculationData {
    @objid ("c786f478-4c84-417d-b92f-b43725d871ef")
    int getAccidentCount();

    @objid ("15859aa9-4bfb-4d83-9adf-4285bdf20c43")
    int getDevelopmentCount();

    @objid ("d40043a3-cddb-481b-b99b-cc1a6161fc9e")
    int getDevelopmentCount(final int accident);

    @objid ("d8711a58-0f3e-4119-990d-30728b4eba86")
    double getValue(final int accident, final int development);

    @objid ("45be1fda-e52c-4cb8-b1f6-55ea0c4d3930")
    double[][] toArray();

}
