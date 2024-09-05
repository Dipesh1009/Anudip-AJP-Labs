/* **** TASK ****
 *  Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. 
 * Subclasses extend the superclass and override its location() and famousFor() method. 
 * 
 * i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class.
 * As it refers to the base class object and the base class method overrides the superclass 
 * method; the base class method is invoked at runtime. 
 * 
 * ii.call the location() and famousFor() method by the all subclass’,and print accordingly.
 * 
 */


package hillstation_program;


/* HillStations class is the parent class in this program, which is inherited by 
 * all the othe hillstation location classes i.e. Manali, Mussoorie, and Gulmarg.
 * 
 * it contains name(String) and details(String) variables to store the name and
 * details of the location.
 * 
 * it has two constructor, i.e. one is default constructor for instantiating the
 * object of base class.
 * 
 * second constructor HillStations(String,String) is for the child classes, if the want
 * to create their object. This constrctor takes name and details of those child classes
 * and initialises their values in the name(String) and details(String) variables 
 * defined in it.
 * 
 * location() function prints the name of the hill station and its location essentials.
 * 
 * famousFor() function prints the details about the location added in the details(String)
 * variables.
 */
class HillStations {

    private String name = "Hill Station";
    private String details = "The hill stations are famous for natural environment away from the Modern hectic life.\n\n";

    public HillStations() {

    }

    public HillStations(String name, String details) {
        this.name = name;
        this.details = details;
    }

    public void location() {
        System.out.println(name);
    }

    public void famousFor() {
        System.out.println(details);
    }
}


/* Manali is the child class of HillStations class which passes the name ane details of it
 * to the parent constructor with the help of super() function. It gets called when the object
 * of Manali class is instantiated.
 * 
 * Its object can access the location() and famousFor() function of its parent class HillStations.
 * 
 */
class Manali extends HillStations {
    
    Manali() {
        String name = "Manali, Kullu District, Himachal Pradesh";
        String details = "Manali is synonymous streams and birdsong, forests and orchards and grandees of snow-capped mountains.\n\n";
        super(name, details);
    }
    
}


/* Mussoorie is the child class of HillStations class which passes the name ane details of it
 * to the parent constructor with the help of super() function. It gets called when the object
 * of Manali class is instantiated.
 * 
 * Its object can access the location() and famousFor() function of its parent class HillStations.
 * 
 */
class Mussoorie extends HillStations {
    
    Mussoorie()
    {
        String name = "Mussoorie, Dehradun District, Uttarakhand";
        String details = "Mussoorie, the queen of hill stations, is famous for its scenic beauty, good social life and entertainment.\n\n";
        super(name,details);
    }
}


/* Gulmarg is the child class of HillStations class which passes the name ane details of it
 * to the parent constructor with the help of super() function. It gets called when the object
 * of Manali class is instantiated.
 * 
 * Its object can access the location() and famousFor() function of its parent class HillStations.
 * 
 */
class Gulmarg extends HillStations {
    
    Gulmarg() {
        String name = "Gulmarg, Baramulla District, Jammu and Kashmir";
        String details = "Gulmarg is known for being a winter sports destination, its natural meadows, scenic beauty of the Himalayan Mountains in the back drop, and the Highest Cable Car in the world, Gulmarg Gondola\n\n";
        super(name, details);
    }

}


/* HillStations class has three childs, Manali, Mussoorie, and Gulmarg. Here Hierarchial 
 * inheritence has been used. Now we will test the functions of base class, and inherited
 * properties with the help of child class. 
 * 
 * in following TravelingAgency class, 4 objects are instantiated. 
 * 1. HillStations class 
 * 2. Manali class (with reference variable of parent class type)
 * 3. Mussoorie class
 * 4. Gulmarg class (with reference variable of parent class type)
 * 
 * all these four objects tests the location() and famousfor() functions.
 */
public class TravelingAgency {
    public static void main(String[] args) {
        
        HillStations hillStation1 = new HillStations();     // Parent class object 
        hillStation1.location();
        hillStation1.famousFor();

        HillStations manaliObj = new Manali();              // Child Class object with parent type reference
        manaliObj.location();
        manaliObj.famousFor();

        Mussoorie mussoorieObj = new Mussoorie();           // Child class object
        mussoorieObj.location();
        mussoorieObj.famousFor();

        HillStations gulmargObj = new Gulmarg();            // Child class object with parent type reference
        gulmargObj.location();
        gulmargObj.famousFor();
    }    
}

// End Of Program
