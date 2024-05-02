import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введіть ваше ім'я: ");
        String name=scanner.nextLine();
        System.out.println("Введіть ваше прізвище: ");
        String surname=scanner.nextLine();
        System.out.println("Скільки днів ви будете перебувати?: ");
        int dateN=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Година прибуття: ");
        String hourS=scanner.nextLine();
        System.out.println("Година відбуття: ");
        String hourF=scanner.nextLine();
        System.out.println("Кількість людей: ");
        int peopleN=scanner.nextInt();

        Booking booking=new Booking(name,surname, dateN, hourS, hourF, peopleN);

        System.out.println("Введіть номер кімнати: ");
        int num=scanner.nextInt();
        System.out.println("Введіть поверх: ");
        int fl=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть тип кімнати(одномісний/двомісний/двокімнатний)");
        String type= scanner.nextLine();

        Room room=new Room(num, fl, type);

        System.out.println("Ваше бронювання:");
        System.out.println("Ім'я: " + booking.getName());
        System.out.println("Прізвище: " + booking.getSurname());
        System.out.println("Кількість днів: " + booking.getDateN());
        System.out.println("Година прибуття: " + booking.getHourS());
        System.out.println("Година відбуття: " + booking.getHourF());
        System.out.println("Кількість людей: " + booking.getPeopleN());
        System.out.println("----------------------");
        System.out.println("Інформація про номер:");
        System.out.println("Номер кімнати: " + room.getNum());
        System.out.println("Поверх: " + room.getFl());
        System.out.println("Тип кімнати: " + room.getType());

        System.out.println("Чи бажаєте щось поїсти?(так/ні)");
        String food= scanner.nextLine();
        if(food.equalsIgnoreCase("так")){
            Food f=new Food();
            f.pMenu();
            System.out.println("Введіть назву страви, яку ви бажаєте: ");
            String order=scanner.nextLine();
            System.out.println("Ваше замовлення: ");
            System.out.println("Назва страви: "+order);
            System.out.println("Ціна: "+f.getPrice(order));
        }

    }
}