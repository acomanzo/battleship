import java.util.Scanner;

public class battleshipMain {
	public static void main(String[] args)
	{
		System.out.println("This is Battleship. Each player will enter the exact coordinates of each part of their ships.");
		System.out.println("The columns are the letters going across, and the rows are the numbers going down.");
		System.out.println("The Ath row is the 10th row.");
		System.out.println("Player 1 is upper case, player 2 is lower case.");
		System.out.println("An 'X' or 'x' means that part of the boat's been hit.");
		System.out.println("When one player has sunk all the boats (17 x's)," +
				"then that player has won.");
		
		battleshipMethods.putCarrier1();
		for(int i=0;i<battleshipVariables.board1.length;i++)
		{
			System.out.println(" ");
			for(int a=0;a<battleshipVariables.board1[0].length;a++)
			{
				System.out.print(battleshipVariables.board1[i][a]+" ");
			}
		}
		battleshipMethods.putCarrier2();
		for(int i=0;i<battleshipVariables.board2.length;i++)
		{
			System.out.println(" ");
			for(int a=0;a<battleshipVariables.board2[0].length;a++)
			{
				System.out.print(battleshipVariables.board2[i][a]+" ");
			}
		}
		battleshipMethods.putBattleship1();
		for(int i=0;i<battleshipVariables.board1.length;i++)
		{
			System.out.println(" ");
			for(int a=0;a<battleshipVariables.board1[0].length;a++)
			{
				System.out.print(battleshipVariables.board1[i][a]+" ");
			}
		}
		battleshipMethods.putBattleship2();
		for(int i=0;i<battleshipVariables.board2.length;i++)
		{
			System.out.println(" ");
			for(int a=0;a<battleshipVariables.board2[0].length;a++)
			{
				System.out.print(battleshipVariables.board2[i][a]+" ");
			}
		}
		battleshipMethods.putCruiser1();
		for(int i=0;i<battleshipVariables.board1.length;i++)
		{
			System.out.println(" ");
			for(int a=0;a<battleshipVariables.board1[0].length;a++)
			{
				System.out.print(battleshipVariables.board1[i][a]+" ");
			}
		}
		battleshipMethods.putCruiser2();
		for(int i=0;i<battleshipVariables.board2.length;i++)
		{
			System.out.println(" ");
			for(int a=0;a<battleshipVariables.board2[0].length;a++)
			{
				System.out.print(battleshipVariables.board2[i][a]+" ");
			}
		}
		battleshipMethods.putSubmarine1();
		for(int i=0;i<battleshipVariables.board1.length;i++)
		{
			System.out.println(" ");
			for(int a=0;a<battleshipVariables.board1[0].length;a++)
			{
				System.out.print(battleshipVariables.board1[i][a]+" ");
			}
		}
		battleshipMethods.putSubmarine2();
		for(int i=0;i<battleshipVariables.board2.length;i++)
		{
			System.out.println(" ");
			for(int a=0;a<battleshipVariables.board2[0].length;a++)
			{
				System.out.print(battleshipVariables.board2[i][a]+" ");
			}
		}
		battleshipMethods.putDestroyer1();
		for(int i=0;i<battleshipVariables.board1.length;i++)
		{
			System.out.println(" ");
			for(int a=0;a<battleshipVariables.board1[0].length;a++)
			{
				System.out.print(battleshipVariables.board1[i][a]+" ");
			}
		}
		battleshipMethods.putDestroyer2();
		for(int i=0;i<battleshipVariables.board2.length;i++)
		{
			System.out.println(" ");
			for(int a=0;a<battleshipVariables.board2[0].length;a++)
			{
				System.out.print(battleshipVariables.board2[i][a]+" ");
			}
		}
		System.out.println("\n");
		System.out.println("Time to shoot each other.");
		while(true)
		{
			battleshipMethods.p1Shoot();
			if(battleshipVariables.p1Win==17)
			{
				System.out.println("Congratulations player 1! You won!");
				break;
			}
			battleshipMethods.p2Shoot();
			if(battleshipVariables.p2Win==17)
			{
				System.out.println("Congratulations player 2! You won!");
				break;
			}
			System.out.println("\n");
			System.out.println("Player 1 hits: "+battleshipVariables.p1Win);
			System.out.println("Player 2 hits: "+battleshipVariables.p2Win);
		}
	}
}


