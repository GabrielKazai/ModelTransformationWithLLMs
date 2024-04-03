import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("95e13bce-3ac8-4078-acb7-999df1f9280d")
public class ClassA {
    @objid ("c7df061f-30cc-4f18-aa31-17aff0962f76")
    private long classAId;

    @objid ("731a1ef0-2a0a-465f-8b8f-94f9d2b644e3")
    private ClassC classC;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0f330e9c-4e71-47ae-ab70-40afe27ee5f0")
public class ClassB {
    @objid ("39c62fda-8e6f-4a6b-acb1-c91789523284")
    private long classBId;

    @objid ("dbe9d7a2-2450-4f53-b50d-1efca8539123")
    private ClassA classA;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fa33f0fb-6a33-47be-b3a7-20835a5188bf")
public class ClassC {
    @objid ("316c2021-db52-41d1-acc5-0af8b945dba9")
    private long classCId;

    @objid ("f8a15eee-9183-4de1-8e8d-b81405df7c2b")
    private ClassD classD;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5f8a5bfe-540b-4a37-8880-f52eae8fc01b")
public class ClassD {
    @objid ("0ae3e9b4-54b7-4647-8e91-643f67421756")
    private long classDId;

    @objid ("309cf3a7-afcd-4f1e-9b82-0819ad9de75a")
    private ClassB classB;

}

