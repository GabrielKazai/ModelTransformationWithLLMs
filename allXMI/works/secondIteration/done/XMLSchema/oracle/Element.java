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
