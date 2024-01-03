import java.util.Scanner;

public class JeuDuNim {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("joueur 1 quel est votre nom ? :");
		String playerOne = scan.nextLine();
		System.out.println("joueur 2 quel est votre nom ? :");
		String playerTwo = scan.nextLine();
		System.out.println("quel joueur commence ? : (1 ou 2)");
		int playerFirst = scan.nextInt();
		
		int candles = 21;
		
		while (candles > 0)
		{
			if(playerFirst == 1)
			{
				System.out.println(playerOne + " combien d'allumette voulez vous retirer entre 1 et 4 ? : ");
				int pOneRemove = scan.nextInt();
				candles -= pOneRemove;
			}
			else if(playerFirst == 2)
			{
				System.out.println(playerTwo + " combien d'allumette voulez vous retirer entre 1 et 4 ? : ");
				int pTwoRemove = scan.nextInt();
				candles -= pTwoRemove;
			}
		}
	}

}
