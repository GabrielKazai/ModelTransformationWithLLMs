import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("96febcd1-dd5b-415e-820e-44f22f5d7ac8")
public class TechnicienMaintenance {
    @objid ("765714c0-b294-420a-92d1-dcd87be3f17a")
    public void gotoDestination() {
    }

    @objid ("b8964ebb-e27b-4f97-b197-de4fe90e4524")
    public void graspObject() {
    }

    @objid ("d470300b-fe58-4c48-9c9b-110cfd173666")
    public void SubOperation() {
    }

    @objid ("cccee767-6c20-4bf8-8daa-7e0704d6b4c7")
    public void TestOperation() {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2c768bd8-664f-4833-9423-cc35a578f590")
public class Box {
    @objid ("eafe2729-6503-4f72-8e00-cf389b261831")
    public void ChangeColor() {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c0e0d2d1-3552-492e-9d8c-7b3eb810393e")
public class entity {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("501cbaf1-2b0f-4a37-a523-19acd6d59353")
public class Agent {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d696f5f4-0d66-4686-9e66-7ee11257a06f")
public enum ContentKind {
    Unspecified,
    Empty,
    Simple,
    Mixed,
    ElementOnly;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("212d0685-e453-48b2-be57-9de8b095b508")
public enum FeatureKind {
    Unspecified,
    Simple,
    Attribute,
    Element,
    AttributeWildcard,
    ElementWildcard,
    Group;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1aae5f29-a7c7-4a9c-a396-376d0295dff2")
public enum VisibilityKind {
    Unspecified,
    None,
    ReadOnly,
    ReadWrite,
    ReadOnlyUnsettable,
    ReadWriteUnsettable;
}

