import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bf631a7a-119a-4109-b9c0-ee5b3fc70664")
public class JobHistory {
    @objid ("a4d99bd6-1689-4db6-9d5b-6062d4225575")
    private dateTime startDate;

    @objid ("22db7218-0e82-4360-a317-7d94621afcad")
    private dateTime endDate;

    @objid ("2fe9cbc4-ea84-4fb8-a74f-2593fe8a1ae1")
    private Job job;

    @objid ("f61375b6-8675-4cac-be39-d6bb50ace729")
    private Department department;

    @objid ("47f97062-625a-4e8d-8c5f-625d357ed7ca")
    private Employee employee;

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3b9c2786-de78-4a73-b2a3-3bd6e920ffa6")
public class Job {
    @objid ("30a010d6-3dec-41d4-b018-2427b2d92517")
    private long jobId;

    @objid ("78714e3b-accf-4c5e-bb00-39fc4c0f2544")
    private String jobTitle;

    @objid ("a16420c4-e147-4743-b54f-3c4a7a1362bc")
    private long minSalary;

    @objid ("9252a285-b6ba-41d2-8545-5771e8943897")
    private long maxSalary;

    @objid ("0dd26a7e-d46e-49c9-b11e-a09d2c1d53e3")
    private List<Task> tasks = new ArrayList<Task> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f4897ed1-98f7-4255-9e35-8c8c36b97aa4")
public class Department {
    @objid ("a208975c-73a9-45da-a125-44ecfe5809d0")
    private long departmentId;

    @objid ("a6f65ae0-b851-4025-878f-25b5621c88d2")
    private String departmentName;

    @objid ("c5f292ef-81df-4b88-a8dd-52e1649ed939")
    private Location location;

    @objid ("f20d68bc-524a-46dd-9146-62d98b965e6b")
    private List<Employee> employees = new ArrayList<Employee> ();

}

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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f44adff4-2de0-4950-8de8-86698e2d56e1")
public class Location {
    @objid ("d6b6c358-0308-4ee9-9a52-057e5d7aebee")
    private long locationId;

    @objid ("44421e6c-35fc-4468-bf73-385ed64e59b3")
    private String streetAddress;

    @objid ("5b4847c2-da52-4dc2-9990-c9de7a1b58b1")
    private String postalCode;

    @objid ("1f986525-5fc3-4cdf-a5c0-f7166414c29a")
    private String city;

    @objid ("53b64af5-1f14-4cb4-b507-750bac494612")
    private String stateProvince;

    @objid ("67df6889-774c-465f-a7f9-a73784d343ae")
    private Country country;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c5b77f98-20ec-4a08-8ce8-a3d2a91f72a7")
public class Country {
    @objid ("4487171d-557e-4669-a142-3d5154d44622")
    private long countryId;

    @objid ("213d4d52-b185-45b2-af69-dc4396aa3b08")
    private String countryName;

    @objid ("126e8109-44b4-4e95-9210-2c6aacb8ec29")
    private Region region;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6846949f-c637-4f3d-8ed2-e42ff2d21a2b")
public class Region {
    @objid ("98a14109-38cb-4a52-8399-dd12785a6f6d")
    private long regionId;

    @objid ("b9057c25-05b0-4269-b648-fbe792c364ad")
    private String regionName;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("13d78e22-fbe5-49b2-9056-f0ea6dae70d9")
public abstract class Task {
    @objid ("b255d185-f081-46f8-ba23-d7adeb02e5e7")
    private long taskId;

    @objid ("65695992-9f7c-4e84-8a00-1b7c336ab6f3")
    private String title;

    @objid ("bed45d55-11a1-4300-8348-2cbcfcda0705")
    private String description;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("de1dbf9b-0ee6-4ef1-988f-b986b3e38f03")
public class BugFixing extends Task {
    @objid ("fa92581a-6d04-4979-876d-25aae139cdb5")
    private int numberOfBugs;

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("7d479954-0094-4ba5-b927-db6fe23b8b54")
public class dateTime {
}

