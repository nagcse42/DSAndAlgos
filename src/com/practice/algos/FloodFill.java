package com.practice.algos;

public class FloodFill {

	public static void main(String[] args) {
		int [][]image = {{1,1,1}, {1,1,0},{1,0,1}};
		int startRow=1, startColumn=1, newColor=2;
		System.out.println("Image with new color : "+fillImage(image, startRow, startColumn, newColor));
		
	}
	
	private static int[][] fillImage(int image[][], int startRow, int startColumn, int newColor){
		if(image[startRow][startColumn] == newColor) {
			return image;
		}
		fillImageColor(image, startRow, startColumn, image[startRow][startColumn], newColor);
		return image;
	}
	
	private static void fillImageColor(int image[][], int startRow, int startColumn, int color, int newColor) {
		if(startRow < 0 || startRow >= image.length || startColumn < 0 
				|| startColumn >= image.length || image[startRow][startColumn] != color) {
			return;
		}
		
		image[startRow][startColumn] = newColor;
		fillImageColor(image, startRow-1, startColumn, color, newColor);
		fillImageColor(image, startRow+1, startColumn, color, newColor);
		fillImageColor(image, startRow, startColumn-1, color, newColor);
		fillImageColor(image, startRow, startColumn+1, color, newColor);
	}

}
