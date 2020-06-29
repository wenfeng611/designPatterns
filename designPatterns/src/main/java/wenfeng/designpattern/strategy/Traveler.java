package wenfeng.designpattern.strategy;

//游客 Context
public class Traveler {
    private String name;
    //......

    TravelStrategy travelStrategy; //策略类

    public Traveler(String name, TravelStrategy travelStrategy) {
        this.name = name;
        this.travelStrategy = travelStrategy;
    }

    public void go(){
        System.out.println(this.name+" ");
        travelStrategy.travel();
    }
}
