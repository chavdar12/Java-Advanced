package src.FamilyTree;

import src.OpinionPoll.Person;

import java.util.*;
import java.util.stream.Collectors;

public class FamilyTree {
    private src.OpinionPoll.Person descendent;
    private final List<src.OpinionPoll.Person> predecessors;
    private final Map<String, List<String>> relations;

    public FamilyTree() {
        this.predecessors = new ArrayList<>();
        this.relations = new LinkedHashMap<>();
    }

    public void addRelation(String parent, String child) {
        this.relations.putIfAbsent(parent, new ArrayList<>());
        this.relations.get(parent).add(child);
    }

    public void addFamilyMember(String givenName, String familyName, String birthDate) {
        src.OpinionPoll.Person member = new src.OpinionPoll.Person(givenName, familyName, birthDate);
        this.predecessors.add(member);
    }

    public void tieInformation() {
        for (String key : relations.keySet()) {
            src.OpinionPoll.Person parent = this.getPerson(key);

            if (parent == null) {
                continue;
            }

            List<String> children = this.relations.get(key);
            for (String childString : children) {
                src.OpinionPoll.Person child = this.getPerson(childString);
                if (child == null) {
                    continue;
                }
                parent.addChild(child);
            }
        }

        this.descendent = getDescendent(this.descendent);
    }

    private src.OpinionPoll.Person getPerson(String parameter) {
        return this.predecessors
                .stream()
                .filter(person -> person.getName().equals(parameter) || person.getBirthDate().equals(parameter))
                .findFirst()
                .orElse(null);
    }

    private src.OpinionPoll.Person getDescendent(src.OpinionPoll.Person descendent) {
        if (descendent.isName()) {
            return this.getPerson(descendent.getName());
        } else {
            return this.getPerson(descendent.getBirthDate());
        }
    }

    @Override
    public String toString() {
        Collection<src.OpinionPoll.Person> parents = this.descendent.getParents();
        Collection<src.OpinionPoll.Person> children = this.descendent.getChildren();
        String output = String.format("%s %s\nParents:\n", this.descendent.getName(), this.descendent.getBirthDate());
        if (!parents.isEmpty()) {
            output += getCollectionToString(parents);
            output += "\n";
        }
        output += "Children:\n";
        if (!children.isEmpty()) {
            output += getCollectionToString(children);
        }
        return output;
    }

    private String getCollectionToString(Collection<src.OpinionPoll.Person> parents) {
        return parents.stream().map(src.OpinionPoll.Person::toString).collect(Collectors.joining("\n"));
    }

    public void setDescendent(Person descendent) {
        this.descendent = descendent;
    }
}