//package demo01;
// try, finally and System.exit(int)
public class ExceptionsFinally {

	public static void main(String[] args) {
		finall();
//		tryFinally();
	}
	
	//throw Vs return
	int divide(int x, int y) {
		if(0==y) 
			throw new ArithmeticException("denom is zero");
		return x/y;
	}
	
	static void  finall() {
		int x = 2;
		try {
			System.out.println("try");
//			if(x ==2) throw new ArithmeticException();
			throw new Exception();
//			System.exit(0);
		}
		catch (Exception e) {
			System.out.println("catch");
			System.exit(1);
//			throw new ArithmeticException();
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("After finall");
	}
	
	static void tryFinally () {
		try {
			System.out.println("try");
			throw new ArithmeticException();
		}
		finally {
			System.out.println("fin");
		}
	}
}
