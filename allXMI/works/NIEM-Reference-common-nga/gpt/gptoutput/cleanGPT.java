public enum DatumCodeSimpleType {
    SAN_F, GAA, ASQ, BOO, SCK, SAN_C, MIK, NAS_L, NAR_E, PRP_F, ARF_E, AIN_A, HKD, EAS, NAH_C, SAE, TOY_C, NAR_B, EUR_B,
    MIN_B, NSD, SAN_L, LUZ_B, PIT, HIT, TDC, OGB_M, PRP_D, AUA, DOB, VOR, NAS_Q, EUR_S, OHA_C, NAS_R, NAS_N, CCD, EUR_C,
    LCF, SAN_G, REU, KEG, MPO, COA, CAI, PLN, NAP, WAK, SAN_M, TRN, PTN, OGB_C, ISG, IDN, JOH, EUR_G, SPK_D, SAN_K, YAC,
    KAN, MAS, AIN_B, HEN, ENW, BAT, ATF, ARF_B, TIL, NAS_H, IND_P, NAS_W, OHA_B, GIZ, BUR, OGB_A, KEA, SAN_H, SAN_I,
    PUR, ADI_M, CAC, FLO, HER, LIB, ZAN, NAH_B, NAS_U, ASM, NAS_I, NAH_A, SRL, SHB, EUS, ING_B, NAS_C, SPK_F, EST,
    NAS_P, EUR_D, OHA_A, EUR_F, ARF_H, HJO, NAR_D, PRP_H, IBE, ADI_A, GEO, AMA, PHA, SAN_E, OGB_D, IST, ARF_C, ADI_B,
    GSE, TOY_M, EUR_M, NAS_E, SPK_B, POS, CHU, EUR_A, CAZ, QUO, DID, MVS, ARS_A, TOY_A, NAS_D, PRP_C, OGB_B, ING_A, GUA,
    NAS_V, AIA, ARS_M, SAN_J, EUR_T, PRP_E, ADI_E, AFG, MER, IRL, OHA_M, SAP, SPK_C, MIN_A, CHI, MOD, QAT, PRP_M, NAR_A,
    INF_A, ANO, EUR_L, HTN, PTB, SPK_G, PUK, BID, ARF_F, TOY_B, EUR_I, CAP, NAS_T, SAO, NAS_B, SAN_D, EUR_J, KUS, OHA_D,
    NAS_G, SAN_B, TAN, FOT, NAR_C, ARF_A, ASC, PRP_A, BER, NAS_J, LUZ_A, SPK_A, SGM, ADI_C, MID, PRP_G, NAS_O, ADI_D,
    AUG, IND_I, LEH, NAS_A, SOA, ADI_F, EUR_K, OEG, SPK_E, ARF_M, IND_B, DAL, EUR_E, CAO, PRP_B, GRA, FAH, VOI, CGE,
    INH_A, NAS_F, ARF_G, ARS_B, NAR_H, SAN_A, EUR_H, ARF_D
}

public class NamespaceElementPropertyHolder {
}public enum DatumCodeType {    // Inherits from DatumCodeSimpleType, no additional members required}public enum ContentKind {    Unspecified, Empty, Simple, Mixed, ElementOnly}public enum FeatureKind {    Unspecified, Simple, Attribute, Element, AttributeWildcard, ElementWildcard, Group}public enum VisibilityKind {    Unspecified, None, ReadOnly, ReadWrite, ReadOnlyUnsettable, ReadWriteUnsettable}