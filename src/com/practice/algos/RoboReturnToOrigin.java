package com.practice.algos;

public class RoboReturnToOrigin {

	public static void main(String[] args) {
		System.out.println("Is robot circler move : "+isCircleMove("LRRLDUUD"));
	}

	private static boolean isCircleMove(String moves) {
		int UD = 0, LR = 0;
		for (int i = 0; i < moves.length(); i++) {
			char currentMove = moves.charAt(i);
			switch (currentMove) {
			case 'U':
				UD++;
				break;
			case 'D':
				UD--;
				break;
			case 'L':
				LR++;
				break;
			case 'R':
				LR--;
				break;
			}
		}

		return UD == 0 && LR == 0;
	}

}
