import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import unlimitedNatural;

@objid ("56ac2fff-8340-485a-b3df-7732500329e6")
public class Class extends BaseClass {
    @objid ("cdba8875-9d99-4350-a272-e778de539f5b")
    public UsedClass[] subsetReadWriteAttribute;

    @objid ("2a4bac24-7782-4d0c-b1ef-c0b5a9996fbd")
    public UsedClass subsetReadOnlyAttribute;

    @objid ("08fd49f4-d846-44be-831c-db1c464e986e")
    public boolean readWriteSingleValuedPrimitiveAttribute = false;

    @objid ("197675f0-b97e-4432-96bd-634a43f27443")
    public unlimitedNatural readOnlySingleValuedPrimitiveAttribute = 1;

    @objid ("13c4e16e-fd6a-47f9-8999-15f3be19dae4")
    public boolean[] readWriteMultiValuedPrimitiveAttribute;

    @objid ("29aecb24-f4ec-4e35-a079-7d8b97540f23")
    public boolean[] readOnlyMultiValuedPrimitiveAttribute;

    @objid ("ff8d8179-248c-4e44-b399-9f53af1b3161")
    public VisibilityKind readWriteSingleValuedEnumerationAttribute = public;

    @objid ("d9548fbd-f2dd-4ff9-9e6b-64e7318ec39f")
    public VisibilityKind readOnlySingleValuedEnumerationAttribute;

    @objid ("d00b0514-9650-4afc-8e07-b04ea865bd76")
    public VisibilityKind[] readWriteMultiValuedEnumerationAttribute;

    @objid ("68c58663-04f1-44b7-aebc-e39a277dbd66")
    public VisibilityKind[] readOnlyMultiValuedEnumerationAttribute;

    @objid ("b82e0951-82ac-4832-8b8a-bf3971e55fbe")
    public UsedClass readOnlySingleValuedObjectAttribute;

    @objid ("a1c227e6-2f3b-41d0-9267-3456e7f0c703")
    public UsedClass[] readWriteMultiValuedObjectAttribute;

    @objid ("279ce009-38fe-48a8-8a8f-86308e785078")
    public UsedClass[] readOnlyMultiValuedObjectAttribute;

    @objid ("2f0a7695-87f8-4cde-90fb-45db0bda3ec2")
    public UsedClass readWriteSingleValuedObjectAttribute;

    @objid ("b5817106-66f2-4c02-8082-9e0f3e2c3e91")
    public boolean opReturnPrimitiveSV() {
        // TODO Auto-generated return
        return false;
    }

    @objid ("1fe2516a-4e00-43cc-bd04-3f4875f4e40e")
    public List<Boolean> opReturnPrimitiveMV() {
        // TODO Auto-generated return
        return false;
    }

    @objid ("629dc3e5-8f9a-48bf-8108-560331736b9a")
    public VisibilityKind opReturnEnumerationSV() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("6d156202-0244-4adf-b3ec-b098e8158640")
    public List<VisibilityKind> opReturnEnumerationMV() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("daa00bfe-7e62-4510-995b-8a30735b0b3a")
    public UsedClass opReturnObjectSV() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("66749ade-908f-446a-b2af-c2df4ddf5358")
    public List<UsedClass> opReturnObjectMV() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("e18f0416-f04b-48af-a3ee-0c2060c11c3d")
    public void opParameters(final boolean pinprimitiveSV, final VisibilityKind pinenumerationSV, final UsedClass pinobjectSV, final List<Boolean> pinprimitiveMV, final List<VisibilityKind> pinenumerationMV, final List<UsedClass> pinobjectMV, boolean pinoutprimitiveSV, VisibilityKind pinoutenumerationSV, UsedClass pinoutobjectSV, List<Boolean> pinoutprimitiveMV, List<VisibilityKind> pinoutenumerationMV, List<UsedClass> pinoutobjectMV, boolean poutprimitiveSV, VisibilityKind poutenumerationSV, UsedClass poutobjectSV, List<Boolean> poutprimitiveMV, List<VisibilityKind> poutenumerationMV, List<UsedClass> poutobjectMV) {
    }

}
