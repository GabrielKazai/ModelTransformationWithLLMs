import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0aef0470-04d6-4147-b4cd-32f1380b7324")
public enum FamilyKinshipCodeSimpleType {
    foster,
    biological,
    marriage,
    adoption;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("75ba2fee-c54c-44c5-b2ca-60b1c5d400d4")
public class NamespaceElementPropertyHolder {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cb9779ba-785c-4b76-b401-eb946f28a927")
public enum FamilyKinshipCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1ba877af-b817-4ca0-94db-8ea64ee68184")
public enum ImagePoseCodeSimpleType {
    Oblique,
    Frontal,
    Side;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("da7d8a9a-c47b-4ad4-9e47-3565e560f2cf")
public enum ImagePoseCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7bbb8faa-0cf1-4829-8978-db57faa5e81e")
public enum MarriageCategoryCodeSimpleType {
    civil union,
    unknown,
    common law,
    married;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("47c087f1-35c3-4ae1-b7d7-febedcec3731")
public enum MarriageCategoryCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a31f0719-b26b-444e-8af3-4a3bb7bcab28")
public enum MarriageStatusCodeSimpleType {
    unknown,
    separated,
    married,
    widowed,
    divorced;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ad54ac72-ea0f-4e42-9574-1d17d55adb73")
public enum MarriageStatusCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("243757d4-8ca5-4608-9045-61717932c016")
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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("05f2d2ea-789b-40cc-be14-ca27c9895f34")
public enum PersonNameCategoryCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("af8b2c58-03e0-42a9-92c5-6bbd772f6f34")
public enum ContentKind {
    Unspecified,
    Empty,
    Simple,
    Mixed,
    ElementOnly;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9a1eb64e-3f6d-45a1-bfc6-89b76406666f")
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

@objid ("8dec5a7b-76e4-41ae-86b9-9f99ab8ee856")
public enum VisibilityKind {
    Unspecified,
    None,
    ReadOnly,
    ReadWrite,
    ReadOnlyUnsettable,
    ReadWriteUnsettable;
}

