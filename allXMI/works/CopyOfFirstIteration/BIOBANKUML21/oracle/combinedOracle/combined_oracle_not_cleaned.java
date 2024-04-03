import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("60b0fd98-9e87-4489-b96d-14c58f933cb4")
public enum BiobankType {
    disease,
    population;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("08d56243-373e-466f-83e2-c06f3463c0dc")
public class Sample {
    @objid ("a58fa036-9a00-4146-90c8-6e0bc061c227")
    private Quality quality;

    @objid ("3d9308d8-6df4-4ad6-9fc8-4ea61754596e")
    public Biobank biobank;

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("4032e419-df72-4c57-8631-e4cab0ef643f")
public class DataType1 {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("a3412783-234e-4f8c-9a2e-d0c75d2f62ed")
public class PrimitiveType1 {
}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("75f8fc65-0575-429e-bc45-1aa87e02606c")
public class Quality {
}

