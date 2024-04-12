public class ArcByCenterPointType {
}

public class ArcType {
}

public class CircleByCenterPointType {
}

public class CircleType {
}

public class CurveType {
}

public class EllipseType {
}

public class EnvelopeType {
}

public class LineStringType {
}

public class MultiCurveType {
}

public class MultiGeometryType {
}

public class MultiPointType {
}

public class MultiSurfaceType {
}

public class PointType {
}

public class PolygonType {
}

public class SurfaceType {
}

public class NamespaceElementPropertyHolder {
    private PointType Point;
    private CircleByCenterPointType CircleByCenterPoint;
    private MultiPointType MultiPoint;
    private PolygonType Polygon;
    private SurfaceType Surface;
    private ArcByCenterPointType ArcByCenterPoint;
    private EllipseType Ellipse;
    private EnvelopeType Envelope;
    private ArcType Arc;
    private MultiSurfaceType MultiSurface;
    private MultiCurveType MultiCurve;
    private CurveType Curve;
    private MultiGeometryType MultiGeometry;
    private CircleType Circle;
    private LineStringType LineString;
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