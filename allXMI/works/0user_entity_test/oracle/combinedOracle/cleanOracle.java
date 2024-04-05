
public class User {
    public String name;

    public Account account;

}

public class Account {
    public int argent;

}

public class Bank {
    public String name;

    public List<User> user = new ArrayList<User>();

}
