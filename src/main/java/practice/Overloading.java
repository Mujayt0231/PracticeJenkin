package practice;

public class Overloading {
	
	public static void main(String[] args) {
		
		
		
	}
	

	public void jump() {
		System.out.println("I can jump");
	}

	
	
	public int jump(int n) {
		System.out.println("I can jump " + n + " times.");
		return 0;
	}
	
	
	public void jump(int n, int x) {
		System.out.println("I can jump " + n + " times as well");
	}
}
