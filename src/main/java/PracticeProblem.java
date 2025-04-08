public class PracticeProblem{
	static String[][] maze;
	static int paths;
	static int search(int row, int col){
			if(maze[row][col].equals("F")){
					paths++;
					return 0;
			}

			int min = 1000000001;
			if(row-1 > -1 && !maze[row-1][col].equals("*")){
					int k = search(row-1, col);
					min = k < min ? k : min;
			}
			if(col+1 < maze[row].length && !maze[row][col+1].equals("*")){
					int k = search(row, col+1);
					min = k < min ? k : min;
			}
			return min+1;
	}

	static int searchMazeMoves(String[][] arr){
			maze = arr;
			paths = 0;
			int min = search(arr.length-1, 0);
			if(min > 999999999) return -1;
			else return min;
	}

	static int noOfPaths(String[][] arr){
			maze = arr;
			paths = 0;
			search(arr.length-1, 0);
			return paths;
	}

	public static void main(String args[]){}
}