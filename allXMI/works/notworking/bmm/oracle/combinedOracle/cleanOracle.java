
abstract class BMM_TYPE extends BMM_CLASSIFIER {
    public abstract BMM_CLASS base_class();

    public abstract boolean has_type_substitutions();

    public abstract List<String> type_substitutions();

    public String as_display_type_string() {
        // TODO Auto-generated return
        return null;
    }

}


class BMM_CLASS extends BMM_CLASSIFIER {
    public String name;

    public String source_schema_id;

    public String[] immediate_descendants;

    public List<BMM_CLASS> ancestors = new ArrayList<BMM_CLASS> ();

    public BMM_PACKAGE package;

    public List<BMM_PROPERTY> properties = new ArrayList<BMM_PROPERTY> ();

    public List<String> all_ancestors() {
        // TODO Auto-generated return
        return null;
    }

    public List<String> all_descendants() {
        // TODO Auto-generated return
        return null;
    }

    public List<String> suppliers() {
        // TODO Auto-generated return
        return null;
    }

    public List<String> suppliers_non_primitive() {
        // TODO Auto-generated return
        return null;
    }

    public List<String> supplier_closure() {
        // TODO Auto-generated return
        return null;
    }

}


class BMM_PROPERTY {
    public String name;

    public Boolean is_mandatory;

    public Boolean is_computed;

    public BMM_TYPE type;

    public MULTIPLICITY_INTERVAL existence() {
        // TODO Auto-generated return
        return null;
    }

    public String display_name() {
        // TODO Auto-generated return
        return null;
    }

    public void () {
    }

}


class BMM_CONTAINER_TYPE extends BMM_TYPE {
    public BMM_CLASS container_class;

    public BMM_TYPE base_type;

}


class BMM_GENERIC_TYPE extends BMM_TYPE {
    public List<BMM_TYPE> generic_parameters = new ArrayList<BMM_TYPE> ();

    public BMM_GENERIC_CLASS base_class;

}


class BMM_SIMPLE_TYPE extends BMM_TYPE {
    public BMM_CLASS base_class;

}


class BMM_SIMPLE_TYPE_OPEN extends BMM_TYPE {
    public BMM_GENERIC_PARAMETER type;

}


class BMM_ENUMERATION extends BMM_CLASS {
    public void () {
    }

}


class BMM_ENUMERATION_STRING extends BMM_ENUMERATION {
}


class BMM_ENUMERATION_INTEGER extends BMM_ENUMERATION {
}


class BMM_PACKAGE extends BMM_PACKAGE_CONTAINER {
    public String name;

    public List<BMM_CLASS> classes = new ArrayList<BMM_CLASS> ();

    public List<BMM_CLASS> root_classes() {
        // TODO Auto-generated return
        return null;
    }

    public String path() {
        // TODO Auto-generated return
        return null;
    }

}


class BMM_GENERIC_PARAMETER extends BMM_CLASSIFIER {
    public String name;

    public BMM_CLASS conforms_to_type;

    private BMM_GENERIC_PARAMETER ;

    public BMM_GENERIC_PARAMETER inheritance_precursor;

    public String flattened_conforms_to_type() {
        // TODO Auto-generated return
        return null;
    }

}


abstract class BMM_CLASSIFIER {
    public abstract String type_category();

    public String as_conformance_type_string() {
        // TODO Auto-generated return
        return null;
    }

    public abstract String as_type_string();

}


class MULTIPLICITY_INTERVAL {
}


class BMM_CONTAINER_PROPERTY extends BMM_PROPERTY {
    public MULTIPLICITY_INTERVAL cardinality;

    public BMM_CONTAINER_TYPE type;

    public String display_name() {
        // TODO Auto-generated return
        return null;
    }

}


class BMM_SCHEMA_CORE {
    public String rm_publisher;

    public String rm_release;

    public String schema_name;

    public String schema_revision;

    public String schema_lifecycle_state;

    public String schema_author;

    public String schema_description;

    public String[] schema_contributors;

    public String archetype_parent_class;

    public String archetype_data_value_parent_class;

    public String[] archetype_rm_closure_packages;

    public String archetype_visualise_descendants_of;

    public String schema_id() {
        // TODO Auto-generated return
        return null;
    }

}


class BMM_GENERIC_CLASS extends BMM_CLASS {
    public List<BMM_GENERIC_PARAMETER> generic_parameters = new ArrayList<BMM_GENERIC_PARAMETER> ();

}


class P_BMM_CLASS extends P_BMM_CLASSIFIER {
    public int uid;

    private String name;

    public String[] ancestors;

    public Boolean is_abstract;

    public Boolean is_override;

    public String source_schema_id;

    public List<P_BMM_PROPERTY> properties = new ArrayList<P_BMM_PROPERTY> ();

    public List<P_BMM_GENERIC_PARAMETER> generic_parameter_defs = new ArrayList<P_BMM_GENERIC_PARAMETER> ();

    public boolean is_generic() {
        // TODO Auto-generated return
        return false;
    }

    public void create_bmm_class_definition() {
    }

    public void populate_bmm_class_definition() {
    }

}


class P_BMM_ENUMERATION extends P_BMM_CLASS {
    public String item_names;

    public T[] item_values;

    public void () {
    }

}


class P_BMM_SCHEMA extends P_BMM_PACKAGE_CONTAINER {
    public String bmm_version;

    public int state;

    public BMM_SCHEMA bmm_schema;

    public List<P_BMM_CLASS> primitive_types = new ArrayList<P_BMM_CLASS> ();

    public List<P_BMM_CLASS> class_definitions = new ArrayList<P_BMM_CLASS> ();

    public List<P_BMM_PACKAGE> canonical_packages = new ArrayList<P_BMM_PACKAGE> ();

    public void validate_created() {
    }

    public void load_finalise() {
    }

    public void merge(final P_BMM_SCHEMA other) {
    }

    public void validate() {
    }

    public void create_bmm_schema() {
    }

}


abstract class P_BMM_CLASSIFIER {
}


abstract class P_BMM_PROPERTY {
    public String name;

    public Boolean is_mandatory;

    public Boolean is_computed;

    public BMM_PROPERTY bmm_property_definition;

    public Boolean is_im_infrastructure;

    public Boolean is_im_runtime;

    public abstract void create_bmm_property_definition();

    public abstract P_BMM_TYPE type_def();

}


class P_BMM_GENERIC_PARAMETER extends P_BMM_CLASSIFIER {
    public String name;

    public String conforms_to_type;

    public BMM_GENERIC_PARAMETER bmm_generic_parameter;

    public BMM_GENERIC_PARAMETER create_bmm_generic_parameter_definition() {
        // TODO Auto-generated return
        return null;
    }

}


abstract class P_BMM_TYPE extends P_BMM_CLASSIFIER {
    public BMM_TYPE bmm_type;

    public abstract void create_bmm_type(final BMM_SCHEMA a_schema, final BMM_CLASS a_class_def);

}


class P_BMM_CONTAINER_TYPE extends P_BMM_TYPE {
    public String container_type;

    public String type;

    public P_BMM_TYPE type_def;

    public P_BMM_TYPE type_ref() {
        // TODO Auto-generated return
        return null;
    }

}


class P_BMM_SIMPLE_TYPE extends P_BMM_TYPE {
    public String type;

}


class P_BMM_SIMPLE_TYPE_OPEN extends P_BMM_TYPE {
    public String type;

}


class P_BMM_GENERIC_TYPE extends P_BMM_TYPE {
    public String root_type;

    public String[] generic_parameters;

    public List<P_BMM_TYPE> generic_parameter_defs = new ArrayList<P_BMM_TYPE> ();

    public void generic_parameter_refs() {
    }

}


class P_BMM_PACKAGE extends P_BMM_PACKAGE_CONTAINER {
    public String name;

    public String[] classes;

    public void merge(final P_BMM_PACKAGE other) {
    }

}


class P_BMM_PACKAGE_CONTAINER {
}


class P_BMM_SINGLE_PROPERTY extends P_BMM_PROPERTY {
    public String type;

    public P_BMM_SIMPLE_TYPE type_def() {
        // TODO Auto-generated return
        return null;
    }

}


class P_BMM_SINGLE_PROPERTY_OPEN extends P_BMM_PROPERTY {
    public String type;

    public P_BMM_SIMPLE_TYPE_OPEN type_def;

    public P_BMM_SIMPLE_TYPE_OPEN type_def() {
        // TODO Auto-generated return
        return null;
    }

}


class P_BMM_GENERIC_PROPERTY extends P_BMM_PROPERTY {
    public P_BMM_GENERIC_TYPE type_def;

}


class P_BMM_ENUMERATION_INTEGER {
}


class P_BMM_ENUMERATION_STRING {
}


class P_BMM_SCHEMA extends P_BMM_PACKAGE_CONTAINER {
    public String bmm_version;

    public int state;

    public BMM_SCHEMA bmm_schema;

    public List<P_BMM_CLASS> primitive_types = new ArrayList<P_BMM_CLASS> ();

    public List<P_BMM_CLASS> class_definitions = new ArrayList<P_BMM_CLASS> ();

    public List<P_BMM_PACKAGE> canonical_packages = new ArrayList<P_BMM_PACKAGE> ();

    public void validate_created() {
    }

    public void load_finalise() {
    }

    public void merge(final P_BMM_SCHEMA other) {
    }

    public void validate() {
    }

    public void create_bmm_schema() {
    }

}


public class T {
}
