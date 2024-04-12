import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e78d1bee-7d8d-46f3-b36e-263e7c377112")
public class DistributionElementAdapterType {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fc1ea619-0be6-4d8c-801f-a292e62724dd")
public class NamespaceElementPropertyHolder {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1d0ddfc7-b5e2-496f-bca2-cabbfa2af81e")
public enum ContentKind {
    Unspecified,
    Empty,
    Simple,
    Mixed,
    ElementOnly;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a7e1f516-e20f-4b0a-96d2-b9d08062ad78")
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

@objid ("3b4cc7ca-04e9-4e5b-97b1-a050a4b7a3ae")
public enum VisibilityKind {
    Unspecified,
    None,
    ReadOnly,
    ReadWrite,
    ReadOnlyUnsettable,
    ReadWriteUnsettable;
}

