package bmm2.core;

abstract class BMM_TYPE {
    abstract BMM_CLASS base_class();

    abstract boolean has_type_substitutions();

    abstract String type_substitutions();

    String as_display_type_string();
}class BMM_CLASS {    public BMM_CLASS ancestors;    public BMM_PACKAGE package;    public BMM_PROPERTY properties;    public String name;    public String source_schema_id;    public String immediate_descendants;    public String all_ancestors();    public String all_descendants();    public String suppliers();    public String suppliers_non_primitive();    public String supplier_closure();}

class BMM_PROPERTY {
    public BMM_TYPE type;
    public String name;
    public boolean is_mandatory;
    public boolean is_computed;

    public MULTIPLICITY_INTERVAL existence();

    public String display_name();
}

class BMM_CONTAINER_TYPE extends BMM_TYPE {
    public BMM_CLASS container_class;
    public BMM_TYPE base_type;
}

class BMM_GENERIC_TYPE extends BMM_TYPE {
    public BMM_TYPE generic_parameters;
    public BMM_GENERIC_CLASS base_class;
}

class BMM_SIMPLE_TYPE extends BMM_TYPE {
    public BMM_CLASS base_class;
}

class BMM_SIMPLE_TYPE_OPEN extends BMM_TYPE {
    public BMM_GENERIC_PARAMETER type;
}

class BMM_ENUMERATION {
    public G G;
}

class BMM_ENUMERATION_STRING extends BMM_ENUMERATION {
}

class BMM_ENUMERATION_INTEGER extends BMM_ENUMERATION {
}

class BMM_PACKAGE {
    public BMM_CLASS classes;
    public String name;

    public BMM_CLASS root_classes();

    public String path();
}

class BMM_GENERIC_PARAMETER extends BMM_CLASSIFIER {
    public BMM_CLASS conforms_to_type;
    public BMM_GENERIC_PARAMETER inheritance_precursor;
    public String name;

    public String flattened_conforms_to_type();
}

abstract class BMM_CLASSIFIER {
    abstract String type_category();

    String as_conformance_type_string();

    abstract String as_type_string();
}

class MULTIPLICITY_INTERVAL {
}

class BMM_CONTAINER_PROPERTY extends BMM_PROPERTY {
    public BMM_CONTAINER_TYPE type;
    public String cardinality;

    public String display_name();
}

class BMM_SCHEMA {
    public BMM_CLASS class_definitions;

    public String primitive_types();

    public String enumeration_types();

    public BMM_CLASS class_definition(String a_name);

    public BMM_ENUMERATION enumeration(String a_name);

    public BMM_PROPERTY property_definition();

    public boolean ms_conformant_property_type();

    public BMM_PROPERTY property_definition_at_path();

    public String all_ancestor_classes(String a_class);

    public boolean type_conforms_to(String a_desc_type, String an_anc_type);
}

class BMM_SCHEMA_CORE extends BMM_CLASSIFIER {
    public String rm_publisher;
    public String rm_release;
    public String schema_name;
    public String schema_revision;
    public String schema_lifecycle_state;
    public String schema_author;
    public String schema_description;
    public String schema_contributors;
    public String archetype_parent_class;
    public String archetype_data_value_parent_class;
    public String archetype_rm_closure_packages;
    public String archetype_visualise_descendants_of;

    public String schema_id();
}

class BMM_PACKAGE_CONTAINER extends BMM_CLASSIFIER {
    public BMM_PACKAGE packages;

    public BMM_PACKAGE package_at_path();

    public void dp_recursive_packages(String action);
}

class BMM_GENERIC_CLASS extends BMM_CLASS {
    public BMM_GENERIC_PARAMETER generic_parameters;
}