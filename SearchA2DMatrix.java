public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };
        int target = 5;

        boolean result = searchMatrix(matrix, target);
        System.out.println("Found target: " + result);

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        int i=0,j=rows*cols-1;

        while(i<=j)
        {
            int mid=(i+j)/2;
            int row=mid/cols;
            int col=mid%cols;

            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col]<target)
                i=mid+1;
            else
                j=mid-1;
        }
        return false;
    }
}



