public class City {
    private List<Houses> houses;

    public List<Houses> getHouses() {
        return houses;
    }

    public void setHouses(List<Houses> houses) {
        this.houses = houses;
    }
}

public class Houses {
    private Family family;

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}

public class Family {
    private Father father;
    private Mother mother;
    private List<Child> children;

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}

public class Father {
}

public class Mother {
}

public class Child {
}