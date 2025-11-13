// 싱글톤05 static inner 클래스 홀더
public class SolarSystem05 {

	private SolarSystem05() {
	}

	private static class SunHolder {
		private static final Sun INSTANCE = Sun.createSun(3.828E26, 46);
	}

	public static Sun getInstance() {
		return SunHolder.INSTANCE;
	}

}
