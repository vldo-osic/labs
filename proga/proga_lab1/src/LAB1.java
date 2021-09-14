public class LAB1 {

    public static void main(String[] args) {
        // Создаем массивы и заполняем их
        int[] e = new int[12];
        double[] x = new double[19];

        for (int i = 24; i >= 2; i -= 2) e[12 - i / 2] = i;

        for (int i = 0; i < 19; i++) x[i] = Math.random() * 10 - 2;

        // Создаем и заполняем по заданию выходной массив.

        double[][] c = new double[12][19];

        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 19; j++) {
                if (e[i] == 24){
                    c[i][j] = Math.cos(
                                    Math.pow(
                                            2 + Math.log(
                                                    Math.abs(x[j])
                                            )
                                            , 2
                                    )
                    );
                } else if (e[i] % 4 == 0 || e[i] % 6 == 0) {
                    c[i][j] = Math.pow(
                                    Math.asin(
                                            Math.sin(x[j])
                                    ) / 2
                            , 3
                    );
                } else {
                    c[i][j] = Math.atan(
                            Math.sin(
                                    Math.pow(
                                            Math.pow(
                                                    Math.E
                                                    , Math.cos(x[j])
                                            ) - 0.5
                                            , Math.tan(x[j])
                                    )
                            )
                    );
                }
            }

        // Вывод результата.

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 19; j++) System.out.printf("% 7.2f", c[i][j]);
            System.out.println();
        }
    }
}