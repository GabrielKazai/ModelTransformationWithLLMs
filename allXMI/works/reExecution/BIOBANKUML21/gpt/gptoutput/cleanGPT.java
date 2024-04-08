public class Address {
    private String city;
    private String street;
}

public class Biobank implements Identifiable {
    private DataType1 dtype;
    private PrimitiveType1 ptype;
    private BiobankType type;
}

public enum BiobankType {
    disease, population
}

public class Sample implements Identifiable {
    public Biobank biobank;
    private Quality quality;
}

public interface Identifiable {
    public static String identifier = "";
    public static String name = "";
    public static String number = "";
}

class DataType1 {
}

class PrimitiveType1 {
}

class Quality {
}