import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a2b9900b-3280-48ba-97ee-c367b63d724e")
public enum ContentKind {
    Unspecified,
    Empty,
    Simple,
    Mixed,
    ElementOnly;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d2e0d3cf-d90c-4bd5-a144-c21d15f37044")
public enum FeatureKind {
    Unspecified,
    Simple,
    Attribute,
    Element,
    AttributeWildcard,
    ElementWildcard,
    Group;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("80e6f720-b2ad-4404-a4d0-bb98a1bfbb77")
public enum VisibilityKind {
    Unspecified,
    None,
    ReadOnly,
    ReadWrite,
    ReadOnlyUnsettable,
    ReadWriteUnsettable;
}

