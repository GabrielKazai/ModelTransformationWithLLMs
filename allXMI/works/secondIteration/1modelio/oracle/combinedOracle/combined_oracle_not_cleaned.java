import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d8c26a3d-ae7d-4272-af2e-0defaa192532")
public class JobHistory {
    @objid ("f39acf8c-a389-4db8-bf9f-d1a9bc5dcb15")
    private zonedDateTime startDate;

    @objid ("25789c4e-c39a-409b-867d-26fd23bc7149")
    private zonedDateTime endDate;

    @objid ("de4f3396-7bc9-4d36-a037-a0965a025066")
    private Job job;

    @objid ("c0974671-85f0-4c33-900e-35cb1794d852")
    private Department department;

    @objid ("4837d576-e176-4d3b-b35f-518f5100d726")
    private Employee employee;

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c4536eaf-0c2d-4ff8-9daa-5ba28bfab191")
public class Job {
    @objid ("d2bc1b35-a7a5-4da9-adb8-bdf43ef10623")
    private long jobId;

    @objid ("6aedeeb0-da02-4d85-9ff2-b15dd771fc42")
    private String jobTitle;

    @objid ("823e723d-9dee-49fe-b403-c1419f83d728")
    private long minSalary;

    @objid ("faa54788-335d-4df7-a6cb-bdef602fef6e")
    private long maxSalary;

    @objid ("c57f171b-2a25-469a-8d75-703cbfed6176")
    private List<Task> task = new ArrayList<Task> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c1acdc20-90ac-4e39-b322-cc8be275169b")
public class Department {
    @objid ("81f988fc-c43d-4c9e-b6f8-9351ca16c80c")
    private long departmentId;

    @objid ("4373f32e-007a-44ad-9a91-d99b612b1662")
    private String departmentName;

    @objid ("6d584173-8deb-49fd-ab36-712dbfbb87a8")
    private Location location;

    @objid ("73b1f6a9-4a53-463e-b1a9-12b07f656d03")
    public List<Employee> employee = new ArrayList<Employee> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("763c70c8-f76b-49a6-8bc7-38ecfe6406b6")
public class Employee {
    @objid ("0a0d1496-f6ff-4522-8b6c-632d3e57eca3")
    private long employeeId;

    @objid ("f9e0675d-717e-454c-a7f2-fa80dacb3809")
    private String firstName;

    @objid ("54c09f1c-fcee-41a5-a174-d0059ed15d8e")
    private String lastName;

    @objid ("4c1997be-2699-445e-9490-0f78f563e07c")
    private String email;

    @objid ("47e415b7-7e73-4efc-bebf-b86e3a84a752")
    private String phoneNumber;

    @objid ("fcc11e6b-a60c-4f9f-8efa-7ef80e47f174")
    private zonedDateTime hireDate;

    @objid ("4e7809e7-28fc-40b7-b0e9-2f59cb7fa290")
    private long salary;

    @objid ("430a2232-5afc-4153-b363-71d58284329c")
    private long commissionPct;

    @objid ("2a66d1e4-682a-4832-8084-01eedd1b0655")
    private List<Job> job = new ArrayList<Job> ();

    @objid ("8f143b16-50f9-4b46-a476-3c150159315d")
    public Employee manager;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1371580f-5f3c-4bd5-bbe9-2dd7171acdc8")
public class Location {
    @objid ("921a5696-2ee5-49ca-8bb3-ad94993debbd")
    private long locationId;

    @objid ("b0e83cfa-10f0-4b0b-af3f-255ecebf0914")
    private String streetAddress;

    @objid ("b0e819cc-ee95-49e0-ac38-949198329f37")
    private String postalCode;

    @objid ("659ac2f3-d57e-4f6c-8bdd-d6bef66d3900")
    private String city;

    @objid ("1e4cda49-0499-4245-a43e-7b53d6431b5c")
    private String stateProvince;

    @objid ("3042a802-c7ba-4693-a16e-3ae2955e3c88")
    private Country country;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f60bda7e-84e9-4d77-b8ae-8245957eccaa")
public class Country {
    @objid ("e77ded7b-ce8b-4b81-9eb7-169b38ba49fe")
    private long countryId;

    @objid ("4a61ef16-43af-448f-8fd8-5f9a5a7d5d66")
    private String countryName;

    @objid ("516428ad-8e7e-4eed-8252-ac71714154c0")
    private Region region;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("624df968-cc42-4563-b87b-b44e5a5e255b")
public class Region {
    @objid ("0f5499de-bdb8-43ea-8d7f-80fa58c1044b")
    private long regionId;

    @objid ("726f86d3-eac0-4a61-b69e-07ee2d6e8f87")
    private String regionName;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b4785b34-bfcd-4617-b060-5ca2b31e2e72")
public abstract class Task {
    @objid ("e0fdd933-07ca-4d2b-9ec9-5db7a64a910b")
    private long taskId;

    @objid ("07dcee98-eb32-4ff0-9d3c-2eb5146ebb16")
    private String title;

    @objid ("97e0d573-0199-4de2-9440-e4c8e13fe10c")
    private String description;

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("a66269be-93b6-474d-b52f-fd869796acc4")
public class zonedDateTime {
}

