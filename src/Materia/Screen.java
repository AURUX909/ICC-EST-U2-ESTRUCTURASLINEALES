package Materia;

public class Screen {
    private int id;
    private String name;
    private String route;

    public Screen() {
    }

    public Screen(int id, String name, String route) {
        this.id = id;
        this.name = name;
        this.route = route;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Screen [route=" + route + "]";
    }
}