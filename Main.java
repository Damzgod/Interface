public class Main {

    @Override
    public String toString() {
        return "main{}";
    }
    static void addNumbers(int a, int b){
        System.out.println(a+b);
    }
      

    public static void main(String[] args) {
    
    Computer hpBangandOlufsen = new Computer(new Storage(), new Processor(), new RAM());
    System.out.println(hpBangandOlufsen);

    addNumbers(6,7);
 }
}