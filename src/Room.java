public class Room {
    int num;
    int fl;
    String type;
    int pricement;

    public Room() {
    }

    int floor(){
        fl=num/100;
        return fl;
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
        else if(num>2&num<=4){
            type="двокімнатний";
        }
        else{
            System.out.println("Забагато людей для одного номеру.");
        }
        return type;
    }
    int pricementRoom(int num){
        if (num == 1) {
            pricement=1200;
        }
        else if (num==2){
            pricement=2200;
        }
        else if(num>2&num<=4){
            pricement=4350;
        }
        else{
            System.out.println("___");
        }
        return pricement;
    }

}
