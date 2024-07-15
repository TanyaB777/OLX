package hw_9.task1;

public class PlanetFactory {
    public static Planet getPlanet(String planetName) throws IllegalAccessException {
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
                throw new IllegalAccessException(String.format("Planet with this name <%s> is not exist!", planetName));
        }
    }
}
