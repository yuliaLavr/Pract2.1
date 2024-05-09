public class Food {
    String mealType;
    private String[] breakfast={"Круасан","Вафлі","Кава","Чай","Макарони"};
    private String[] lunch={"Піца","Бургер","Картопля по-селянськи","Салат","Кампот"};
    private String[] dinner={"Суп","Чай","Десерт","Мясо з гарніром","Желе"};
    private int[] priceBr={125,150,75,55,100};
    private int[] priceLun={135,150,145,55,60};
    private int[] priceDin={101,55,165,155,110};
    private String hourS;
    public Food(String hourS){
        this.hourS=hourS;
    }
    public void pMenu() {
        String[] part = hourS.split(":");
        int h = Integer.parseInt(part[0]);
        int m = Integer.parseInt(part[1]);

        if (h >= 7 && h <= 10 && m >= 30 && m <= 20) {
            mealType = "Сніданок";
        }
        else if (h >= 13 && h <= 15 && m >= 15 && m <= 30) {
            mealType = "Обід";
        }
        else if (h >= 17 && h <= 20 && m >= 45 && m <= 30) {
            mealType = "Вечеря";
        } else {
            mealType = "Меню наразі недоступне." +
                    "Сніданок: з 7:30-10:20 \n" +
                    "                    Обід: з 13:15-15:30 \n" +
                    "                    Вечеря: з 17:45-20:10";
        }
        //Вивід меню
        System.out.println("Тип прийому їжі: " + mealType);
        if (mealType.equals("Сніданок")) {
            for (int i = 0; i < breakfast.length; i++) {
                System.out.println(breakfast[i] + "-" + priceBr[i] + "грн");
            }
        } else if (mealType.equals("Обід")) {
            for (int i = 0; i < lunch.length; i++) {
                System.out.println(lunch[i] + "-" + priceLun[i] + "грн");
            }
        } else if (mealType.equals("Вечеря")) {
            for (int i = 0; i < dinner.length; i++) {
                System.out.println(dinner[i] + "-" + priceDin[i] + "грн");
            }
        } else {
            System.out.println("Меню наразі недоступне." +
                    "Сніданок: з 7:30-10:20 \n" +
                    "                    Обід: з 13:15-15:30 \n" +
                    "                    Вечеря: з 17:45-20:10");
        }
    }
}

