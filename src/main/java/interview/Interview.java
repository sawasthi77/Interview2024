package interview;

import java.util.*;

import java.util.stream.Collectors;

public class Interview {

    public static void main(String[] args) {
        List<Person> persons =  new ArrayList<>();

        Trainer trainer = persons.stream()
                .collect(Collectors.groupingBy(Person::getTrainer, Collectors.counting())).entrySet().stream()
                .filter( entry -> entry.getValue() > 1L).map(Map.Entry::getKey).findFirst().get();
        System.out.println(trainer.getName());

    }
}

class Trainer{
    public Trainer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    private long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

class Person{
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private long id;

    public Person(long id, String name, Trainer trainer) {
        this.id = id;
        this.name = name;
        this.trainer = trainer;
    }

    private String name;
    private Trainer trainer;
}



