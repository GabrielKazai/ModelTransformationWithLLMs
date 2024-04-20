abstract class BMM_TYPE {
    abstract BMM_TYPE base_class();

    abstract boolean has_type_substitutions();

    abstract List<String> type_substitutions();

    abstract String as_display_type_string();
}abstract class BMM_CLASS extends BMM_TYPE {    List<BMM_CLASS> ancestors;    BMM_PACKAGE package;    List<BMM_PROPERTY> properties;    String name;    String source_schema_id;    List<BMM_CLASS> immediate_descendants;    abstract List<String> all_ancestors();    abstract List<String> all_descendants();    abstract List<String> suppliers();    abstract List<String> suppliers_non_primitive();    abstract List<String> supplier_closure();}

class BMM_PROPERTY<T> extends BMM_TYPE {
    BMM_TYPE type;
    String name;
    boolean is_mandatory;
    boolean is_computed;

    abstract T existence();

    abstract String display_name();
}

abstract class BMM_CONTAINER_TYPE extends BMM_TYPE {
    BMM_CLASS container_class;
    BMM_TYPE base_type;
}

abstract class BMM_GENERIC_TYPE extends BMM_TYPE {
    List<BMM_TYPE> generic_parameters;
    BMM_CLASS base_class;
}

abstract class BMM_SIMPLE_TYPE extends BMM_TYPE {
    BMM_CLASS base_class;
}

abstract class BMM_SIMPLE_TYPE_OPEN extends BMM_TYPE {
    BMM_GENERIC_PARAMETER type;
}

abstract class BMM_ENUMERATION<G> extends BMM_TYPE {
}

abstract class BMM_ENUMERATION_STRING extends BMM_ENUMERATION<String> {
}

abstract class BMM_ENUMERATION_INTEGER extends BMM_ENUMERATION<Integer> {
}

abstract class BMM_PACKAGE extends BMM_TYPE {
    List<BMM_CLASS> classes;
    String name;

    abstract List<BMM_CLASS> root_classes();

    abstract String path();
}

abstract class BMM_GENERIC_PARAMETER extends BMM_TYPE {
    BMM_CLASS conforms_to_type;
    BMM_GENERIC_PARAMETER inheritance_precursor;
    String name;

    abstract String flattened_conforms_to_type();
}

abstract class BMM_CLASSIFIER extends BMM_TYPE {
    abstract String type_category();

    abstract String as_conformance_type_string();

    abstract String as_type_string();
}

abstract class BMM_CONTAINER_PROPERTY<T extends BMM_CONTAINER_TYPE> extends BMM_PROPERTY<T> {
    T type;

    abstract String display_name();
}

abstract class BMM_SCHEMA extends BMM_TYPE {
    List<BMM_CLASS> class_definitions;

    abstract String primitive_types();

    abstract String enumeration_types();

    abstract BMM_CLASS class_definition(String a_name);

    abstract BMM_ENUMERATION enumeration(String a_name);

    abstract BMM_PROPERTY property_definition();

    abstract boolean ms_conformant_property_type();

    abstract BMM_PROPERTY property_definition_at_path();

    abstract List<BMM_CLASS> all_ancestor_classes(BMM_CLASS a_class);

    abstract boolean type_conforms_to(String a_desc_type, String an_anc_type);
}

class BMM_SCHEMA_CORE extends BMM_TYPE {
    String rm_publisher;
    String rm_release;
    String schema_name;
    String schema_revision;
    String schema_lifecycle_state;
    String schema_author;
    String schema_description;
    List<String> schema_contributors;
    String archetype_parent_class;
    String archetype_data_value_parent_class;
    List<String> archetype_rm_closure_packages;
    String archetype_visualise_descendants_of;

    abstract String schema_id();
}

abstract class BMM_PACKAGE_CONTAINER extends BMM_TYPE {
    List<BMM_PACKAGE> packages;

    abstract BMM_PACKAGE package_at_path();

    abstract void dp_recursive_packages(String action);
}

abstract class BMM_GENERIC_CLASS extends BMM_CLASS {
    List<BMM_GENERIC_PARAMETER> generic_parameters;
}

class P_BMM_CLASS extends BMM_CLASS {
    List<BMM_PROPERTY> properties;
    List<BMM_GENERIC_PARAMETER> generic_parameter_defs;
    int uid;
    String ancestors;
    boolean is_abstract;
    boolean is_override;

    abstract boolean is_generic();

    abstract void create_bmm_class_definition();

    abstract void populate_bmm_class_definition();
}

class P_BMM_ENUMERATION<T> extends BMM_ENUMERATION<T> {
    List<String> item_names;
    List<T> item_values;
}

class P_BMM_SCHEMA extends BMM_SCHEMA {
    List<P_BMM_CLASS> primitive_types;
    List<P_BMM_CLASS> class_definitions;
    List<P_BMM_PACKAGE> canonical_packages;
    String bmm_version;
    int state;
    BMM_SCHEMA bmm_schema;

    abstract void validate_created();

    abstract void load_finalise();

    abstract void merge(P_BMM_SCHEMA other);

    abstract void validate();

    abstract void create_bmm_schema();
}

abstract class P_BMM_CLASSIFIER extends BMM_CLASSIFIER {
}

abstract class P_BMM_PROPERTY extends BMM_PROPERTY<BMM_PROPERTY> {
    String name;
    boolean is_mandatory;
    boolean is_computed;
    BMM_PROPERTY bmm_property_definition;
    boolean is_im_infrastructure;
    boolean is_im_runtime;

    abstract void create_bmm_property_definition();

    abstract P_BMM_TYPE type_def();
}

abstract class P_BMM_GENERIC_PARAMETER extends P_BMM_CLASSIFIER {
    String name;
    String conforms_to_type;
    BMM_GENERIC_PARAMETER bmm_generic_parameter;

    abstract void create_bmm_generic_parameter_definition();
}

abstract class P_BMM_TYPE extends BMM_TYPE {
    BMM_TYPE bmm_type;

    abstract void create_bmm_type(BMM_SCHEMA a_schema, BMM_CLASS a_class_def);
}

abstract class P_BMM_CONTAINER_TYPE extends P_BMM_TYPE {
    P_BMM_TYPE type_def;
    String container_type;
    String type;

    abstract P_BMM_TYPE type_ref();
}

class P_BMM_SIMPLE_TYPE extends BMM_SIMPLE_TYPE {
    String type;
}

class P_BMM_SIMPLE_TYPE_OPEN extends BMM_SIMPLE_TYPE_OPEN {
    String type;
}

class P_BMM_GENERIC_TYPE extends BMM_GENERIC_TYPE {
    List<P_BMM_TYPE> generic_parameter_defs;
    String root_type;
    List<String> generic_parameters;

    abstract void generic_parameter_refs();
}

class P_BMM_PACKAGE extends BMM_PACKAGE {
    String name;
    List<P_BMM_CLASS> classes;

    abstract void merge(P_BMM_PACKAGE other);
}

class P_BMM_PACKAGE_CONTAINER extends BMM_PACKAGE_CONTAINER {
}

class P_BMM_CONTAINER_PROPERTY extends BMM_CONTAINER_PROPERTY<P_BMM_CONTAINER_TYPE> {
    P_BMM_CONTAINER_TYPE type_def;
    String cardinality;
}

class P_BMM_SINGLE_PROPERTY extends P_BMM_PROPERTY {
    String type;

    abstract P_BMM_SIMPLE_TYPE type_def();
}

class P_BMM_SINGLE_PROPERTY_OPEN extends P_BMM_PROPERTY {
    P_BMM_SIMPLE_TYPE type_def;
    String type;

    abstract P_BMM_SIMPLE_TYPE type_def();
}

class P_BMM_GENERIC_PROPERTY extends P_BMM_PROPERTY {
    P_BMM_GENERIC_TYPE type_def;
}

class P_BMM_ENUMERATION_INTEGER extends P_BMM_ENUMERATION<Integer> {
}

class P_BMM_ENUMERATION_STRING extends P_BMM_ENUMERATION<String> {
}