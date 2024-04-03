public class Person {
    private String name;
    private int age;
}

public class Student extends Person {
    private String studentID;
}

public class Teacher extends Person {
    private String teacherID;
    private double salary;
}

public class Course {
    private String courseName;
    private Teacher teacher;
}

public class Enrollment {
    private Student student;
    private Course course;
    private double grade;
}