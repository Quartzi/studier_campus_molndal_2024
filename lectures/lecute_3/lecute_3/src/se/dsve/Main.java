package se.dsve;


public class Main {
    public static void main(String[] args) {
        System.out.println("Main");

        Car car1 = new Car();
        car1.startEngine();
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);

        car1.brand = "Volvo";
        car1.model = "V90";
        car1.year = 2024;
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);

        car1.brand = "Tesla";
        System.out.println(car1.brand);



        System.out.println("-------------------------------------------------------");


        Book book1 = new Book();
        book1.title = "Java";
        book1.author = "John Doe";
        book1.pages = 350;

        book1.bookInfo();
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.pages);


        Book book2 = new Book();
        book2.title = "example";
        book2.author = "John Doe2";
        book2.pages = 300;

        book2.bookInfo();
        System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.pages);

        System.out.println("-----------------------------------------------------");

        CarConstr car2 = new CarConstr("Mazda", "323",  1994);
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        car2.carInfo();

        CarConstr car3 = new CarConstr(  "Nissan",  "Micra");
        System.out.println(car3.brand);
        System.out.println(car3.model);
        car3.carInfo();

        CarConstr car4 = new CarConstr();
        System.out.println(car4.brand);
        System.out.println(car4.speed);
        car4.carInfo();

        System.out.println(car2.speed);
        System.out.println(car3.speed);
        System.out.println(car4.speed);

        System.out.println("-------------------------------");


        Person person1 = new Person( "Erik ",  29,  "example@gmail.com");
        person1.personInfo();

        Person person2 = new Person( "Alexander ",  22);
        person2.personInfo();

        Person person3 = new Person();
        person3.personInfo();

        System.out.println("-------------------------------------------");

        Dog dog = new Dog("Freja ", 8);

        Dog replikaDog1 = dog;
        Dog replikaDog2 = dog;

        replikaDog2.name = "Wolfie";
        replikaDog1.name = "smile.jpg";
        dog1.bark();
        replikaDog1.bark();
        replikaDog2.bark();

        dog.dogInfo();



    }

}