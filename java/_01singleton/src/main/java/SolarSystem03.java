// 싱글톤03 enum
public enum SolarSystem03 {
    INSTANCE;

    private final Sun sun;

    SolarSystem03() {
        sun = Sun.createSun(3.828E26, 46);
    }

    public Sun getSun() {
        return sun;
    }
}
