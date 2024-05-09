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

        Room room=new Room();
        System.out.println();
        System.out.println("Ваше бронювання:");
        System.out.println("Ім'я: " + booking.getName());
        System.out.println("Прізвище: " + booking.getSurname());
        System.out.println("Кількість днів: " + booking.getDateN());
        System.out.println("Година прибуття: " + booking.getHourS());
        System.out.println("Година відбуття: " + booking.getHourF());
        System.out.println("Кількість людей: " + booking.getPeopleN());
        System.out.println("----------------------");
        System.out.println("Інформація про номер:");
        System.out.println("Номер вашої кімнати: "+room.number());
        System.out.println("Поверх: " + room.floor());
        System.out.println("Тип кімнати: " + room.typeOfRoom(peopleN));
        System.out.println("Ціна: "+ room.pricementRoom(peopleN)* booking.getDateN());

        scanner.nextLine();
        System.out.println("Чи бажаєте щось поїсти?(так/ні)");
        Food f=new Food(booking.getHourS());
        f.pMenu();

    }
}
