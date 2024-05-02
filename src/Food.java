public class Food {
    String food;
    String order;
    private String[] menu={"Піца","Бургер","Картопля по-селянськи","Салат"};
    private int[] price={125,150,200,170};
    public void pMenu(){
        System.out.println("Меню");
        for (int i = 0; i < menu.length ; i++) {
            System.out.println((i+1)+")"+menu[i]+"-"+price[i]+"грн");
        }
    }

    public int getPrice(String food) {
        for (int i = 0; i <menu.length; i++) {
            if(food.equalsIgnoreCase(menu[i])){
                return price[i];
            }
        }
        return 0;
    }
}
