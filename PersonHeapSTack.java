import static java.lang.System.out;
import java.io.*;
class Person {
int id;
String name;

public Person(int id, String name) {
this.id = id;
this.name = name;
System.out.print(this.id + "\n" +this.name);
}
}

public class PersonHeapSTack {
private static Person buildPerson(int
id, String name) {
return new Person(id, name);
}
public static void main(String[] args)
{
int id = 23;
String name = "John";
Person person = null;
person = buildPerson(id, name);
}

}