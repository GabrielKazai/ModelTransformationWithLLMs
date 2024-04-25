package bmm2.core;

abstract class BMM_TYPE extends BMM_CLASSIFIER {
    abstract BMM_CLASS base_class();

    abstract boolean has_type_substitutions();

    abstract String[] type_substitutions();

    abstract String as_display_type_string();
}class BMM_CLASS extends BMM_CLASSIFIER {    BMM_CLASS[] ancestors;    BMM_PACKAGE package;    BMM_PROPERTY[] properties;    String name;    String source_schema_id;    abstract String[] all_ancestors();    abstract String[] all_descendants();    abstract String[] suppliers();    abstract String[] suppliers_non_primitive();    abstract String[] supplier_closure();}

class BMM_PROPERTY {
    BMM_TYPE type;
    String name;
    boolean is_mandatory;
    boolean is_computed;

    abstract MULTIPLICITY_INTERVAL existence();

    abstract String display_name();
}

class BMM_CONTAINER_TYPE extends BMM_TYPE {
    BMM_CLASS container_class;
    BMM_TYPE base_type;
}

class BMM_GENERIC_TYPE extends BMM_TYPE {
    BMM_TYPE[] generic_parameters;
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
    BMM_CLASS[] classes;
    String name;

    abstract BMM_CLASS[] root_classes();

    abstract String path();
}

class BMM_GENERIC_PARAMETER extends BMM_CLASSIFIER {
    BMM_CLASS conforms_to_type;
    BMM_GENERIC_PARAMETER inheritance_precursor;
    String name;

    abstract String flattened_conforms_to_type();
}

abstract class BMM_CLASSIFIER {
    abstract String type_category();

    abstract String as_conformance_type_string();

    abstract String as_type_string();
}

class MULTIPLICITY_INTERVAL {
}

class BMM_CONTAINER_PROPERTY extends BMM_PROPERTY {
    BMM_CONTAINER_TYPE type;
    MULTIPLICITY_INTERVAL cardinality;

    abstract String display_name();
}

class BMM_SCHEMA extends BMM_SCHEMA_CORE {
    BMM_CLASS[] class_definitions;

    abstract String[] primitive_types();

    abstract String[] enumeration_types();

    abstract BMM_CLASS class_definition(String a_name);

    abstract BMM_ENUMERATION enumeration(String a_name);

    abstract BMM_PROPERTY property_definition();

    abstract boolean ms_conformant_property_type();

    abstract BMM_PROPERTY property_definition_at_path();

    abstract String[] all_ancestor_classes(BMM_CLASS a_class);

    abstract boolean type_conforms_to(BMM_CLASS a_desc_type, BMM_CLASS an_anc_type);
}

class BMM_SCHEMA_CORE {
    String rm_publisher;
    String rm_release;
    String schema_name;
    String schema_revision;
    String schema_lifecycle_state;
    String schema_author;
    String schema_description;
    String[] schema_contributors;
    String archetype_parent_class;
    String archetype_data_value_parent_class;
    String[] archetype_rm_closure_packages;
    String archetype_visualise_descendants_of;

    abstract String schema_id();
}

class BMM_PACKAGE_CONTAINER {
    BMM_PACKAGE[] packages;

    abstract BMM_PACKAGE package_at_path();

    abstract void dp_recursive_packages(String action);
}

class BMM_GENERIC_CLASS extends BMM_CLASS {
    BMM_GENERIC_PARAMETER[] generic_parameters;
}