import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9e6a5566-cbb9-4499-839d-6ca109922080")
public class JobHistory {
    @objid ("32798bf7-b458-40d3-83d7-1f3ccdcc3bfe")
    private dateTime startDate;

    @objid ("dbf5c7e4-78fb-4980-ab3c-c67e6d83835c")
    private dateTime endDate;

    @objid ("7ac1e062-2eee-4ad2-81fd-5435ea6a6e02")
    private Job job;

    @objid ("e0b3d571-1bc5-4177-973e-c7248406293c")
    private Department department;

    @objid ("406821f6-4c80-41ec-a630-214a3a133072")
    private Employee employee;

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("aff8b23e-6f58-434e-b24d-62e7bbfe6483")
public class Job {
    @objid ("bbaf5ebc-1e3e-413b-be22-351579bd90d4")
    private long jobId;

    @objid ("19f3bcef-e224-43bb-a35a-16155922674d")
    private String jobTitle;

    @objid ("99cd9ea8-5f00-4f9a-b3ea-614deb9e0740")
    private long minSalary;

    @objid ("a6a01c1b-ae2a-433c-a1a8-3ea38361e815")
    private long maxSalary;

    @objid ("922fc40b-d3a6-4041-a96e-9f7af7430e6c")
    private List<Task> tasks = new ArrayList<Task> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d9beadab-d802-4569-a188-2d57b8ef0c0b")
public class Department {
    @objid ("8e0cf127-0a97-43ff-88fa-82659f9041f6")
    private long departmentId;

    @objid ("17aec57e-6c4a-435c-9ace-4a85b3d449bb")
    private String departmentName;

    @objid ("681dcda1-114a-462e-a637-ad850e3ae9e0")
    private Location location;

    @objid ("aef7731c-1b7e-4d5c-b32e-30eb18580506")
    private List<Employee> employees = new ArrayList<Employee> ();

}

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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4b7eefdc-e2b8-4697-a763-83731a7bb3f6")
public class Location {
    @objid ("35235849-6de9-46c1-8d6e-0e6fa5a306e9")
    private long locationId;

    @objid ("f1cc99e8-4f85-40f7-8feb-4eff7cb4121b")
    private String streetAddress;

    @objid ("888829c4-afec-40cc-bb18-f308f6b5537b")
    private String postalCode;

    @objid ("525c4706-f32e-4bc7-968a-b8e482fb5045")
    private String city;

    @objid ("2ef20da4-a20e-49c7-a08b-f6985cd799e0")
    private String stateProvince;

    @objid ("abd174fc-7ae4-454c-bc5c-056d5df478be")
    private Country country;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2b265da3-91fb-4098-9e53-12a2a32edffa")
public class Country {
    @objid ("21d68c30-1c0c-4eba-9eaa-1aa709701491")
    private long countryId;

    @objid ("69e8d933-6630-4099-bceb-3803cff771df")
    private String countryName;

    @objid ("4228fad9-416e-44a9-9bad-aa7a950d7805")
    private Region region;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ee2660f9-04b0-4658-a5c5-69927946ec03")
public class Region {
    @objid ("281bcd7e-88a5-43b4-b4fe-cc634d621d73")
    private long regionId;

    @objid ("470c3032-83d0-4717-badb-61e368e7b954")
    private String regionName;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("14da0010-98d9-4b66-a3bf-591eb9a71dcd")
public abstract class Task {
    @objid ("3360f788-f8ae-49b8-8dc8-caacda3d3568")
    private long taskId;

    @objid ("98227901-5ffb-42e5-98c6-ef5d9e1916c3")
    private String title;

    @objid ("b0550192-e649-4661-953a-be54cd8639e2")
    private String description;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6559464a-4988-41cf-ad64-9d2b3fc16431")
public class BugFixing extends Task {
    @objid ("3f29e2c8-0b69-45eb-ad1f-c31970e5ec8f")
    private int numberOfBugs;

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("e51e0422-ea50-45b7-bf74-3d1353347470")
public class dateTime {
}

