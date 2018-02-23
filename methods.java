import java.util.Scanner;

public class battleshipMethods {
	public static char[][] putCarrier1() {
		Scanner kbReader = new Scanner(System.in);
		String rowString = "";
		char rowChar = ' ';
		String colString = "";
		char colChar = ' ';
		int row = 0;
		int col = 0;
		String restart = "";
		for (int i = 0; i < battleshipVariables.board1.length; i++) {
			System.out.println(" ");
			for (int a = 0; a < battleshipVariables.board1[0].length; a++) {
				System.out.print(battleshipVariables.board1[i][a] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Player 1, time to place your carrier(5 spots).");
		for (int i = 1; i < 6; i++) {
			while (true) {
				System.out.println("\n");
				System.out.println("Enter the row of spot " + i + ".");
				rowString = kbReader.nextLine().toUpperCase();
				// System.out.println(rowString);
				rowChar = rowString.charAt(0);
				// System.out.println(rowChar);
				if (i != 1 && Math.abs(Character.getNumericValue(rowChar) - row) > 1)

				{
					System.out.println("Invalid input! Try again.");
				} else if (Character.getNumericValue(rowChar) > 10 || Character.getNumericValue(rowChar) < 1
				// || rowString.matches("[a-z]")
				) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			while (true) {
				System.out.println("Enter the column of spot " + i + ".");
				colString = kbReader.nextLine().toUpperCase();
				// System.out.println(colString);
				colChar = colString.charAt(0);
				// System.out.println(colChar);
				if (Character.getNumericValue(colChar) - 9 > 10 || Character.getNumericValue(colChar) < 1
						|| Math.abs((Character.getNumericValue(colChar) - 9) - col) > 1 && row != 0 && col != 0
						|| colString.matches("\\d")
				// || colString.matches("[a-z]")
				) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			if ((Character.getNumericValue(rowChar) == row && Character.getNumericValue(colChar) - 9 == col)
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'C'
					|| (battleshipVariables.board1[Character.getNumericValue(rowChar) - 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'C' && Character.getNumericValue(rowChar) != 1)
					|| (!colString.equals("J")
							&& battleshipVariables.board1[Character.getNumericValue(rowChar)
									- 1][Character.getNumericValue(colChar) - 9 + 1] == 'C'
							&& Character.getNumericValue(rowChar) != 1)
					|| (!rowString.equals("A") && battleshipVariables.board1[Character.getNumericValue(rowChar) + 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'C')
					|| !rowString.equals("A") && !colString.equals("J")
							&& battleshipVariables.board1[Character.getNumericValue(rowChar)
									+ 1][Character.getNumericValue(colChar) - 9 + 1] == 'C'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'B'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'B' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'B' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'B'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'B'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'U'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'U' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'U' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'U'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'U'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'S'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'S' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'S' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'S'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'S'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'D'
			// ||
			// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
			// == 'D' && Character.getNumericValue(rowChar) != 1)
			// || (!colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
			// == 'D' && Character.getNumericValue(rowChar) != 1)
			// ||
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
			// == 'D'
			// || !colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
			// == 'D')
			) {
				System.out.println("Invalid inputs! Try again. Do you need to clear the carrier? (yes/no)");
				restart = kbReader.nextLine();
				if (restart.matches("(?i)yes")) {
					i = 0;
					row = 0;
					col = 0;
					for (int r = 1; r < battleshipVariables.board1.length; r++) {
						for (int a = 1; a < battleshipVariables.board1[0].length; a++) {
							if (battleshipVariables.board1[r][a] == 'C') {
								battleshipVariables.board1[r][a] = ' ';
							}
						}
					}
					continue;
				} else if (restart.matches("(?i)no")) {
					i -= 1;
					continue;
				}
			}
			row = Character.getNumericValue(rowChar);
			col = Character.getNumericValue(colChar) - 9;

			battleshipVariables.board1[row][col] = 'C';
			for (int b = 0; b < battleshipVariables.board1.length; b++) {
				System.out.println(" ");
				for (int a = 0; a < battleshipVariables.board1[0].length; a++) {
					System.out.print(battleshipVariables.board1[b][a] + " ");
				}
			}
		}
		return battleshipVariables.board1;
	}

	public static char[][] putCarrier2() {
		Scanner kbReader = new Scanner(System.in);
		String rowString = "";
		char rowChar = ' ';
		String colString = "";
		char colChar = ' ';
		int row = 0;
		int col = 0;
		String restart = "";
		for (int i = 0; i < battleshipVariables.board2.length; i++) {
			System.out.println(" ");
			for (int a = 0; a < battleshipVariables.board2[0].length; a++) {
				System.out.print(battleshipVariables.board2[i][a] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Player 2, time to place your carrier(5 spots).");
		for (int i = 1; i < 6; i++) {
			while (true) {
				System.out.println("\n");
				System.out.println("Enter the row of spot " + i + ".");
				rowString = kbReader.nextLine().toUpperCase();
				rowChar = rowString.charAt(0);
				if (i != 1 && Math.abs(Character.getNumericValue(rowChar) - row) > 1)

				{
					System.out.println("Invalid input! Try again.");
				} else if (Character.getNumericValue(rowChar) > 10 || Character.getNumericValue(rowChar) < 1) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			while (true) {
				System.out.println("Enter the column of spot " + i + ".");
				colString = kbReader.nextLine().toUpperCase();
				colChar = colString.charAt(0);
				if (Character.getNumericValue(colChar) - 9 > 10 || Character.getNumericValue(colChar) < 1
						|| Math.abs((Character.getNumericValue(colChar) - 9) - col) > 1 && row != 0 && col != 0
						|| colString.matches("\\d"))

				{
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			if ((Character.getNumericValue(rowChar) == row && Character.getNumericValue(colChar) - 9 == col)
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'c'
					|| (battleshipVariables.board2[Character.getNumericValue(rowChar) - 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'c' && Character.getNumericValue(rowChar) != 1)
					|| (!colString.equals("J")
							&& battleshipVariables.board2[Character.getNumericValue(rowChar)
									- 1][Character.getNumericValue(colChar) - 9 + 1] == 'c'
							&& Character.getNumericValue(rowChar) != 1)
					|| !rowString.equals("A") && battleshipVariables.board2[Character.getNumericValue(rowChar) + 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'c'
					|| !rowString.equals("A") && !colString.equals("J")
							&& battleshipVariables.board2[Character.getNumericValue(rowChar)
									+ 1][Character.getNumericValue(colChar) - 9 + 1] == 'c'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'b'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'b' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'b' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'b'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'b'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'u'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'u' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'u' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'u'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'u'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 's'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 's' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 's' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 's'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 's'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'd'
			// ||
			// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
			// == 'd' && Character.getNumericValue(rowChar) != 1)
			// || (!colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
			// == 'd' && Character.getNumericValue(rowChar) != 1)
			// ||
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
			// == 'd'
			// || !colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
			// == 'd')
			) {
				System.out.println("Invalid inputs! Try again. Do you need to clear the carrier? (yes/no)");
				restart = kbReader.nextLine();
				if (restart.matches("(?i)yes")) {
					i = 0;
					row = 0;
					col = 0;
					for (int r = 1; r < battleshipVariables.board2.length; r++) {
						for (int a = 1; a < battleshipVariables.board2[0].length; a++) {
							if (battleshipVariables.board2[r][a] == 'c') {
								battleshipVariables.board2[r][a] = ' ';
							}
						}
					}
					continue;
				} else if (restart.matches("(?i)no")) {
					i -= 1;
					continue;
				}
			}
			row = Character.getNumericValue(rowChar);
			col = Character.getNumericValue(colChar) - 9;

			battleshipVariables.board2[row][col] = 'c';
			for (int b = 0; b < battleshipVariables.board2.length; b++) {
				System.out.println(" ");
				for (int a = 0; a < battleshipVariables.board2[0].length; a++) {
					System.out.print(battleshipVariables.board2[b][a] + " ");
				}
			}
		}
		return battleshipVariables.board2;
	}

	public static char[][] putBattleship1() {
		Scanner kbReader = new Scanner(System.in);
		String rowString = "";
		char rowChar = ' ';
		String colString = "";
		char colChar = ' ';
		int row = 0;
		int col = 0;
		String restart = "";
		for (int i = 0; i < battleshipVariables.board1.length; i++) {
			System.out.println(" ");
			for (int a = 0; a < battleshipVariables.board1[0].length; a++) {
				System.out.print(battleshipVariables.board1[i][a] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Player 1, time to place your battleship(4 spots).");
		for (int i = 1; i < 5; i++) {
			while (true) {
				System.out.println("\n");
				System.out.println("Enter the row of spot " + i + ".");
				rowString = kbReader.nextLine().toUpperCase();
				rowChar = rowString.charAt(0);
				if (i != 1 && Math.abs(Character.getNumericValue(rowChar) - row) > 1)

				{
					System.out.println("Invalid input! Try again.");
				} else if (Character.getNumericValue(rowChar) > 10 || Character.getNumericValue(rowChar) < 1) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			while (true) {
				System.out.println("Enter the column of spot " + i + ".");
				colString = kbReader.nextLine().toUpperCase();
				colChar = colString.charAt(0);
				if (Character.getNumericValue(colChar) - 9 > 10 || Character.getNumericValue(colChar) < 1
						|| Math.abs((Character.getNumericValue(colChar) - 9) - col) > 1 && row != 0 && col != 0
						|| colString.matches("\\d"))

				{
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			//System.out.println(Character.getNumericValue(rowChar));
			if ((Character.getNumericValue(rowChar) == row && Character.getNumericValue(colChar) - 9 == col)
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'C'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'C' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'C' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'C'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'C'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'B'
					|| (battleshipVariables.board1[Character.getNumericValue(rowChar) - 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'B' && Character.getNumericValue(rowChar) != 1)
					|| (!colString.equals("J")
							&& battleshipVariables.board1[Character.getNumericValue(rowChar)
									- 1][Character.getNumericValue(colChar) - 9 + 1] == 'B'
							&& Character.getNumericValue(rowChar) != 1)
					|| !rowString.equals("A") && battleshipVariables.board1[Character.getNumericValue(rowChar) + 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'B'
					|| !rowString.equals("A") && !colString.equals("J")
							&& battleshipVariables.board1[Character.getNumericValue(rowChar)
									+ 1][Character.getNumericValue(colChar) - 9 + 1] == 'B'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'U'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'U' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'U' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'U'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'U'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'S'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'S' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'S' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'S'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'S'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'D'
			// ||
			// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
			// == 'D' && Character.getNumericValue(rowChar) != 1)
			// || (!colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
			// == 'D' && Character.getNumericValue(rowChar) != 1)
			// ||
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
			// == 'D'
			// || !colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
			// == 'D')
			) {
				System.out.println("Invalid inputs! Try again. Do you need to clear the battleship? (yes/no)");
				restart = kbReader.nextLine();
				if (restart.matches("(?i)yes")) {
					i = 0;
					row = 0;
					col = 0;
					for (int r = 1; r < battleshipVariables.board1.length; r++) {
						for (int a = 1; a < battleshipVariables.board1[0].length; a++) {
							if (battleshipVariables.board1[r][a] == 'B') {
								battleshipVariables.board1[r][a] = ' ';
							}
						}
					}
					continue;
				} else if (restart.matches("(?i)no")) {
					i -= 1;
					continue;
				}
			}
			row = Character.getNumericValue(rowChar);
			col = Character.getNumericValue(colChar) - 9;

			battleshipVariables.board1[row][col] = 'B';
			for (int b = 0; b < battleshipVariables.board1.length; b++) {
				System.out.println(" ");
				for (int a = 0; a < battleshipVariables.board1[0].length; a++) {
					System.out.print(battleshipVariables.board1[b][a] + " ");
				}
			}
		}
		return battleshipVariables.board1;
	}

	public static char[][] putBattleship2() {
		Scanner kbReader = new Scanner(System.in);
		String rowString = "";
		char rowChar = ' ';
		String colString = "";
		char colChar = ' ';
		int row = 0;
		int col = 0;
		String restart = "";
		for (int i = 0; i < battleshipVariables.board2.length; i++) {
			System.out.println(" ");
			for (int a = 0; a < battleshipVariables.board2[0].length; a++) {
				System.out.print(battleshipVariables.board2[i][a] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Player 2, time to place your battleship(4 spots).");
		for (int i = 1; i < 5; i++) {
			while (true) {
				System.out.println("\n");
				System.out.println("Enter the row of spot " + i + ".");
				rowString = kbReader.nextLine().toUpperCase();
				rowChar = rowString.charAt(0);
				if (i != 1 && Math.abs(Character.getNumericValue(rowChar) - row) > 1)

				{
					System.out.println("Invalid input! Try again.");
				} else if (Character.getNumericValue(rowChar) > 10 || Character.getNumericValue(rowChar) < 1) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			while (true) {
				System.out.println("Enter the column of spot " + i + ".");
				colString = kbReader.nextLine().toUpperCase();
				colChar = colString.charAt(0);
				if (Character.getNumericValue(colChar) - 9 > 10 || Character.getNumericValue(colChar) < 1
						|| Math.abs((Character.getNumericValue(colChar) - 9) - col) > 1 && row != 0 && col != 0

				) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			if ((Character.getNumericValue(rowChar) == row && Character.getNumericValue(colChar) - 9 == col)
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'c'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'c' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'c' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'c'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'c'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'b'
					|| (battleshipVariables.board2[Character.getNumericValue(rowChar) - 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'b' && Character.getNumericValue(rowChar) != 1)
					|| (!colString.equals("J")
							&& battleshipVariables.board2[Character.getNumericValue(rowChar)
									- 1][Character.getNumericValue(colChar) - 9 + 1] == 'b'
							&& Character.getNumericValue(rowChar) != 1)
					|| !rowString.equals("A") && battleshipVariables.board2[Character.getNumericValue(rowChar) + 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'b'
					|| !rowString.equals("A") && !colString.equals("J")
							&& battleshipVariables.board2[Character.getNumericValue(rowChar)
									+ 1][Character.getNumericValue(colChar) - 9 + 1] == 'b'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'u'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'u' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'u' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'u'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'u'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 's'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 's' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 's' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 's'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 's'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'd'
			// ||
			// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
			// == 'd' && Character.getNumericValue(rowChar) != 1)
			// || (!colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
			// == 'd' && Character.getNumericValue(rowChar) != 1)
			// ||
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
			// == 'd'
			// || !colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
			// == 'd')
			) {
				System.out.println("Invalid inputs! Try again. Do you need to clear the battleship? (yes/no)");
				restart = kbReader.nextLine();
				if (restart.matches("(?i)yes")) {
					i = 0;
					row = 0;
					col = 0;
					for (int r = 1; r < battleshipVariables.board2.length; r++) {
						for (int a = 1; a < battleshipVariables.board2[0].length; a++) {
							if (battleshipVariables.board2[r][a] == 'b') {
								battleshipVariables.board2[r][a] = ' ';
							}
						}
					}
					continue;
				} else if (restart.matches("(?i)no")) {
					i -= 1;
					continue;
				}
			}
			row = Character.getNumericValue(rowChar);
			col = Character.getNumericValue(colChar) - 9;

			battleshipVariables.board2[row][col] = 'b';
			for (int b = 0; b < battleshipVariables.board2.length; b++) {
				System.out.println(" ");
				for (int a = 0; a < battleshipVariables.board2[0].length; a++) {
					System.out.print(battleshipVariables.board2[b][a] + " ");
				}
			}
		}
		return battleshipVariables.board2;
	}

	public static char[][] putCruiser1() {
		Scanner kbReader = new Scanner(System.in);
		String rowString = "";
		char rowChar = ' ';
		String colString = "";
		char colChar = ' ';
		int row = 0;
		int col = 0;
		String restart = "";
		for (int i = 0; i < battleshipVariables.board1.length; i++) {
			System.out.println(" ");
			for (int a = 0; a < battleshipVariables.board1[0].length; a++) {
				System.out.print(battleshipVariables.board1[i][a] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Player 1, time to place your cruiser(3 spots).");
		for (int i = 1; i < 4; i++) {
			while (true) {
				System.out.println("\n");
				System.out.println("Enter the row of spot " + i + ".");
				rowString = kbReader.nextLine().toUpperCase();
				rowChar = rowString.charAt(0);
				if (i != 1 && Math.abs(Character.getNumericValue(rowChar) - row) > 1)

				{
					System.out.println("Invalid input! Try again.");
				} else if (Character.getNumericValue(rowChar) > 10 || Character.getNumericValue(rowChar) < 1) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			while (true) {
				System.out.println("Enter the column of spot " + i + ".");
				colString = kbReader.nextLine().toUpperCase();
				colChar = colString.charAt(0);
				if (Character.getNumericValue(colChar) - 9 > 10 || Character.getNumericValue(colChar) < 1
						|| Math.abs((Character.getNumericValue(colChar) - 9) - col) > 1 && row != 0 && col != 0
						|| colString.matches("\\d")

				) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			if ((Character.getNumericValue(rowChar) == row && Character.getNumericValue(colChar) - 9 == col)
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'C'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'C' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'C' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'C'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'C'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'B'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'B' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'B' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'B'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'B'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'U'
					|| (battleshipVariables.board1[Character.getNumericValue(rowChar) - 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'U' && Character.getNumericValue(rowChar) != 1)
					|| (!colString.equals("J")
							&& battleshipVariables.board1[Character.getNumericValue(rowChar)
									- 1][Character.getNumericValue(colChar) - 9 + 1] == 'U'
							&& Character.getNumericValue(rowChar) != 1)
					|| !rowString.equals("A") && battleshipVariables.board1[Character.getNumericValue(rowChar) + 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'U'
					|| !rowString.equals("A") && !colString.equals("J")
							&& battleshipVariables.board1[Character.getNumericValue(rowChar)
									+ 1][Character.getNumericValue(colChar) - 9 + 1] == 'U'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'S'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'S' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'S' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'S'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'S'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'D'
			// ||
			// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
			// == 'D' && Character.getNumericValue(rowChar) != 1)
			// || (!colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
			// == 'D' && Character.getNumericValue(rowChar) != 1)
			// ||
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
			// == 'D'
			// || !colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
			// == 'D')
			) {
				System.out.println("Invalid inputs! Try again. Do you need to clear the cruiser? (yes/no)");
				restart = kbReader.nextLine();
				if (restart.matches("(?i)yes")) {
					i = 0;
					row = 0;
					col = 0;
					for (int r = 1; r < battleshipVariables.board1.length; r++) {
						for (int a = 1; a < battleshipVariables.board1[0].length; a++) {
							if (battleshipVariables.board1[r][a] == 'U') {
								battleshipVariables.board1[r][a] = ' ';
							}
						}
					}
					continue;
				} else if (restart.matches("(?i)no")) {
					i -= 1;
					continue;
				}
			}
			row = Character.getNumericValue(rowChar);
			col = Character.getNumericValue(colChar) - 9;

			battleshipVariables.board1[row][col] = 'U';
			for (int b = 0; b < battleshipVariables.board1.length; b++) {
				System.out.println(" ");
				for (int a = 0; a < battleshipVariables.board1[0].length; a++) {
					System.out.print(battleshipVariables.board1[b][a] + " ");
				}
			}
		}
		return battleshipVariables.board1;
	}

	public static char[][] putCruiser2() {
		Scanner kbReader = new Scanner(System.in);
		String rowString = "";
		char rowChar = ' ';
		String colString = "";
		char colChar = ' ';
		int row = 0;
		int col = 0;
		String restart = "";
		for (int i = 0; i < battleshipVariables.board2.length; i++) {
			System.out.println(" ");
			for (int a = 0; a < battleshipVariables.board2[0].length; a++) {
				System.out.print(battleshipVariables.board2[i][a] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Player 2, time to place your cruiser(3spots).");
		for (int i = 1; i < 4; i++) {
			while (true) {
				System.out.println("\n");
				System.out.println("Enter the row of spot " + i + ".");
				rowString = kbReader.nextLine().toUpperCase();
				rowChar = rowString.charAt(0);
				if (i != 1 && Math.abs(Character.getNumericValue(rowChar) - row) > 1)

				{
					System.out.println("Invalid input! Try again.");
				} else if (Character.getNumericValue(rowChar) > 10 || Character.getNumericValue(rowChar) < 1) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			while (true) {
				System.out.println("Enter the column of spot " + i + ".");
				colString = kbReader.nextLine().toUpperCase();
				colChar = colString.charAt(0);
				if (Character.getNumericValue(colChar) - 9 > 10 || Character.getNumericValue(colChar) < 1
						|| Math.abs((Character.getNumericValue(colChar) - 9) - col) > 1 && row != 0 && col != 0
						|| colString.matches("\\d")

				) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			if ((Character.getNumericValue(rowChar) == row && Character.getNumericValue(colChar) - 9 == col)
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'c'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'c' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'c' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'c'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'c'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'b'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'b' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'b' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'b'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'b'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'u'
					|| (battleshipVariables.board2[Character.getNumericValue(rowChar) - 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'u' && Character.getNumericValue(rowChar) != 1)
					|| (!colString.equals("J")
							&& battleshipVariables.board2[Character.getNumericValue(rowChar)
									- 1][Character.getNumericValue(colChar) - 9 + 1] == 'u'
							&& Character.getNumericValue(rowChar) != 1)
					|| !rowString.equals("A") && battleshipVariables.board2[Character.getNumericValue(rowChar) + 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'u'
					|| !rowString.equals("A") && !colString.equals("J")
							&& battleshipVariables.board2[Character.getNumericValue(rowChar)
									+ 1][Character.getNumericValue(colChar) - 9 + 1] == 'u'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 's'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 's' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 's' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 's'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 's'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'd'
			// ||
			// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
			// == 'd' && Character.getNumericValue(rowChar) != 1)
			// || (!colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
			// == 'd' && Character.getNumericValue(rowChar) != 1)
			// ||
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
			// == 'd'
			// || !colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
			// == 'd')
			) {
				System.out.println("Invalid inputs! Try again. Do you need to clear the cruiser? (yes/no)");
				restart = kbReader.nextLine();
				if (restart.matches("(?i)yes")) {
					i = 0;
					row = 0;
					col = 0;
					for (int r = 1; r < battleshipVariables.board2.length; r++) {
						for (int a = 1; a < battleshipVariables.board2[0].length; a++) {
							if (battleshipVariables.board2[r][a] == 'u') {
								battleshipVariables.board2[r][a] = ' ';
							}
						}
					}
					continue;
				} else if (restart.matches("(?i)no")) {
					i -= 1;
					continue;
				}
			}
			row = Character.getNumericValue(rowChar);
			col = Character.getNumericValue(colChar) - 9;

			battleshipVariables.board2[row][col] = 'u';
			for (int b = 0; b < battleshipVariables.board2.length; b++) {
				System.out.println(" ");
				for (int a = 0; a < battleshipVariables.board2[0].length; a++) {
					System.out.print(battleshipVariables.board2[b][a] + " ");
				}
			}
		}
		return battleshipVariables.board2;
	}

	public static char[][] putSubmarine1() {
		Scanner kbReader = new Scanner(System.in);
		String rowString = "";
		char rowChar = ' ';
		String colString = "";
		char colChar = ' ';
		int row = 0;
		int col = 0;
		String restart = "";
		for (int i = 0; i < battleshipVariables.board1.length; i++) {
			System.out.println(" ");
			for (int a = 0; a < battleshipVariables.board1[0].length; a++) {
				System.out.print(battleshipVariables.board1[i][a] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Player 1, time to place your submarine(3 spots).");
		for (int i = 1; i < 4; i++) {
			while (true) {
				System.out.println("\n");
				System.out.println("Enter the row of spot " + i + ".");
				rowString = kbReader.nextLine().toUpperCase();
				rowChar = rowString.charAt(0);
				if (i != 1 && Math.abs(Character.getNumericValue(rowChar) - row) > 1)

				{
					System.out.println("Invalid input! Try again.");
				} else if (Character.getNumericValue(rowChar) > 10 || Character.getNumericValue(rowChar) < 1) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			while (true) {
				System.out.println("Enter the column of spot " + i + ".");
				colString = kbReader.nextLine().toUpperCase();
				colChar = colString.charAt(0);
				if (Character.getNumericValue(colChar) - 9 > 10 || Character.getNumericValue(colChar) < 1
						|| Math.abs((Character.getNumericValue(colChar) - 9) - col) > 1 && row != 0 && col != 0
						|| colString.matches("\\d")

				) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			if ((Character.getNumericValue(rowChar) == row && Character.getNumericValue(colChar) - 9 == col)
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'C'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'C' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'C' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'C'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'C'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'B'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'B' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'B' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'B'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'B'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'U'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'U' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'U' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'U'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'U'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'S'
					|| (battleshipVariables.board1[Character.getNumericValue(rowChar) - 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'S' && Character.getNumericValue(rowChar) != 1)
					|| (!colString.equals("J")
							&& battleshipVariables.board1[Character.getNumericValue(rowChar)
									- 1][Character.getNumericValue(colChar) - 9 + 1] == 'S'
							&& Character.getNumericValue(rowChar) != 1)
					|| !rowString.equals("A") && battleshipVariables.board1[Character.getNumericValue(rowChar) + 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'S'
					|| !rowString.equals("A") && !colString.equals("J")
							&& battleshipVariables.board1[Character.getNumericValue(rowChar)
									+ 1][Character.getNumericValue(colChar) - 9 + 1] == 'S'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'D'
			// ||
			// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
			// == 'D' && Character.getNumericValue(rowChar) != 1)
			// || (!colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
			// == 'D' && Character.getNumericValue(rowChar) != 1)
			// ||
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
			// == 'D'
			// || !colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
			// == 'D')
			) {
				System.out.println("Invalid inputs! Try again. Do you need to clear the submarine? (yes/no)");
				restart = kbReader.nextLine();
				if (restart.matches("(?i)yes")) {
					i = 0;
					row = 0;
					col = 0;
					for (int r = 1; r < battleshipVariables.board1.length; r++) {
						for (int a = 1; a < battleshipVariables.board1[0].length; a++) {
							if (battleshipVariables.board1[r][a] == 'S') {
								battleshipVariables.board1[r][a] = ' ';
							}
						}
					}
					continue;
				} else if (restart.matches("(?i)no")) {
					i -= 1;
					continue;
				}
			}
			row = Character.getNumericValue(rowChar);
			col = Character.getNumericValue(colChar) - 9;

			battleshipVariables.board1[row][col] = 'S';
			for (int b = 0; b < battleshipVariables.board1.length; b++) {
				System.out.println(" ");
				for (int a = 0; a < battleshipVariables.board1[0].length; a++) {
					System.out.print(battleshipVariables.board1[b][a] + " ");
				}
			}
		}
		return battleshipVariables.board1;
	}

	public static char[][] putSubmarine2() {
		Scanner kbReader = new Scanner(System.in);
		String rowString = "";
		char rowChar = ' ';
		String colString = "";
		char colChar = ' ';
		int row = 0;
		int col = 0;
		String restart = "";
		for (int i = 0; i < battleshipVariables.board2.length; i++) {
			System.out.println(" ");
			for (int a = 0; a < battleshipVariables.board2[0].length; a++) {
				System.out.print(battleshipVariables.board2[i][a] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Player 2, time to place your submarine(3 spots).");
		for (int i = 1; i < 4; i++) {
			while (true) {
				System.out.println("\n");
				System.out.println("Enter the row of spot " + i + ".");
				rowString = kbReader.nextLine().toUpperCase();
				rowChar = rowString.charAt(0);
				if (i != 1 && Math.abs(Character.getNumericValue(rowChar) - row) > 1)

				{
					System.out.println("Invalid input! Try again.");
				} else if (Character.getNumericValue(rowChar) > 10 || Character.getNumericValue(rowChar) < 1) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			while (true) {
				System.out.println("Enter the column of spot " + i + ".");
				colString = kbReader.nextLine().toUpperCase();
				colChar = colString.charAt(0);
				if (Character.getNumericValue(colChar) - 9 > 10 || Character.getNumericValue(colChar) < 1
						|| Math.abs((Character.getNumericValue(colChar) - 9) - col) > 1 && row != 0 && col != 0
						|| colString.matches("\\d")

				) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			if ((Character.getNumericValue(rowChar) == row && Character.getNumericValue(colChar) - 9 == col)
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'c'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'c' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'c' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'c'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'c'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'b'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'b' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'b' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'b'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'b'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'u'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'u' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'u' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'u'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'u'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 's'
					|| (battleshipVariables.board2[Character.getNumericValue(rowChar) - 1][Character
							.getNumericValue(colChar) - 9 - 1] == 's' && Character.getNumericValue(rowChar) != 1)
					|| (!colString.equals("J")
							&& battleshipVariables.board2[Character.getNumericValue(rowChar)
									- 1][Character.getNumericValue(colChar) - 9 + 1] == 's'
							&& Character.getNumericValue(rowChar) != 1)
					|| !rowString.equals("A") && battleshipVariables.board2[Character.getNumericValue(rowChar) + 1][Character
							.getNumericValue(colChar) - 9 - 1] == 's'
					|| !rowString.equals("A") && !colString.equals("J")
							&& battleshipVariables.board2[Character.getNumericValue(rowChar)
									+ 1][Character.getNumericValue(colChar) - 9 + 1] == 's'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'd'
			// ||
			// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
			// == 'd' && Character.getNumericValue(rowChar) != 1)
			// || (!colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
			// == 'd' && Character.getNumericValue(rowChar) != 1)
			// ||
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
			// == 'd'
			// || !colString.equals("J") &&
			// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
			// == 'd')
			) {
				System.out.println("Invalid inputs! Try again. Do you need to clear the submarine? (yes/no)");
				restart = kbReader.nextLine();
				if (restart.matches("(?i)yes")) {
					i = 0;
					row = 0;
					col = 0;
					for (int r = 1; r < battleshipVariables.board2.length; r++) {
						for (int a = 1; a < battleshipVariables.board2[0].length; a++) {
							if (battleshipVariables.board2[r][a] == 's') {
								battleshipVariables.board2[r][a] = ' ';
							}
						}
					}
					continue;
				} else if (restart.matches("(?i)no")) {
					i -= 1;
					continue;
				}
			}
			row = Character.getNumericValue(rowChar);
			col = Character.getNumericValue(colChar) - 9;

			battleshipVariables.board2[row][col] = 's';
			for (int b = 0; b < battleshipVariables.board2.length; b++) {
				System.out.println(" ");
				for (int a = 0; a < battleshipVariables.board2[0].length; a++) {
					System.out.print(battleshipVariables.board2[b][a] + " ");
				}
			}
		}
		return battleshipVariables.board2;
	}

	public static char[][] putDestroyer1() {
		Scanner kbReader = new Scanner(System.in);
		String rowString = "";
		char rowChar = ' ';
		String colString = "";
		char colChar = ' ';
		int row = 0;
		int col = 0;
		String restart = "";
		for (int i = 0; i < battleshipVariables.board1.length; i++) {
			System.out.println(" ");
			for (int a = 0; a < battleshipVariables.board1[0].length; a++) {
				System.out.print(battleshipVariables.board1[i][a] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Player 1, time to place your destroyer(2 spots).");
		for (int i = 1; i < 3; i++) {
			while (true) {
				System.out.println("\n");
				System.out.println("Enter the row of spot " + i + ".");
				rowString = kbReader.nextLine().toUpperCase();
				rowChar = rowString.charAt(0);
				if (i != 1 && Math.abs(Character.getNumericValue(rowChar) - row) > 1)

				{
					System.out.println("Invalid input! Try again.");
				} else if (Character.getNumericValue(rowChar) > 10 || Character.getNumericValue(rowChar) < 1) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			while (true) {
				System.out.println("Enter the column of spot " + i + ".");
				colString = kbReader.nextLine().toUpperCase();
				colChar = colString.charAt(0);
				if (Character.getNumericValue(colChar) - 9 > 10 || Character.getNumericValue(colChar) < 1
						|| Math.abs((Character.getNumericValue(colChar) - 9) - col) > 1 && row != 0 && col != 0
						|| colString.matches("\\d")

				) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			if ((Character.getNumericValue(rowChar) == row && Character.getNumericValue(colChar) - 9 == col)
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'C'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'C' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'C' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'C'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'C'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'B'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'B' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'B' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'B'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'B'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'U'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'U' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'U' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'U'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'U'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'S'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'S' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'S' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'S'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'S'
					|| battleshipVariables.board1[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'D'
					|| (battleshipVariables.board1[Character.getNumericValue(rowChar) - 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'D' && Character.getNumericValue(rowChar) != 1)
					|| (!colString.equals("J")
							&& battleshipVariables.board1[Character.getNumericValue(rowChar)
									- 1][Character.getNumericValue(colChar) - 9 + 1] == 'D'
							&& Character.getNumericValue(rowChar) != 1)
					|| !rowString.equals("A") && battleshipVariables.board1[Character.getNumericValue(rowChar) + 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'D'
					|| !rowString.equals("A") && !colString.equals("J") && battleshipVariables.board1[Character.getNumericValue(rowChar)
							+ 1][Character.getNumericValue(colChar) - 9 + 1] == 'D') {
				System.out.println("Invalid inputs! Try again. Do you need to clear the destroyer? (yes/no)");
				restart = kbReader.nextLine();
				if (restart.matches("(?i)yes")) {
					i = 0;
					row = 0;
					col = 0;
					for (int r = 1; r < battleshipVariables.board1.length; r++) {
						for (int a = 1; a < battleshipVariables.board1[0].length; a++) {
							if (battleshipVariables.board1[r][a] == 'D') {
								battleshipVariables.board1[r][a] = ' ';
							}
						}
					}
					continue;
				} else if (restart.matches("(?i)no")) {
					i -= 1;
					continue;
				}
			}
			row = Character.getNumericValue(rowChar);
			col = Character.getNumericValue(colChar) - 9;

			battleshipVariables.board1[row][col] = 'D';
			for (int b = 0; b < battleshipVariables.board1.length; b++) {
				System.out.println(" ");
				for (int a = 0; a < battleshipVariables.board1[0].length; a++) {
					System.out.print(battleshipVariables.board1[b][a] + " ");
				}
			}
		}
		return battleshipVariables.board1;
	}

	public static char[][] putDestroyer2() {
		Scanner kbReader = new Scanner(System.in);
		String rowString = "";
		char rowChar = ' ';
		String colString = "";
		char colChar = ' ';
		int row = 0;
		int col = 0;
		String restart = "";
		for (int i = 0; i < battleshipVariables.board2.length; i++) {
			System.out.println(" ");
			for (int a = 0; a < battleshipVariables.board2[0].length; a++) {
				System.out.print(battleshipVariables.board2[i][a] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Player 2, time to place your destroyer(2 spots).");
		for (int i = 1; i < 3; i++) {
			while (true) {
				System.out.println("\n");
				System.out.println("Enter the row of spot " + i + ".");
				rowString = kbReader.nextLine().toUpperCase();
				rowChar = rowString.charAt(0);
				if (i != 1 && Math.abs(Character.getNumericValue(rowChar) - row) > 1)

				{
					System.out.println("Invalid input! Try again.");
				} else if (Character.getNumericValue(rowChar) > 10 || Character.getNumericValue(rowChar) < 1) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			while (true) {
				System.out.println("Enter the column of spot " + i + ".");
				colString = kbReader.nextLine().toUpperCase();
				colChar = colString.charAt(0);
				if (Character.getNumericValue(colChar) - 9 > 10 || Character.getNumericValue(colChar) < 1
						|| Math.abs((Character.getNumericValue(colChar) - 9) - col) > 1 && row != 0 && col != 0
						|| colString.matches("\\d")

				) {
					System.out.println("Invalid input! Try again.");
				} else {
					break;
				}
			}
			if ((Character.getNumericValue(rowChar) == row && Character.getNumericValue(colChar) - 9 == col)
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'c'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'c' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'c' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'c'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'c'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'b'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'b' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'b' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'b'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'b'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'u'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 'u' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 'u' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 'u'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 'u'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 's'
					// ||
					// (battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9-1]
					// == 's' && Character.getNumericValue(rowChar) != 1)
					// || (!colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)-1][Character.getNumericValue(colChar)-9+1]
					// == 's' && Character.getNumericValue(rowChar) != 1)
					// ||
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9-1]
					// == 's'
					// || !colString.equals("J") &&
					// battleshipVariables.board1[Character.getNumericValue(rowChar)+1][Character.getNumericValue(colChar)-9+1]
					// == 's'
					|| battleshipVariables.board2[Character.getNumericValue(rowChar)][Character.getNumericValue(colChar)
							- 9] == 'd'
					|| (battleshipVariables.board2[Character.getNumericValue(rowChar) - 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'd' && Character.getNumericValue(rowChar) != 1)
					|| (!colString.equals("J")
							&& battleshipVariables.board2[Character.getNumericValue(rowChar)
									- 1][Character.getNumericValue(colChar) - 9 + 1] == 'd'
							&& Character.getNumericValue(rowChar) != 1)
					|| !rowString.equals("A") && battleshipVariables.board2[Character.getNumericValue(rowChar) + 1][Character
							.getNumericValue(colChar) - 9 - 1] == 'd'
					|| !rowString.equals("A") && !colString.equals("J") && battleshipVariables.board2[Character.getNumericValue(rowChar)
							+ 1][Character.getNumericValue(colChar) - 9 + 1] == 'd') {
				System.out.println("Invalid inputs! Try again. Do you need to clear the destroyer? (yes/no)");
				restart = kbReader.nextLine();
				if (restart.matches("(?i)yes")) {
					i = 0;
					row = 0;
					col = 0;
					for (int r = 1; r < battleshipVariables.board2.length; r++) {
						for (int a = 1; a < battleshipVariables.board2[0].length; a++) {
							if (battleshipVariables.board2[r][a] == 'd') {
								battleshipVariables.board2[r][a] = ' ';
							}
						}
					}
					continue;
				} else if (restart.matches("(?i)no")) {
					i -= 1;
					continue;
				}
			}
			row = Character.getNumericValue(rowChar);
			col = Character.getNumericValue(colChar) - 9;

			battleshipVariables.board2[row][col] = 'd';
			for (int b = 0; b < battleshipVariables.board2.length; b++) {
				System.out.println(" ");
				for (int a = 0; a < battleshipVariables.board2[0].length; a++) {
					System.out.print(battleshipVariables.board2[b][a] + " ");
				}
			}
		}
		return battleshipVariables.board2;
	}

	public static char[][] p1Shoot() {
		Scanner kbReader = new Scanner(System.in);
		char row;
		char col;
		while (true) {
			System.out.println("\n");
			System.out.println("Player 1, enter the row of where you want to shoot.");
			String rowString = kbReader.nextLine().toUpperCase();
			row = rowString.charAt(0);
			if (Character.getNumericValue(row) > 10 || Character.getNumericValue(row) < 1
					|| rowString.matches("[a-z]")) {
				System.out.println("Invalid input! Try again.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("Enter the column of where you want to shoot.");
			String colString = kbReader.nextLine().toUpperCase();
			col = colString.charAt(0);
			if (Character.getNumericValue(col) - 9 > 10 || Character.getNumericValue(col) - 9 < 1
					|| colString.matches("\\d") || colString.matches("[a-z]")) {
				System.out.println("Invalid input! Try again.");
			} else {
				break;
			}
		}
		if (battleshipVariables.blank2[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] != 'x'
				&& (battleshipVariables.board2[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] == 'c'
				|| battleshipVariables.board2[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] == 'b'
				|| battleshipVariables.board2[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] == 'u'
				|| battleshipVariables.board2[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] == 's'
				|| battleshipVariables.board2[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] == 'd')) {
			System.out.println("Direct hit! One of player 2's ships has been hit.");
			battleshipVariables.blank2[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] = 'x';
			battleshipVariables.p1Win++;
			for (int i = 0; i < battleshipVariables.blank2.length; i++) {
				System.out.println(" ");
				for (int a = 0; a < battleshipVariables.blank2[0].length; a++) {
					System.out.print(battleshipVariables.blank2[i][a] + " ");
				}
			}
		} else {
			System.out.println("Hit negative. Try next turn.");
		}
		return battleshipVariables.blank2;
	}

	public static char[][] p2Shoot() {
		Scanner kbReader = new Scanner(System.in);
		char row;
		char col;
		while (true) {
			System.out.println("\n");
			System.out.println("Player 2, enter the row of where you want to shoot.");
			String rowString = kbReader.nextLine().toUpperCase();
			row = rowString.charAt(0);
			if (Character.getNumericValue(row) > 10 || Character.getNumericValue(row) < 1
					|| rowString.matches("[a-z]")) {
				System.out.println("Invalid input! Try again.");
			} else {
				break;
			}
		}
		while (true) {
			System.out.println("Enter the column of where you want to shoot.");
			String colString = kbReader.nextLine().toUpperCase();
			col = colString.charAt(0);
			if (Character.getNumericValue(col) - 9 > 10 || Character.getNumericValue(col) - 9 < 1
					|| colString.matches("\\d") || colString.matches("[a-z]")) {
				System.out.println("Invalid input! Try again.");
			} else {
				break;
			}
		}
		if (battleshipVariables.blank2[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] != 'X'
				&& battleshipVariables.board1[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] == 'C'
				|| battleshipVariables.board1[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] == 'B'
				|| battleshipVariables.board1[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] == 'U'
				|| battleshipVariables.board1[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] == 'S'
				|| battleshipVariables.board1[Character.getNumericValue(row)][Character.getNumericValue(col)
						- 9] == 'D') {
			System.out.println("Direct hit! One of player 1's ships has been hit.");
			battleshipVariables.blank1[Character.getNumericValue(row)][Character.getNumericValue(col) - 9] = 'X';
			battleshipVariables.p2Win++;
			for (int i = 0; i < battleshipVariables.blank1.length; i++) {
				System.out.println(" ");
				for (int a = 0; a < battleshipVariables.blank1[0].length; a++) {
					System.out.print(battleshipVariables.blank1[i][a] + " ");
				}
			}
		} else {
			System.out.println("Hit negative. Try next turn.");
		}
		return battleshipVariables.blank1;
	}
	/*static char[][] bllsn(){
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Place the head of the boat by entering the " +
				"row and column of the coordinate.");
		System.out.println("Enter the row number.");
		String rowString = kbReader.nextLine();
		char row = rowString.charAt(0);
		System.out.println("Enter the col letter.");
		String colString = kbReader.nextLine();
		char col = colString.charAt(0);
		battleshipVariables.board1[Character.getNumericValue(row)][Character.getNumericValue(col)] = 'C';
		String direction;
		while(true){
			System.out.println("Put the rest of the boat right, left, up or down?");
			direction = kbReader.nextLine();
			if(direction.equals("up") && Character.getNumericValue(row) < 5){
				System.out.println("Not enough room. Try a different direction.");
			}
			else if(direction.equals("down") && Character.getNumericValue(row)>5){
				System.out.println("Not enough room. Try a different direction.");
			}
			else if(direction.equals("left") && Character.getNumericValue(col) < 5){
				System.out.println("Not enough room. Try a different direction.");
			}
			else if(direction.equals("right") && Character.getNumericValue(col) > 5){
				System.out.println("Not enough room. Try a different direction.");
			}
			System.out.println("If you need to replace the head of the boat, enter 'y'.");
			String replace = kbReader.nextLine();
			if(replace.equals("y")){
				battleshipVariables.board1[Character.getNumericValue(row)][Character.getNumericValue(col)] = ' ';
				break;
			}
			else{
				continue;
			}
		}
		if(direction.equals("up")){
			
		}
		
		
	}*/
}

