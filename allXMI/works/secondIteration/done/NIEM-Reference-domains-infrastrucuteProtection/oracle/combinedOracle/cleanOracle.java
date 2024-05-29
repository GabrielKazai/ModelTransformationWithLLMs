
public class AssetCategoryType {
    public List<AssetType> Asset = new ArrayList<AssetType>();

}

public class NamespaceElementPropertyHolder {
}

public class AssetType {
}

public enum AssetStatusCodeType extends {
    ;
}

public enum AssetStatusCodeSimpleType {
    3,
    2,
    1;
}

public class SectorType {
    public List<SubsectorType> SubSector = new ArrayList<SubsectorType>();

}

public class SubsectorType {
    public List<SegmentType> Segment = new ArrayList<SegmentType>();

}

public class SegmentType {
    public List<SubsegmentType> SubSegment = new ArrayList<SubsegmentType>();

}

public class SubsegmentType {
    public List<AssetCategoryType> AssetCategory = new ArrayList<AssetCategoryType>();

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
