import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("19cb4770-fb00-4c19-b462-734226bbd986")
public enum Verdict {
    none,
    pass,
    inconclusive,
    fail,
    error;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("82ec8007-8467-4f94-a732-97372e193792")
public interface Arbiter {
    @objid ("5b22fc7a-f797-41f3-b962-e866098d0012")
    Verdict getVerdict();

    @objid ("448cf41c-2e48-4840-babd-4f760a71b1a4")
    void setVerdict(final Verdict v);

}

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

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("f6a5566c-4d6d-492e-bc81-34b68f42c83e")
public class Timepoint {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("fa88816b-5761-4408-a4cf-e4b3acb33c43")
public class Duration {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("821bd573-02cc-4472-a60d-fa3bc30e5f08")
public class Timezone {
}

