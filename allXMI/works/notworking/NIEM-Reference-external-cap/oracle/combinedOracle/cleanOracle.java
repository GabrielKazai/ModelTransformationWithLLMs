
public class NamespaceElementPropertyHolder {
    public class alert_._type
    {
        public class info_._type {
            public class eventCode_._type {
            }

            public class parameter_._type {
            }

            public class resource_._type {
            }

            public class area_._type {
                public class geocode_._type {
                }

            }

            class category_._type {
            }

            class responseType_._type {
            }

            class urgency_._type {
            }

            class severity_._type {
            }

            class certainty_._type {
            }

        }

        class status_._type {
        }

        class msgType_._type {
        }

        class scope_._type {
        }

    }

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
