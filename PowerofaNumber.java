package PST;

public class PowerofaNumber {

	public class PowerOfNumber {
	    public static void main(String[] args) {
	        int base = 2;
	        int exponent = 5;
	        int result = 1;

	        for (int i = 1; i <= exponent; i++) {
	            result = result * base;
	        }

	        System.out.println("Result: " + result);
	    }
	}