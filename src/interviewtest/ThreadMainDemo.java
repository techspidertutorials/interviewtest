package interviewtest;

public class ThreadMainDemo {

	public static void main(String[] args) throws InterruptedException {
			ThreadEvenNumbers even=new ThreadEvenNumbers();
			ThreadOddNumbers odd=new ThreadOddNumbers();
			
			//even.start();
			
			odd.start();
	}
}
