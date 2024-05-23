public enum AvailabilityStatusCodeSimpleType {
    Adequate, Insufficient
}

public class AvailabilityStatusCodeType extends AvailabilityStatusCodeSimpleType {
}

public enum BedCategoryCodeSimpleType {
    MedicalSurgical, AdultICU, PediatricICU, Pediatrics, Psychiatric, Burn, OtherIsolation, OperatingRooms,
    NegativeFlowIsolation
}

public class BedCategoryCodeType extends BedCategoryCodeSimpleType {
}

public enum CapacityStatusCodeSimpleType {
    VacantAvailable, NotAvailable
}

public class CapacityStatusCodeType extends CapacityStatusCodeSimpleType {
}

public enum ClinicalStatusCodeSimpleType {
    Level1, Full, Normal, Level2
}

public class ClinicalStatusCodeType extends ClinicalStatusCodeSimpleType {
}

public enum DeconCapacityCodeSimpleType {
    Full, Open, Exceeded, Inactive
}

public class DeconCapacityCodeType extends DeconCapacityCodeSimpleType {
}

public enum EMSOffloadStatusCodeSimpleType {
    Delayed, Normal
}

public class EMSOffloadStatusCodeType extends EMSOffloadStatusCodeSimpleType {
}

public enum EMSTrafficStatusCodeSimpleType {
    NotApplicable, Closed, Normal, Advisory
}

public class EMSTrafficStatusCodeType extends EMSTrafficStatusCodeSimpleType {
}

public enum EOCPlanCodeSimpleType {
    Inactive, Active
}

public class EOCPlanCodeType extends EOCPlanCodeSimpleType {
}

public enum EOCStatusCodeSimpleType {
    Inactive, Active
}

public class EOCStatusCodeType extends EOCStatusCodeSimpleType {
}

public enum FacilityStatusCodeSimpleType {
    Compromised, Closed, Normal, Evacuating
}

public class FacilityStatusCodeType extends FacilityStatusCodeSimpleType {
}

public enum MorgueCapacityCodeSimpleType {
    Full, Exceeded, Open
}

public class MorgueCapacityCodeType extends MorgueCapacityCodeSimpleType {
}

public enum SecurityStatusCodeSimpleType {
    Quarantine, RestrictedAccess, Elevated, Normal, Lockdown
}

public class SecurityStatusCodeType extends SecurityStatusCodeSimpleType {
}