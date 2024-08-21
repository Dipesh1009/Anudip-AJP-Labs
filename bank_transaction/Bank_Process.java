// Task : Create a Bank procedure program which implements withdraw and deposit methods

package bank_transaction;       //Package declaration

//declaring Bank Class for all the procedure
class Bank {           
    
    
    //Instance variable to store bank balance
    private double amount;    

    
    //class Constructor which initialize the given bank balance amount
    Bank(double amount){
        this.amount = amount;
    }


    // display() function to display the value of amount variable
    public void display() {
        System.out.println("Your Current balance is " + this.amount);
    }


    // withdraw() function to take out the amount balance,
    // it checks if the amount in the account remains above the
    // minimum balance amount i.e. 1000
    // otherwise it denies the withdraw request
    public void withdraw (double withdrawalAmount) {
        double limit = this.amount - withdrawalAmount;
        

        //Checking the sufficient balance to withdraw
        Boolean sufficient = ( limit <= 1000 ) ? false : true ;         

        if (sufficient) {
            System.out.println("Withdraw Successful :)");

            this.amount -= withdrawalAmount;
            display();
        }
        
        else {
            System.out.println("Amount is insufficient to withdraw");
        }
    }


    // deposit() function to deposit amount to the bank account variable.
    public void deposit (double depositAmount) {
        System.out.println("Amount deposited : " + depositAmount);

        this.amount += depositAmount;
        display();

    }
}


// This is the driver class contains main() function
public class Bank_Process {
    public static void main(String[] args) {
        
        //Object of Bank class is instantiated
        Bank account1 = new Bank(10000);


        account1.display();                         //it displays the current balance

        account1.deposit(5000);         // it deposits and displays the new 
                                                      // value of amount of account1

    }
}

//End of Program