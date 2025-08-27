class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Final list to store Pascal's triangle rows
        List<List<Integer>> result = new ArrayList<>();

        // Loop for each row
        for (int i = 0; i < numRows; i++) {
            // Create new row list
            List<Integer> row = new ArrayList<>();

            // First element of every row is always 1
            row.add(1);

            // Fill middle elements (only if row has more than 2 elements)
            for (int j = 1; j < i; j++) {
                // Formula: sum of two elements just above (from previous row)
                int value = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                row.add(value);
            }

            // Last element of every row is also 1 (except first row)
            if (i > 0) {
                row.add(1);
            }

            // Add this row to final result
            result.add(row);
        }

        // Return complete Pascal's Triangle
        return result;
    }
}
