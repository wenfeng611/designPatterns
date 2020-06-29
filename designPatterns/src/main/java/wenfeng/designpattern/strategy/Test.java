package wenfeng.designpattern.strategy;

public class Test {

    public static void main(String[] args) {
        Traveler travelerA = new Traveler("甲",new Plane());
        Traveler travelerB = new Traveler("乙",new Bus());
        travelerA.go();
        travelerB.go();
    }
}
