public enum ClassificationType {
    U, C, S, TS, R, CTS, CTS_B, CTS_BALK, NU, NR, NC, NS, NS_S, NS_A, CTSA, NSAT, NCA
}

public class ICISMMetadataType {
    ClassificationType classification;
    String ownerProducer;
    String SCIcontrols;
    String SARIdentifier;
    String disseminationControls;
    String FGIsourceOpen;
    String FGIsourceProtected;
    String releasableTo;
    String nonICmarkings;
    String classifiedBy;
    String classificationReason;
    String derivedFrom;
    String declassDate;
    String declassEvent;
    String declassException;
    String typeOfExemptedSource;
    String dateOfExemptedSource;
    String declassManualReview;
}

public class NamespaceElementPropertyHolder {
    ICISMMetadataType ICISMMetadata;
}

public class SecurityAttributesGroup {
    ClassificationType classification;
    String ownerProducer;
    String SCIcontrols;
    String SARIdentifier;
    String disseminationControls;
    String FGIsourceOpen;
    String FGIsourceProtected;
    String releasableTo;
    String nonICmarkings;
    String classifiedBy;
    String classificationReason;
    String derivedFrom;
    String declassDate;
    String declassEvent;
    String declassException;
    String typeOfExemptedSource;
    String dateOfExemptedSource;
    String declassManualReview;
}

public class SecurityAttributesOptionGroup {
    ClassificationType classification;
    String ownerProducer;
    String SCIcontrols;
    String SARIdentifier;
    String disseminationControls;
    String FGIsourceOpen;
    String FGIsourceProtected;
    String releasableTo;
    String nonICmarkings;
    String classifiedBy;
    String classificationReason;
    String derivedFrom;
    String declassDate;
    String declassEvent;
    String declassException;
    String typeOfExemptedSource;
    String dateOfExemptedSource;
    String declassManualReview;
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