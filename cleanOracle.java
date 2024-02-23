import java.util.ArrayList;
import java.util.List;

public class City {
    private List<Houses> unspecified = new ArrayList<Houses>();
}

public class Houses {
    private Family family;
}

public class Family {
    private Father Father;
    private Mother Mother;
    private Child[] Children;
}

public class Father {
}

public class Mother {
}

public class Child {
}