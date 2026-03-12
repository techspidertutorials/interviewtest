package interviewtest;

public class ThreadOddNumbers extends Thread {

	
	@Override
	public void run() {
		ThreadEvenNumbers t=new ThreadEvenNumbers();
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0)
				System.out.println("Number is..." + i);
			
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t.join();
			t.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
