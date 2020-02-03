package FCB_201901;

public class Choice23_TestTryCatch {
	public static void main (String[] args) {
		System.out.print("甲");//甲丙丁
		try {
			int i = 2 / 0;
			System.out.print("乙");
		} catch (Exception e) {
			System.out.print("丙");
			throw e;
		} finally {
			System.out.print("丁");
		}
		System.out.print("戊");
	}
}
