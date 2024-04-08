import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a7027f9c-44bd-48d6-94a7-09ba34fffa9f")
public class Environment {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("50d394d2-c22d-47c4-8cc3-1d1da0de0807")
public class Model {
}

import java.util.ArrayList;
import java.util.List;
import Signal;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("11e2753c-7628-4d4b-97bc-cb28f2547486")
public class Package extends Element {
    @objid ("f94b6e71-0323-41ec-977a-e597be7e0c8e")
    public List<Package> packages = new ArrayList<Package> ();

    @objid ("cecc85d0-f0d5-42ef-8e2a-0a32bffcab55")
    public Package parentPackage;

    @objid ("643b17ac-2f7f-4f55-b538-6f3ee8dfb5d7")
    public List<Class> classes = new ArrayList<Class> ();

    @objid ("15f8aa11-c7c2-44fc-9436-7dadb97ecabe")
    public List<Signal> signals = new ArrayList<Signal> ();

    @objid ("fbef54a9-8015-468d-9f45-ffd111fe2ea8")
    public void Package(final String name) {
    }

    @objid ("0b820c98-1f68-4180-ad57-2602929d3627")
    public String getFullName() {
        // TODO Auto-generated return
        return null;
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c0a10126-c807-4ac8-a236-e86888d64c2c")
public class Class extends Classifier {
    @objid ("692ee42c-c17a-4cf1-89e2-c4367b185948")
    public Package package;

    @objid ("9541b0e1-37cc-4767-840e-71b15feac585")
    public void Class(final String name) {
    }

    @objid ("20f914af-70ae-42b8-88f9-04df687d0502")
    public void getFullName() {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bb6ab28e-6889-470b-870c-50dd32dd196a")
public class Element {
    @objid ("2b48c18e-278f-4da8-8a19-c31ae0e2f31c")
    public String name;

    @objid ("0d64e5f6-c370-401d-945d-f58626618e00")
    public String description;

    @objid ("81292453-5c7b-42f7-a2ed-81a660df7e0c")
    public String summary;

    @objid ("dd6e4dd7-8186-4524-b436-10e14820ed07")
    public ID id;

    @objid ("23eb7fc3-f930-46cb-a19b-88558b16a6a1")
    public void Element(final String name) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.DataType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@DataType
@objid ("bab3d941-70c4-4697-adb0-05c00db28f3c")
public class ID {
}

import java.util.ArrayList;
import java.util.List;
import Behavior;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("86e4cf1b-bfb1-4c66-b3ee-651414723116")
public class Classifier extends Element {
    @objid ("87f8d049-09a3-46b2-aea2-5ded39655f09")
    public boolean isAbstract;

    @objid ("ef00345f-c729-403e-afeb-dccbb57ed09c")
    public List<Classifier> chidren = new ArrayList<Classifier> ();

    @objid ("b2bc62a3-3cc7-4c4b-b5ec-497b92a5bf52")
    public List<Classifier> parents = new ArrayList<Classifier> ();

    @objid ("f5a70548-7e0c-43c0-beca-2c23715ac2ca")
    public List<Behavior> ownedBehavior = new ArrayList<Behavior> ();

    @objid ("e268ef2b-91a5-4eb8-a8af-d300d0d37cc0")
    public boolean isA(final Classifier classifier) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("bb46fc00-7248-4afc-8107-644151150ab0")
    public void Classifier(final String name) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a415141b-81d1-4332-8423-6e0b990c1638")
public class Feature extends Element {
    @objid ("6831d73f-a237-4dd4-9e9f-30f8d14a2d37")
    public void Feature(final String name) {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2cd55204-0b97-4c10-a209-3d29fd874c70")
public class Property extends Feature {
    @objid ("14eddc30-f830-44ce-9b3c-0092b095bf9c")
    public boolean isComposite;

    @objid ("1466aa97-1b30-4ce0-ad88-e8b208efa649")
    public boolean isNavigable;

    @objid ("9a1a9a3e-6c89-44ef-a6d7-d3e89bb49161")
    public boolean isReadOnly;

    @objid ("c2d6af81-7e35-47c6-914e-bebd8f8c5f88")
    public boolean isDerived;

    @objid ("a20e8512-70de-4aea-aaad-a28048d2a79d")
    public boolean isOrdered;

    @objid ("4a55103f-b12f-4018-8d25-3f295da624d2")
    public boolean isUnique;

    @objid ("94934fe5-9e2a-497c-87ad-f18293ae2cf3")
    public int minimumNumber;

    @objid ("d1fed957-c76a-4419-8217-c31898475de7")
    public int maximumNumber;

    @objid ("54d5c9f9-d745-4f9d-8bfe-2ec9c3e59f24")
    public Classifier type;

    @objid ("90d5f603-7288-4a52-a540-e43eb6e3a2d5")
    public Classifier classifier;

    @objid ("ea786689-48c0-428a-baa4-1a800f5a2bd1")
    public Property opposite;

    @objid ("1fad44c9-a381-4c45-b363-5b7c3cc1e2fc")
    public ValueSpecification defaultValue;

    @objid ("f60572b6-00f9-4743-a9f5-4696f57cbc3e")
    public DomainSpecification domain;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("aafe4375-36cc-453f-8c2e-d806b7f1bd4c")
public class ValueSpecification {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8d0f7957-f632-496d-b21b-2449c61b33fe")
public class DomainSpecification {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4445d5c5-3888-4a8e-a13d-bbff30965628")
public class Signal extends Class {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7a9c418b-be75-43e2-ba60-bf2b1a7ce5b2")
public class Behavior {
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f3e0e74c-d765-4803-8ae3-4933208600d4")
public enum ContentKind {
    Unspecified,
    Empty,
    Simple,
    Mixed,
    ElementOnly;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1d1ed4fe-2a78-44f3-8827-b3001c40e8ec")
public enum FeatureKind {
    Unspecified,
    Simple,
    Attribute,
    Element,
    AttributeWildcard,
    ElementWildcard,
    Group;
}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9cee23fd-4404-481c-9503-fb5a461b1ab1")
public enum VisibilityKind {
    Unspecified,
    None,
    ReadOnly,
    ReadWrite,
    ReadOnlyUnsettable,
    ReadWriteUnsettable;
}

