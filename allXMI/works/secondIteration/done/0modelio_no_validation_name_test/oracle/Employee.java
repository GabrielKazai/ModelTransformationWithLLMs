import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b9295f90-06bc-4d92-800e-e287cfbb638d")
public class Employee {
    @objid ("112d07e1-cee9-42d1-8847-02312ce7f772")
    private long employeeId;

    @objid ("3e099561-61cd-48f0-bfd0-6b98aef36be2")
    private String firstName;

    @objid ("049a56ab-bc3b-4f62-a716-037ced39d7bc")
    private String lastName;

    @objid ("5ae38f81-d9e9-49c0-935c-79a5b7553790")
    private String email;

    @objid ("69241d4b-6f40-4d8f-8d84-35854c75cdb6")
    private String phoneNumber;

    @objid ("e3ec0dc7-dce3-42ec-ba44-4a6583da70a2")
    private dateTime hireDate;

    @objid ("13fccdde-32d6-4cf1-a150-407586418f6e")
    private long salary;

    @objid ("124b5830-4ae0-478d-bcfe-81f75c845c78")
    private long comissionPct;

    @objid ("779b909b-6381-415c-a945-f7663fbb9d41")
    private Employee manager;

    @objid ("685952f3-4821-470e-81f0-99735a9c29cb")
    private Job job;

}
