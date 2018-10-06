public class Test{
    public static void main(String[] args){
        System.out.println("Hello Array!!!");
        Array array = new Array(10);
        array.insertToTail(1);
        array.insert(0,1);
        array.find(0);
        array.printAll();
        array.delete(0);
        array.printAll();
    }
}