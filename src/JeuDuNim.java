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
		
		int matches = 21;
		String lastPlayer = null;
		
		while (matches > 0)
		{
			if(firstPlayer == 1)
			{
				System.out.println(playerOne.toUpperCase() + " combien d'allumette voulez vous retirer entre 1 et 4 ? : ");
				int pOneRemove = scan.nextInt();
				pOneRemove = verifMatchesRemove(pOneRemove, scan , matches);
				
				matches -= pOneRemove;
				
				System.out.println("reste : " + matches + " allumette");
				firstPlayer = 2;
				
				if(matches == 1)
				{
					lastPlayer = playerTwo;
				}
				if(matches == 0)
				{
					break;
				}
			}
			
			if(firstPlayer == 2)
			{
				System.out.println(playerTwo.toUpperCase() + " combien d'allumette voulez vous retirer entre 1 et 4 ? : ");
				int pTwoRemove = scan.nextInt();
				pTwoRemove = verifMatchesRemove(pTwoRemove, scan , matches);
				
				matches -= pTwoRemove;
				
				System.out.println("reste : " + matches + " allumette");
				firstPlayer = 1;
				
				if(matches == 1)
				{
					lastPlayer = playerOne;
				}
			}
		}
		scan.close();
		System.out.println(lastPlayer.toUpperCase() + " a perdu ");
	}
	
	public static int verifMatchesRemove ( int numberUser , Scanner scan , int matches)
	{
		if( numberUser > 4 || numberUser <= 0 )
		{
			while( numberUser > 4 || numberUser <= 0 )
			{
				System.out.println("possibiliter de retirer 1 a 4 alumettes , pas plus , pas moins : ");
				numberUser = scan.nextInt();
			}
		}
		else if ( matches == 1  && (numberUser > 1 || numberUser <= 0))
		{
			while( numberUser > 1 || numberUser <= 0 )
			{
				System.out.println("reste que 1 alumette : ");
				numberUser = scan.nextInt();
			}
		}
		return numberUser;
	}
}
