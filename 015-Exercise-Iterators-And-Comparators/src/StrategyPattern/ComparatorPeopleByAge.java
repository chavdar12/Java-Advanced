package src.StrategyPattern;

import src.ComparingObjects.Person;

import java.util.Comparator;

public class ComparatorPeopleByAge implements Comparator<src.ComparingObjects.Person> {

    @Override
    public int compare(src.ComparingObjects.Person first, Person second) {
        return first.getAge() - second.getAge();
    }
}
