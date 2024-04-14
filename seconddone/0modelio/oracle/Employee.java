import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e7332b7a-3c2d-40b1-b7bd-fd3c5fb958ff")
public class Employee {
    @objid ("c5cb4f8d-ee04-4a81-af70-26b0d82be10f")
    private long employeeId;

    @objid ("4e0c7019-9383-4130-b800-241ab51ff286")
    private String firstName;

    @objid ("69085d6f-9110-4d49-abc8-dfa02ddbeaff")
    private String lastName;

    @objid ("f378ed94-c250-42cf-b387-08d087284203")
    private String email;

    @objid ("5aef5a4e-2885-48ed-9ce6-67702d53e0f4")
    private String phoneNumber;

    @objid ("1f866977-b8e2-4d1a-8af8-e5b3897cb5d2")
    private dateTime hireDate;

    @objid ("81412465-27f7-44f9-81c9-f400fccc9c46")
    private long salary;

    @objid ("8c665c61-cd0a-4136-8deb-6e1278889e5f")
    private long comissionPct;

    @objid ("b2774b4b-17a7-4bed-a87a-22318dcace15")
    private Employee manager;

    @objid ("dd2d286d-5106-47e5-8175-f0c7c26c3c89")
    private Job job;

}
