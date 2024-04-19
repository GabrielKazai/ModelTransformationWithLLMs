public enum USStateCodeSimpleType {
    WA, NE, MI, NM, MD, KY, OR, ID, MT, WV, UT, CA, AR, NJ, VT, AL, FL, MS, UM, NY, LA, CT, DE, GU, OH, WI, AZ, ME, ND,
    PA, IN, CO, GA, WY, VI, NH, TX, AK, RI, OK, IL, MN, NC, HI, DC, MP, IA, PR, SD, TN, VA, MO, NV, PW, MH, MA, SC, FM,
    AS, KS
}

public class NamespaceElementPropertyHolder {
}

public enum USStateCodeType {
}

public enum USStateNumericCodeSimpleType {
    _05("05"), _26("26"), _71("71"), _69("69"), _01("01"), _42("42"), _21("21"), _56("56"), _35("35"), _89("89"),
    _51("51"), _47("47"), _25("25"), _16("16"), _49("49"), _11("11"), _72("72"), _81("81"), _76("76"), _45("45"),
    _27("27"), _66("66"), _46("46"), _19("19"), _41("41"), _68("68"), _18("18"), _02("02"), _20("20"), _17("17"),
    _86("86"), _55("55"), _06("06"), _31("31"), _24("24"), _48("48"), _67("67"), _54("54"), _84("84"), _28("28"),
    _09("09"), _12("12"), _79("79"), _36("36"), _64("64"), _29("29"), _32("32"), _60("60"), _08("08"), _40("40"),
    _70("70"), _04("04"), _30("30"), _34("34"), _53("53"), _22("22"), _95("95"), _50("50"), _78("78"), _13("13"),
    _33("33"), _15("15"), _10("10"), _44("44"), _37("37"), _38("38"), _23("23"), _39("39"), _74("74");

    private final String code;

    USStateNumericCodeSimpleType(String code) {
        this.code = code;
    }
}

public enum USStateNumericCodeType {
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