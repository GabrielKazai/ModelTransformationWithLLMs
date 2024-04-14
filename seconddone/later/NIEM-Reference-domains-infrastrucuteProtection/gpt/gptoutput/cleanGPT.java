public class AssetCategoryType {
    public AssetType Asset;
    public String AssetCategoryName;
    public String AssetCategoryID;
    public String SubSegmentName;
    public String AssetCategoryDescriptionText;
}

public class NamespaceElementPropertyHolder {
    public String SubSegmentName;
    public String SectorName;
    public String SubSectorName;
    public String SegmentName;
    public String AssetCategoryName;
    public SectorType Sector;
}

public class AssetType {
    public String AssetName;
    public String AssetID;
    public String AssetAliasName;
    public AssetStatusCodeType AssetStatusCode;
    public String AssetCategoryName;
}

public enum AssetStatusCodeType {
    _3, _2, _1
}

public enum AssetStatusCodeSimpleType {
    _3, _2, _1
}

public class SectorType {
    public SubsectorType SubSector;
    public String SectorName;
    public String SectorTaxonomyID;
    public String SectorTaxonomyDescriptionText;
}

public class SubsectorType {
    public SegmentType Segment;
    public String SubSectorName;
    public String SubSectorTaxonomyID;
    public String SectorName;
    public String SubSectorTaxonomyDescriptionText;
}

public class SegmentType {
    public SubsegmentType SubSegment;
    public String SegmentName;
    public String SegmentTaxonomyID;
    public String SubSectorName;
    public String SegmentTaxonomyDescriptionText;
}

public class SubsegmentType {
    public AssetCategoryType AssetCategory;
    public String SubSegmentName;
    public String SubSegmentTaxonomyID;
    public String SegmentName;
    public String SubSegmentDescriptionText;
}

public enum ContentKind {
    Unspecified, Empty, Simple, Mixed, ElementOnly
}

public enum FeatureKind {
    Unspecified, Simple, Attribute, Element, AttributeWildcard, ElementWildcard, Group
}

public enum VisibilityKind {
    Unspecified, None, ReadOnly, ReadWrite, ReadOnlyUnsettable, ReadWriteUnsettable
}