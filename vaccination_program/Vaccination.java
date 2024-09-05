/* **** TASK ****
 * 
 * Create abstract class vaccine.Create two variables age(int),nationality(String).
 * create 2 concrete methods firstDose() and secondDose(). 
 * 
 * Scenario 1:user can take the first dose if the user is Indian and age is 18.
 * After vaccination the user has to pay 250rs(which will be displayed on the console). 
 * 
 * Scenario 2: Users are eligible to take the second dose only after completing the 
 * first dose. 
 * 
 * Scenario 3: create abstract method boosterDose() in abstract class Vaccine.
 * Create one implementation class vaccinationSuccessful, where implement boosterDose() 
 * method. Create main class vaccination and invoke all methods accordingly.
 * 
 */


package vaccination_program;

/* Vaccine is an abstract class which is defining the name, age, and nationality of
 * an user. It also contains the boolean flags which are defining the status of 
 * First Dose and Second Dose of the vaccination to the corresponding user.
 * 
 * It contains two functions firstDose() and secondDose(), which checks eligibility of
 * user, approves and disapproves the vaccination dose, and redirects to respective dose
 * (if necessary).
 * 
 * It contains eligibility() to check if the user is eligible for vaccinations
 * according to its age and nationality.
 * 
 * It contains an abstract method boosterDose(), which is for the additional booster dose
 * of vaccination. It will be implemented by the child class or sub class of Vaccine class.
 * 
*/

abstract class Vaccine {

    
    /* Declaring the variables i.e. name(String), age(int), nationality(String),
     * isFirstDose(boolean), isSecondDose(boolean). These are kept as protected 
     * so that the data of user and its Vaccination Status doesn't get compromised.
     */

    protected int age;
    protected String nationality;
    protected boolean isFirstDose = false, isSecondDose = false;
    protected String name;

    
    /* Constructor of Vaccine class, which takes age(int), name(String), nationality(String)
     * as parameters. As the Object will be instantiated of any child class, these variables
     * will be initialised, respective to the data passed by the child class constructor.
     */

    public Vaccine (int age,String name, String nationality) {
        this.age = age;
        this.nationality = nationality;
        this.name = name;
    }

    
    /* eligibility() checks the users age and nationality, and as per the condition
     * returns true or false [boolean values]. (if User is of age 18 and its
     * nationality is "Indian", the user is declared eligible for vaccination).
     */

    public boolean eligibility() {

        if (age >= 18 && nationality == "Indian") {
            return true;
        }
        else {
            return false;
        }

    }


    /* notEligiblePrintMessage(String msg) funtion prints the default message of
     * ineligibility for any dose, (type of dose is passed in msg variable).
     */

    public void notEligiblePrintMessage (String msg) {
        System.out.println(toString() + "User is not eligible for " + msg + " dose\n");
    }


    /* firstDose() function checks and approves the first dose of Vaccination to user.
     * 
     * if the user has already taken the first dose, it redirects to the second dose of
     * Vaccination. 
     * 
     * if the user hasn't taken the first dose, it checks the eligibility of user,
     * and approves or disapproves the user's first dose of vaccine. If it approves,
     * it shows prompt to collect 250 Rs. from user. And sets the value of
     * isFirstDose(boolean) as true.
     */
    
    public void firstDose () {
        if (isFirstDose) {
            secondDose();
        }
        
        else if (eligibility()) {
            System.out.println(toString() + "First Dose of Vaccination Approved!\nCollect 250 Rs after vaccination\n");
            isFirstDose = true;
        }
        
        else notEligiblePrintMessage("first");
    }
    

    /* secondDose() function checks and approves the second dose of Vaccination to user.
     * 
     * if the user has already taken the second dose, it prompts that basic doses of
     * Vaccination are complete.
     * 
     * if the user hasn't taken the first dose, it redirects user to first dose.
     * 
     * if the user hasn't taken the second dose and has completed the first dose, 
     * it checks the eligibility of user, and approves or disapproves the user's 
     * second dose of vaccine. 
     * 
     * If it approves, it shows prompt to collect 350 Rs. from user. 
     * And sets the value of isSecondDose(boolean) as true.
     */

    public void secondDose() {
        if (isSecondDose) {
            System.out.println(toString() + "Basic Vaccination is complete, no vaccines remaining\nYou can apply for Booster Dose, if want! it's not necessary.");
        }

        else if (isFirstDose) {
            System.out.println(toString() + "Second Vaccine Dose is approved!\nCollect 350 Rs. after vaccination\n");
            isSecondDose = true;
        }
        else if (eligibility()) {
            notEligiblePrintMessage("second");
            firstDose();
        }
        else {
            notEligiblePrintMessage("second");
        }
    }
    

    /* boosterDose() is an abstract method, which is declared for the implementation
     * by the child class. It would check eligibility of a user for booser dose of 
     * Vaccine.
     */

    public abstract void boosterDose();

    
    /* 
     * this toString() function returns the name of the user. 
     */
    public String toString () {
        return "User Name: " + this.name + "\t";
    }
}


/* class VaccinationSuccessful is the child class of Vaccine. it inherits all the
 * variables of the Vaccine class. It also implements the boosterDose() abstract method
 * of the class Vaccine. Which checks the eligibility of the User for the Booster Dose.
 * 
 * it uses a isBoosterDose(boolean) variable for checking if the user has already taken the
 * booster dose or not. 
 */
class VaccinationSuccessful extends Vaccine{
    protected boolean isBoosterDose = false;


    /* Constructor of VaccinationSuccessful class takes the age(int), name(String), and 
     * nationality(String) as parameters. With super(), it passes these arguments to
     * its parent class constructor for initialization. 
     */

    public VaccinationSuccessful (int age, String name, String nationality)
    {
        super(age, name, nationality);
    }


    /* boosterDose() checks and approves the user for Booster Dose of the Vaccination.
     * 
     * if user has already taken booster dose, it prompts the respective message and 
     * terminates the function.
     * 
     * if user has taken the second dose, only then booster dose is approved. A prompt
     * to collect 500 Rs. is printed on console. And the value of isBoosterDose(boolean) is
     * set to true.
     * 
     * if user hasn't got its second dose, then the function checks its eligibility with 
     * eligibility() and redirects user for the previous dose, i.e. firsDose() from the parent
     * class. Or prints the ineligiblity prompt.
     */
    public void boosterDose() {
        if (isBoosterDose) {
            System.out.println(toString() + "Booster Vaccine is already given.\n");
        }
        else if (isSecondDose) {
            System.out.println(toString() + "Booster dose is approved\nCollect 500 Rs. from the user.\n");
            isBoosterDose = true;
        }
        else if (eligibility()) {
            notEligiblePrintMessage("booster");
            firstDose();
        }
        else notEligiblePrintMessage("Vaccine");
    }

}


/* 
 * Vaccination class is the main class which contains the main() function. It executes the
 * methods and classes define above. It creates different objects of VaccinationSuccessful 
 * class with different age, name and nationality. Then it invokes the firstDose(), secondDose()
 * and boosterDose() methods for them respectively in sequential and random order.
 */
public class Vaccination {
    public static void main(String[] args) {
        VaccinationSuccessful user1 = new VaccinationSuccessful(21, "Rahul Kaushik", "Indian");
        VaccinationSuccessful user2 = new VaccinationSuccessful(15, "Kartik Goyal", "Indian");
        VaccinationSuccessful user3 = new VaccinationSuccessful(18, "Sudha More", "Indian");
        VaccinationSuccessful user4 = new VaccinationSuccessful(28, "Kavya Sharma", "American");

        /* user1 is an eligible user and all the three methods are called in
         * the correct order for it. It shows the program is working correctly.
         */

        user1.firstDose();
        user1.secondDose();
        user1.boosterDose();

        /* user2 is an under age user, therefore the program denies to approve the
         * vaccination dose for the user2. It clears the objective of checking age criteria
         * in the program.
         */
        user2.firstDose();

        /* user3 being an eligible user, tries to go for second dose, for which it gets
         * redirectd to the first dose.
         * Again the user tries to get the booster dose before second dose, and again it
         * gets redirected to second dose. and Gets an booster dose afterwards.
         */
        user3.secondDose();
        user3.boosterDose();
        user3.boosterDose();

        /* user4 tries to get booster dose, but being an NRI, the user gets dsapproved
         * for the vaccination directly.
         */
        user4.boosterDose();
    }
}

// Program Ends Here.