package myexercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.*;

/**
 * Created by jpmc on 9/30/2016.
 */


public class Collection {
    public static void myCollection() {
        List<String> myFriends = new ArrayList<String>();

        myFriends.add("Arniel");
        myFriends.add("Bert");
        myFriends.add("Cris");
        myFriends.add("John");
        myFriends.add("Mark");
        // System.out.println(myFriends);
        System.out.print(myFriends);

        for (int i = 0; i < myFriends.size(); i++) ;

        myFriends.get(2);
        myFriends.size();

    }

    public static void myGirlFriends() {

        List<String> myGirFriends = new ArrayList<String>();

        myGirFriends.add(" April ");
        myGirFriends.add(" Dennice ");
        myGirFriends.add(" Glydel ");
        myGirFriends.add(" Jenny ");
        myGirFriends.add(" Kate ");
        myGirFriends.add(" Lovely ");

        System.out.print(myGirFriends);

        for (int x = 0; x < myGirFriends.size(); x++) {
            //     System.out.println(myGirFriends.get(x));
          //  System.out.print(myGirFriends.get(x));
        }

    }

    public static void relation() {

        List<String> boy = new ArrayList<String>();
        boy.add("loki");
        boy.add("daniel");
        boy.add("Cj");

        int thisBoy = boy.size();
        Random randomb = new Random();
        int newBoy = randomb.nextInt(thisBoy);


        List<String> girl = new ArrayList<String>();
        girl.add("her");
        girl.add("she");
        girl.add("a boy");

        int thisGirl = boy.size();
        Random randomg = new Random();
        int newGirl = randomg.nextInt(thisGirl);


        List<String> relation = new ArrayList<String>();

        relation.add(" married to ");
        relation.add(" in-loved to ");
        relation.add(" afraid to ");

        int theirRelation = boy.size();
        Random randomr = new Random();
        int status = randomr.nextInt(theirRelation);


       //TODO System.out.print(" " + boy.get(newBoy) + "" + relation.get(status) + "" + girl.get(newGirl) + " ");
    }
/*
    public static void shuffle (String[] argv) throws Exception {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("A");
        obj.add("E");
        obj.add("I");
        obj.add("O");
        obj.add("U");


        System.out.println(obj);
        */
    }


            //   System.out.println(relation.get(y));
           // System.out.print(relation.get(y));








    /*

 byte byteVariable = 127; //range -128 to 127;
 short mediumRangeDecimalVariable = 32767; //range from -32768 to 32767;
 int decimalVariableUpTo = -2147483647; //in java <8 from -2147483648 to 2147483647 java8+ 4294967296;
 long largeDecimalVariableFrom = -9223372036854775808L;
 long largeDecimalVariableUpTo = 922337203685478L;
 float numberWithDecimalPlaces = 8.2f;
 double veryLargeNumberWithDecimalPlaces = 12321312.1232;
 boolean isTrueOrFalse = true;
 char singleCharacter = '\u0041';

 decimalVariableUpTo = ;

 int sampleSsample = 1234;
 long sampleSample = 34508987648648767L;

 sampleSample = sampleSsample; //changing the directory


 String someText = "this is a string variable"; //just like echo in php

 System.out.println(byteVariable);
 System.out.println(mediumRangeDecimalVariable);
 System.out.println(decimalVariableUpTo);
 System.out.println(largeDecimalVariableFrom);
 System.out.println(largeDecimalVariableUpTo);
 System.out.println(numberWithDecimalPlaces);
 System.out.println(veryLargeNumberWithDecimalPlaces);
 System.out.println(isTrueOrFalse);
 System.out.println(singleCharacter);
 System.out.println(sampleSample);
 System.out.println(someText);

 */
/*
        int x = 1;
        while ( x < 6) {

            x++;
            System.out.print("["+x+"]");
            System.out.println();

        }

        int n = 1;
        int sum = 0;
        do {
            System.out.print(sum);
            n++;
        }
        while (n <= 6); {

            sum += n;
            System.out.print(n+"+");
            System.out.println();
            n++;
        }
        System.out.println(+sum);
*/
/*
        int i;
        for (i=1; i<=6; i++){
            System.out.print("["+i+"]");
        }
        */
/*
        int sum = 0;
        for (int i=1; i<=6; i++){
            sum += i;

        }
        System.out.print(sum);
*/
//array
        /*
        String[] myInstructor = {"Neil", "Bert", "Rad"};
        for (int i=0; i<=2; i++){
            if (myInstructor[i] == "Bert"){
                myInstructor[i] = "Amante";
            }

                System.out.println(myInstructor[i]);

        }
        */


/*
        Employee intEmployer = new Employee();
        intEmployer.setFirstName("Rhaminne");
        String theFirstName = intEmployer.getFirstName();
        System.out.println(theFirstName);

        //lastname
        intEmployer.setLastName("dela");
        String theLastName = intEmployer.getLastName();
        System.out.println(theLastName);
        //username
        //overwrite
        intEmployer.intruduceYourSelf();
        String introMessage = intEmployer.intruduceYourSelf();
        System.out.println(introMessage);

        Customer client = new Customer();
        client.setFirstName("Daniel");
        String clientName = client.getFirstName();
        System.out.println(clientName);

        client.setLastName("april");
        String clientLname = client.getLastName();
        System.out.println(clientLname);

        //overloading
        String fruits = client.food("Mango");
        System.out.println(introMessage + fruits);
        */
/*
        int x = 5;
        if(x == 5){
            System.out.println("You got it right");
        }else {
            System.out.println("You are wrong");
        }
*/

/*
        person.setUserName("Rhamchu");
        String theUserName = person.getUserName();
        System.out.println(theUserName);
*/

//TODO Please Study this....

/*
        Animal myPet = new Animal();

        myPet.setPetType("Dog");
        myPet.getPetType();

        myPet.setPopulation(5);
        myPet.getPopulation();

        myPet.setMansBestFriend(true);
        myPet.isMansBestFriend();

        System.out.println("i am a "+myPet.getPetType());
        System.out.println("Our current Population is "+myPet.getPopulation());
        System.out.println("am i a Friend? : "+myPet.isMansBestFriend());


*/

        /*TODO to create an animal class with three properties and getters and setters */


//TODO please study this..
/*
        Employee nEmployee = new Employee();

        nEmployee.setFirstName("sample1");
        nEmployee.setLastName("sample2");

        String fullname = nEmployee.getFirstName() +" "+ nEmployee.getLastName();

        System.out.print(fullname);
*/



// Person person1 = new Person("firstName"," lastName");



