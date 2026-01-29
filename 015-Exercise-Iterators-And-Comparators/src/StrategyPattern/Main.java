package src.StrategyPattern;

import src.ComparingObjects.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<src.ComparingObjects.Person> peopleByNames = new TreeSet<>(new ComparatorPeople());
        TreeSet<src.ComparingObjects.Person> peopleByAges = new TreeSet<>(new ComparatorPeopleByAge());

        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {

            String[] tokens = reader.readLine().split(" ");

            src.ComparingObjects.Person p = new src.ComparingObjects.Person(tokens[0], Integer.parseInt(tokens[1]));

            peopleByNames.add(p);
            peopleByAges.add(p);
        }
        for (src.ComparingObjects.Person person : peopleByNames) {
            System.out.println(person.toString());
        }
        for (Person person : peopleByAges) {
            System.out.println(person.toString());
        }

    }
}
