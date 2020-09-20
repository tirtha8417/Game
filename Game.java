import java.util.Random;
import java.util.Scanner;
class Game{
	public static void main(String args[]){
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What you want to choose 1.Rock, 2.Paper, 3.Scissor : ");
		x = sc.nextInt();
		
		Random rand = new Random();
		int computer=rand.nextInt(3)+1;
		//System.out.println(computer);
		
		switch(computer){
			case 1:System.out.println("Computer choose rock");
					break;
			case 2:System.out.println("Computer choose paper");
					break;
			case 3:System.out.println("Computer choose scissor");
					break;
			default:System.out.println("Invalid option choose");
		}
		if(x==computer){
			System.out.println("Match Draw");
		}else if((x==1) && (computer==3)){
			System.out.println("User win the match");
		}else if((x==1) && (computer==2)){
			System.out.println("Computer win the match");
		}else if((x==2) && (computer==1)){
			System.out.println("User win the match");
		}else if((x==2) && (computer==3)){
			System.out.println("Computer win the match");
		}else if((x==3) && (computer==2)){
			System.out.println("User win the match");
		}else if((x==3) && (computer==1)){
			System.out.println("Computer win the match");
		}
	}
}