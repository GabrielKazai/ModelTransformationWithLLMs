public enum VisibilityKind {    public,    private,    protected,    package}

public abstract class BaseClass {
    public boolean readWriteSingleValuedPrimitiveAttribute = true;
    public UsedClass subsettedReadWriteAttribute;
    public UsedClass subsettedReadOnlyAttribute;
    public boolean slot;
    public boolean readWriteDerivedAttribute;
    public boolean readOnlyDerivedAttribute;
    public boolean readWriteDerivedUnionAttribute;
    public boolean readOnlyDerivedUnionAttribute;

    public boolean readWriteDerivedAttribute() {
        return false;
    }

    public boolean readOnlyDerivedAttribute() {
        return false;
    }

    public boolean aRealOperation() {
        return false;
    }
}

public class UsedClass {
    public Class oppositeReadWriteSingleValuedObjectAttribute;
}

public class Class extends BaseClass {
    public UsedClass readWriteSingleValuedObjectAttribute;
    public UsedClass subsetReadWriteAttribute;
    public UsedClass subsetReadOnlyAttribute;
    public boolean readWriteSingleValuedPrimitiveAttribute;
    public boolean readOnlySingleValuedPrimitiveAttribute = true;
    public boolean readWriteMultiValuedPrimitiveAttribute;
    public boolean readOnlyMultiValuedPrimitiveAttribute;
    public VisibilityKind readWriteSingleValuedEnumerationAttribute = VisibilityKind.public;
    public VisibilityKind readOnlySingleValuedEnumerationAttribute;
    public VisibilityKind readWriteMultiValuedEnumerationAttribute;
    public VisibilityKind readOnlyMultiValuedEnumerationAttribute;
    public UsedClass readOnlySingleValuedObjectAttribute;
    public UsedClass readWriteMultiValuedObjectAttribute;
    public UsedClass readOnlyMultiValuedObjectAttribute;

    public boolean opReturnPrimitiveSV() {
        return false;
    }

    public boolean opReturnPrimitiveMV() {
        return false;
    }

    public VisibilityKind opReturnEnumerationSV() {
        return null;
    }

    public VisibilityKind opReturnEnumerationMV() {
        return null;
    }

    public UsedClass opReturnObjectSV() {
        return null;
    }

    public UsedClass opReturnObjectMV() {
        return null;
    }

    public boolean opParameters(boolean pinprimitiveSV, VisibilityKind pinenumerationSV, UsedClass pinobjectSV,
            boolean[] pinprimitiveMV, VisibilityKind[] pinenumerationMV, UsedClass[] pinobjectMV,
            boolean pinoutprimitiveSV, VisibilityKind pinoutenumerationSV, UsedClass pinoutobjectSV,
            boolean[] pinoutprimitiveMV, VisibilityKind[] pinoutenumerationMV, UsedClass[] pinoutobjectMV,
            boolean poutprimitiveSV, VisibilityKind poutenumerationSV, UsedClass poutobjectSV,
            boolean[] poutprimitiveMV, VisibilityKind[] poutenumerationMV, UsedClass[] poutobjectMV) {
        return false;
    }
}