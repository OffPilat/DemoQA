public class datatype {

    public static void main(String args[]) {
        byte a = 126;
        byte b = 127;
        System.out.println("a * b = " + (a * b));

        short c = 32767;
        short d = 32767;
        System.out.println("c * d = " + (c * d));

        int e = 2147483647;
        int f = 2147483647;
        System.out.println("e * f = " + (e * f));

        long g = Long.MAX_VALUE;
        long h = Long.MAX_VALUE;
        System.out.println("g * h = " + (g * h));


        Double j = Double.MAX_VALUE;
        Double i = Double.MAX_VALUE;
        System.out.println("i * j = " + (i * j));


        System.out.println("a * c = " + (a * c));
        System.out.println("a * e = " + (a * e));
        System.out.println("a * g = " + (a * g));
        System.out.println("e * j = " + (e * j));



    }

}
