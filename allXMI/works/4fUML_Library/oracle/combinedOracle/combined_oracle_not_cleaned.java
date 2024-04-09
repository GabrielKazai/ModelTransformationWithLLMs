import Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1fc7111d-df89-4e02-9651-f3dc044e21e8")
public abstract class Channel {
    @objid ("1c7805cf-35a9-468c-9b1c-b261a465b44d")
    public abstract String getName();

    @objid ("d47f5fa8-e010-43f9-9798-df2742ddc235")
    public abstract void open(Status errorStatus);

    @objid ("d4bc4468-0afa-4e8f-aee6-b7a4b5d406ad")
    public abstract void close(Status errorStatus);

    @objid ("51282a48-f29b-47e8-919f-bfaeec5495f8")
    public abstract boolean isOpen();

    @objid ("844d3d2c-d2ae-451e-892a-e4f4316611cb")
    public abstract Status getStatus();

}

import Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import unlimitedNatural;

@objid ("c6aaa516-532a-49cf-b8f4-763b1bcef44d")
public abstract class TextInputChannel extends InputChannel {
    @objid ("9a138b77-1125-43c8-8950-da74d12ed219")
    public String readCharacter(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("5408de8b-48f5-4ea5-bd24-53d76fae7777")
    public String peekCharacter(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("fa6c2a13-f7e9-4cea-96e1-c778eea070ec")
    public String readLine(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("fc74428a-cab1-4c19-892f-658cf68a3f16")
    public Integer readInteger(Status errorStatus) {
        // TODO Auto-generated return
        return 0;
    }

    @objid ("b567aa03-04de-42b5-8d77-87996a206dce")
    public Boolean readBoolean(Status errorStatus) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("df94acbb-0807-46a4-85a9-f289c93c5e39")
    public unlimitedNatural readUnlimitedNatural(Status errorStatus) {
        // TODO Auto-generated return
        return null;
    }

}

import Status;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import unlimitedNatural;

@objid ("8a4a3e78-f7ce-438d-bbcd-844733db704f")
public abstract class TextOutputChannel extends OutputChannel {
    @objid ("9e9ca140-7bba-4446-8950-bee78c24c2ab")
    public void writeString(final String value, Status errorStatus) {
    }

    @objid ("614a9f6c-0167-4216-8131-cd05d956b369")
    public abstract void writeNewLine(Status errorStatus);

    @objid ("6ee1da46-86e3-40a5-ad34-365925f9349e")
    public void writeLine(final String value, Status errorStatus) {
    }

    @objid ("acc7f222-2278-4155-ae70-0542130ed6b5")
    public void writeInteger(final int value, Status errorStatus) {
    }

    @objid ("bb40585c-a179-4e4e-a4d6-358d72ddf74b")
    public void writeBoolean(final boolean value, Status errorStatus) {
    }

    @objid ("24c7bd6b-2272-4908-be3d-126b437ed0ab")
    public void writeUnlimitedNatural(final unlimitedNatural value, Status errorStatus) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("880a2dac-ca06-4290-b38a-19d45bddcdc6")
public abstract class StandardInputChannel extends TextInputChannel {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("778b430e-fbaa-43e0-ad9b-afce27558045")
public abstract class StandardOutputChannel extends TextOutputChannel {
}

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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("67ea0f32-ea8d-4096-be83-579c039c656d")
public abstract class Listener {
    @objid ("6d461488-23f3-4c5c-89ed-64d36ec48c27")
    public void [[GabrielRonnie]]() {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("9c405a2c-8680-49f5-9557-ba8a958aece3")
public class Status {
    @objid ("2b969ea9-a585-4a58-9e9d-463b2f6b498d")
    public String context;

    @objid ("4ecabd48-6101-430b-91f5-1e3fdb610831")
    public int code;

    @objid ("8dc269e8-e05f-4429-8578-29f4138d4db7")
    public String description;

}

