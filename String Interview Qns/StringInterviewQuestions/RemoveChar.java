package StringInterviewQuestions;
//How to remove a particular character from a string ?
public class RemoveChar {
	public static void main(String[] args) {
		String str = "India is my country";
		System.out.println(charRemoveAt(str, 7));
	}

	public static String charRemoveAt(String str, int p) {
		return str.substring(0, p) + str.substring(p + 1);
	}

}
