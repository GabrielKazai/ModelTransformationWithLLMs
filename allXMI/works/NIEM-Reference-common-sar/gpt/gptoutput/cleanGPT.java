public enum TargetSectorCodeSimpleType {
    EMRG, TELCM, SPCFXN, LIVSTK, OTHR, WATR, EDU, COMM, AGRI, HAZMAT, CHEM, CORR, NATRL, CSTL, PRSN, TACTCP, HLTH,
    GVTBLDG, MAIL, RETL, ENTMT, CULTR, TRANS, NCLR, MNMT, POP, FIN, DFNSE, DAMS, ENRG, IT, MASS, MFG, UTL
}

public enum TargetSectorCodeType extends
    TargetSectorCodeSimpleType {
        }

    public enum TipClassCodeSimpleType {
        FUND, CYBER, SPCSSBST, BIO, FRAUD, HATE, CNTFTG, INFRA, SPCSA, VRUS, SPCSP, EXPL, CTMN, INCEND, NCLR, LAUND,
        CHEM, THRTPUB
    }

    public enum TipClassCodeType extends
        TipClassCodeSimpleType {
            }

        public enum TipDomainCodeSimpleType {
            G, D, F, H, E, A, B, C
        }public enum TipDomainCodeType extends TipDomainCodeSimpleType {}public enum ContentKind {    Unspecified, Empty, Simple, Mixed, ElementOnly}public enum FeatureKind {    Unspecified, Simple, Attribute, Element, AttributeWildcard, ElementWildcard, Group}public enum VisibilityKind {    Unspecified, None, ReadOnly, ReadWrite, ReadOnlyUnsettable, ReadWriteUnsettable}class NamespaceElementPropertyHolder {}