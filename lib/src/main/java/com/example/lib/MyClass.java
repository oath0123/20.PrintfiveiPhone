package com.example.lib;

public class MyClass {
    public static void main (String[] args ) {
        Phone phone = new Phone(1, "카찱", "iPhone", "2007", "$500");
        Phone phone1 = new Phone(2, "카찱", "iPhone4", "2010", "$400");
        Phone phone2 = new Phone(3, "카찱", "iPhone5", "2012", "$600");
        Phone phone3 = new Phone(4, "카찱", "iPhone6", "2014", "$650");
        Phone phone4 = new Phone(5, "카찱", "iPhone7", "2017", "$650");
        phone.alldetailedprint();
        phone1.alldetailedprint();
        phone2.alldetailedprint();
        phone3.alldetailedprint();
        phone4.alldetailedprint();
    }
}

