public class BigO {

    public BigO() {
        int[] data = new int[400];

        /*
            O(n)
         */
        System.out.printf("O(n): %d datapunkter", data.length);

        int ops = 0;
        for (int i = 0; i < data.length; i++) {
            ops++;
        }
        System.out.printf("\n%d operationer", ops);

        /*
         * O(n^2)
         */
        ops = 0;
        System.out.printf("\nO(n^2): %d datapunkter", data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < i; j++) {
                ops++;
            }
        }
        System.out.printf("\n%d operationer", ops);

        /*
            O(log n)
         */
        ops = 0;
        System.out.printf("\nO(log n): %d datapunkter", data.length);
        int len = data.length;
        while (len > 0){
            len = len / 2;
            ops++;
        }
        System.out.printf("\n%d operationer", ops);

    }



}
