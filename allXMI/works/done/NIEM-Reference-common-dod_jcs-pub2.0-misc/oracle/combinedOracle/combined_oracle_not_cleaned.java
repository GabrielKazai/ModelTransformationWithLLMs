import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("17f7d5ba-6889-433a-8e74-31f555d8a00b")
public enum DocumentIntelligenceCategoryCodeSimpleType {
    TECHINT,
    HUMINT,
    SIGINT,
    MASINT,
    IMINT,
    CI,
    OSINT;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d19ca701-e04e-4037-ba1f-507fc8ca08d3")
public class NamespaceElementPropertyHolder {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("44f1c50e-b6a3-4fe8-aa4c-d34eae5bac04")
public enum DocumentIntelligenceCategoryCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("147d6f59-ac01-4e99-8d6e-94aee8cbb10c")
public enum ContentKind {
    Unspecified,
    Empty,
    Simple,
    Mixed,
    ElementOnly;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a91b46be-dc6f-4961-a6bb-d5a3bfabaccc")
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

@objid ("5375aa65-eec5-4c6e-aaac-548fba644523")
public enum VisibilityKind {
    Unspecified,
    None,
    ReadOnly,
    ReadWrite,
    ReadOnlyUnsettable,
    ReadWriteUnsettable;
}

