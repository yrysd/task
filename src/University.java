public class University {

    private String name;
    private short yearOfFoundation;
    private short numberOfStudents;

    void setName(String name1){
        name = name1;
    }
    public String getName(){
        return name;
    }
    void setYearOfFoundation(short yearOfFoundation1){
        yearOfFoundation = yearOfFoundation1;
    }
    public short getYearOfFoundation(){
        return yearOfFoundation;
    }
    void setNumberOfStudents (short numberOfStudents1){
        numberOfStudents = numberOfStudents1;
    }

    public short getNumberOfStudents() {
        return numberOfStudents;
    }
    public void getInfo(){
        System.out.printf("""
                name   -%s
                yearOfFoundation -%s
                numberOfStudents  -%s
                """,getName(),getYearOfFoundation(),getNumberOfStudents());
    }


}

