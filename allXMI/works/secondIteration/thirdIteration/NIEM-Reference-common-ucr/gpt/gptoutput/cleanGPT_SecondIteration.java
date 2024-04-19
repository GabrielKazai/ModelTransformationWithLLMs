public enum OffenseCodeSimpleType {
    _240, _36A, _26E, _510, _11C, _90H, _220, _23F, _13A, _23C, _26B, _200, _100, _290, _09C, _23G, _90G, _23D, _39D,
    _90D, _250, _90B, _90Z, _26C, _23A, _09A, _23E, _90J, _270, _35A, _520, _36B, _39B, _23B, _40A, _13C, _90C, _210,
    _11B, _40B, _35B, _90I, _280, _13B, _26A, _23H, _90F, _26D, _90E, _09B, _39A, _370, _90A, _120, _11D, _11A, _39C
}

public class OffenseCodeType {
    private OffenseCodeSimpleType code;
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