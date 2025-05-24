package p1;

public class Test {
	int getSpecialChar(String input) {
		String spList = ",;' _()*&^";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			Character ch = input.charAt(i);
			if (spList.contains(Character.toString(ch))) {
				count++;

			}
		}
		System.out.println("The count of special characters are: " + count);
		return count;
	}

	public static void main(String[] args) {
		Test as25 = new Test();
		as25.getSpecialChar("te!c,h(n[o");
	}

}
