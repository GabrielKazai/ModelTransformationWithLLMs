public class Environment {
}

public class Model {
}

public class Package {
    public Package[] packages;
    public Package parentPackage;
    public Class[] classes;
    public Signal[] signals;

    public Package(String name) {
    }

    public String getFullName() {
        return "";
    }
}

public class Class extends Classifier {
    public Package package;    public Class(String name) {    }

    public String getFullName() {
        return "";
    }
}

public abstract class Element {
    public String name;
    public String description;
    public String summary;
    public ID id;

    public Element(String name) {
    }
}

public class ID {
}

public abstract class Classifier extends Element {
    public Classifier[] chidren;
    public Classifier[] parents;
    public Behavior[] ownedBehavior;
    public boolean isAbstract;

    public boolean isA(Classifier classifier) {
        return false;
    }

    public Classifier(String name) {
    }
}

public class Feature extends Element {
    public Feature(String name) {
    }
}

public class Property extends Feature {
    public Classifier type;
    public Classifier classifier;
    public Property opposite;
    public ValueSpecification defaultValue;
    public DomainSpecification domain;
    public boolean isComposite;
    public boolean isNavigable;
    public boolean isReadOnly;
    public boolean isDerived;
    public boolean isOrdered;
    public boolean isUnique;
    public int minimumNumber;
    public int maximumNumber;
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
    Unspecified, Empty, Simple, Mixed, ElementOnly
}

public enum FeatureKind {
    Unspecified, Simple, Attribute, Element, AttributeWildcard, ElementWildcard, Group
}

public enum VisibilityKind {
    Unspecified, None, ReadOnly, ReadWrite, ReadOnlyUnsettable, ReadWriteUnsettable
}