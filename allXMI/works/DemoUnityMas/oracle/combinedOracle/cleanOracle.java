
public class TechnicienMaintenance {
    public void gotoDestination() {
    }

    public void graspObject() {
    }

    public void SubOperation() {
    }

    public void TestOperation() {
    }

}

public class Box {
    public void ChangeColor() {
    }

}

public class entity {
}

public class Agent {
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
