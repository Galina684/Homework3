
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");//Задача 1
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
        System.out.println("Задача 2"); //Задача 2
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
        System.out.println("Задача 3"); //Задача 3
        int lyudmilaPav = 23;
        int annaSer = 27;
        int ekaterinaAnd = 30;
        int paper = 480 / (lyudmilaPav + annaSer + ekaterinaAnd);
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
        System.out.println("Задача 4"); //Задача 4
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
        System.out.println("Задача 5"); //Задача 5
        int allCansPaint = 120;
        int whitePaint1 = 2;
        int brownPaint1 = 4;
        int classRooms = allCansPaint / (whitePaint1 + brownPaint1);
        int whitePaintAll = whitePaint1 * classRooms;
        int brownPaintAll = brownPaint1 * classRooms;
        System.out.println("В школе, где " +  classRooms + " классов, нужно "
                  + whitePaintAll + " банок белой краски и " + brownPaintAll + " банок коричневой краски");
        System.out.println("Задача 6");//Задача 6
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int breakfastGr = banana*5 + milk*2 + iceCream*2 + egg*4;
        int kg1 = 1000;
        float breakfastKg = breakfastGr/(float)kg1;
        System.out.println("Завтрак спортсмена весит " + breakfastGr + " гр");
        System.out.println("Завтрак спортсмена весит " + breakfastKg + "кг");
        System.out.println("Задача 7"); //Задача 7
        int kg7 = kg1*7;
        int diet250 = 250;
        int diet500 = 500;
        int result250 = kg7/diet250;
        int result500 = kg7/diet500;
        int resultMean = (result250 + result500)/2;
        System.out.println("При потери веса по 250 грамм в день спортсмен похудеет на 7 кг за " + result250 + " дней");
        System.out.println("При потери веса по 500 грамм в день спортсмен похудеет на 7 кг за " + result500 + " дней");
        System.out.println("В среднем спортсмену понадобится " + resultMean + " дней, чтобы похудеть на 7 кг");
        System.out.println("Задача 8"); //Задача 8
        int mashaPay = 67760;
        int denisPay = 83690;
        int kristinaPay = 76230;
        int mashaPayNew = mashaPay*10/100 + mashaPay;
        int mashaPayLastY = mashaPay * 12;
        int mashaPayNewY = mashaPayNew * 12;
        int mashaProfit = mashaPayNewY - mashaPayLastY;
        System.out.println("Маша теперь получает " + mashaPayNew + " рублей. Годовой доход вырос на " + mashaProfit);
        int denisPayNew = denisPay*10/100 + denisPay;
        int denisPayLastY = denisPay * 12;
        int denisPayNewY = denisPayNew * 12;
        int denisProfit = denisPayNewY - denisPayLastY;
        System.out.println("Денис теперь получает " + denisPayNew + " рублей. Годовой доход вырос на " + denisProfit);
        int kristinaPayNew = kristinaPay*10/100 + kristinaPay;
        int kristinaPayLastY = kristinaPay * 12;
        int kristinaPayNewY = kristinaPayNew * 12;
        int kristinaProfit = kristinaPayNewY - kristinaPayLastY;
        System.out.println("Кристина теперь получает " + kristinaPayNew + " рублей. Годовой доход вырос на " + kristinaProfit);


    }
}