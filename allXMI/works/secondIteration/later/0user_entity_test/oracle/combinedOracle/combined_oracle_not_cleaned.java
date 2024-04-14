import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1c9c36bb-806e-4e31-9f61-44158fb98aa3")
public class User {
    @objid ("cd6183a6-faf4-47ea-8920-117fafca9708")
    public String name;

    @objid ("5155f570-e8e3-42be-8ac3-32f1ff7c87d8")
    public Account account;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9fb83785-16ce-4950-a040-fd77136ec67c")
public class Account {
    @objid ("04a0165d-ed01-4b4c-8806-39cd283977cb")
    public int argent;

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("911e93c7-c220-4481-9275-3e9e9669d7c4")
public class Bank {
    @objid ("093ba438-5840-4ab2-a1a8-3f8788d9e799")
    public String name;

    @objid ("00c46321-eb0f-4990-9468-0a79063fbc61")
    public List<User> user = new ArrayList<User> ();

}

