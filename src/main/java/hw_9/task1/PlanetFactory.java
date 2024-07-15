package hw_9.task1;

public class PlanetFactory {
    public static Planet getPlanet(String planetName) {
        switch (planetName) {
            case "Mercury":
                return new Mercury();
            case "Venus":
                return new Venus();
            case "Earth":
                return new Earth();
            case "Mars":
                return new Mars();
            case "Jupiter":
                return new Jupiter();
            case "Saturn":
                return new Saturn();
            case "Uranus":
                return new Uranus();
            case "Neptune":
                return new Neptune();
            default:
                try {
                    throw new Exception("Planet with this name is not exist!");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
