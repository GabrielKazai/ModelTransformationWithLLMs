public class JobHistory {
    private Job job;
    private Department department;
    private Employee employee;
    private DateTime startDate;
    private DateTime endDate;
}

public class Job {
    private Task[] tasks;
    private long jobId;
    private String jobTitle;
    private long minSalary;
    private long maxSalary;
}

public class Department {
    private Location location;
    private Employee[] employees;
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
    private DateTime hireDate;
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

public class DateTime {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
}