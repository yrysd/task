public class Person {

   private String name;
   private String sureName;
    private String profession;
    private byte age ;

    void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    void setSureName(String sureName){
        this.sureName = sureName;
    }
    public String getSureName() {
        return sureName;
    }
    void setProfession (String profession){
        this.profession = profession;
    }
    public String getProfession (){
        return profession;
    }
    void setAge(short age){
        this.age = (byte) age;
    }
    public short getAge(){
        return age;
    }
   public void getInfo1(){
        System.out.printf("""
                Name: %s
                SureName: %s
                Profession: %s
                Age: %s
                """,getName(),getSureName(),getProfession(),getAge());
    }

}
