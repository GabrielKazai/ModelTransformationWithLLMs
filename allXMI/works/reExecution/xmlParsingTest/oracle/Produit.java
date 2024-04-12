import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e4f16bf0-4b81-40c3-af8e-ba99b938871e")
class Produit {
    @objid ("1ddfb1b1-91bd-4324-a4c1-e7c44f9cc334")
    protected String nom;

    @objid ("1fd47dc1-a213-49b9-a8d0-cdf24263730f")
    private static String classifier;

    @objid ("502765f9-dd91-4ee7-a790-ab8ed3266954")
    private List<Theme> themes = new ArrayList<Theme> ();

}
