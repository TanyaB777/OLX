package hw_9.task1;

public class Program {
    public static void main(String[] args) throws IllegalAccessException {

        String[] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        for (String helperPlanet : planetNames) {
            PlanetFactory.getPlanet(helperPlanet).displayInfo();
        }


    }
}
