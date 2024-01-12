package ru.zhuravlev.homeworks.homework13;

public enum AreaType {
    FOREST("Густой лес"),
    PLAIN("Равнина"),
    SWAMP("Болото");

    AreaType(String area) {
        this.area = area;
    }

    private final String area;

    public String getArea() {
        return area;
    }
}
