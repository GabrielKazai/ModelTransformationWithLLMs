
public class Environment {
}

public class Model {
}

public class Package extends Element {
    public List<Package> packages = new ArrayList<Package>();

    public Package parentPackage;

    public List<Class> classes = new ArrayList<Class>();

    public List<Signal> signals = new ArrayList<Signal>();

    public void Package(final String name) {
    }

    public String getFullName() {
        // TODO Auto-generated return
        return null;
    }

}

public class Class extends Classifier {
    public Package package;

    public void Class(final String name) {
    }

    public void getFullName() {
    }

}

public class Element {
    public String name;

    public String description;

    public String summary;

    public ID id;

    public void Element(final String name) {
    }

}

public class ID {
}

public class Classifier extends Element {
    public boolean isAbstract;

    public List<Classifier> chidren = new ArrayList<Classifier>();

    public List<Classifier> parents = new ArrayList<Classifier>();

    public List<Behavior> ownedBehavior = new ArrayList<Behavior>();

    public boolean isA(final Classifier classifier) {
        // TODO Auto-generated return
        return false;
    }

    public void Classifier(final String name) {
    }

}

public class Feature extends Element {
    public void Feature(final String name) {
    }

}

public class Property extends Feature {
    public boolean isComposite;

    public boolean isNavigable;

    public boolean isReadOnly;

    public boolean isDerived;

    public boolean isOrdered;

    public boolean isUnique;

    public int minimumNumber;

    public int maximumNumber;

    public Classifier type;

    public Classifier classifier;

    public Property opposite;

    public ValueSpecification defaultValue;

    public DomainSpecification domain;

}

public class ValueSpecification {
}

public class DomainSpecification {
}

public class Signal extends Class {
}

public class Behavior {
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
