
public class XMLGraph {
}

public class Attribute {
    private String name;

    private String value;

    private List<Element> refs = new ArrayList<Element>();

}

public class Element extends Node {
    private String name;

    private List<Text> texts = new ArrayList<Text>();

    private List<Element> children = new ArrayList<Element>();

    private List<Attribute> attributes = new ArrayList<Attribute>();

    private List<Node> contents = new ArrayList<Node>();

}

public abstract class Node {
}

public class Text extends Node {
    private String content;

}
