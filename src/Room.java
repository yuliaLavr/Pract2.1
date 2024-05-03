public class Room {
    int num;
    int fl;
    String type;

    public Room(int fl, String type) {
        this.fl = fl;
        this.type = type;
    }

    public Room() {
    }

    public Room(int fl) {
        this.fl = fl;
    }

    int  number() {
        num=(int)(Math.random()*200+100);
        return num;
    }

    String typeOfRoom(int num){
        if (num == 1) {
            type ="одномісний";
        }
        else if (num==2){
            type ="двомісний";
        }
        else{
            type="двокімнатний";
        }
        return type;
    }

    public int getFl() {
        return fl;
    }

}
