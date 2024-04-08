import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4ca78f29-4016-40c0-a6ca-8db4492f531b")
public class Cursus {
    @objid ("78f2579f-1036-4311-9411-603515b52133")
    private int id;

    @objid ("02fd5968-1114-43ee-93f8-59a3332fb19e")
    private Date annee;

    @objid ("90755fb9-7b27-4964-99b0-ac99be5ef697")
    private String libelle;

    @objid ("50c163b5-1690-46da-9df7-0d415967e8db")
    public List<Ecole> ecole = new ArrayList<Ecole> ();

}
