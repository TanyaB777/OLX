package hw_9.task1;

public class Program {
    public static void main(String[] args) {

        String[] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        try {
            for (String helperPlanet : planetNames) {
                PlanetFactory.getPlanet(helperPlanet).displayInfo();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
