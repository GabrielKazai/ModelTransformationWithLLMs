import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7001c0c3-5276-4a74-b6c0-fca47aa866c8")
public class One {
    @objid ("6e26021a-d687-4955-baf8-3dde7ea2617d")
    public List<Many> many = new ArrayList<Many> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ac098bf2-0d58-47ca-8fad-b356de9d586f")
public class Many {
}

