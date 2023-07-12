package smartengineer;

public class Asciivalue {
	public static void main(String[] args) {
		char ch = 'A';
				int ascii = ch;
		// you can also cast char to int
		int castAscii = (int) ch;
		System.out.println("The ASCII value of"+ ch + "is:"+ascii);
		System.out.println("The ASCII value of"+ ch + "is:"+castAscii);
	}

}
