// 싱글톤01 Static 초기화
public final class SolarSystem01 {
    
    // 클래스 로딩 시 자동으로 한 번만 생성됨
    private static final Sun sun = Sun.createSun(3.828E26, 46);

    // 생성자를 막아서 인스턴스 생성 방지
    private SolarSystem01() {}

    public static Sun getSun() {
        return sun;
    }
}
