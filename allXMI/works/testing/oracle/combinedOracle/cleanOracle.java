
public enum VisibilityKind {
    public,
    private,
    protected,
    package;
}

public abstract class BaseClass {
    public boolean readWriteSingleValuedPrimitiveAttribute = true;

    public boolean[] slot;

    public List<Boolean> readWriteDerivedAttribute() {
        // TODO Auto-generated return
        return false;
    }

    public List<Boolean> readOnlyDerivedAttribute() {
        // TODO Auto-generated return
        return false;
    }

    public List<Boolean> aRealOperation() {
        // TODO Auto-generated return
        return false;
    }

}

public class UsedClass {
    public Class oppositeReadWriteSingleValuedObjectAttribute;

}

public class Class extends BaseClass {
    public UsedClass[] subsetReadWriteAttribute;

    public UsedClass subsetReadOnlyAttribute;

    public boolean readWriteSingleValuedPrimitiveAttribute = false;

    public unlimitedNatural readOnlySingleValuedPrimitiveAttribute = 1;

    public boolean[] readWriteMultiValuedPrimitiveAttribute;

    public boolean[] readOnlyMultiValuedPrimitiveAttribute;

    public VisibilityKind readWriteSingleValuedEnumerationAttribute = public;

    public VisibilityKind readOnlySingleValuedEnumerationAttribute;

    public VisibilityKind[] readWriteMultiValuedEnumerationAttribute;

    public VisibilityKind[] readOnlyMultiValuedEnumerationAttribute;

    public UsedClass readOnlySingleValuedObjectAttribute;

    public UsedClass[] readWriteMultiValuedObjectAttribute;

    public UsedClass[] readOnlyMultiValuedObjectAttribute;

    public UsedClass readWriteSingleValuedObjectAttribute;

    public boolean opReturnPrimitiveSV() {
        // TODO Auto-generated return
        return false;
    }

    public List<Boolean> opReturnPrimitiveMV() {
        // TODO Auto-generated return
        return false;
    }

    public VisibilityKind opReturnEnumerationSV() {
        // TODO Auto-generated return
        return null;
    }

    public List<VisibilityKind> opReturnEnumerationMV() {
        // TODO Auto-generated return
        return null;
    }

    public UsedClass opReturnObjectSV() {
        // TODO Auto-generated return
        return null;
    }

    public List<UsedClass> opReturnObjectMV() {
        // TODO Auto-generated return
        return null;
    }

    public void opParameters(final boolean pinprimitiveSV, final VisibilityKind pinenumerationSV,
            final UsedClass pinobjectSV, final List<Boolean> pinprimitiveMV,
            final List<VisibilityKind> pinenumerationMV, final List<UsedClass> pinobjectMV, boolean pinoutprimitiveSV,
            VisibilityKind pinoutenumerationSV, UsedClass pinoutobjectSV, List<Boolean> pinoutprimitiveMV,
            List<VisibilityKind> pinoutenumerationMV, List<UsedClass> pinoutobjectMV, boolean poutprimitiveSV,
            VisibilityKind poutenumerationSV, UsedClass poutobjectSV, List<Boolean> poutprimitiveMV,
            List<VisibilityKind> poutenumerationMV, List<UsedClass> poutobjectMV) {
    }

}

public class unlimitedNatural {
}
