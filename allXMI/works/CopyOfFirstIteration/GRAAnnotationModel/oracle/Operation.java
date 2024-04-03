import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f5b34151-d508-4952-9712-ccd1d967b56f")
public class Operation extends GRAServiceAnnotationBase {
    @objid ("25945e14-a19b-4021-bb99-42dd55cad000")
    private ExchangePattern MessageExchangePattern;

    @objid ("7f233947-652f-459d-9f10-d495bb78acc3")
    protected Boolean isAsyncronous;

    @objid ("aefdad16-b651-4e97-a446-df4d1b20528f")
    private List<Message> message = new ArrayList<Message> ();

}
