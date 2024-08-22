class A {

    //load 1 function
    public void load (int num) {
        System.out.println(num + " I am load 1 function\nI do overloading to load 2\n");
    }
    
    // load 2 function
    public void load (int num, int num2){
        System.out.println(num + num2 + " I am load 2 function\nI do overloading to load 1\n");
    }

    //load 3 function 
    public void load (String listen) {
        System.out.println(listen + " are you sure, you are calling me from class A object, because I am property of class A, not B; I am not even over-rided Is it why you see me? :(\n");
    }
}

class B extends A{
    // load 1 function of child class
    public void load (int num) {
        System.out.println(num + " I am load 1 function in class B, because you called me not my parent\nI do over riding to load 1 function of my parent class A\n");
    }
    
    // load 2 function of child class
    public void load (int num, int num2) {
        System.out.println("I am overloading my house B's load 1 class, but do you notice; I am from class B, not from A, but let me show you super magic");
        super.load(num, num2);

    }
    
}

// It's time to run the code of overloading and over-riding,
// watch carefully, whether you just get confused... just joking... but not...
public class over {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.load(1);                  // calls the first load function of class A
        a.load(1,1);            // calls the second load function of class A

        b.load(1);                      //calls the first load function of class B 
        b.load(1,1);                // calls the second load function of class B
                                            //which will call eventually class A load 2 function

        b.load("My dear Friend");    // This is not B's func but, it had a parent
                                            // and it had not been overridden

    }
    
}
