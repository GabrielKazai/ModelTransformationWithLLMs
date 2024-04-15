import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4930565f-38e5-443b-85fa-1929820f980d")
public class JobHistory {
    @objid ("16321522-97a8-4925-9668-906589991b4c")
    private dateTime startDate;

    @objid ("acb7039e-d9da-4520-a3c5-8fba23fd11f8")
    private dateTime endDate;

    @objid ("b59b70a7-e3db-4830-bae6-6d7304fa2dcc")
    private Job job;

    @objid ("1f889e06-ffa3-4e32-94eb-1422aae352bb")
    private Department department;

    @objid ("5546e689-eda8-4cbb-80ff-84e30c9cba89")
    private Employee employee;

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b2d2b07d-f798-40a1-84d0-5354f8bc2032")
public class Job {
    @objid ("6751a1ab-a096-4bba-97a0-d87f88d55356")
    private long jobId;

    @objid ("7a1fea21-a220-4cb0-a66e-9a71bc1b80a0")
    private String jobTitle;

    @objid ("6d77b37c-81a1-4514-98a9-f07f7172aa8a")
    private long minSalary;

    @objid ("8bcb6433-8ded-4a8f-b084-4ac6b3e55964")
    private long maxSalary;

    @objid ("ccc462b8-b388-4c2e-a81f-0853fddfb92d")
    private List<Task> tasks = new ArrayList<Task> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b09bfb5b-9e23-4e4f-8ee7-953fd7184e08")
public class Department {
    @objid ("e19aa21a-ddc7-4a3c-bd3e-8783c49f8ef8")
    private long departmentId;

    @objid ("3a4c2e1f-65c6-479f-a954-144c1abc36c2")
    private String departmentName;

    @objid ("5e0fa046-7eba-45fe-8a3a-49d5e6809dce")
    private Location location;

    @objid ("f0dbe61b-a77f-4c91-a5b8-fe78130e9583")
    private List<Employee> employees = new ArrayList<Employee> ();

}

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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("088007f1-1d62-459c-857b-af295d7e1517")
public class Location {
    @objid ("417484a4-b1ea-4766-b18c-ef1c578460c6")
    private long locationId;

    @objid ("cc8a6208-a6db-4390-8526-cac78620edb8")
    private String streetAddress;

    @objid ("f81ce09e-e041-40bd-b9b5-a6d51cb71a9f")
    private String postalCode;

    @objid ("ca35b1a0-134e-45bd-b2b5-a9dbbfc66ed3")
    private String city;

    @objid ("42da85c9-e429-458d-9de1-6dfc7d74bf18")
    private String stateProvince;

    @objid ("142300fb-b619-4df2-812a-7807eb37d989")
    private Country country;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8328cb97-ba13-42fd-870b-147ae898edad")
public class Country {
    @objid ("207c96f8-9dc1-45fb-afdf-922a2d2d222d")
    private long countryId;

    @objid ("e5d9275f-ddb8-4106-9081-2ebeb3eaede2")
    private String countryName;

    @objid ("540e8279-fc4d-48ae-a17d-17d86903e6ee")
    private Region region;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ed440e04-833e-416d-88a5-4316389cedd1")
public class Region {
    @objid ("20d9dd0b-9fba-41ce-adfc-98d41729dd1f")
    private long regionId;

    @objid ("57e61bb6-c4a7-423d-bff9-2f8977546a26")
    private String regionName;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8bf4da9c-95fa-4630-976e-cf01e20f9575")
public class BugFixing extends Task {
    @objid ("8016921c-f9a2-4f67-9915-c1f598b9048d")
    private int numberOfBugs;

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("9516e569-b111-4e2c-ae8a-ac388a8c98b2")
public class dateTime {
}

