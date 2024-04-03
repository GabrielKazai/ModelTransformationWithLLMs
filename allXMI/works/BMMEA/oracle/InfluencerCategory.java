import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7a21f794-400a-48d5-9e20-4cfb0e35a0d8")
public class InfluencerCategory extends MotivationElement {
    @objid ("8b99b59d-7bef-4a31-ba55-48f3436e057a")
    public List<Influencer> categorizedInfluencer = new ArrayList<Influencer> ();

    @objid ("2e839fb7-8893-4f87-bb53-d5053cdd5544")
    public List<InfluencerCategory> broaderInfluencerCategory = new ArrayList<InfluencerCategory> ();

    @objid ("cacef3f9-d0a9-4f2e-8927-dcae0ca9580b")
    public List<InfluencerCategory> narrowerInfluencerCategory = new ArrayList<InfluencerCategory> ();

}
