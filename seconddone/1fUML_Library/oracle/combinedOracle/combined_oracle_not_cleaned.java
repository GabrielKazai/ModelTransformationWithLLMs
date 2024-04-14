import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1f08e28b-aee7-4f6d-98a8-7ba6ba157863")
public abstract class Channel {
    @objid ("df7bfb1b-e981-4991-ac14-25dc3d3750f3")
    public abstract String getName();

    @objid ("5d82b098-8a55-4a6b-aad3-ef7988c9a6ef")
    public abstract void open(Status errorStatus);

    @objid ("bc6cd5e2-e5fc-4e06-b2bd-e0f5535a9f05")
    public abstract void close(Status errorStatus);

    @objid ("31c0bb69-c285-42e6-b11a-442bd089e183")
    public abstract boolean isOpen();

    @objid ("fbdd5830-64b1-4e90-9e69-e269b96b5a1d")
    public abstract Status getStatus();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fa2dc69b-e438-4888-a458-747f418c17d8")
public abstract class StandardInputChannel extends TextInputChannel {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c82a85bf-1e33-44f8-b793-cd3d59cc5d7d")
public abstract class StandardOutputChannel extends TextOutputChannel {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f04fa283-4758-4152-bdf1-21d77ed3cdaa")
public abstract class ActiveChannel extends Channel {
    @objid ("5e2397be-5ade-4c1e-b951-7f6c91e9bc5b")
    public void register(final Listener listener) {
    }

    @objid ("bcea6560-c652-4617-9445-1ffdba4dd3b6")
    public void unregister(final Listener listener) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("832855b0-ec3b-47b1-a3e3-204a31acd8d6")
public class unlimitedNatural {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c881cf7d-3802-43a4-8efd-7eeae758d590")
public abstract class Listener {
    @objid ("56d4b3a8-58d7-489c-9ba0-2638a7b5d060")
    public void Notification() {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("efff5e21-d45d-4a11-9403-904b93b02fbc")
public class Status {
    @objid ("7a750b44-fc54-4929-a40e-4d3ccc831e21")
    public String context;

    @objid ("fbe31706-7a5a-4e7b-a8fe-f38c9cc73616")
    public int code;

    @objid ("0c3a9ea1-4ad1-4445-a96b-76fa3a63f9d3")
    public String description;

}

