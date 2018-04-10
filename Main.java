public class Main {

    public static void main(String[] args) {
        String[] Datos={"Dato 1", "Dato 2", "Dato 3", "Dato 4"};
        int[] ArraySum = {2, 5, 6, 7};
        int total = 0;

        for (int i = 0; i < ArraySum.length; i++) {
            total += ArraySum[i];
            System.out.println(Datos[i] + ": "+ArraySum[i]);
        }

        System.out.println("La suma es igual " + total);
        System.out.println(Datos[0] + ":" + ArraySum[0]);

    }

}