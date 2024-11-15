package hello_java;

// Two Demonsional Array Program in java

public class TwoDemonsionalArray {
	public static void main(String[] args) {
		int Building[][];
		Building = new int[3][4];

		Building[0][0] = 100;
		Building[0][1] = 101;
		Building[0][2] = 102;
		Building[0][3] = 103;
		Building[1][0] = 111;
		Building[1][1] = 112;
		Building[1][2] = 113;
		Building[1][3] = 114;
		Building[2][0] = 201;
		Building[2][1] = 202;
		Building[2][2] = 203;
		Building[2][3] = 204;

		for (int i = 0; i < Building.length; i++) {
			for (int j = 0; j < Building[i].length; j++) {
				System.out.print(Building[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
