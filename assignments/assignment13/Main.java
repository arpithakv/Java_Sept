package co.arpitha.training.assignments.assignment13;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Student("Shyam", "Bangalore, Karnataka", "Java fundamentals", 2010, 4500.0),
                new Staff("Anand", "Bangalore, Karnataka", "Delhi Public school", 35000.0),
                new Staff("Umesh", "Bangalore, Karnataka", "National Public school", 42000.0),
                new Student("Suresh", "Hassan, Karnataka", "Java fundamentals", 2012, 4750.0),
                new Student("Kiran", "Vasco, Goa", "Reactjs", 2017, 12500.0)
        };
        for(Person person:people){
            System.out.println(person.toString());
        }
    }
}
/*OUTPUT
Student[Person [name='Shyam', address='Bangalore, Karnataka']',program='Java fundamentals', year=2010, fee=4500.0]
Staff[Person [name='Anand', address='Bangalore, Karnataka']',school='Delhi Public school', pay=35000.0]
Staff[Person [name='Umesh', address='Bangalore, Karnataka']',school='National Public school', pay=42000.0]
Student[Person [name='Suresh', address='Hassan, Karnataka']',program='Java fundamentals', year=2012, fee=4750.0]
Student[Person [name='Kiran', address='Vasco, Goa']',program='Reactjs', year=2017, fee=12500.0]
 */
