import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        University university = new University();
        university.setName("Manas");
        university.setNumberOfStudents((short) 6000);
        university.setYearOfFoundation((short) 1995);
        System.out.println("___________________________________________");


        University university1 = new University();
        university1.setName("Jusup Balasagyn ");
        university1.setYearOfFoundation((short) 1925);
        university1.setNumberOfStudents((short) 5000);



        University university2 = new University();
        university2.setName("American University of Central Asia(AUCA)");
        university2.setNumberOfStudents((short)5000 );
        university2.setYearOfFoundation((short) 1993);


        University[] array = {university, university1, university2};
        for (University a : array) {
            a.getInfo();
            System.out.println("___________________________________________");
        }

        Person person = new Person();
        person.setName("Yryskeldi");
        person.setSureName("Alymbekov");
        person.setProfession("Programmer");
        person.setAge( (short)16);
        

        Person person1 = new Person();
        person1.setName("Rahim");
        person1.setSureName("Bazarbay uulu");
        person1.setProfession("Java developer");
        person1.setAge((short) 25);

        Person person2 = new Person();
        person2.setName("Mukhammed");
        person2.setSureName("Toichubay uulu");
        person2.setProfession("Java developer");
        person2.setAge((short) 25);

        Person [] array1 = {person,person1,person2};
        for (Person b:array1) {
            b.getInfo1();
            System.out.println("___________________________________________");

        }


        School school = new School();
        school.setName("A.Matieva");
        school.setNumber((byte) 76);
        school.setNumberOfStudents((short)450);

        School school1 = new School();
        school1.setName("O.Muratov");
        school1.setNumber((byte)86);
        school1.setNumberOfStudents((short)600);


        School school2 = new School();
        school2.setName("S.Davletova");
        school2.setNumber((byte) 14);
        school2.setNumberOfStudents((short) 800);

        School [] array2 = {school,school1,school2};
        for (School c:array2) {
            c.getInfo2();
            System.out.println("___________________________________________");

        }


        Car car = new Car();
        car.setBrent("Mercedes-Bence");
        car.setPrise((short)40000);
        car.setSpeed((short) 233);

        Car car1 = new Car();
        car1.setBrent("Lamborghini Aventador");
        car1.setPrise((short) 100000);
        car1.setSpeed((short) 750);

        Car car2 = new Car();
        car2.setBrent("Tesla Motors");
        car2.setSpeed((short)30000);
        car2.setPrise((short)200);

        Car [] array3 = {car,car1,car2};
        for (Car c:array3) {
            c.getInfo3();
            System.out.println("___________________________________________");

        }





    }
}