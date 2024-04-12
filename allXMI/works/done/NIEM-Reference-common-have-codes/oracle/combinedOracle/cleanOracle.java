
public enum AvailabilityStatusCodeSimpleType {
    Adequate,
    Insufficient;
}

public class NamespaceElementPropertyHolder {
}

public enum AvailabilityStatusCodeType extends {
    ;
}

public enum BedCategoryCodeSimpleType {
    MedicalSurgical,
    AdultICU,
    PediatricICU,
    Pediatrics,
    Psychiatric,
    Burn,
    OtherIsolation,
    OperatingRooms,
    NegativeFlowIsolation;
}

public enum BedCategoryCodeType extends {
    ;
}

public enum CapacityStatusCodeSimpleType {
    VacantAvailable,
    NotAvailable;
}

public enum CapacityStatusCodeType extends {
    ;
}

public enum ClinicalStatusCodeSimpleType {
    Level1,
    Full,
    Normal,
    Level2;
}

public enum ClinicalStatusCodeType extends {
    ;
}

public enum DeconCapacityCodeSimpleType {
    Full,
    Open,
    Exceeded,
    Inactive;
}

public enum DeconCapacityCodeType extends {
    ;
}

public enum EMSOffloadStatusCodeSimpleType {
    Delayed,
    Normal;
}

public enum EMSOffloadStatusCodeType extends {
    ;
}

public enum EMSTrafficStatusCodeSimpleType {
    NotApplicable,
    Closed,
    Normal,
    Advisory;
}

public enum EMSTrafficStatusCodeType extends {
    ;
}

public enum EOCPlanCodeSimpleType {
    Inactive,
    Active;
}

public enum EOCPlanCodeType extends {
    ;
}

public enum EOCStatusCodeSimpleType {
    Inactive,
    Active;
}

public enum EOCStatusCodeType extends {
    ;
}

public enum FacilityStatusCodeSimpleType {
    Compromised,
    Closed,
    Normal,
    Evacuating;
}

public enum FacilityStatusCodeType extends {
    ;
}

public enum MorgueCapacityCodeSimpleType {
    Full,
    Exceeded,
    Open;
}

public enum MorgueCapacityCodeType extends {
    ;
}

public enum SecurityStatusCodeSimpleType {
    Quarantine,
    RestrictedAccess,
    Elevated,
    Normal,
    Lockdown;
}

public enum SecurityStatusCodeType extends {
    ;
}

public enum ContentKind {
    Unspecified,
    Empty,
    Simple,
    Mixed,
    ElementOnly;
}

public enum FeatureKind {
    Unspecified,
    Simple,
    Attribute,
    Element,
    AttributeWildcard,
    ElementWildcard,
    Group;
}

public enum VisibilityKind {
    Unspecified,
    None,
    ReadOnly,
    ReadWrite,
    ReadOnlyUnsettable,
    ReadWriteUnsettable;
}
