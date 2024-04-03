import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1384af52-6549-40eb-bc62-b478ccc57a84")
public interface Timer {
    @objid ("fac04ac0-81a3-49b0-9b93-c77916dbba14")
    void start(final Timepoint expire);

    @objid ("8870e9a3-6677-437f-835b-47d9b739363c")
    void start2(final Duration expire);

    @objid ("d30e8484-6ab8-41e0-bdb1-794457ccbacd")
    void stop();

    @objid ("b140ac93-1202-4818-9f11-47898a5877cf")
    Duration read();

}
