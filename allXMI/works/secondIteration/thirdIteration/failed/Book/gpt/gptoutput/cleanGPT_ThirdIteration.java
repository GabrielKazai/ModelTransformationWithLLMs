public class Activity {
    private final ActivitySector acivitySector;
    private final Organigram organigram;
}

public class ActivitySector {
}

public class Answer {
    private final Question questionItem;
    private final Surveyance surveyance;
}public class Article {    private final Group group;    private final User author;    private final Rubric class;}

public class Contact {
    private final User user;
    private final ContactNature contactNature;
}

public class ContactNature {
}

public class Event {
    private final EventNature eventNature;
}

public class EventNature {
}

public class Group {
}

public class GroupIntervention {
    private final Event event;
    private final Group group;
    private final InterventionNature groupInterventionNature;
}

public class GroupLink {
    private final Group group;
    private final Group group1;
    private final GroupLinkNature groupLinkNature;
}

public class GroupLinkNature {
}

public class Honour {
    private final HonourOrder honourNature;
}

public class HonourOrder {
}

public class IncomingPayment {
    private final User user;
}

public class InterventionNature {
    private final EventNature eventNature;
}

public class Invitation {
    private final Event event;
    private final User introducer;
    private final User guest;
}

public class Label {
}

public class Mandate {
    private final Group group;
    private final MandateNature mandateNature;
    private final User user;
}

public class MandateNature {
    private final Label tag;
}

public class Organigram {
    private final Activity activity;
}

public class Product {
    private final Event event;
    private final Group group;
}

public class Profession {
    private final Organigram organigram;
}

public class Question {
    private final Survey survey;
}

public class Remittance {
    private final Honour honour;
    private final User user;
}

public class Right {
    private final MandateNature mandateNature;
}

public class Rubric {
}

public class Sale {
    private final Group group;
    private final User client;
}

public class SaleLine {
    private final Product product;
    private final Sale sale;
}

public class Survey {
    private final User author;
}

public class Surveyance {
    private final Survey survey;
    private final User user;
}

public class Tag {
    private final Group group;
    private final Label label;
}

public class User {
    private final Activity activity;
    private final Profession profession;
    private final Question question;
}

public class UserIntervention {
    private final Event event;
    private final GroupIntervention groupIntervention;
    private final InterventionNature userInterventionNature;
    private final User user;
}