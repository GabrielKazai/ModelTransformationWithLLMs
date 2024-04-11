import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2982050d-a99f-406f-ba2f-046601c5a356")
public class Activity {
    @objid ("dc205334-ab17-478b-8596-36d9ef4bdb6f")
    public ActivitySector acivitySector;

    @objid ("be9bf1f3-2df0-4187-91d4-f74351cec0be")
    public Organigram organigram;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8e95290a-b585-4683-9d4c-8b8a79d3ceb1")
public class ActivitySector {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7c0fa578-c53d-470f-a92b-7fc230ad095c")
public class Answer {
    @objid ("5cfaff53-5668-4577-95de-b3a5fbf80aa7")
    public Question questionItem;

    @objid ("00b18a4b-75f5-4b8a-bb93-69ebe39cf8ad")
    public Surveyance surveyance;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("58b1778f-b55e-45df-89de-c3aa4aa54c5b")
public class Contact {
    @objid ("88f49654-17e4-4abd-b972-5219bca04636")
    public User user;

    @objid ("484945ee-5d2b-489f-941e-bf621b1e4646")
    public ContactNature contactNature;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b8e0fc68-fff9-4c22-a3a7-8444f1270b1f")
public class ContactNature {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("20519351-4d7b-4cbb-ae67-fb443086768d")
public class Event {
    @objid ("6eb7b76e-eafe-4765-bc73-4d6d696b0fa9")
    public EventNature eventNature;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4a03d2e9-09c7-41f3-8f66-2fe5f7a8a285")
public class EventNature {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d5eb18d2-4b90-40f0-a372-6c6e1824c217")
public class Group {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("12d35af0-2276-466f-9feb-3ffe95c7be67")
public class GroupIntervention {
    @objid ("1cf8a2ab-9672-4693-8693-2ea749a966da")
    public Event event;

    @objid ("b74af312-3fba-4fb2-a4e7-b2dbff8d1d55")
    public Group group;

    @objid ("d8566d1c-fe14-4b8b-8f5d-2a5d4085387e")
    public InterventionNature groupInterventionNature;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1f9bf180-f2ba-4621-b793-cde23b54f5d7")
public class GroupLink {
    @objid ("b2b8a15b-f0a5-4be9-974f-c48ee10ce34b")
    public Group group;

    @objid ("3ae844b0-5bc2-4c62-9232-6e8dc426c763")
    public Group group1;

    @objid ("97824415-8f46-4641-8da7-753859d3430d")
    public GroupLinkNature groupLinkNature;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("137dbf87-4e60-4bcf-bf94-dc548ed1f5b4")
public class GroupLinkNature {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bf064fdf-a17b-42c5-8722-794da047d40b")
public class Honour {
    @objid ("1b5eaeb5-0cd7-4fe5-ae76-ef2510f09304")
    public HonourOrder honourNature;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("17a0ca8c-6950-4385-a08c-880bac6328e7")
public class HonourOrder {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9c78e216-ce76-45d3-87ec-5b4e6022015e")
public class IncomingPayment {
    @objid ("92d4ed33-a0d3-4cf4-b625-439cc51c2b79")
    public User user;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c53fef05-ebf5-42a5-9d13-916462e5ff87")
public class Sale {
    @objid ("cf25e42d-ecdd-4337-91ba-fdbe9dddcbee")
    public Group group;

    @objid ("130bfabe-b53f-41a2-bec7-6e68872e0f71")
    public User client;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4bee7eff-e2b7-4c22-a9ea-2a6baa35b35e")
public class InterventionNature {
    @objid ("f7243b0e-215d-4f42-bdd4-5e0e76f86f2e")
    public EventNature eventNature;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("49c6453c-aad5-4d80-970e-5947f60ebdcc")
public class Invitation {
    @objid ("fc98741a-cb9c-4ab3-bbe8-dc437184e294")
    public Event event;

    @objid ("a7020f49-babe-4b04-a478-b2dc6c6a1a42")
    public User introducer;

    @objid ("d68a624c-39cd-4a44-ae42-3f5153a87058")
    public User guest;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2d23737d-d641-4d0e-9c98-407cbf5d5522")
public class Label {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0fbbf14d-4a59-4c53-963b-14b72ce2f1d4")
public class Mandate {
    @objid ("f3833d2d-ae28-4d1d-a950-7576b0b92417")
    public Group group;

    @objid ("59788845-22a8-4299-9c26-9df531b393d6")
    public MandateNature mandateNature;

    @objid ("e1105aae-1bda-486b-a09d-4f2cf8159b9c")
    public User user;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e115c255-9b48-485a-b13f-4bec8f63d5ba")
public class MandateNature {
    @objid ("88a55a38-7f7a-4e19-afd0-064395229680")
    public Label tag;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1ed33430-7add-450e-b071-e230f6e2bca1")
public class Organigram {
    @objid ("05c682f9-0ba3-49dc-8b79-d6672fca1b3a")
    public Activity ;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a5b95dc1-5fa1-4a46-a2aa-4100c9997958")
public class Product {
    @objid ("00713c56-0e93-43f0-a29c-e48772667ec3")
    public Event event;

    @objid ("1ab23f0b-1d81-4e0a-a151-438e61f89017")
    public Group group;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("442f0612-1f2d-4ba8-b7ae-c1e26c505b80")
public class Profession {
    @objid ("0d85236c-ef71-4d9d-805e-3b703bbf2e94")
    public Organigram organigram;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6f035eb5-3981-4f33-ad82-d4590db4fdb3")
public class Question {
    @objid ("cc8c080c-88d8-445a-aeb4-e08649c9cb29")
    public Survey question;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3a55f4d8-3d41-43a4-aaf3-495b5ae64a5c")
public class Remittance {
    @objid ("f01ac78a-988b-41c1-9c6d-e7389ea725b6")
    public Honour honour;

    @objid ("b506005c-f5b5-42ab-bc27-f62a8793a4a6")
    public User user;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("313c5541-c8ff-433b-9a46-793c51c99abe")
public class Right {
    @objid ("021e53f6-0803-40f5-955e-d86ba841b142")
    public MandateNature mandateNature;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("54813cf7-e792-471e-8a17-728ebfc99d6f")
public class Rubric {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("833fe751-4563-48c8-a437-41e5c63f0a39")
public class SaleLine {
    @objid ("210b6d85-711d-49c3-b220-d64d22307f4f")
    public Product product;

    @objid ("fe643e4b-8ca9-401f-8f8d-a4a7ab62bf02")
    public Sale sale;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("508be331-e6df-42aa-a79a-315b52d82957")
public class Survey {
    @objid ("b9de3616-9fdc-4ceb-927e-980a14a84ab7")
    public User ;

    @objid ("6ba4f2f1-7f68-4728-ba40-ce3c19161aea")
    public User author;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("089f5fb6-b229-432f-a2da-8a6968412e80")
public class Surveyance {
    @objid ("3fe93f60-d63f-4d32-9210-74e340f58a09")
    public Survey survey;

    @objid ("897c3e83-077f-467e-947c-b5ce2d11c921")
    public User user;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("242aab33-75f5-4dd3-8eb0-f45fd3d512ed")
public class Tag {
    @objid ("19d9d293-ac2b-4035-a03b-031c78bcc5fd")
    public Group group;

    @objid ("53379802-9d5b-4bd3-97c2-875ce9bc2d8f")
    public Label label;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2baf98fe-aa98-467d-b472-0443f92812eb")
public class User {
    @objid ("d24eb11d-3967-4e41-8f34-a2898efe2729")
    public Activity activity;

    @objid ("6179f1f2-2617-422e-97f0-f77861d8c249")
    public Profession profession;

    @objid ("e4a8326c-f853-4c7d-aeb2-6d7e0f785185")
    public Survey question;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("43a638d6-f288-417b-93d5-69ee24b9a6aa")
public class UserIntervention {
    @objid ("750fe7b4-54c6-48b3-8ed1-d8755dfffa40")
    public Event event;

    @objid ("ac53b443-72eb-4e9c-871b-d95e2bbd12c0")
    public GroupIntervention groupIntervention;

    @objid ("539ec365-9923-450a-853c-a7f87fca6586")
    public InterventionNature userInterventionNature;

    @objid ("f13a3531-dfd0-40bf-a968-30383efefd28")
    public User user;

}

