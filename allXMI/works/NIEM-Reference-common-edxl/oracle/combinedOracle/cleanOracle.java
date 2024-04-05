
public enum ContentCategoryCodeSimpleType {
    Accept,

    Offer Unsolicited Resources,
    Notify Auxiliary Recipients,
    Decline,
    Cancel,
    Response to
    Offer Unsolicited Resources,
    Request Return,
            Requisition
    Resource,
    Response to
    Request Resource,
            Response
    to Request Return,
    Response to

    Request Information (RFI),
    Response to Request Quote,
    Release Resource,
    Update,
    Request Resource,
    Request Quote,
    Acknowledge,
    Notify Resource Request Disposition,

    Request Information (RFI),
    Commit Resource,
    Request Extension,
    Request Resource Disposition;
}

    public class NamespaceElementPropertyHolder {
    }

public enum ContentCategoryCodeType extends {
    ;
}

    public enum ResponseCodeSimpleType {
        Decline,
        Accept;
    }

public enum ResponseCodeType extends {
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
