import java.util.Scanner;

public class JeuDuNim 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bonjour le joueur 1 commence toujours en 1er !");
		System.out.println("joueur 1 quel est votre nom ? :");
		String playerOne = scan.nextLine();
		System.out.println("joueur 2 quel est votre nom ? :");
		String playerTwo = scan.nextLine();
		System.out.println("quel joueur , joue en premier ? : ");
		int firstPlayer = scan.nextInt();
		
		while( firstPlayer < 1 || firstPlayer > 2)
		{
			System.out.println("entrez un n° de joueur , 1 ou 2 uniquement : ");
			firstPlayer = scan.nextInt();
		}
		
		int candles = 21;
		String lastPlayer = null;
		
		while (candles > 0)
		{
			if(firstPlayer == 1)
			{
				System.out.println(playerOne.toUpperCase() + " combien d'allumette voulez vous retirer entre 1 et 4 ? : ");
				int pOneRemove = scan.nextInt();
				candles -= pOneRemove;
				verifOneToFour(pOneRemove, scan);
				System.out.println("reste : " + candles + " allumette");
				firstPlayer = 2;
				
				if(candles == 1)
				{
					lastPlayer = playerTwo;
					
				}
				if(candles == 0)
				{
					break;
				}
			}
			
			if(firstPlayer == 2)
			{
				System.out.println(playerTwo.toUpperCase() + " combien d'allumette voulez vous retirer entre 1 et 4 ? : ");
				int pTwoRemove = scan.nextInt();
				candles -= pTwoRemove;
				verifOneToFour(pTwoRemove, scan);
				System.out.println("reste : " + candles + " allumette");
				firstPlayer = 1;
				
				if(candles == 1)
				{
					lastPlayer = playerOne;
				}
			}
			
		}
		scan.close();
		System.out.println(lastPlayer.toUpperCase() + " a perdu ");
	}
	
	public static String verifOneToFour ( int numberUser , Scanner scan)
	{
		String warning = null;
		while( numberUser > 4 || numberUser <= 0 )
		{
			System.out.println("possibiliter de retirer 1 a 4 alumettes , pas plus , pas moins : ");
			numberUser = scan.nextInt();
		}
		return warning;
	}
}
