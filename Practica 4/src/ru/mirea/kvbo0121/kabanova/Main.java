package ru.mirea.kvbo0121.kabanova;

public class Main {

    public static void main(String[] args) {
        Season mySeason = Season.SUMMER;
        mySeason.info();
        System.out.println("Средняя температура сезона "+mySeason.srtemp);
        mySeason.iLike();
        mySeason.getDescription();

        mySeason=Season.WINTER;
        mySeason.info();
        System.out.println("Средняя температура сезона " + mySeason.srtemp);
        mySeason.iLike();
        mySeason.getDescription();
        System.out.println(" - - - - ПЕЧАТЬ ИНФОРМАЦИИ О ВСЕХ ВРЕМЕНАХ ГОДА - - - -");
        for (Season d : Season.values())
        {
            System.out.println(d);
            d.info();
            System.out.println("Средняя температура сезона " + d.srtemp);
        }

    }
}
