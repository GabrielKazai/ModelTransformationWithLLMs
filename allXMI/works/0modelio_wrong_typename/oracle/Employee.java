import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("58c7de13-3e31-4255-96c4-44be067a0c96")
public class Employee {
    @objid ("4b0eece7-2f2a-479f-86cf-67ee0a15b659")
    private long employeeId;

    @objid ("4a3ae0aa-128d-4192-8e33-297997096b05")
    private String firstName;

    @objid ("603f8ab4-2e5a-4746-844e-35bf26256f1a")
    private String lastName;

    @objid ("0243d5f5-8162-43f7-8e21-6290d9089f5f")
    private String email;

    @objid ("ae203a41-4666-49c3-a6a3-aac3356af929")
    private String phoneNumber;

    @objid ("12d6f9cc-e5d5-4da2-b0d9-28e9e25aad08")
    private dateTime hireDate;

    @objid ("d98e60c7-d9e6-44e3-9e60-422045911311")
    private long salary;

    @objid ("a72c01eb-c640-4793-89e0-ca2bc7182518")
    private long comissionPct;

    @objid ("3bc757ab-f046-41a1-8741-38be4ca319cf")
    private Employee manager;

    @objid ("ea1f0af3-2860-40ea-94b0-e589214a3d4b")
    private Job job;

}
