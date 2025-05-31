/*

return the first name from the array having digit within it.
input : {"Hello", "rahul","P7une","I2ndi3a"}
output : P7une */

package p1;

public class NK1 {

	String getFirstDigitElement(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				char letter = arr[i].charAt(j);
				if (Character.isDigit(letter)) {
					return arr[i];
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		String[] input = { "Hello", "Technocredits", "Pu7ne", "3India" };
		NK1 nk = new NK1();
		String output = nk.getFirstDigitElement(input);
		System.out.println("First element having digit is :" + output);
	}

}
