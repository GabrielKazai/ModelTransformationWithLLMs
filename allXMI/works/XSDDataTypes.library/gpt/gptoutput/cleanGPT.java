public class anyType {
}

public class anySimpleType {
}

public class anyURI {
}

public class base64Binary {
}public class boolean{}public class byte{}

public class date {
}

public class dateTime {
}

public class decimal {
}public class double{}

public class duration {
}

public class ENTITY {
}

public class ENTITIES {
}public class float{}

public class gDay {
}

public class gMonth {
}

public class gMonthDay {
}

public class gYear {
}

public class gYearMonth {
}

public class hexBinary {
}

public class ID {
}

public class IDREF {
}

public class IDREFS {
}public class int{}

public class integer {
}

public class language {
}public class long{}

public class Name {
}

public class NCName {
}

public class NMTOKEN {
}

public class NMTOKENS {
}

public class normalizedString {
}

public class NOTATION {
}

public class negativeInteger {
}

public class nonNegativeInteger {
}

public class nonPositiveInteger {
}

public class positiveInteger {
}

public class QName {
}public class short{}

public class string {
}

public class time {
}

public class token {
}

public class unsignedByte {
}

public class unsignedInt {
}

public class unsignedLong {
}

public class unsignedShort {
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

public enum ImageUsageHint {
    None, Icon, ShapeImage
}

public enum ConstraintEvaluationMode {
    batch, live
}

public enum ConstraintSeverity {
    error, warning, info
}

public class TimingDiagramOrder {
public String diagramId;
// TimingStates is a composite aggregation of TimingState. // Represented here
// as an attribute but actually indicates a one to many relationship.}public
// class TimingState { public String stateInvariant; public String
// occurrenceSpecification; // Represented as attributes but are actually part
// of a one to many relationship.}