class ClockTower {
    private Clock clock;
}

class Clock {
private ClockTower clockTower;
private Hand hourHand;
private Hand minuteHand;
public int currentHour;
private int currentMinute;

public Clock() {        // Constructor logic here    }    public void updateHands() {        // Method implementation    }    public void addOneHour() {        // Method implementation    }    public void addOneMinute() {        // Method implementation    }}class Hand {    private Clock clock;}