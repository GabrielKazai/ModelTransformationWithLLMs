import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a9614742-30e7-4a76-9514-811135f2de77")
public class JobHistory {
    @objid ("a266e789-559f-4879-968a-1acf475efe78")
    private dateTime startDate;

    @objid ("0cd3c2e3-862a-47a2-bf1e-967c6f51c53d")
    private dateTime endDate;

    @objid ("cf66e50d-95f3-41b3-81b1-e64c9a600738")
    private Job job;

    @objid ("8e232168-9129-4bc3-aa9f-999baeae6451")
    private Department department;

    @objid ("bb4ca6c4-fe20-48dd-b747-09b9d5054402")
    private Employee employee;

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4c4e536b-8146-48b9-bf8c-63050ff8abfa")
public class Job {
    @objid ("08ea6d4c-2778-4670-8b30-949773d720c2")
    private long jobId;

    @objid ("1cf07534-24c5-4781-972f-c60bc4f14df2")
    private String jobTitle;

    @objid ("bc680fc9-baf2-4cc7-af4f-da9af77afeed")
    private long minSalary;

    @objid ("709e728a-150c-4ea0-bc35-c226f467f07f")
    private long maxSalary;

    @objid ("433c3545-2465-48ad-92f8-47526aa5602e")
    private List<Task> tasks = new ArrayList<Task> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8391d938-4771-4746-a9cb-07db82bd1761")
public class Department {
    @objid ("e5fc4b12-5949-4595-a9bd-a89a603e2b86")
    private long departmentId;

    @objid ("c296e4ac-6fec-4f0e-9a6e-c68b6d08d868")
    private String departmentName;

    @objid ("3e638615-4d1e-46ee-ba71-093b0573c127")
    private Location location;

    @objid ("8702c40f-a888-4c66-a69b-eda0461c957a")
    private List<Employee> employees = new ArrayList<Employee> ();

}

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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8538b671-8eed-407e-8c14-6133accced31")
public class Location {
    @objid ("cd6c44cf-7b9f-4712-bcd2-abe038b02a86")
    private long locationId;

    @objid ("546bb6da-be0b-478f-9aaf-365805bd041e")
    private String streetAddress;

    @objid ("6a3982fc-8c07-426f-bd63-f848436c08c0")
    private String postalCode;

    @objid ("e12e21b3-80f3-4d5e-99cd-f70954a36c30")
    private String city;

    @objid ("b424548c-4546-4620-a2f4-7eb28cb324ec")
    private String stateProvince;

    @objid ("1b40b4a5-2bcd-4ec5-b18e-86bce2079b48")
    private Country country;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("81df3971-500b-4f2c-92a1-637d377ec17a")
public class Country {
    @objid ("556fd06a-975e-4b7e-8920-9b1431ce529f")
    private long countryId;

    @objid ("ee8c942f-6da7-4e33-a771-d78598a3741b")
    private String countryName;

    @objid ("93ce31d6-21be-4d52-b269-9d670528ce6b")
    private Region region;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("46636a18-358e-4e02-9e40-7308bfc234a7")
public class Region {
    @objid ("dd5aabd7-7fb3-4662-9bb2-893d193e4358")
    private long regionId;

    @objid ("309d3703-8641-4d2c-a44d-d41ec77fe096")
    private String regionName;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("14a21be2-ea49-40f1-97cf-70c2b0a34e78")
public abstract class Task {
    @objid ("d8040a46-d2b5-4b39-85df-3499bdaece31")
    private long taskId;

    @objid ("47b118c0-8dbb-4c40-966c-bba587233cc4")
    private String title;

    @objid ("db519b8a-060b-4c22-a82a-6f184c8bf9c6")
    private String description;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("82f93a3c-635c-4df1-a4f7-db6da5eb5179")
public class BugFixing extends Task {
    @objid ("b1225fbe-f012-49ce-8e22-44a6a25bf8f5")
    private int numberOfBugs;

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("6a2da9f4-916f-495d-bb1f-1d59f2e0d389")
public class dateTime {
}

