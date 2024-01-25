package day30_inheritance.planeTask;

public class Planet {

    private String name;
    private long mass, radius, surfaceGravity, surfaceArea, volume, population;

    public Planet(String name, long mass, long radius, long surfaceGravity, long surfaceArea, long volume, long population) {
        setName(name);
        setMass(mass);
        setRadius(radius);
        setSurfaceArea(surfaceArea);
        setSurfaceGravity(surfaceGravity);
        setVolume(volume);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMass() {
        return mass;
    }

    public void setMass(long mass) {
        this.mass = mass;
    }

    public long getRadius() {
        return radius;
    }

    public void setRadius(long radius) {
        this.radius = radius;
    }

    public long getSurfaceGravity() {
        return surfaceGravity;
    }

    public void setSurfaceGravity(long surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public long getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(long surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
