public enum CurrencyCodeSimpleType {
    BHD, ZAR, UAH, ZWD, LBP, XFO, BEF, VND, ATS, SLL, YUM, AUD, AFA, KYD, TJS, JOD, IDR, BBD, SHP, MYR, KMF, KZT, SAR,
    PGK, MMK, MRO, GYD, XBB, AOR, XAF, LSL, MXN, BWP, PAB, TND, ZMK, KGS, EUR, TWD, UYU, SCR, KRW, CLF, ILS, PHP, TMM,
    XDR, CRC, CZK, DZD, XOF, SKK, ZAL, EEK, GBP, NIO, BZD, FRF, THB, XBD, MDL, MTL, SOS, MKD, SBD, SIT, GRD, XBC, HUF,
    MGF, HNL, KHR, TOP, ESP, XAG, SDD, USS, INR, BMD, MOP, MWK, UZS, LKR, MZM, ERN, CDF, CVE, XPF, GNF, XTS, UGX, MUR,
    GTQ, XAU, NOK, XCD, WST, PTE, TPE, LTL, ISK, CLP, GMD, ZRN, DKK, KPW, NLG, ECV, KWD, DOP, GEL, ALL, XFU, ITL, TTD,
    GHC, LUF, OMR, USN, BTN, HKD, STD, PEN, RUB, VUV, YER, LVL, MNT, BSD, BDT, DJF, AZM, IEP, ANG, XXX, EGP, SYP, TRL,
    LRD, IRR, GWP, CUP, TJR, ARS, GIP, ROL, BGN, TZS, AWG, JMD, ADP, CNY, KES, SEK, BND, AED, PLN, BIF, HTG, RUR, QAR,
    MXV, CHF, SVC, MAD, NPR, FKP, SZL, NZD, MVR, BRL, AON, XPT, FJD, CAD, CYP, AMD, BAM, BGL, XBA, PYG, XPD, HRK, SRG,
    IQD, FIM, LYD, DEM, ECS, LAK, COP, ETB, VEB, BYR, USD, RWF, JPY, PKR, NGN, SGD, NAD;
}

public enum ContentKind {
    Unspecified, Empty, Simple, Mixed, ElementOnly;
}

public enum FeatureKind {
    Unspecified, Simple, Attribute, Element, AttributeWildcard, ElementWildcard, Group;
}

public enum VisibilityKind {
    Unspecified, None, ReadOnly, ReadWrite, ReadOnlyUnsettable, ReadWriteUnsettable;
}public enum CurrencyCodeType {    // Inherits CurrencyCodeSimpleType values implicitly}public class NamespaceElementPropertyHolder {    // Class content would go here}