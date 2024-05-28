import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("6f74eda8-da4f-4164-8c1c-dec4fe92647f")
public class City {
    @objid("06e7e067-696c-45e0-922d-dfb5e99e7559")
    private List<Houses> DemoString = new ArrayList<Houses>();

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ce46c156-7d2d-4f7e-81c0-4e8072baf0c4")
public class Houses {
    @objid ("2c2bc856-02cc-4926-8db6-0e1d0054a19d")
    private Family family;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ff1ba3d2-a2b7-498e-82a4-8aa4f0c5ae6a")
public class Family {
    @objid ("58e12862-afc3-454c-a361-1a1d4e3a8134")
    private Father Father;

    @objid ("74d10100-6e39-4991-b474-7bed49352c1c")
    private Mother Mother;

    @objid ("2aa0d1ad-c600-47aa-b9af-37fe254a2af7")
    private Child[] Children;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1a03ab75-57cb-4225-9e54-8a7cd23387f8")
public class Father {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01676551-b8fe-4c1d-9679-5958b3f084e4")
public class Mother {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f2f43d7c-e347-4bd7-bbc0-9f797f9b28d8")
public class Child {
}

