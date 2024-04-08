import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("60cafa30-0280-4eec-ad49-562905b1b1fa")
public enum AlarmEventCategoryCodeSimpleType {
    Medical,
    FIRE,
    Comm,
    BURG,
    Holdup;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a12e6be5-de40-4fdd-8a05-dc44f516964a")
public class NamespaceElementPropertyHolder {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3cdc251a-bc83-476a-b43d-3042a6d4e128")
public enum AlarmEventCategoryCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0e7bb63c-dadd-4862-bca5-d3dbd158bf29")
public enum AlarmEventLocationCategoryCodeSimpleType {
    commercial,
    residential;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("200f1ae7-1c91-4424-9f4a-b074a04a4601")
public enum AlarmEventLocationCategoryCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8cd0d9ed-ca36-40bd-8386-cafee27adefc")
public enum AlarmEventResponseActionCodeSimpleType {
    respond,
    notify;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("597b46ce-e574-41cf-8b80-e654e6bd49e9")
public enum AlarmEventResponseActionCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5fc4e2a3-7057-4b4e-90ad-6d256949e1a0")
public enum ContentKind {
    Unspecified,
    Empty,
    Simple,
    Mixed,
    ElementOnly;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("66c49107-8458-4dee-a77e-18ae91746f9b")
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

@objid ("a8462faf-8095-42cb-b7c1-720ea7070b6b")
public enum VisibilityKind {
    Unspecified,
    None,
    ReadOnly,
    ReadWrite,
    ReadOnlyUnsettable,
    ReadWriteUnsettable;
}

