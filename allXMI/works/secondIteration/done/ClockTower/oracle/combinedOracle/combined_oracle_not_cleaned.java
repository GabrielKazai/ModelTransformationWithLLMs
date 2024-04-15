import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01346372-93f5-49cb-b517-d4b1b70d3062")
class ClockTower {
    @objid ("9c498790-1f55-4d91-8d68-b6e46adde036")
    private Clock clock;

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("48d981ce-ab87-487b-a595-2539ad08f571")
class Clock {
    @objid("ffdcc0f1-690b-4a6c-8838-22584774d67a")
    public int currentHour = 0;

    @objid("1c3440c7-7c94-41e2-92ca-8a86863587a4")
    private int currentMinute = 0;

    @objid ("0c9eeafa-550b-4e1c-baec-01d700baf8cd")
    private ClockTower [[GabrielRonnie]];

    @objid ("c9c9cc74-7001-4cbf-a4c0-90e13954f959")
    private Hand hourHand;

    @objid("ac541f48-cdf6-416f-bf46-f440542f9664")
    private Hand minuteHand;

    @objid("d09120e9-8f8e-4237-ab4a-e75828fb1616")
    public void updateHands() {
    }

    @objid("02180ffa-d982-4411-9433-9a5497bd7fa4")
    public void addOneHour() {
    }

    @objid("aefb413f-b967-42c6-ada2-8babbf583c06")
    public void addOneMinute() {
    }

    @objid("0fd47003-6ee9-4a07-8e49-0ad6d0e41eb4")
    public void Clock() {
    }

}

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ec7c5a20-576e-414c-b3ff-218ec9b3d8f8")
class Hand {
    @objid ("135ba14f-4eb1-4bca-94fa-435ad7137f01")
    private Clock [[GabrielRonnie]];

    @objid ("e4b5f3b1-6ca0-4b7d-b21d-a1e23831a72b")
    private Clock [[GabrielRonnie]];

}

