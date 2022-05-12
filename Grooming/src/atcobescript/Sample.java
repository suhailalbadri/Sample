package atcobescript;

public class Sample {

	static void str(int no) {
		if (no<=10) {
			System.out.println(no);
			no++;
			str(no);
		}
	}
	public static void main(String[] args) {
		str(1);
	}
}