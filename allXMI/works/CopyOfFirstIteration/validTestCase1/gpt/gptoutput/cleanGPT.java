public abstract class Class1 {
    private Class3 class3_1;
    public boolean attribute1;
}

public class Class2 {
    private Class3 class3_2;
    protected boolean attribute2 = true;
}

private class Class3 extends Class1,Class2
{
    public Class1 class1;
    protected Class2 class2;
    Class3 class3;
    String attribute3;
}