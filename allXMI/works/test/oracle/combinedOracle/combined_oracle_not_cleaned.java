import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2953b869-7b87-4d50-9dc8-60f18c81c09e")
public class Employee {
    @objid ("5f17faea-5d8f-4f1e-97bd-7c70aa4e8e47")
    public String Attribute;

    @objid ("f86ebd21-5b5a-4736-a09e-b31d516ad3bd")
    public List<Job> jobAssigne = new ArrayList<Job> ();

    @objid ("435df9d5-609f-41be-8cb1-4c2b881c8dc9")
    public List<Job> jobAFaire = new ArrayList<Job> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6bd90c23-33f6-4109-9a14-f97ec1a87400")
public class Job {
    @objid ("9d8ec676-4545-4cb0-8d60-13f98cfc2bd4")
    public String Attribute;

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8a72c2a1-17b5-4199-b027-ee240abadabe")
public class ManyFoo {
    @objid ("816445c7-c3a6-4c3a-9d8a-5cde903611ad")
    public List<ManyFaa> faaOne = new ArrayList<ManyFaa> ();

    @objid ("be740253-4f55-422d-9fa1-a78ea43f6270")
    public List<ManyFaa> faaTwo = new ArrayList<ManyFaa> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("95ee2067-1b90-49eb-aaf1-b3925c73011f")
public class ManyFaa {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2be91ddf-f3cf-49b7-ab4a-fe04dbce65dd")
public class OneFoo {
    @objid ("23f4b7c1-2366-448f-8da8-365c430ee871")
    public OneFaa firstFaa;

    @objid ("ec088d31-acc9-4992-9d49-9f181339c139")
    public OneFaa faaSecond;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d19e072b-2c45-4634-99ef-a64d6a2e56a0")
public class OneFaa {
}

