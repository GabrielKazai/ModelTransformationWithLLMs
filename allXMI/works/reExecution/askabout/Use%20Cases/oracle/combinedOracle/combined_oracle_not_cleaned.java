import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("59cbe979-2f79-4752-a751-571bcbe42c3c")
public class Class {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("eb2d2d30-dc93-4af9-8ed2-c10a4830d9e7")
public enum ContentKind {
    Unspecified,
    Empty,
    Simple,
    Mixed,
    ElementOnly;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5c256d40-eb92-48d2-8621-f54e0a42d9d6")
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

@objid ("6be6a7a5-c090-4af3-8aff-986b768609fc")
public enum VisibilityKind {
    Unspecified,
    None,
    ReadOnly,
    ReadWrite,
    ReadOnlyUnsettable,
    ReadWriteUnsettable;
}

