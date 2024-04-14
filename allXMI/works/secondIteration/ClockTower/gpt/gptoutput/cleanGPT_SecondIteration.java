package ClockTower.Environment;

class ClockTower {
    private Clock clock;
}

class Clock {
    private ClockTower clockTower;
    private Hand hourHand;
    private Hand minuteHand;
    public int currentHour;
    private int currentMinute;

    public Clock() {
    }

    public void updateHands() {
    }

    public void addOneHour() {
    }

    public void addOneMinute() {
    }
}

class Hand {
    private Clock clock;
    private Clock associatedClock;
}