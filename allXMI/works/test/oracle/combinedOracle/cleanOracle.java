
public class Employee {
    public String Attribute;

    public List<Job> jobAssigne = new ArrayList<Job> ();

    public List<Job> jobAFaire = new ArrayList<Job> ();

}


public class Job {
    public String Attribute;

}


public class ManyFoo {
    public List<ManyFaa> faaOne = new ArrayList<ManyFaa> ();

    public List<ManyFaa> faaTwo = new ArrayList<ManyFaa> ();

}


public class ManyFaa {
}


public class OneFoo {
    public OneFaa firstFaa;

    public OneFaa faaSecond;

}


public class OneFaa {
}

