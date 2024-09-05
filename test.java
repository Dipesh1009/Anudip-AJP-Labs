

class Oil <t> {
    t age;

    public String toString(){
        return "age: " + this.age;
    }
}

class Data <t> {
    t bytes;

    public String toString(){
        return "bytes: " + this.bytes;
    }
}
public class test {

    public static void main(String[] args) {

        Oil<Integer> oil = new Oil<>();
        Data<Integer> data = new Data<>();
        oil.age = 25;
        data.bytes = 32;

        Oil<String> oil2 = new Oil<>();
        Data<Byte> data2 = new Data<>();
        oil2.age = "Thirty two";
        data2.bytes = 64;
        
        System.out.println(oil);
        System.out.println(oil2);
        System.out.println(data);
        System.out.println(data2);

    }
}