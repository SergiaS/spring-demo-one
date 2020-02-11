package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyInitStuff(){
        System.out.println("TrackCoach: inside method doMyInitStuff");
    }

    // add a destroy method
    public void doMyDestroyStuff(){
        System.out.println("TrackCoach: inside method doMyDestroyStuff");
    }
}
