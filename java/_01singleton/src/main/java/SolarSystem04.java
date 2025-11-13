// 싱글톤04 double-checked locking
public final class SolarSystem04 {

	// 메모리 가시성을 보장하고 instruction reordering을 방지
    private static volatile Sun sun;

    private SolarSystem04() {}

    public static Sun getSun() {
        if (sun == null) { // 1차 체크 - 동기화 비용 피함 (동기화 x)
			synchronized (SolarSystem04.class) {
				if (sun == null) { // 2차 체크 - 중복 생성 방지 (동기화 o)
					sun = Sun.createSun(3.828E26, 46);
				}
			}
        }

        return sun;
    }
}
