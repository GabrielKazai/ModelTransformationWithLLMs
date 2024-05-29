
public class Activity {
    public ActivitySector acivitySector;

    public Organigram organigram;

}

public class ActivitySector {
}

public class Answer {
    public Question questionItem;

    public Surveyance surveyance;

}

public class Contact {
    public User user;

    public ContactNature contactNature;

}

public class ContactNature {
}

public class Event {
    public EventNature eventNature;

}

public class EventNature {
}

public class Group {
}

public class GroupIntervention {
    public Event event;

    public Group group;

    public InterventionNature groupInterventionNature;

}

public class GroupLink {
    public Group group;

    public Group group1;

    public GroupLinkNature groupLinkNature;

}

public class GroupLinkNature {
}

public class Honour {
    public HonourOrder honourNature;

}

public class HonourOrder {
}

public class IncomingPayment {
    public User user;

}

public class Sale {
    public Group group;

    public User client;

}

public class InterventionNature {
    public EventNature eventNature;

}

public class Invitation {
    public Event event;

    public User introducer;

    public User guest;

}

public class Label {
}

public class Mandate {
    public Group group;

    public MandateNature mandateNature;

    public User user;

}

public class MandateNature {
    public Label tag;

}

public class Organigram {
    public Activity ;

}

public class Product {
    public Event event;

    public Group group;

}

public class Profession {
    public Organigram organigram;

}

public class Question {
    public Survey question;

}

public class Remittance {
    public Honour honour;

    public User user;

}

public class Right {
    public MandateNature mandateNature;

}

public class Rubric {
}

public class SaleLine {
    public Product product;

    public Sale sale;

}

public class Survey {
    public User ;

    public User author;

}

public class Surveyance {
    public Survey survey;

    public User user;

}

public class Tag {
    public Group group;

    public Label label;

}

public class User {
    public Activity activity;

    public Profession profession;

    public Survey question;

}

public class UserIntervention {
    public Event event;

    public GroupIntervention groupIntervention;

    public InterventionNature userInterventionNature;

    public User user;

}
