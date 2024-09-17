import java.util.ArrayList;
import java.util.List;
public class PascalsTriangle {
    public static void main(String[] args) {
        PascalsTriangle pt = new PascalsTriangle();
        List<List<Integer>> result = pt.generate(5); // Generate 5 rows of Pascal's Triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }


        public List<List<Integer>> generate(int numRows) { // to generate rows

            List<List<Integer>> result = new ArrayList<>(); //we have created a list of list that will store our result/list

            if (numRows == 0) return result; //if nothing

            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);

            if (numRows == 1) return result;

            for (int i = 1; i < numRows; i++) {
                List<Integer> prevRow = result.get(i - 1);

                // Start the next row
                ArrayList<Integer> row = new ArrayList<>();
                row.add(1);
                for (int j = 0; j < i - 1; j++) {  //loop for prev row number
                    row.add(prevRow.get(j) + prevRow.get(j + 1));
                }
                row.add(1);

                // Add this new row to final result
                result.add(row);
            }

            return result;
        }

    }

