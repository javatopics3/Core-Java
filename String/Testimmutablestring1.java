public class Testimmutablestring1 {
	public static void main(String[] args) {
		String s = "Sachin";
		s = s.concat(" Tendulkar");
		/*
		 * explicitely assign it to the reference variable Please notice that
		 * still sachin object is not modified.
		 */
		System.out.println(s);
	}
}
