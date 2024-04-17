public enum ContentKind {
    Unspecified, Empty, Simple, Mixed, ElementOnly
}

public enum FeatureKind {
    Unspecified, Simple, Attribute, Element, AttributeWildcard, ElementWildcard, Group
}

public enum VisibilityKind {
    Unspecified, None, ReadOnly, ReadWrite, ReadOnlyUnsettable, ReadWriteUnsettable
}

public enum statusValues {
    Actual, Exercise, System, Test
}

public enum typeValues {
    Report, Update, Cancel, Request, Response, Dispatch, Ack, Error, SensorConfiguration, SensorControl, SensorStatus,
    SensorDetection
}

public class NamespaceElementPropertyHolder {
    EDXLDistribution_._type EDXLDistribution;
}public class EDXLDistribution_._type {    String distributionID;    String senderID;    String dateTimeSent;    statusValues distributionStatus;    typeValues distributionType;    String combinedConfidentiality;    String language;    valueListType senderRole;    valueListType recipientRole;    valueListType keyword;    String distributionReference;    valueSchemeType explicitAddress;    targetAreaType targetArea;    contentObjectType contentObject;}public class valueListType {    String valueListUrn;    String value;}public class valueSchemeType {    String explicitAddressScheme;    String explicitAddressValue;}public class targetAreaType {    String circle;    String polygon;    String country;    String subdivision;    String locCodeUN;}public class contentObjectType {    choice_8 choice_8;    String any;    String contentDescription;    valueListType contentKeyword;    String incidentID;    String incidentDescription;    valueListType originatorRole;    valueListType consumerRole;    String confidentiality;}public class choice_8 {    nonXMLContentType nonXMLContent;    xmlContentType xmlContent;}public class nonXMLContentType {    String mimeType;    int size;    String digest;    String uri;    byte[] contentData;}public class xmlContentType {    anyXMLType keyXMLContent;    anyXMLType embeddedXMLContent;}public class anyXMLType {    String any;    String anyAttribute;}