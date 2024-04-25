package bmm2.core;

abstract class BMM_TYPE {
    abstract BMM_CLASS base_class();

    abstract boolean has_type_substitutions();

    abstract String type_substitutions();

    String as_display_type_string();
}abstract class BMM_CLASS extends BMM_TYPE {    BMM_CLASS ancestors;    BMM_PACKAGE package;    BMM_PROPERTY properties;    String name;    String source_schema_id;    String all_ancestors();    String all_descendants();    String suppliers();    String suppliers_non_primitive();    String supplier_closure();}

class BMM_PROPERTY {
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
}class BMM_ENUMERATION extends BMM_CLASS {    <G> G;}

class BMM_ENUMERATION_STRING extends BMM_ENUMERATION {
}

class BMM_ENUMERATION_INTEGER extends BMM_ENUMERATION {
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

class BMM_CLASSIFIER {
    abstract String type_category();

    String as_conformance_type_string();

    abstract String as_type_string();
}

class MULTIPLICITY_INTERVAL {
}

class BMM_CONTAINER_PROPERTY extends BMM_PROPERTY {
    BMM_CONTAINER_TYPE type;
    MULTIPLICITY_INTERVAL cardinality;

    String display_name();
}

class BMM_SCHEMA extends BMM_SCHEMA_CORE {
    BMM_CLASS class_definitions;

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

    void dp_recursive_packages(String action);
}

class BMM_GENERIC_CLASS extends BMM_CLASS {
    BMM_GENERIC_PARAMETER generic_parameters;
}