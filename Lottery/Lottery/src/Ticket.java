import java.util.Random;


public class Ticket {
	Random rand = new Random();
	private int ticketNum;
	private int[] numbers = new int[3];
	private long time;
	
	
	public Ticket(int idNum){
		ticketNum = idNum;
		for (int i : numbers) {
			numbers[i] = rand.nextInt(30);
			if (i > 0) {
				same = true;
				while(same) {
					if (numbers[i] == numbers[i-1]) {
						numbers
				}
			}
		}	// end for loop
		time = System.currentTimeMillis();
	} // end constructor
	
	public long getTimestamp() {
		return time;
	} // end getTimeStamp
	
	public int[] getNumbers() {
		return numbers;
	}
	
	public int getTicketNum() {
		return ticketNum;
	}
	
	public void printNums() {
		System.out.println(numbers);
	}
} // end class


