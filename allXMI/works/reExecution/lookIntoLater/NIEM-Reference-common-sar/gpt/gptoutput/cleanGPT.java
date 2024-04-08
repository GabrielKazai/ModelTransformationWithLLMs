public enum TargetSectorCodeSimpleType {
    EMRG, TELCM, SPCFXN, LIVSTK, OTHR, WATR, EDU, COMM, AGRI, HAZMAT, CHEM, CORR, NATRL, CSTL, PRSN, TACTCP, HLTH,
    GVTBLDG, MAIL, RETL, ENTMT, CULTR, TRANS, NCLR, MNMT, POP, FIN, DFNSE, DAMS, ENRG, IT, MASS, MFG, UTL
}

public class NamespaceElementPropertyHolder {
}

public enum TargetSectorCodeType {
}

public enum TipClassCodeSimpleType {
    FUND, CYBER, SPCSSBST, BIO, FRAUD, HATE, CNTFTG, INFRA, SPCSA, VRUS, SPCSP, EXPL, CTMN, INCEND, NCLR, LAUND, CHEM,
    THRTPUB
}

public enum TipClassCodeType {
}

public enum TipDomainCodeSimpleType {
    G, D, F, H, E, A, B, C
}

public enum TipDomainCodeType {
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