import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("690a9543-9f12-40c3-9354-eedec26e3542")
public class Employee {
    @objid ("cc9f7a75-57b3-41ab-b2d0-c7dc8bbe1c8f")
    private long employeeId;

    @objid ("cdbffaa6-f04c-4527-aed1-f32dccc34b36")
    private String firstName;

    @objid ("8a0a98e5-15b1-4ff0-8ebc-e3371b40487f")
    private String lastName;

    @objid ("3b03d790-0731-4d09-b874-646fbccf52b5")
    private String email;

    @objid ("da85b365-8592-4794-91f2-82bc3e4eb222")
    private String phoneNumber;

    @objid ("9279cf68-676a-4191-ae5b-b61b04ecc6e3")
    private dateTime hireDate;

    @objid ("621925c5-0821-419d-9478-c891afc0f41d")
    private long salary;

    @objid ("ead95171-8f39-460a-9796-7b152143b191")
    private long comissionPct;

    @objid ("b0f172b8-22f1-4e5d-ab75-6ecf8ffdfa7d")
    private Employee manager;

    @objid ("b453d51e-d239-4490-9806-8e99103e8258")
    private Job job;

}
