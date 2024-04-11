public abstract class Student {
    public String name;
    public int age;
}

public class Professor {
    public String name;
    public String department;
}

public class Enrollment {
    public int id;
    public String date;
}

public enum DirectionKind {
    DirectionIn
}

public class InterStudent extends Student {
    public String studentId;
}