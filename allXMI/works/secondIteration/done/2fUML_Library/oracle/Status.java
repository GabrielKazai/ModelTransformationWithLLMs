package Common;

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("9ae6400b-423d-416b-a4fb-1e38ad597f60")
public class Status {
    @objid ("5bcdc281-7cd0-43cf-a2d5-08eb21ff0c9d")
    public String context;

    @objid ("11b48c93-4725-46b6-994e-302064132ed0")
    public int code;

    @objid ("723081ad-14d2-46e8-9035-e7485533d6a4")
    public String description;

}
