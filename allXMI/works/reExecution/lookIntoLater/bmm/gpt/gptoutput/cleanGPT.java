javaCopy codepackage bmm2.core;
abstract class BMM_TYPE {
    abstract BMM_CLASS base_class();

    abstract boolean has_type_substitutions();

    abstract String type_substitutions();

    String as_display_type_string();
}abstract class BMM_CLASS extends BMM_CLASSIFIER {    BMM_CLASS ancestors;    BMM_PACKAGE package;    BMM_PROPERTY properties;    String name;    String source_schema_id;    String immediate_descendants;    String all_ancestors();    String all_descendants();    String suppliers();    String suppliers_non_primitive();    String supplier_closure();}

class BMM_PROPERTY<T> {
    BMM_TYPE type;
    String name;
    boolean is_mandatory;
    boolean is_computed;

    MULTIPLICITY_INTERVAL existence();

    String display_name();
}

class BMM_CONTAINER_TYPE extends BMM_TYPE {
    BMM_CLASS container_class;
    BMM_TYPE base_type;
}

class BMM_GENERIC_TYPE extends BMM_TYPE {
    BMM_TYPE generic_parameters;
    BMM_GENERIC_CLASS base_class;
}

class BMM_SIMPLE_TYPE extends BMM_TYPE {
    BMM_CLASS base_class;
}

class BMM_SIMPLE_TYPE_OPEN extends BMM_TYPE {
    BMM_GENERIC_PARAMETER type;
}

class BMM_ENUMERATION<G> extends BMM_CLASS {
}

class BMM_ENUMERATION_STRING extends BMM_ENUMERATION<String> {
}

class BMM_ENUMERATION_INTEGER extends BMM_ENUMERATION<Integer> {
}

class BMM_PACKAGE extends BMM_PACKAGE_CONTAINER {
    BMM_CLASS classes;
    String name;

    BMM_CLASS root_classes();

    String path();
}

class BMM_GENERIC_PARAMETER extends BMM_CLASSIFIER {
    BMM_CLASS conforms_to_type;
    BMM_GENERIC_PARAMETER inheritance_precursor;
    String name;

    String flattened_conforms_to_type();
}

abstract class BMM_CLASSIFIER {
    abstract String type_category();

    String as_conformance_type_string();

    abstract String as_type_string();
}

class MULTIPLICITY_INTERVAL {
}

class BMM_CONTAINER_PROPERTY<T> extends BMM_PROPERTY<T> {
    BMM_CONTAINER_TYPE type;
    MULTIPLICITY_INTERVAL cardinality;

    String display_name();
}

class BMM_SCHEMA extends BMM_SCHEMA_CORE,BMM_PACKAGE_CONTAINER
{    BMM_CLASS class_definitions;

    String primitive_types();

    String enumeration_types();

    BMM_CLASS class_definition(String a_name);

    BMM_ENUMERATION enumeration(String a_name);

    BMM_PROPERTY property_definition();

    boolean ms_conformant_property_type();

    BMM_PROPERTY property_definition_at_path();

    String all_ancestor_classes(String a_class);

    boolean type_conforms_to(String a_desc_type, String an_anc_type);
}

class BMM_SCHEMA_CORE {
    String rm_publisher;
    String rm_release;
    String schema_name;
    String schema_revision;
    String schema_lifecycle_state;
    String schema_author;
    String schema_description;
    String schema_contributors;
    String archetype_parent_class;
    String archetype_data_value_parent_class;
    String archetype_rm_closure_packages;
    String archetype_visualise_descendants_of;

    String schema_id();
}

class BMM_PACKAGE_CONTAINER {
    BMM_PACKAGE packages;

    BMM_PACKAGE package_at_path();

    void dp_recursive_packages(Action action);
}

class BMM_GENERIC_CLASS extends BMM_CLASS {
    BMM_GENERIC_PARAMETER generic_parameters;}javaCopy codepackage bmm2.persistence;

    class P_BMM_CLASS extends P_BMM_CLASSIFIER {
        P_BMM_PROPERTY properties;
        P_BMM_GENERIC_PARAMETER generic_parameter_defs;
        int uid;
        String name;
        String ancestors;
        boolean is_abstract;
        boolean is_override;
        String source_schema_id;

        boolean is_generic();

        void create_bmm_class_definition();

        void populate_bmm_class_definition();
    }

    class P_BMM_ENUMERATION<T> extends P_BMM_CLASS {
        String item_names;
        T item_values;
    }

    class P_BMM_SCHEMA extends P_BMM_PACKAGE_CONTAINER {
        P_BMM_CLASS primitive_types;
        P_BMM_CLASS class_definitions;
        P_BMM_PACKAGE canonical_packages;
        String bmm_version;
        int state;
        BMM_SCHEMA bmm_schema;

        void validate_created();

        void load_finalise();

        void merge(P_BMM_SCHEMA other);

        void validate();

        void create_bmm_schema();
    }

    abstract class P_BMM_CLASSIFIER {
    }

    abstract class P_BMM_PROPERTY extends P_BMM_CLASSIFIER {
        String name;
        boolean is_mandatory;
        boolean is_computed;
        BMM_PROPERTY bmm_property_definition;
        boolean is_im_infrastructure;
        boolean is_im_runtime;

        abstract void create_bmm_property_definition();

        abstract P_BMM_TYPE type_def();
    }

    class P_BMM_GENERIC_PARAMETER extends P_BMM_CLASSIFIER {
        String name;
        String conforms_to_type;
        BMM_GENERIC_PARAMETER bmm_generic_parameter;

        BMM_GENERIC_PARAMETER create_bmm_generic_parameter_definition();
    }

    abstract class P_BMM_TYPE extends P_BMM_CLASSIFIER {
        BMM_TYPE bmm_type;

        abstract void create_bmm_type(BMM_SCHEMA a_schema, BMM_CLASS a_class_def);
    }

    class P_BMM_CONTAINER_TYPE extends P_BMM_TYPE {
        P_BMM_TYPE type_def;
        String container_type;
        String type;

        P_BMM_TYPE type_ref();
    }

    class P_BMM_SIMPLE_TYPE extends P_BMM_TYPE {
        String type;
    }

    class P_BMM_SIMPLE_TYPE_OPEN extends P_BMM_TYPE {
        String type;
    }

    class P_BMM_GENERIC_TYPE extends P_BMM_TYPE {
        P_BMM_TYPE generic_parameter_defs;
        String root_type;
        String generic_parameters;

        void generic_parameter_refs();
    }

    class P_BMM_PACKAGE extends P_BMM_PACKAGE_CONTAINER {
        String name;
        String classes;

        void merge(P_BMM_PACKAGE other);
    }

    class P_BMM_PACKAGE_CONTAINER {
    }

    class P_BMM_CONTAINER_PROPERTY extends P_BMM_PROPERTY {
        P_BMM_CONTAINER_TYPE type_def;
        MULTIPLICITY_INTERVAL cardinality;
    }

    class P_BMM_SINGLE_PROPERTY extends P_BMM_PROPERTY {
        String type;

        P_BMM_SIMPLE_TYPE type_def();
    }

    class P_BMM_SINGLE_PROPERTY_OPEN extends P_BMM_PROPERTY {
        P_BMM_SIMPLE_TYPE_OPEN type_def;
        String type;
    }

    class P_BMM_GENERIC_PROPERTY extends P_BMM_PROPERTY {
        P_BMM_GENERIC_TYPE type_def;
}Message ChatGPT…
ChatGPT can
make mistakes.
Consider checking
important information.?
ChatGPT