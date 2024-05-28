public interface Electronic {
    
boolean onOroff = false;

    boolean on();

    
    boolean off();

    default void electronic(){
        if (onOroff) {
            System.out.println("Default");
            
        }
    }

 
}