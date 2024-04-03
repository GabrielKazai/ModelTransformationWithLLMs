import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("66e994f2-676a-48c8-a210-631897dadfd0")
public class Проект {
    @objid ("ff552f0f-d453-44c6-8fb6-d1abd5019bf0")
    public String �?азвание;

    @objid ("cdd9f63b-49eb-4c8a-97ac-8361cf553ee5")
    public boolean Закрыт;

    @objid ("013fe931-540e-4d54-841a-5a9a3c7e72be")
    public Сотрудник руководитель;

    @objid ("7b4b00df-eff7-4cf7-ae56-c8763073cd6f")
    public List<Сотрудник> уча�?тники = new ArrayList<Сотрудник> ();

    @objid ("87e46432-8bfd-4661-a8b7-a2eabc220cde")
    public List<Задача> задачи = new ArrayList<Задача> ();

}
