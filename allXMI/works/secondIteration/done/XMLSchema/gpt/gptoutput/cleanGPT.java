public class XMLGraph {
}

public class Attribute {
    private String name;
    private String value;
}

public abstract class Node {
}

public class Text extends Node {
    private String content;
}

public class Element extends Node {
    private String name;
}