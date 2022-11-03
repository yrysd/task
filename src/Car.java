public class Car {

    String brent;
    short prise;
    short speed;

    void setBrent(String brent){
        this.brent = brent;
    }
    public String getBrent(){
        return brent;
    }
    void setPrise (short prise){
        this.prise = prise;
    }
    public short getPrise(){
        return prise;
    }
    void setSpeed(short speed){
        this.speed = speed;
    }
    public short getSpeed(){
        return speed;
    }
    public void getInfo3(){
        System.out.printf("""
                Brent: %s
                Prise: %s
                Speed: %s
                """,getBrent(),getPrise(),getSpeed());
    }

}
