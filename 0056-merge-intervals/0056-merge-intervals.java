class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (row1, row2) -> Integer.compare(row1[0], row2[0]));
        // System.out.println(Arrays.deepToString(intervals));
        List<int[]> merged = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int cstart = intervals[i][0];
            int cend = intervals[i][1];
            if (end >= cstart) {

                end = Math.max(end, cend);
            }

            else {

                merged.add(new int[] { start, end });

                // after adding we need to change the start and end because now we are dealing
                // with new interval;
                start = cstart;
                end = cend;

            }

        }
        merged.add(new int[] { start, end });
        int[][] result = merged.toArray(new int[merged.size()][]);
        return result;
    }
}