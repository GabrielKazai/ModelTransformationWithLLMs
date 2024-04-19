public enum VisibilityKind {
    public_, private_, protected_, package_
}

public abstract class BaseClass {
    public boolean readWriteSingleValuedPrimitiveAttribute = true;
    public UsedClass subsettedReadWriteAttribute;
    public final UsedClass subsettedReadOnlyAttribute = null;
    public boolean[] slot;
    public boolean[] readWriteDerivedAttribute;
    public final boolean[] readOnlyDerivedAttribute = null;
    public boolean[] readWriteDerivedUnionAttribute;
    public final boolean[] readOnlyDerivedUnionAttribute = null;

    public boolean[] readWriteDerivedAttribute() {
        return null;
    }

    public boolean[] readOnlyDerivedAttribute() {
        return null;
    }

    public boolean[] aRealOperation() {
        return null;
    }
}

public class UsedClass {
    public Class oppositeReadWriteSingleValuedObjectAttribute;
}

public class Class extends BaseClass {
    public UsedClass readWriteSingleValuedObjectAttribute;
    public UsedClass[] subsetReadWriteAttribute;
    public final UsedClass subsetReadOnlyAttribute = null;
    public boolean readWriteSingleValuedPrimitiveAttribute;
    public final UnlimitedNatural readOnlySingleValuedPrimitiveAttribute = new UnlimitedNatural(1);
    public boolean[] readWriteMultiValuedPrimitiveAttribute;
    public final boolean[] readOnlyMultiValuedPrimitiveAttribute = null;
    public VisibilityKind readWriteSingleValuedEnumerationAttribute = VisibilityKind.public_;
    public final VisibilityKind readOnlySingleValuedEnumerationAttribute = null;
    public VisibilityKind[] readWriteMultiValuedEnumerationAttribute;
    public final VisibilityKind[] readOnlyMultiValuedEnumerationAttribute = null;
    public final UsedClass readOnlySingleValuedObjectAttribute = null;
    public UsedClass[] readWriteMultiValuedObjectAttribute;
    public final UsedClass[] readOnlyMultiValuedObjectAttribute = null;

    public boolean opReturnPrimitiveSV() {
        return false;
    }

    public boolean[] opReturnPrimitiveMV() {
        return null;
    }

    public VisibilityKind opReturnEnumerationSV() {
        return null;
    }

    public VisibilityKind[] opReturnEnumerationMV() {
        return null;
    }

    public UsedClass opReturnObjectSV() {
        return null;
    }

    public UsedClass[] opReturnObjectMV() {
        return null;
    }

    public void opParameters(boolean pinprimitiveSV, VisibilityKind pinenumerationSV, UsedClass pinobjectSV,
            boolean[] pinprimitiveMV, VisibilityKind[] pinenumerationMV, UsedClass[] pinobjectMV,
            boolean[] pinoutprimitiveSV, VisibilityKind[] pinoutenumerationSV, UsedClass[] pinoutobjectSV,
            boolean[] pinoutprimitiveMV, VisibilityKind[] pinoutenumerationMV, UsedClass[] pinoutobjectMV,
            boolean[] poutprimitiveSV, VisibilityKind[] poutenumerationSV, UsedClass[] poutobjectSV,
            boolean[] poutprimitiveMV, VisibilityKind[] poutenumerationMV, UsedClass[] poutobjectMV) {
    }
}

public class UnlimitedNatural {
    private int value;

    public UnlimitedNatural(int value) {
        this.value = value;
    }
}