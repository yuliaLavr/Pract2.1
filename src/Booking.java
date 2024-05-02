public class Booking {
    String name;
    String surname;
    int dateN;
    String hourS;
    String hourF;
    int peopleN;

    public Booking(String name, String surname, int dateN, String hourS, String hourF, int peopleN) {
        this.name = name;
        this.surname = surname;
        this.dateN = dateN;
        this.hourS = hourS;
        this.hourF = hourF;
        this.peopleN = peopleN;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDateN() {
        return dateN;
    }

    public String getHourS() {
        return hourS;
    }

    public String getHourF() {
        return hourF;
    }

    public int getPeopleN() {
        return peopleN;
    }
}
