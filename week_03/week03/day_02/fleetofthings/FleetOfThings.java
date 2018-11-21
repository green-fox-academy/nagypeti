package day_02.fleetofthings;

public class FleetOfThings {

  public static void main(String[] args) {

    Fleet fleet = new Fleet();

    Thing remove = new Thing("Remove the obstacles");
    remove.complete();

    Thing stand = new Thing("Stand up");
    stand.complete();

    fleet.add(new Thing("Eat lunch"));
    fleet.add(new Thing("Get milk"));
    fleet.add(remove);
    fleet.add(stand);

    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);

  }

}
