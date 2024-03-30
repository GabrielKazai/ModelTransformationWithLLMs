import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e5835c90-6a28-40b0-9564-36213b61aaf0")
public class AssetCategoryType {
    @objid ("1599ed62-8cf9-45ef-abfe-4649b1068eaf")
    public List<AssetType> Asset = new ArrayList<AssetType> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("233fc83e-ffaf-445c-a8bc-f86defa69d21")
public class NamespaceElementPropertyHolder {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bc53fd86-f2ec-48f9-95bc-1e8c168d34f3")
public class AssetType {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9c89d85d-9d50-4985-9142-f6e79b29d2e8")
public enum AssetStatusCodeType extends {
    ;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4126f970-75ab-4d81-921a-6b73ec986117")
public enum AssetStatusCodeSimpleType {
    3,
    2,
    1;
}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d25e50cb-af8d-4e06-a0f9-74f4e95ce8b7")
public class SectorType {
    @objid ("85e4f330-696d-40a1-bc0a-76d7af9ea9db")
    public List<SubsectorType> SubSector = new ArrayList<SubsectorType> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("34459311-77c1-45a9-8884-be0f75e5fc33")
public class SubsectorType {
    @objid ("7871ea87-8d48-47ac-b278-0c72e1290810")
    public List<SegmentType> Segment = new ArrayList<SegmentType> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d779dd99-f485-446c-9424-5a7956091b45")
public class SegmentType {
    @objid ("67719354-6f88-4fdd-ab0a-0a53fdb1807d")
    public List<SubsegmentType> SubSegment = new ArrayList<SubsegmentType> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("52ca1be7-8a1f-424e-9c8d-0696ce55520a")
public class SubsegmentType {
    @objid ("6f41d162-15cf-4055-8228-4729a878b56f")
    public List<AssetCategoryType> AssetCategory = new ArrayList<AssetCategoryType> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c26419af-5879-40e2-bbc0-17af6e483797")
public enum ContentKind {
    Unspecified,
    Empty,
    Simple,
    Mixed,
    ElementOnly;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f92cd5d1-55ae-4089-8900-7ce67faf654c")
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

@objid ("b30aa7dd-9287-4beb-b52b-08356c41df5b")
public enum VisibilityKind {
    Unspecified,
    None,
    ReadOnly,
    ReadWrite,
    ReadOnlyUnsettable,
    ReadWriteUnsettable;
}

