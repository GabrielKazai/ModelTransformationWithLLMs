import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("af54c47e-cdf1-4a6f-a638-0a7f46a0e46d")
public class Задача {
    @objid ("c0481b0e-5fe2-4b8a-b54c-a0a6dd8c97a1")
    public String �?азвание;

    @objid ("7de43b66-b4c7-4a6b-85ec-605b1b6bf93d")
    public String Тек�?т;

    @objid ("ca33a0a9-52c9-4a8a-950d-78144f96cc60")
    public int План_врем�?;

    @objid ("5a18a046-8291-4a54-a0c4-e1d9644df487")
    public int Факт_врем�?;

    @objid ("7935f341-d041-4c55-bcb3-2692c4f67fb3")
    public Сотрудник и�?полнитель;

    @objid ("e00817ba-a8b9-4660-a3a7-f7b32df976cf")
    public Проект проект;

    @objid ("082c475e-c813-494a-b1f9-9b2baf0e653d")
    public List<Задача> подзадача = new ArrayList<Задача> ();

    @objid ("6c0ba00a-a284-4fa1-a32e-8f13e1b479ac")
    public Задача род_задача;

}
