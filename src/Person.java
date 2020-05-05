public class Person {
     public static int instanceCount;
     public int localCount;
     public Person() {
         instanceCount++;
         localCount++;
     }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        System.out.println("(" + person4.localCount + "," + Person.instanceCount + ")");
    }
    // localCount will be 1 because it's separate variable for each object
    // instanceCount will be 4 because is shared and will continue to increment to 4
}
