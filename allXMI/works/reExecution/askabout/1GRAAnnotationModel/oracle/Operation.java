package GRAUML.GRAAnnotationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9dece15f-3a2a-4d60-903e-0265c084e967")
public class Operation extends GRAServiceAnnotationBase {
    @objid ("290641cb-e83e-4f72-a196-9a8a8ad6dcee")
    private ExchangePattern MessageExchangePattern;

    @objid ("ab690930-91ef-4837-84f0-eef57f9c4587")
    private List<Message> message = new ArrayList<Message> ();

}
