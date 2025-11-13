// 싱글톤02 lazy 초기화
public final class SolarSystem02 {
    
    private static Sun sun;

    private SolarSystem02() {}

    public static Sun getSun() {
        if (sun == null) {
			sun = Sun.createSun(3.828E26, 46);
        }
        return sun;
    }
}
