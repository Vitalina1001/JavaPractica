package ru.mirea.kvbo0121.kabanova;

public enum Season
{
SUMMER(19.5){
    @Override
    public void getDescription() {
        System.out.println("Тёплое время года");
    }
},WINTER(-8),AUTUMN(8),SPRING(10);
double srtemp;
    Season() {}
private Season (double t)
{
this.srtemp=t;
}

public void getDescription()
{
    System.out.println("Холодное время года");
}
    public void info () {
    switch (this) {
        case SUMMER:
            System.out.println("ЛЕТО - Наиболее жаркая погода, мало дождей, пик роста растений");
            break;
        case WINTER:
            System.out.println("ЗИМА - Наиболее холодная погода, преобладание снега, растения в спячке");
            break;
        case AUTUMN:
            System.out.println("ОСЕНЬ - Прохладная погода, обильные дожди, завершение цикла роста у растений");
            break;
        case SPRING:
            System.out.println("ВЕСНА - Тёплая погода, свойственны как дождь так и снег, пробуждение растений");
            break;
    }
}

    public void iLike ()
    {
        switch (this)
        {
            case SUMMER:
                System.out.println("Я люблю ЛЕТО!"); break;
            case WINTER:
                System.out.println("Я люблю ЗИМУ!"); break;
            case AUTUMN:
                System.out.println("Я люблю ОСЕНЬ!"); break;
            case SPRING:
                System.out.println("Я люблю ВЕСНУ!"); break;
        }
    }
}

