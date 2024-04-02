import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2de697f5-dc85-48f9-95df-279b579b64fc")
public class Сотрудник {
    @objid ("36b842f9-32d5-477d-9f53-d7d0de2c8e6a")
    public String ФИО;

    @objid ("8c09ec64-579b-4428-aba0-2a98764e51a5")
    public Date Дата_рождени�?;

    @objid ("4cdfca22-5aad-4bb0-9058-1a092bb1bf1c")
    public List<Задача> задачи = new ArrayList<Задача> ();

    @objid ("89bae6b1-51b7-4b3d-bbd0-aadc3f5297de")
    public List<Проект> проектыР = new ArrayList<Проект> ();

    @objid ("04c44677-3a6a-49da-93b0-b9bf28d028fb")
    public List<Проект> проектыУ = new ArrayList<Проект> ();

}
