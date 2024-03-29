import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e1824b6b-0d35-4c71-9551-1ea6ea31efa6")
public class XMLGraph {
}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6dac9801-7b9c-4e86-a7ba-a69118b2c3d7")
public class Attribute {
    @objid ("90fdded2-23e3-477e-8940-efc39de9f81e")
    private String name;

    @objid ("9e27d964-1f66-47e2-ad46-af756858872d")
    private String value;

    @objid ("9abe8a52-cdd2-4e54-a530-4faf4016721d")
    private List<Element> refs = new ArrayList<Element> ();

}

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b2ca06b7-326d-420e-8638-f52285d30f78")
public class Element extends Node {
    @objid ("e91b3df9-b958-4869-8558-19817c189bfe")
    private String name;

    @objid ("5e7b61df-30aa-40b1-9d70-72f706fa54f7")
    private List<Text> texts = new ArrayList<Text> ();

    @objid ("18f62f6b-5f7c-4bf2-9727-241ecde64fae")
    private List<Element> children = new ArrayList<Element> ();

    @objid ("b2d206dd-d4ee-42e2-8c70-c97020a89c0e")
    private List<Attribute> attributes = new ArrayList<Attribute> ();

    @objid ("b5f39602-0766-47b9-8fee-eb9866ea836b")
    private List<Node> contents = new ArrayList<Node> ();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f0c30fd5-f946-4bce-85d5-a4ca6790e427")
public abstract class Node {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6cf2215b-cbdf-4116-87f9-8e7639e57432")
public class Text extends Node {
    @objid ("0d29e92b-5e3f-42fe-ad9a-2201d76324bb")
    private String content;

}

