package homework2;

public class HighestNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		getGreatestNum(num1,num2,num3);
	}

	public static void getGreatestNum(int num1, int num2, int num3){
		int highestNum = 0;
		if(num1 > num2){
			if(num1 > num3){
				highestNum = num1;
			}
			else
				highestNum = num3;
			
		}
		else{
			if(num2 > num3){
				highestNum = num2;
			}
			else
				highestNum = num3;
			
		}

		System.out.println("The highest number is: "+highestNum);
	}
}