public class Main {
    public static void main(String[] args) {
        int maxValue = 2147483647;
        maxValue += 1;
        maxValue = maxValue + maxValue;
        System.out.println(maxValue);

        int CZH = 1000000;
        CZH = CZH * CZH;
        System.out.println(CZH);

        long maxLong =  9223372036854775807L;
        maxLong += 1;
        System.out.println(maxLong);

        float maxFloat = 1000000000;
        for (int i = 0; i < 5; i++){
            maxFloat = maxFloat * maxFloat;
            System.out.println(maxFloat);
        }
    }
}
