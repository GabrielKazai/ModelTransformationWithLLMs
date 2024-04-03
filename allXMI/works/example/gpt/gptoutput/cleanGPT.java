public abstract class Student {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Professor {
    public String name;
    public String department;
}

public class Enrollment {
    public String id;
    public String date;
}

public enum DirectionKind {
    DirectionIn
}

public class InterStudent extends Student {
    public String studentId;
}