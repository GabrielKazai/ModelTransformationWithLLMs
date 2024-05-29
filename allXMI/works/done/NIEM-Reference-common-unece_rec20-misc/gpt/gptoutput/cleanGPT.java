public enum LengthCodeSimpleType {    HMT, A71, X1, A12, A45, 4H, A11, C52, B57, CMT, MTR, AK, C45, KMT, M7, MMT, INH, 77, YRD, FOT, NMI, DMT, C63, SMI}public enum LengthCodeType {    HMT, A71, X1, A12, A45, 4H, A11, C52, B57, CMT, MTR, AK, C45, KMT, M7, MMT, INH, 77, YRD, FOT, NMI, DMT, C63, SMI}public enum MassCodeSimpleType {    KGM, DTN, STN, GRM, APZ, TNE, STI, Mg, CWA, LBR, 2U, DG, HGM, KTN, LTN, CGM, ONZ, MC, DJ, CWI, MGM, GRN}public enum MassCodeType {    KGM, DTN, STN, GRM, APZ, TNE, STI, Mg, CWA, LBR, 2U, DG, HGM, KTN, LTN, CGM, ONZ, MC, DJ, CWI, MGM, GRN}

public enum TimeCodeSimpleType {
    D42, B52, HUR, WEE, C26, ANN, MON, DAY, MIN, B98, C47, SEC
}

public enum TimeCodeType {
    D42, B52, HUR, WEE, C26, ANN, MON, DAY, MIN, B98, C47, SEC
}public enum VelocityCodeSimpleType {    HM, 2X, 2M, KNT, FR, MTS, KMH, C16, IU, FS}public enum VelocityCodeType {    HM, 2X, 2M, KNT, FR, MTS, KMH, C16, IU, FS}

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