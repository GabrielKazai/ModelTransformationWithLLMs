import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c728a440-514d-4dc1-893f-681edd81cfda")
abstract class BMM_TYPE extends BMM_CLASSIFIER {
    @objid ("2850be56-4c31-4103-8b79-dbe3a4e8257c")
    public abstract BMM_CLASS base_class();

    @objid ("abdd8613-c747-415b-9027-d4f42d07218d")
    public abstract boolean has_type_substitutions();

    @objid ("9f169dbb-7b68-4ca5-b3a6-c05fb55ebba1")
    public abstract List<String> type_substitutions();

    @objid ("da49b331-879a-493c-aa6a-e25280e9770d")
    public String as_display_type_string() {
        // TODO Auto-generated return
        return null;
    }

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7975e44e-1224-4b1e-92cc-27590f5fb78f")
class BMM_CLASS extends BMM_CLASSIFIER {
    @objid ("6ec856fa-ff3d-4268-b47c-a515de14d30a")
    public String name;

    @objid ("b227e23c-c299-4b73-9ac9-1811b0545630")
    public String source_schema_id;

    @objid ("e07b1455-5b9e-4e00-82c5-854479ea1550")
    public String[] immediate_descendants;

    @objid ("9b3aab49-22d0-4fd5-be7f-9a3b8c630f50")
    public List<BMM_CLASS> ancestors = new ArrayList<BMM_CLASS> ();

    @objid ("26784c6e-2c2b-460b-9331-5164846a2991")
    public BMM_PACKAGE package;

    @objid ("16ca734c-cb32-4757-babe-4c8a36720c28")
    public List<BMM_PROPERTY> properties = new ArrayList<BMM_PROPERTY> ();

    @objid ("76f6a1f4-2b58-4dad-a6c5-16f28854ef28")
    public List<String> all_ancestors() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("e2dda828-1c3e-4136-99b7-55580d090ec8")
    public List<String> all_descendants() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("d411b4fb-8c94-4094-bbe1-56d382d4746f")
    public List<String> suppliers() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("0e7e0fbb-0d1a-47be-af40-98100ab0eabb")
    public List<String> suppliers_non_primitive() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("457c7e36-52bf-4b46-ab1f-0ea3b1d72f75")
    public List<String> supplier_closure() {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b02a1328-fe19-43f6-8544-61a7684943e7")
class BMM_PROPERTY {
    @objid ("6cad63db-fac4-42a2-9e77-a059845fa0b2")
    public String name;

    @objid ("ce5a0d93-d89f-4fbf-aa82-859c07039b3e")
    public Boolean is_mandatory;

    @objid ("3ff9a632-c23a-43ae-a659-df9befd0deb2")
    public Boolean is_computed;

    @objid ("0cb584f6-8d96-4723-aec2-3bb75adbaa0a")
    public BMM_TYPE type;

    @objid ("ae029b08-5b42-465a-98f4-08e7a424e62f")
    public MULTIPLICITY_INTERVAL existence() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("4362f1f5-391d-4fce-93eb-1a7e6cf919c2")
    public String display_name() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("2ac27dff-c051-4350-9e28-47feaf4e2708")
    public void () {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b7933565-0a7e-4fe5-b5fe-13ddb5397cdd")
class BMM_CONTAINER_TYPE extends BMM_TYPE {
    @objid ("1d49a7b2-7460-42fe-8900-981e89b4b7bc")
    public BMM_CLASS container_class;

    @objid ("2d63657f-73af-4a4e-a849-a6fa0c526f21")
    public BMM_TYPE base_type;

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("31619257-2114-478b-b69b-f5c979574d4a")
class BMM_GENERIC_TYPE extends BMM_TYPE {
    @objid ("9d133e20-7f19-4fde-b335-f9727b0d7a35")
    public List<BMM_TYPE> generic_parameters = new ArrayList<BMM_TYPE> ();

    @objid ("81422845-559a-443d-9337-a57aeafa3e75")
    public BMM_GENERIC_CLASS base_class;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ed3a5548-fe21-4c62-a65e-4b91a0f40735")
class BMM_SIMPLE_TYPE extends BMM_TYPE {
    @objid ("573d26dd-56ca-4a08-8fab-8175c139c657")
    public BMM_CLASS base_class;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("85bc4fe5-ad64-49a1-a23f-2ea80f689824")
class BMM_SIMPLE_TYPE_OPEN extends BMM_TYPE {
    @objid ("32aa93cd-9b3f-4547-af55-bd4f0b45bdaf")
    public BMM_GENERIC_PARAMETER type;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("91707997-a156-4cf8-947a-f5edfbf1995a")
class BMM_ENUMERATION extends BMM_CLASS {
    @objid ("0151cfeb-45e0-470f-a0dc-c7481cbe2569")
    public void () {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e599017e-8102-470f-b798-eff7ba9727b4")
class BMM_ENUMERATION_STRING extends BMM_ENUMERATION {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("56f74500-7df8-48fc-bb4d-137c8f5e4f8c")
class BMM_ENUMERATION_INTEGER extends BMM_ENUMERATION {
}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("caad2963-7a32-4e31-8612-3f056841eeb4")
class BMM_PACKAGE extends BMM_PACKAGE_CONTAINER {
    @objid ("a2153959-cb9d-40f0-98a7-f801cf0a9104")
    public String name;

    @objid ("bb5b6e94-31b6-414e-9747-846d3dda804a")
    public List<BMM_CLASS> classes = new ArrayList<BMM_CLASS> ();

    @objid ("c617d504-129a-4ccb-9c14-49e2c1c230e2")
    public List<BMM_CLASS> root_classes() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("e808e74d-e441-4252-abb2-1f6739ee1baf")
    public String path() {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("10410793-23cc-4a03-a3f7-2b8705d825a2")
class BMM_GENERIC_PARAMETER extends BMM_CLASSIFIER {
    @objid ("0abff135-87db-4756-9288-118992fd9dad")
    public String name;

    @objid ("9030df66-69d4-40eb-bc6b-0bbefe5b2258")
    public BMM_CLASS conforms_to_type;

    @objid ("503c81f7-5b5e-460b-a859-023e29215b24")
    private BMM_GENERIC_PARAMETER ;

    @objid ("2075b6d6-6904-476f-8c1a-6ec3017d86ce")
    public BMM_GENERIC_PARAMETER inheritance_precursor;

    @objid ("a7d748ed-0909-45c5-92ed-4d7efdfdb296")
    public String flattened_conforms_to_type() {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d6ffab25-90c4-4f66-8cf4-d568b2966410")
abstract class BMM_CLASSIFIER {
    @objid ("be25aec1-df18-4e8b-9cfc-b2516ce6f530")
    public abstract String type_category();

    @objid ("6d80a00a-e73d-4a05-a8f4-600527d12df8")
    public String as_conformance_type_string() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("7b16916e-b3d0-4fb6-85e7-c4e1be554292")
    public abstract String as_type_string();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("faf0a2b0-6d07-40ed-b200-93272fecc2f6")
class MULTIPLICITY_INTERVAL {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("783f9aa6-15a7-4d06-92f7-1e56c7ab3c47")
class BMM_CONTAINER_PROPERTY extends BMM_PROPERTY {
    @objid ("bcfbb38a-485a-4243-a865-77a78ed7f328")
    public MULTIPLICITY_INTERVAL cardinality;

    @objid ("c5751e0e-32ec-439d-8893-c26c927032d6")
    public BMM_CONTAINER_TYPE type;

    @objid ("5cb9f1ca-168e-4290-81cd-02cf65528235")
    public String display_name() {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0ced988f-559a-47e1-a122-7e1de3d2b0c3")
class BMM_SCHEMA_CORE {
    @objid ("1757e069-022d-410b-a24c-07795049212b")
    public String rm_publisher;

    @objid ("82fda281-5d2a-4f13-9d01-e346220a518f")
    public String rm_release;

    @objid ("3f9f4c93-5bc7-4666-a614-5574e7fc2281")
    public String schema_name;

    @objid ("2e26f48c-a13d-4fae-8e6a-87f149a2dca2")
    public String schema_revision;

    @objid ("b2e4df1f-59c6-4a70-9db5-da569e693752")
    public String schema_lifecycle_state;

    @objid ("c5d7857b-752a-44ae-8423-a49db344a99c")
    public String schema_author;

    @objid ("99954305-549d-4e0c-a387-017bded0913a")
    public String schema_description;

    @objid ("9f9af48e-ba83-42f6-8efe-0833a6e57282")
    public String[] schema_contributors;

    @objid ("e64efdc1-afdf-4f23-9142-b4560a5a6806")
    public String archetype_parent_class;

    @objid ("edfc1322-4db2-463a-ace2-23ba60d400c9")
    public String archetype_data_value_parent_class;

    @objid ("23e42e3c-845e-43b2-9b99-803bdb8b9bfa")
    public String[] archetype_rm_closure_packages;

    @objid ("e344c4ba-8bec-4cff-82bb-6609667450a0")
    public String archetype_visualise_descendants_of;

    @objid ("e4fbaa52-14dc-4c26-8d5e-41f41e7e7937")
    public String schema_id() {
        // TODO Auto-generated return
        return null;
    }

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("87888dbb-7a2f-4f4e-8135-e01366139084")
class BMM_GENERIC_CLASS extends BMM_CLASS {
    @objid ("381e199c-d73d-4457-830a-8f4858cea5f8")
    public List<BMM_GENERIC_PARAMETER> generic_parameters = new ArrayList<BMM_GENERIC_PARAMETER> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c274f534-f607-44b6-a559-d14d8d0991eb")
class P_BMM_CLASS extends P_BMM_CLASSIFIER {
    @objid ("001283bd-1da5-4746-842a-8bd8ae85189e")
    public int uid;

    @objid ("29766d5a-0847-446b-9005-c62843e12a23")
    private String name;

    @objid ("e19716c2-4358-47b5-9b7b-ad4b474cb3cc")
    public String[] ancestors;

    @objid ("bcf92735-88c9-4d79-a63f-b8664ba3ca6b")
    public Boolean is_abstract;

    @objid ("2dd64ca0-06f5-4bc3-96fe-508cae3ce304")
    public Boolean is_override;

    @objid ("826df87c-63c9-4a0d-bd53-8732c56f41dd")
    public String source_schema_id;

    @objid ("daac5c2a-0df8-4e3d-be84-9335be315110")
    public List<P_BMM_PROPERTY> properties = new ArrayList<P_BMM_PROPERTY> ();

    @objid ("6ceb97a9-50b2-4fd3-ab53-707203d5a256")
    public List<P_BMM_GENERIC_PARAMETER> generic_parameter_defs = new ArrayList<P_BMM_GENERIC_PARAMETER> ();

    @objid ("e0531d02-8115-4aee-9b84-5fca788a7576")
    public boolean is_generic() {
        // TODO Auto-generated return
        return false;
    }

    @objid ("0577a987-c501-44c3-bab4-4156a41c893a")
    public void create_bmm_class_definition() {
    }

    @objid ("92de45bf-e580-4b7b-be51-a2175b3b1a0d")
    public void populate_bmm_class_definition() {
    }

}

import T;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1334e26a-41da-4f49-971e-e92299ad2555")
class P_BMM_ENUMERATION extends P_BMM_CLASS {
    @objid ("3472f881-3559-4d05-b52a-e92b1d2df707")
    public String item_names;

    @objid ("def97f15-9557-4cbc-89b3-5315139f2e6c")
    public T[] item_values;

    @objid ("23489c4c-7f17-44da-b312-da1843217b31")
    public void () {
    }

}

import java.util.ArrayList;
import java.util.List;
import P_BMM_SCHEMA;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("edc3703c-853e-4acf-a676-541cf8b282fe")
class P_BMM_SCHEMA extends P_BMM_PACKAGE_CONTAINER {
    @objid ("785b562d-a859-499c-8b6a-0e9b7795ab70")
    public String bmm_version;

    @objid ("42bf17a5-dccb-4b7e-979e-600986a3d081")
    public int state;

    @objid ("c9860c74-0616-4f74-b5a5-6b58c1da6a3c")
    public BMM_SCHEMA bmm_schema;

    @objid ("0f8b9b22-a3f5-49e0-8bdb-62b8d0610f15")
    public List<P_BMM_CLASS> primitive_types = new ArrayList<P_BMM_CLASS> ();

    @objid ("5574b31d-305a-4e5c-a09f-c56aaec0139d")
    public List<P_BMM_CLASS> class_definitions = new ArrayList<P_BMM_CLASS> ();

    @objid ("fe3bf43f-3036-45b5-9c7f-4cff974a58e8")
    public List<P_BMM_PACKAGE> canonical_packages = new ArrayList<P_BMM_PACKAGE> ();

    @objid ("cc7e0aa2-f854-4125-b37f-a11c05e79ae8")
    public void validate_created() {
    }

    @objid ("857b2bc2-e88d-46e2-90f8-4c894d742502")
    public void load_finalise() {
    }

    @objid ("96459788-4d62-4964-9e4a-9a2cc2043278")
    public void merge(final P_BMM_SCHEMA other) {
    }

    @objid ("dd2fa403-9819-45ff-ae1c-de7f3b931fd4")
    public void validate() {
    }

    @objid ("3f8f7aca-9f74-4ce9-accf-a74848b1da8c")
    public void create_bmm_schema() {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("69d25743-38be-4dc8-b6bf-581705bc956d")
abstract class P_BMM_CLASSIFIER {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("15640e52-2c58-465d-8f91-78bfbce1331d")
abstract class P_BMM_PROPERTY {
    @objid ("a8ebe418-de56-4b55-bcb0-8983ea150a5d")
    public String name;

    @objid ("7ea959ba-0f87-4c6e-9b62-b31659c1e043")
    public Boolean is_mandatory;

    @objid ("de244753-0914-4caa-96e4-fa3b8834bb46")
    public Boolean is_computed;

    @objid ("a6f875b0-7b4a-4e4c-862e-285d8b0dabd9")
    public BMM_PROPERTY bmm_property_definition;

    @objid ("e38e9091-67ec-41bb-8ebc-a2c2e11a8188")
    public Boolean is_im_infrastructure;

    @objid ("35eafdf6-5ce0-4ff1-9c64-34a00406b8a0")
    public Boolean is_im_runtime;

    @objid ("a4d152c6-0334-4a3a-83df-e38feda41a43")
    public abstract void create_bmm_property_definition();

    @objid ("b58160cf-1ea1-4489-9282-7057570b3a9d")
    public abstract P_BMM_TYPE type_def();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a8c700ab-c30c-489f-a0b8-03cb6daee6b9")
class P_BMM_GENERIC_PARAMETER extends P_BMM_CLASSIFIER {
    @objid ("67de95d0-d4dd-4fd3-a2c7-c8700f2505eb")
    public String name;

    @objid ("f8cd14b9-5a87-45c9-b5b8-dc38a67edee7")
    public String conforms_to_type;

    @objid ("4537c005-6a18-448f-b501-15982ad063be")
    public BMM_GENERIC_PARAMETER bmm_generic_parameter;

    @objid ("751e67f9-745d-4294-a1c4-31f62d22a3cf")
    public BMM_GENERIC_PARAMETER create_bmm_generic_parameter_definition() {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2913b449-b330-47c5-8d3a-fd1913ec0f5a")
abstract class P_BMM_TYPE extends P_BMM_CLASSIFIER {
    @objid ("61e61d51-ef03-4b16-adf1-f43889140714")
    public BMM_TYPE bmm_type;

    @objid ("9b3606e5-cee9-4229-bbf2-85124f253152")
    public abstract void create_bmm_type(final BMM_SCHEMA a_schema, final BMM_CLASS a_class_def);

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0954b2ec-2e80-459c-980b-beb0060cab03")
class P_BMM_CONTAINER_TYPE extends P_BMM_TYPE {
    @objid ("9903fd5a-45d2-4859-8b88-0bbc7fc29649")
    public String container_type;

    @objid ("4dddb16a-854d-402b-a1e0-55cbf216a1c6")
    public String type;

    @objid ("927114fd-3860-4218-af4f-6c3cb3d9ffcf")
    public P_BMM_TYPE type_def;

    @objid ("d5d4b234-c5bb-406e-bef8-f20f0d0d4a25")
    public P_BMM_TYPE type_ref() {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cd6790c1-a1c9-4ae9-aabd-550cb8d77ec2")
class P_BMM_SIMPLE_TYPE extends P_BMM_TYPE {
    @objid ("46864f11-1f1c-431c-946b-b78595340d84")
    public String type;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ff72ce95-ab29-4113-9cf6-cb456bc67884")
class P_BMM_SIMPLE_TYPE_OPEN extends P_BMM_TYPE {
    @objid ("a2e21207-d540-451c-a7fc-74910be0d686")
    public String type;

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("abe1333c-9fa1-4a48-a26d-1c21adbd9272")
class P_BMM_GENERIC_TYPE extends P_BMM_TYPE {
    @objid ("bf1be732-a9b6-4798-aa1b-f4e9d1baf98d")
    public String root_type;

    @objid ("11930be6-7c03-46aa-8fb6-f0c847359c44")
    public String[] generic_parameters;

    @objid ("a54a683b-9819-4c1c-94b9-49e2190c3aef")
    public List<P_BMM_TYPE> generic_parameter_defs = new ArrayList<P_BMM_TYPE> ();

    @objid ("ce4e81d7-8d6f-468f-b6af-cbbffbbb1c9b")
    public void generic_parameter_refs() {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c15d1d48-398b-42f7-bfc3-06f7800150f0")
class P_BMM_PACKAGE extends P_BMM_PACKAGE_CONTAINER {
    @objid ("8cbdfd8c-a927-4b25-b620-2e0788e95754")
    public String name;

    @objid ("0fd9b5c3-d462-4f52-9be8-5a3afbbf0da5")
    public String[] classes;

    @objid ("5aa1e528-10dd-42bd-b581-0551a26f90ac")
    public void merge(final P_BMM_PACKAGE other) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e5cfffce-bc91-41c4-a730-a411fa6f91ac")
class P_BMM_PACKAGE_CONTAINER {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2b93764c-c7ed-44d3-b8ee-ab2458beb92b")
class P_BMM_SINGLE_PROPERTY extends P_BMM_PROPERTY {
    @objid ("1a239202-aa97-47ac-9b22-c444d8324825")
    public String type;

    @objid ("814f79d8-cb7f-40c7-8815-f667bfa4b33a")
    public P_BMM_SIMPLE_TYPE type_def() {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("412b8fca-ecb0-4dad-b1a5-6bc68010bbc5")
class P_BMM_SINGLE_PROPERTY_OPEN extends P_BMM_PROPERTY {
    @objid ("bfb89497-90d9-495c-920a-adaa717b0664")
    public String type;

    @objid ("96d20e25-726c-4682-a448-d482bdf77baf")
    public P_BMM_SIMPLE_TYPE_OPEN type_def;

    @objid ("80ca2d6c-2beb-4080-b39d-1204a2e27d64")
    public P_BMM_SIMPLE_TYPE_OPEN type_def() {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0e38b72f-1fe0-4790-8ce7-1f51f8273138")
class P_BMM_GENERIC_PROPERTY extends P_BMM_PROPERTY {
    @objid ("4192fe7d-c131-4f3b-852c-720a0a7cd16f")
    public P_BMM_GENERIC_TYPE type_def;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("26168770-cb6a-4f0a-94b9-ed75bc74f565")
class P_BMM_ENUMERATION_INTEGER {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bfd64a88-84aa-421e-9906-ab29a67fe650")
class P_BMM_ENUMERATION_STRING {
}

import java.util.ArrayList;
import java.util.List;
import P_BMM_SCHEMA;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("edc3703c-853e-4acf-a676-541cf8b282fe")
class P_BMM_SCHEMA extends P_BMM_PACKAGE_CONTAINER {
    @objid ("785b562d-a859-499c-8b6a-0e9b7795ab70")
    public String bmm_version;

    @objid ("42bf17a5-dccb-4b7e-979e-600986a3d081")
    public int state;

    @objid ("c9860c74-0616-4f74-b5a5-6b58c1da6a3c")
    public BMM_SCHEMA bmm_schema;

    @objid ("0f8b9b22-a3f5-49e0-8bdb-62b8d0610f15")
    public List<P_BMM_CLASS> primitive_types = new ArrayList<P_BMM_CLASS> ();

    @objid ("5574b31d-305a-4e5c-a09f-c56aaec0139d")
    public List<P_BMM_CLASS> class_definitions = new ArrayList<P_BMM_CLASS> ();

    @objid ("fe3bf43f-3036-45b5-9c7f-4cff974a58e8")
    public List<P_BMM_PACKAGE> canonical_packages = new ArrayList<P_BMM_PACKAGE> ();

    @objid ("cc7e0aa2-f854-4125-b37f-a11c05e79ae8")
    public void validate_created() {
    }

    @objid ("857b2bc2-e88d-46e2-90f8-4c894d742502")
    public void load_finalise() {
    }

    @objid ("96459788-4d62-4964-9e4a-9a2cc2043278")
    public void merge(final P_BMM_SCHEMA other) {
    }

    @objid ("dd2fa403-9819-45ff-ae1c-de7f3b931fd4")
    public void validate() {
    }

    @objid ("3f8f7aca-9f74-4ce9-accf-a74848b1da8c")
    public void create_bmm_schema() {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("4edbb155-78cb-40da-850e-e83be422e32c")
public class T {
}

