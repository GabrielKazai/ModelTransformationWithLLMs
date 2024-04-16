
public class JobHistory {
    private dateTime startDate;

    private dateTime endDate;

    private Job job;

    private Department department;

    private Employee employee;

}

public class Job {
    private long jobId;

    private String jobTitle;

    private long minSalary;

    private long maxSalary;

    private List<Task> tasks = new ArrayList<Task>();

}

public class Department {
    private long departmentId;

    private String departmentName;

    private Location location;

    private List<Employee> employees = new ArrayList<Employee>();

}

public class Employee {
    private long employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private dateTime hireDate;

    private long salary;

    private long comissionPct;

    private Employee manager;

    private Job job;

}

public class Location {
    private long locationId;

    private String streetAddress;

    private String postalCode;

    private String city;

    private String stateProvince;

    private Country country;

}

public class Country {
    private long countryId;

    private String countryName;

    private Region region;

}

public class Region {
    private long regionId;

    private String regionName;

}

public abstract class Task {
    private long taskId;

    private String title;

    private String description;

}

public class BugFixing extends Task {
    private int numberOfBugs;

}

public class dateTime {
}
