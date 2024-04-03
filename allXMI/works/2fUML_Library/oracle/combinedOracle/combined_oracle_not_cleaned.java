package BasicInputOutput;

import Common.*;
import Common.Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9f5fdb1f-de17-4382-bc15-50ed87041fe7")
public abstract class Channel {
    @objid ("9577628d-9bd2-485b-bbbb-c65097655763")
    public abstract String getName();

    @objid ("d4f76a5c-7b0b-4c62-963b-09b9bc07e007")
    public abstract void open(Status errorStatus);

    @objid ("d4e68128-e66a-4ad2-925c-a70d44dd9b8e")
    public abstract void close(Status errorStatus);

    @objid ("322472dd-d733-463e-8106-cb380c426bb8")
    public abstract boolean isOpen();

    @objid ("eca4633a-8a0b-403c-8331-3bb2cf52ecf8")
    public abstract Status getStatus();

}

package BasicInputOutput;

import Common.*;
import Common.Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import external.unlimitedNatural;

@objid ("cdc9ca69-b71d-4a70-9365-3114224b8c2f")
public abstract class TextInputChannel extends InputChannel {
    @objid ("21581c01-4cab-458e-ade4-01357ae88a5b")
    public String readCharacter(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("4d7bd9e8-81e7-4a40-879e-e63b3ff85dc0")
    public String peekCharacter(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("906f0819-1739-41ae-a7df-3a8d871169e0")
    public String readLine(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("88289d81-3b42-4e5b-b117-e6e247f35039")
    public Integer readInteger(Status errorStatus) {
        // TODO Auto-generated return
        return 0;
    }

    @objid ("87e24053-2ed1-4d1b-ba5f-d211ff0e6ec5")
    public Boolean readBoolean(Status errorStatus) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("39c89a6c-3121-481a-8365-8633069c658b")
    public unlimitedNatural readUnlimitedNatural(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

}

package BasicInputOutput;

import Common.*;
import Common.Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import external.unlimitedNatural;

@objid ("e948070b-fd6c-4355-ab27-0f45547b7e15")
public abstract class TextOutputChannel extends OutputChannel {
    @objid ("f6fbd130-a892-49ef-a227-84b5dbc55e28")
    public void writeString(final String value, Status errorStatus) {
    }

    @objid ("4a9725fc-4fbe-4702-9349-dedf3c219551")
    public abstract void writeNewLine(Status errorStatus);

    @objid ("82b909b3-eaf8-486e-911e-bd61440887e3")
    public void writeLine(final String value, Status errorStatus) {
    }

    @objid ("f7f55981-ec54-40cc-bb66-b27dca5f5a48")
    public void writeInteger(final int value, Status errorStatus) {
    }

    @objid ("1ad98ecb-cf2f-4e54-8c74-b82f4347179a")
    public void writeBoolean(final boolean value, Status errorStatus) {
    }

    @objid ("96803747-ed54-4418-bce0-75e2f79577e5")
    public void writeUnlimitedNatural(final unlimitedNatural value, Status errorStatus) {
    }

}

package BasicInputOutput;

import Common.*;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2a38ca64-4879-4ad5-a1aa-8e52bb634ef2")
public abstract class StandardInputChannel extends TextInputChannel {
}

package BasicInputOutput;

import Common.*;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8a859d4b-6ac1-4073-a598-02bd634c18e9")
public abstract class StandardOutputChannel extends TextOutputChannel {
}

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

package external;

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("9bce345a-f393-4ce5-b326-95b7b3d82279")
public class unlimitedNatural {
}

package Common;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("10a77b86-e65c-49d4-9a77-0b08e8acda88")
public abstract class Listener {
    @objid ("50b403f2-4e22-422f-a287-599234c32fff")
    public void Notification() {
    }

}

package Common;

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("9ae6400b-423d-416b-a4fb-1e38ad597f60")
public class Status {
    @objid ("5bcdc281-7cd0-43cf-a2d5-08eb21ff0c9d")
    public String context;

    @objid ("11b48c93-4725-46b6-994e-302064132ed0")
    public int code;

    @objid ("723081ad-14d2-46e8-9035-e7485533d6a4")
    public String description;

}

