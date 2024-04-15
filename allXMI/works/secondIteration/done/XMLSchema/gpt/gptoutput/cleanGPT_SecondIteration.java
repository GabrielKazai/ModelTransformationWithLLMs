public class XMLGraph {
}

public class Attribute {
    private String name;
    private String value;
    private Element[] refs;
}

public abstract class Node {
}

public class Text extends Node {
    private String content;
}

public class Element extends Node {
    private String name;
    private Text[] texts;
    private Element[] children;
    private Attribute[] attributes;
    private Node[] contents;
}