public enum statusValues {
    Actual, Exercise, System, Test
}

public enum typeValues {
    Report, Update, Cancel, Request, Response, Dispatch, Ack, Error, SensorConfiguration, SensorControl, SensorStatus,
    SensorDetection
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

public class NamespaceElementPropertyHolder {
    private EDXLDistribution_._type EDXLDistribution;
}

public class EDXLDistribution_._type
{
    private String distributionID;
    private String senderID;
    private String dateTimeSent;
    private statusValues distributionStatus;
    private typeValues distributionType;
    private String combinedConfidentiality;
    private String language;
    private valueListType senderRole;
    private valueListType recipientRole;
    private valueListType keyword;
    private String distributionReference;
    private valueSchemeType explicitAddress;
    private targetAreaType targetArea;
    private contentObjectType contentObject;
}

public class valueListType {
    private String valueListUrn;
    private String[] value;
}

public class valueSchemeType {
    private String explicitAddressScheme;
    private String[] explicitAddressValue;
}

public class targetAreaType {
    private String[] circle;
    private String[] polygon;
    private String[] country;
    private String[] subdivision;
    private String[] locCodeUN;
}

public class contentObjectType {
    private choice_8 choice_8;
    private String any;
    private String contentDescription;
    private valueListType contentKeyword;
    private String incidentID;
    private String incidentDescription;
    private valueListType originatorRole;
    private valueListType consumerRole;
    private String confidentiality;
}

public class choice_8 {
    private nonXMLContentType nonXMLContent;
    private xmlContentType xmlContent;
}

public class nonXMLContentType {
    private String mimeType;
    private String size;
    private String digest;
    private String uri;
    private byte[] contentData;
}

public class xmlContentType {
    private anyXMLType[] keyXMLContent;
    private anyXMLType[] embeddedXMLContent;
}

public class anyXMLType {
    public String any;
    public String anyAttribute;
}