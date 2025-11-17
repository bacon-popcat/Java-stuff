public class PracticeProblems {
   public static int countOccurances(int[] arr, int n) {
      int Occurances = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == n) {
            Occurances += 1;
         }
      }
      return Occurances;
   }

   public static int[] reverseArray(int[] arr) {
      int[] newArr = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
         newArr[i] = arr[arr.length - i];
      }
      return newArr;
   }

   public static int sumGrid(int[][] grid) {
      int sum = 0;
      for (int x = 0; x < grid.length; x++) {
         for (int y = 0; y < grid[x].length; y++) {
            sum += grid[x][y];
         }
      }
      return sum;
   }

   public static Number fib(int n) {
      n -= 1; // We are subtracting one b/c this formula sets the first term as 1 and not 0
      double GoldenRatio = (1 + Math.sqrt(5))/2;
      double psi = (1 - Math.sqrt(5))/2;
      return Math.round((Math.pow(GoldenRatio, n) - Math.pow(psi, n))/Math.sqrt(5));
   }
}