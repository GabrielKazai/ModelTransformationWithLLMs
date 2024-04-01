import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7975e44e-1224-4b1e-92cc-27590f5fb78f")
class BMM_CLASS extends BMM_CLASSIFIER {
    @objid ("6ec856fa-ff3d-4268-b47c-a515de14d30a")
    public String name;

    @objid ("b227e23c-c299-4b73-9ac9-1811b0545630")
    public String source_schema_id;

    @objid ("e07b1455-5b9e-4e00-82c5-854479ea1550")
    public String[] immediate_descendants;

    @objid ("9b3aab49-22d0-4fd5-be7f-9a3b8c630f50")
    public List<BMM_CLASS> ancestors = new ArrayList<BMM_CLASS> ();

    @objid ("26784c6e-2c2b-460b-9331-5164846a2991")
    public BMM_PACKAGE package;

    @objid ("16ca734c-cb32-4757-babe-4c8a36720c28")
    public List<BMM_PROPERTY> properties = new ArrayList<BMM_PROPERTY> ();

    @objid ("76f6a1f4-2b58-4dad-a6c5-16f28854ef28")
    public List<String> all_ancestors() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("e2dda828-1c3e-4136-99b7-55580d090ec8")
    public List<String> all_descendants() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("d411b4fb-8c94-4094-bbe1-56d382d4746f")
    public List<String> suppliers() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("0e7e0fbb-0d1a-47be-af40-98100ab0eabb")
    public List<String> suppliers_non_primitive() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("457c7e36-52bf-4b46-ab1f-0ea3b1d72f75")
    public List<String> supplier_closure() {
        // TODO Auto-generated return
        return null;
    }

}
