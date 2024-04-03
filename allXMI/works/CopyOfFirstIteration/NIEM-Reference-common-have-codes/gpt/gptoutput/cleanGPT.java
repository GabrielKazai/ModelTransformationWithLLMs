public enum AvailabilityStatusCodeSimpleType {
    Adequate, Insufficient
}

public enum AvailabilityStatusCodeType {
    Adequate, Insufficient
}

public enum BedCategoryCodeSimpleType {
    MedicalSurgical, AdultICU, PediatricICU, Pediatrics, Psychiatric, Burn, OtherIsolation, OperatingRooms,
    NegativeFlowIsolation
}

public enum BedCategoryCodeType {
    MedicalSurgical, AdultICU, PediatricICU, Pediatrics, Psychiatric, Burn, OtherIsolation, OperatingRooms,
    NegativeFlowIsolation
}

public enum CapacityStatusCodeSimpleType {
    VacantAvailable, NotAvailable
}

public enum CapacityStatusCodeType {
    VacantAvailable, NotAvailable
}

public enum ClinicalStatusCodeSimpleType {
    Level1, Full, Normal, Level2
}

public enum ClinicalStatusCodeType {
    Level1, Full, Normal, Level2
}

public enum DeconCapacityCodeSimpleType {
    Full, Open, Exceeded, Inactive
}

public enum DeconCapacityCodeType {
    Full, Open, Exceeded, Inactive
}

public enum EMSOffloadStatusCodeSimpleType {
    Delayed, Normal
}

public enum EMSOffloadStatusCodeType {
    Delayed, Normal
}

public enum EMSTrafficStatusCodeSimpleType {
    NotApplicable, Closed, Normal, Advisory
}

public enum EMSTrafficStatusCodeType {
    NotApplicable, Closed, Normal, Advisory
}

public enum EOCPlanCodeSimpleType {
    Inactive, Active
}

public enum EOCPlanCodeType {
    Inactive, Active
}

public enum EOCStatusCodeSimpleType {
    Inactive, Active
}

public enum EOCStatusCodeType {
    Inactive, Active
}

public enum FacilityStatusCodeSimpleType {
    Compromised, Closed, Normal, Evacuating
}

public enum FacilityStatusCodeType {
    Compromised, Closed, Normal, Evacuating
}

public enum MorgueCapacityCodeSimpleType {
    Full, Exceeded, Open
}

public enum MorgueCapacityCodeType {
    Full, Exceeded, Open
}

public enum SecurityStatusCodeSimpleType {
    Quarantine, RestrictedAccess, Elevated, Normal, Lockdown
}

public enum SecurityStatusCodeType {
    Quarantine, RestrictedAccess, Elevated, Normal, Lockdown
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
}