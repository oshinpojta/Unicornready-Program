import java.util.*;
public class Solution{
	
	private Double A = 35.0;
	private Double B = 65.0;
	private Double C = 50.0;
	private Double D = 85.0;
	private Double A4pack = 100.0;
	private Double C6pack = 250.0;

	public Double getTotalPrice(String items){
		Double result = 0.0; 
		Integer[] countItems = {0,0,0,0};
		for(int i=0;i<items.length();i++){
			if(items.charAt(i)=='A'){
				countItems[0]++;
			}
			else if(items.charAt(i)=='B'){
				countItems[1]++;
			}
			else if(items.charAt(i)=='C'){
				countItems[2]++;
			}
			else if(items.charAt(i)=='D'){
				countItems[3]++;
			}
		}

		result += ((countItems[0]%4)*this.A)+((countItems[0]/4)*this.A4pack)+(countItems[1]*this.B)+((countItems[2]%6)*this.C)+((countItems[2]/6)*this.C6pack)+(countItems[3]*this.D);
		return result;
	}

    public void print(Double result){
	    System.out.println("Total price is Rs."+result);
	    System.out.println();
	}



	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter items list :");
			String items = input.nextLine();
			Solution answer = new Solution();
			Double result = answer.getTotalPrice(items);
			answer.print(result);
		}
	}

}