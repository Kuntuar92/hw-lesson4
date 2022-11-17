
public class PrimitiveData {

        public static void main(String[] args) {

            //поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
            byte bt = 120;
            short shr = 32767;
            int inter = 2147483647;
            long l = 9223372036854775807L;
            float f = 120.5f;
            double d = 255.1d;
            char c = 'd';
            boolean bool = false;


            System.out.println(bt + 7.5);
            System.out.println(shr + 10);
            System.out.println(inter + 1000000000);
            System.out.println(l + 1000);
            System.out.println(l + d);
            System.out.println(c + f);
            System.out.println();

            //попробовать вычисления комбинаций типов данных (int и double)
            int a = 100;
            double b = 100.5;

            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
        }

}
