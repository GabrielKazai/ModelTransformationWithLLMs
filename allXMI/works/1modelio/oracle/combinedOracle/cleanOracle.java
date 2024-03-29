
public class JobHistory {
    private zonedDateTime startDate;

    private zonedDateTime endDate;

    private Job job;

    private Department department;

    private Employee employee;

}

public class Job {
    private long jobId;

    private String jobTitle;

    private long minSalary;

    private long maxSalary;

    private List<Task> task = new ArrayList<Task>();

}

public class Department {
    private long departmentId;

    private String departmentName;

    private Location location;

    public List<Employee> employee = new ArrayList<Employee>();

}

public class Employee {
    private long employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private zonedDateTime hireDate;

    private long salary;

    private long commissionPct;

    private List<Job> job = new ArrayList<Job>();

    public Employee manager;

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

public class zonedDateTime {
}
