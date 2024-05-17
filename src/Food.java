import java.util.ArrayList;
import java.util.List;

public class Food {
    String mealType;
    private final List<String> orders = new ArrayList<>();
    private final String[] breakfast = {"Круасан", "Вафлі", "Кава", "Чай", "Макарони"};
    private final String[] lunch = {"Піца", "Бургер", "Картопля по-селянськи", "Салат", "Кампот"};
    private final String[] dinner = {"Суп", "Чай", "Десерт", "Мясо з гарніром", "Желе"};
    private final int[] priceBr = {125, 150, 75, 55, 100};
    private final int[] priceLun = {135, 150, 145, 55, 60};
    private final int[] priceDin = {101, 55, 165, 155, 110};
    private final String hourS;

    public Food(String hourS) {
        this.hourS = hourS;
    }

    public void pMenu() {
        String[] part = hourS.split(":");
        int h = Integer.parseInt(part[0]);
        int m = Integer.parseInt(part[1]);
        int hvul = h * 60 + m;

        if (hvul >= 450 && hvul <= 620) {
            mealType = "Сніданок";
        } else if (hvul >= 795 && hvul <= 930) {
            mealType = "Обід";
        } else if (hvul >= 1065 && hvul <= 1210) {
            mealType = "Вечеря";
        } else {
            mealType = "Меню наразі недоступне." +
                    "Сніданок: з 7:30-10:20 \n" +
                    "                    Обід: з 13:15-15:30 \n" +
                    "                    Вечеря: з 17:45-20:10";
        }
        //Вивід меню
        System.out.println("Тип прийому їжі: " + mealType);
        System.out.println("Меню: ");
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

    public int gerPrice(String food1) {
        for (int i = 0; i < breakfast.length; i++) {
            if (food1.equals(breakfast[i])) {
                return priceBr[i];
            }
        }
        for (int i = 0; i < lunch.length; i++) {
            if (food1.equalsIgnoreCase(lunch[i])) {
                return priceLun[i];
            }
        }
        for (int i = 0; i < dinner.length; i++) {
            if (food1.equalsIgnoreCase(dinner[i])) {
                return priceDin[i];
            }
        }
        return 0;
    }

    public void addOrder(String order1) {
        orders.add(order1);
    }

    public List<String> getOrders() {
        return orders;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (String order1 : orders) {
            totalPrice += gerPrice(order1);
        }
        return totalPrice;
    }
}

