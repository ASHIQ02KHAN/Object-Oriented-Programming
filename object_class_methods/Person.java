package object_class_methods;

public class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Override toString() to provide a custom string representation
    @Override
    public String toString() {
        return "Person[name=" + name + ", id=" + id + "]";
    }

    // Override equals() to compare Person objects by content
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return this.id == p.id && this.name.equals(p.name);
    }

    // Override hashCode() for consistency with equals()
    @Override
    public int hashCode() {
        return name.hashCode() + id;
    }
}
