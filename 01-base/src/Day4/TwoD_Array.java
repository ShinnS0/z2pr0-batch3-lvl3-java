package Day4;

import java.util.Arrays;

public class TwoD_Array {

		public static void main(String[] args) {
			int[][] marks = {
					{65,50,70,40,90},
					{100,90,99,98,89},
					{40,49,12,30,90}
			};
			String[] names = {"John","Merry","Cherry"};
			//output
			for(var r = 0; r<3; r++) {
				for(var c = 0; c<5; c++) {
					System.out.print(marks[r][c] + "\t");
				}
				System.out.println();
			}
			System.out.println("------- for each --------");
			for(int[] row : marks) {
				for(int col : row){
					System.out.print(col + "\t");
				}
				System.out.println();
			}
			System.out.println(Arrays.deepToString(marks));
			System.out.println("--------------------");
			//for String[]
			int row = marks.length;
			int col = marks[0].length;
			for(var i = 0; i < marks.length; i++) {
				var total = 0;
				for(var j =0; j<col; j++) {
					total += marks[i][j];
				}
				System.out.println("Total mark obtained by " + names[i] + " : " + total + " marks");
				System.out.println("Average mark: " + (float)total/5 + " marks");
				System.out.println("---------------------");
			}
		}
}
