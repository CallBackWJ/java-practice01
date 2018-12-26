package practice01;

public class Prob5 {

	public static void main(String[] args) {

		boolean check = false;
		for (int i = 1; i < 100; i++) {
			StringBuilder str = new StringBuilder();
			str.append(i + " ");
			for (int j = 0; j < str.length() - 1; j++) {
				if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
					str.append("짝");
					check = true;
				}
			} 
			if (check) {
				System.out.println(str);
				check = false;
			}
		}

	}
}
