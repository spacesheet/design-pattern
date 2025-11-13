public final class Sun {
    private final String group = "Milky Way";
    private double luminosity;
    private int age;

    private Sun(double luminosity, int age) {
        this.luminosity = luminosity;
        this.age = age;
    }

    public static Sun createSun(double luminosity, int age) {
        return new Sun(luminosity, age);
    }

    public void revolve() {
        this.age += 2.25;
        this.luminosity *= 102.25;
    }
}
