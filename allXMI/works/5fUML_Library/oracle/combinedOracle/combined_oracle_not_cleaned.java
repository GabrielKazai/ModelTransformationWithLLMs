import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e12f9834-690f-40ad-83fe-203666528c8b")
public abstract class Channel {
    @objid ("1e789046-0272-4951-852f-ac481993c72d")
    public abstract String getName();

    @objid ("e2400784-1fc6-4a33-8fed-272ca6d937d5")
    public abstract void open(Status errorStatus);

    @objid ("8967c33a-e5af-4770-ab9e-605cea9cb111")
    public abstract void close(Status errorStatus);

    @objid ("f6d2f003-6a24-4e25-9bfa-a8135c4bd1b9")
    public abstract boolean isOpen();

    @objid ("330980c7-7f9a-4ee1-af59-bcd85e19a27c")
    public abstract Status getStatus();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("457a2877-ac75-47b4-845a-a8e137bc9774")
public abstract class TextInputChannel extends InputChannel {
    @objid ("bbba763a-5653-4d41-ab2b-2f489da1f3b8")
    public String readCharacter(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("fd7a868d-ba60-4383-8c6c-506797daa78f")
    public String peekCharacter(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("97052f0f-7eb2-4458-a6df-8629419b0a99")
    public String readLine(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("3b77168b-c65e-452c-8a12-ebf2f35bb58a")
    public Integer readInteger(Status errorStatus) {
        // TODO Auto-generated return
        return 0;
    }

    @objid ("4719c7c8-7190-4164-bbfe-790934518605")
    public Boolean readBoolean(Status errorStatus) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("7a9f5624-0f3e-4a0c-93c2-8404335a7351")
    public unlimitedNatural readUnlimitedNatural(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("531dec82-d4fd-4e07-bb0a-1088bdafaaeb")
public abstract class TextOutputChannel extends OutputChannel {
    @objid ("089e372b-aad2-467f-9eb2-3fead6f0107a")
    public void writeString(final String value, Status errorStatus) {
    }

    @objid ("4e22b867-0074-4c5a-808b-42eb80dacbbc")
    public abstract void writeNewLine(Status errorStatus);

    @objid ("76c6e2a7-66e6-4702-accc-411f99febad7")
    public void writeLine(final String value, Status errorStatus) {
    }

    @objid ("d05271c9-6631-480e-a6e7-8709efe07eca")
    public void writeInteger(final int value, Status errorStatus) {
    }

    @objid ("ab8e84a1-15e5-4514-b4ce-2f90faa0b90b")
    public void writeBoolean(final boolean value, Status errorStatus) {
    }

    @objid ("8e04237a-532a-445e-a7b2-ae856d48b73b")
    public void writeUnlimitedNatural(final unlimitedNatural value, Status errorStatus) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7476d594-a340-4f25-a3fe-201557774fdd")
public abstract class StandardInputChannel extends TextInputChannel {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("695b85df-660f-4f9c-8d58-f585c494c3ad")
public abstract class StandardOutputChannel extends TextOutputChannel {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("98c51e2d-1ed0-4da0-a493-013214e0a30d")
public abstract class ActiveChannel extends Channel {
    @objid ("f438a036-4c3b-485f-bcfd-437862fee094")
    public void register(final Listener listener) {
    }

    @objid ("71f1887a-2cc7-43de-9f1d-ad2561e651d2")
    public void unregister(final Listener listener) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("d29b9873-393a-4152-8520-d4ad7451ebf0")
public class unlimitedNatural {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2e142f82-ea85-45f1-ac6d-d3898cf11874")
public abstract class Listener {
    @objid ("3a585318-7ae0-41e1-a7a3-cfa93a5b4218")
    public void () {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("29b7d27d-e35c-4ee4-9017-b00d5ff85703")
public class Status {
    @objid ("a274a789-013f-4f75-ad25-75c77fd311cf")
    public String context;

    @objid ("de7e1e45-a0b9-41c3-895f-0e8d1dadbc58")
    public int code;

    @objid ("f70d6c71-2c13-4cd2-8ff3-05e02ec6bba7")
    public String description;

}

