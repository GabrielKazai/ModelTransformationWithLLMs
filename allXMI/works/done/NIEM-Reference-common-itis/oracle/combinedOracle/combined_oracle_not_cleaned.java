import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("83e39bc1-fc5b-4349-925f-cf7c63378d79")
public enum LightingCodeSimpleType {
    lighting-unknown,
    artificial-interior-light,
    artificial-exterior-light,
    moonlight,
    dusk,
    daylight,
    darkness,
    dawn;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c3006c34-1498-420b-9f27-7ae555ad667f")
public class NamespaceElementPropertyHolder {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("24b8ffe4-6852-43c1-96d6-9837cfe1deef")
public enum LightingCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("de310802-6bd7-4895-b67f-34c674f6a664")
public enum WeatherConditionsCodeSimpleType {
    uV-index-low,
    clear-skies,
    overcast,
    dry,
    mostly-cloudy,
    mostly-sunny,
    uV-index-very-low,
    fair-skies,
    mostly-clear,
    ozone-alert,
    uV-index-moderate,
    barometric-pressure,
    partly-cloudy,
    uV-index-high,
    uV-index-very-high,
    sunny,
    partly-sunny,
    cloudy,
    mostly-dry;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d5dc9760-e5ca-49a2-8513-19db17f68091")
public enum WeatherConditionsCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fde68b64-63ce-4262-b789-7609d038a16c")
public enum ContentKind {
    Unspecified,
    Empty,
    Simple,
    Mixed,
    ElementOnly;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bdd12f44-c85e-44b7-95e0-d13a050fc71a")
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

@objid ("2552fcd2-03e8-4664-95c2-4a7f988198c1")
public enum VisibilityKind {
    Unspecified,
    None,
    ReadOnly,
    ReadWrite,
    ReadOnlyUnsettable,
    ReadWriteUnsettable;
}

