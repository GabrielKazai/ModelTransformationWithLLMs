import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("24e52e7a-f52f-4b4c-9e21-7a1ccf11ea08")
public interface LinkRatioSmoothing extends LinkRatio {
    @objid ("1bbb0439-06c3-4899-816b-a6be1a0567b5")
    LinkRatio getSourceLinkRatios();

    @objid ("cac549e7-0243-499b-b683-89769f426b64")
    void setDevelopmentCount(final int developments);

}
