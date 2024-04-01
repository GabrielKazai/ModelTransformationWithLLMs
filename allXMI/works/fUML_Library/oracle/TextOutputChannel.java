import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d39409fc-8a73-42d4-8f1b-72fdbd5ab5de")
public abstract class TextOutputChannel extends OutputChannel {
    @objid ("db52af83-40f2-4c26-9ddc-59d23efdd297")
    public void writeString(final String value, Status errorStatus) {
    }

    @objid ("1055601d-594c-4ad1-9bd6-794d8196a5d9")
    public abstract void writeNewLine(Status errorStatus);

    @objid ("439f4fa0-07e4-4207-b978-2e213ff53b86")
    public void writeLine(final String value, Status errorStatus) {
    }

    @objid ("04e42e71-8baf-4838-a11b-264ee36532d6")
    public void writeInteger(final int value, Status errorStatus) {
    }

    @objid ("51fa51a1-e19a-4918-8c3e-79f932e76c2e")
    public void writeBoolean(final boolean value, Status errorStatus) {
    }

    @objid ("dd573134-598b-455e-aad1-66c674c3dbc1")
    public void writeUnlimitedNatural(final unlimitedNatural value, Status errorStatus) {
    }

}
