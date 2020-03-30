package com.company;

import javax.crypto.spec.DESedeKeySpec;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File mytestFIle = new File("C:\\Files\\Abteilungen.txt");
        mytestFIle.canRead();
        String Employee = "Employee: ";
        String Department = "Department: ";

        try {
            String line = null;
            FileReader fileReader = new FileReader(mytestFIle);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            Person[] personen = new Person[12];
            Department[] abteilungen = new Department[12];
            int counter1 = 0;
            int counter2 = 0;
            while ((line = bufferReader.readLine()) != null) {
                //System.out.println();
                String[] splitting = line.split(";");

                String name = splitting[0];
                String departmerts = splitting[1];

                Person Mitarbeiter = new Person(name);
                personen[counter1] = Mitarbeiter;

                Department department = new Department(departmerts);
                abteilungen[counter2] = department;


                Abteilungen firma = new Abteilungen(personen[counter1], abteilungen[counter2]);

                System.out.println(Employee + personen[counter1] + " " + Department + abteilungen[counter2]);
                counter1++;
                counter2++;
            }


        } catch (IOException ex) {
            ex.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException raaa) {
            System.out.println(" der index geht zu weit");
        }


    }
}
