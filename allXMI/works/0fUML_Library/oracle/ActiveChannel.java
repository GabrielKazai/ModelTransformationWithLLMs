import Listener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e81255c4-52e9-4c92-a985-8f3fe9c78e7a")
public abstract class ActiveChannel extends Channel {
    @objid ("289c2711-57a2-4d78-b67e-baea9a0220d9")
    public void register(final Listener listener) {
    }

    @objid ("02de64d7-7067-424b-9abf-b141ad847a50")
    public void unregister(final Listener listener) {
    }

}
