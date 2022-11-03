public class School {

    String name;
    byte number;
    short numberOfStudents;

    void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }
    void setNumber(byte number){
        this.number = number;
    }

    public byte getNumber() {
        return number;
    }
    void setNumberOfStudents(Short numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }

    public short getNumberOfStudents() {
        return numberOfStudents;
    }
    public void getInfo2(){
        System.out.printf("""
                Name: %s
                Number: №%s
                NumberOfStudents: %s
                """,getName(),getNumber(),getNumberOfStudents());
    }
}
