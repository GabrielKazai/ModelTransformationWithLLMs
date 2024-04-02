package BasicInputOutput;

import Common.*;
import Common.Listener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("88f6d861-3aa3-4cce-b243-ca5dd061ee61")
public abstract class ActiveChannel extends Channel {
    @objid ("4254abed-d745-49e4-b8ee-8d10ad14ae56")
    public void register(final Listener listener) {
    }

    @objid ("08b24f0b-8cdb-4e57-9c15-4810359bdd2e")
    public void unregister(final Listener listener) {
    }

}
