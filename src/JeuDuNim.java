import java.util.Scanner;

public class JeuDuNim {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("joueur 1 quel est votre nom ? :");
		String playerOne = scan.nextLine();
		System.out.println("joueur 2 quel est votre nom ? :");
		String playerTwo = scan.nextLine();
		
		int candles = 21;
		String lastPlayer = null;
		
		while (candles > 0)
		{
			System.out.println(playerOne + " combien d'allumette voulez vous retirer entre 1 et 4 ? : ");
			int pOneRemove = scan.nextInt();
			candles -= pOneRemove;
			System.out.println("reste : " + candles + " allumette");
			if(candles == 1)
			{
				lastPlayer = playerTwo;
			}
			if(candles == 0)
			{
				break;
			}
		
			System.out.println(playerTwo + " combien d'allumette voulez vous retirer entre 1 et 4 ? : ");
			int pTwoRemove = scan.nextInt();
			candles -= pTwoRemove;
			System.out.println("reste : " + candles + " allumette");
			if(candles == 1)
			{
				lastPlayer = playerOne;
			}
		}
		scan.close();
		System.out.println(lastPlayer + " a perdu ");
	}

}
