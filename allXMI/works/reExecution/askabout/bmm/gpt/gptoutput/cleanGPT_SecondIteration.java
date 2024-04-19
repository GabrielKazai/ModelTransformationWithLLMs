package bmm2.core;

abstract class BMM_TYPE extends BMM_CLASSIFIER {
    abstract BMM_CLASS base_class();

    abstract boolean has_type_substitutions();

    abstract String[] type_substitutions();

    String as_display_type_string() {
        return "";
    }
}class BMM_CLASS extends BMM_TYPE {    public BMM_CLASS[] ancestors;    public BMM_PACKAGE package;    public BMM_PROPERTY[] properties;    public String name;    public String source_schema_id;    public String[] immediate_descendants;    public String[] all_ancestors() {        return new String[0];    }    public String[] all_descendants() {        return new String[0];    }    public String[] suppliers() {        return new String[0];    }    public String[] suppliers_non_primitive() {        return new String[0];    }    public String[] supplier_closure() {        return new String[0];    }}

class BMM_PROPERTY {
    public BMM_TYPE type;
    public String name;
    public boolean is_mandatory;
    public boolean is_computed;

    public MULTIPLICITY_INTERVAL existence() {
        return new MULTIPLICITY_INTERVAL();
    }

    public String display_name() {
        return "";
    }
}

class BMM_CONTAINER_TYPE extends BMM_TYPE {
    public BMM_CLASS container_class;
    public BMM_TYPE base_type;
}

class BMM_GENERIC_TYPE extends BMM_TYPE {
    public BMM_TYPE[] generic_parameters;
    public BMM_GENERIC_CLASS base_class;
}

class BMM_SIMPLE_TYPE extends BMM_TYPE {
    public BMM_CLASS base_class;
}

class BMM_SIMPLE_TYPE_OPEN extends BMM_TYPE {
    public BMM_GENERIC_PARAMETER type;
}

class BMM_ENUMERATION extends BMM_CLASS {
public Object G;
// Generic type placeholder}class BMM_ENUMERATION_STRING extends BMM_ENUMERATION
// {}class BMM_ENUMERATION_INTEGER extends BMM_ENUMERATION {}class BMM_PACKAGE
// extends BMM_PACKAGE_CONTAINER { public BMM_CLASS[] classes; public String
// name; public BMM_CLASS[] root_classes() { return new BMM_CLASS[0]; } public
// String path() { return ""; }}class BMM_GENERIC_PARAMETER extends
// BMM_CLASSIFIER { public BMM_CLASS conforms_to_type; public
// BMM_GENERIC_PARAMETER inheritance_precursor; public String name; public
// String flattened_conforms_to_type() { return ""; }}abstract class
// BMM_CLASSIFIER { abstract String type_category(); String
// as_conformance_type_string() { return ""; } abstract String
// as_type_string();}class MULTIPLICITY_INTERVAL {}class BMM_CONTAINER_PROPERTY
// extends BMM_PROPERTY { public BMM_CONTAINER_TYPE type; public String
// cardinality; public String display_name() { return ""; }}class BMM_SCHEMA {
// public BMM_CLASS[] class_definitions; public String[] primitive_types() {
// return new String[0]; } public String[] enumeration_types() { return new
// String[0]; } public BMM_CLASS class_definition(String a_name) { return new
// BMM_CLASS(); } public BMM_ENUMERATION enumeration(String a_name) { return new
// BMM_ENUMERATION(); } public BMM_PROPERTY property_definition() { return new
// BMM_PROPERTY(); } public boolean ms_conformant_property_type() { return
// false; } public BMM_PROPERTY property_definition_at_path() { return new
// BMM_PROPERTY(); } public String[] all_ancestor_classes(String a_class) {
// return new String[0]; } public boolean type_conforms_to(String a_desc_type,
// String an_anc_type) { return false; }}class BMM_SCHEMA_CORE extends
// BMM_CLASSIFIER { public String rm_publisher; public String rm_release; public
// String schema_name; public String schema_revision; public String
// schema_lifecycle_state; public String schema_author; public String
// schema_description; public String[] schema_contributors; public String
// archetype_parent_class; public String archetype_data_value_parent_class;
// public String[] archetype_rm_closure_packages; public String
// archetype_visualise_descendants_of; public String schema_id() { return "";
// }}class BMM_PACKAGE_CONTAINER extends BMM_CLASSIFIER { public BMM_PACKAGE[]
// packages; public BMM_PACKAGE package_at_path() { return new BMM_PACKAGE(); }
// public void dp_recursive_packages(String action) { }}class BMM_GENERIC_CLASS
// extends BMM_CLASS { public BMM_GENERIC_PARAMETER[] generic_parameters;}