public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private int identifier;
    private String state;
    private String zipcode;
}

public class Organization {
    public int identifier;
    public String name;
    public String postalAddress;
    public String statusCode;
    public String telecomAddress;
}

public class Patient extends Person {
    private Organization hospital;
}

public class Person {
    public Organization worksFor;
    public java.util.Date birthDate;
    public int identifier;
    public String name;
    public String postalAddress;
    public String raceCode;
    public String sexCode;
    public String statusCode;
    public String telecomAddress;

    public String getNickName() {
        return "";
    }
}