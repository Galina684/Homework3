
public class Main {
    public static void main(String[] args) {
       //Задача 1
        int in = 5000000;
        byte by = 100;
        short sh = 1000;
        long lo = 9000L;
        float fl = 20.5f;
        double db = 10.255;
        System.out.println(in);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(db);
        //Задача 2
        float fl1 = 27.12f;
        long lo1 = 987678965549L;
        double db1 = 2.786;
        short sh1 = 569;
        short sh2 = -159;
        int in1 = 27897;
        byte by1 = 67;
        System.out.println(fl1);
        System.out.println(lo1);
        System.out.println(db1);
        System.out.println(sh1);
        System.out.println(sh2);
        System.out.println(in1);
        System.out.println(by1);
        //Задача 3
        int lp = 23;
        int as = 27;
        int ea = 30;
        int paper = 480 / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
        //Задача 4
        int min2 = 16;
        int min1 = min2 / 2;
        int min20 = 20 * min1;
        int day1 = 60 * 24 * min1;
        int day3 = day1 * 3;
        int day30 = day1 * 30;
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + day1 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + day30 + " штук бутылок");
        //Задача 5
        int allCansPaint = 120;
        int whitePaint1 = 2;
        int brownPaint1 = 4;
        int classRooms = allCansPaint / (whitePaint1 + brownPaint1);
        int whitePaintAll = whitePaint1 * classRooms;
        int brownPaintAll = brownPaint1 * classRooms;
        System.out.println("В школе, где " +  classRooms + " классов, нужно "
                  + whitePaintAll + " банок белой краски и " + brownPaintAll + " банок коричневой краски");



    }
}