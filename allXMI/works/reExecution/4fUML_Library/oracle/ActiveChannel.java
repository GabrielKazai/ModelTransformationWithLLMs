import Listener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2b1885e3-5999-43c8-a048-76151a0f757c")
public abstract class ActiveChannel extends Channel {
    @objid ("d57d8cff-83fa-4180-93a1-d31ac3c4f038")
    public void register(final Listener listener) {
    }

    @objid ("b401d497-571b-468a-9209-713bb9eadb7a")
    public void unregister(final Listener listener) {
    }

}
