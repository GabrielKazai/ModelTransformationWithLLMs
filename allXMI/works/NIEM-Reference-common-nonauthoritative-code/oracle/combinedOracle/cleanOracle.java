
public enum FamilyKinshipCodeSimpleType {
    foster,
    biological,
    marriage,
    adoption;
}

public class NamespaceElementPropertyHolder {
}

public enum FamilyKinshipCodeType extends {
    ;
}

public enum ImagePoseCodeSimpleType {
    Oblique,
    Frontal,
    Side;
}

public enum ImagePoseCodeType extends {
    ;
}

public enum MarriageCategoryCodeSimpleType {

    civil union,
    unknown,
    common
    law,
    married;
}

public enum MarriageCategoryCodeType extends {
    ;
}

public enum MarriageStatusCodeSimpleType {
    unknown,
    separated,
    married,
    widowed,
    divorced;
}

public enum MarriageStatusCodeType extends {
    ;
}

public enum PersonNameCategoryCodeSimpleType {
    handle,
    aka,
    dba,
    moniker,

    call sign,
    pseudonym,
    nickname,
    user id,
    alias,
    other,
    provided,
    fka,
    unknown;
}

public enum PersonNameCategoryCodeType extends {
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
