public class JobHistory {
    private Job job;
    private Department department;
    private Employee employee;
    private dateTime startDate;
    private dateTime endDate;
}

public class Job {
    private List<Task> tasks = new ArrayList<>();
    private long jobId;
    private String jobTitle;
    private long minSalary;
    private long maxSalary;
}

public class Department {
    private Location location;
    private List<Employee> employees = new ArrayList<>();
    private long departmentId;
    private String departmentName;
}

public class Employee {
    private Employee manager;
    private Job job;
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private dateTime hireDate;
    private long salary;
    private long comissionPct;
}

public class Location {
    private Country country;
    private long locationId;
    private String streetAddress;
    private String postalCode;
    private String city;
    private String stateProvince;
}

public class Country {
    private Region region;
    private long countryId;
    private String countryName;
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