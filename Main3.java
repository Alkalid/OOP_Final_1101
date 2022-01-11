package Final;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(System.in);
			String pw = s.next();
			
			if (pw.length() < 6 || pw.length() > 20) {
				throw new PasswordLengthException();
			}
			
			if (pw.split("&").length > 1 || pw.split("|").length > 1 || pw.split("{").length > 1 || pw.split("}").length > 1 || pw.split("'").length > 1) {
				throw new PasswordSymbolException();
			}
			
		} catch (PasswordLengthException p) {
			System.out.println(p.getMessage());
		} catch (PasswordSymbolException p) {
			System.out.println(p.getMessage());
		}
	}

}

class PasswordLengthException extends Exception {
	@Override
	public String getMessage() {
		return "Invalid length";
	}
}

class PasswordSymbolException extends Exception {
	@Override
	public String getMessage() {
		return "Invalid symbol";
	}
}