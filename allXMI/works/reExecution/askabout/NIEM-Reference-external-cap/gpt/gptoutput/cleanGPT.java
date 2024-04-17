public class NamespaceElementPropertyHolder {
    private Object value;
    private Alert alert;
    private Object valueName;
}

public class Alert {
    private Object identifier;
    private Object sender;
    private Object sent;
    private Status status;
    private MsgType msgType;
    private Object source;
    private Scope scope;
    private Object restriction;
    private Object addresses;
    private Object code;
    private Object note;
    private Object references;
    private Object incidents;
    private Info info;
}

public class Status {
}

public class MsgType {
}

public class Scope {
}

public class Info {
    private Object language;
    private Object category;
    private Object event;
    private ResponseType responseType;
    private Urgency urgency;
    private Severity severity;
    private Certainty certainty;
    private Object audience;
    private EventCode eventCode;
    private Object effective;
    private Object onset;
    private Object expires;
    private Object senderName;
    private Object headline;
    private Object description;
    private Object instruction;
    private Object web;
    private Object contact;
    private Parameter parameter;
    private Resource resource;
    private Area area;
}

public class ResponseType {
}

public class Urgency {
}

public class Severity {
}

public class Certainty {
}

public class EventCode {
    private Object valueName;
    private Object value;
}

public class Parameter {
    private Object valueName;
    private Object value;
}

public class Resource {
    private Object resourceDesc;
    private Object mimeType;
    private Object size;
    private Object uri;
    private Object derefUri;
    private Object digest;
}

public class Area {
    private Object areaDesc;
    private Object polygon;
    private Object circle;
    private Geocode geocode;
    private Object altitude;
    private Object ceiling;
}

public class Geocode {
    private Object valueName;
    private Object value;
}

public enum ContentKind {
    Unspecified, Empty, Simple, Mixed, ElementOnly
}

public enum FeatureKind {
    Unspecified, Simple, Attribute, Element, AttributeWildcard, ElementWildcard, Group
}

public enum VisibilityKind {
    Unspecified, None, ReadOnly, ReadWrite, ReadOnlyUnsettable, ReadWriteUnsettable
}