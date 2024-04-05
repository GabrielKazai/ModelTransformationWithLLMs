import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("38371701-b003-4132-ae22-d1ce13a2cf6e")
public enum ContentCategoryCodeSimpleType {
    Accept,
    Offer Unsolicited Resources,
    Notify Auxiliary Recipients,
    Decline,
    Cancel,
    Response to Offer Unsolicited Resources,
    Request Return,
    Requisition Resource,
    Response to Request Resource,
    Response to Request Return,
    Response to Request Information (RFI),
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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cf267159-5fd6-4b7b-bfa0-a8ed3a8f3903")
public class NamespaceElementPropertyHolder {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2fa016a3-c14e-40be-992d-a873be157046")
public enum ContentCategoryCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b6e1e475-6e91-40fb-afac-1c5cfe2bb097")
public enum ResponseCodeSimpleType {
    Decline,
    Accept;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("69622b7e-acf5-4b92-8177-8e5a33ee2bda")
public enum ResponseCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f1a8432c-2f2b-48a9-845e-fcc08074e49b")
public enum ContentKind {
    Unspecified,
    Empty,
    Simple,
    Mixed,
    ElementOnly;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6d978788-b6dc-4b81-9695-55a202be9adb")
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

@objid ("71a59788-734a-4b48-b30d-7330e44f24b9")
public enum VisibilityKind {
    Unspecified,
    None,
    ReadOnly,
    ReadWrite,
    ReadOnlyUnsettable,
    ReadWriteUnsettable;
}

