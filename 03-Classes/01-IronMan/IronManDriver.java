import java.util.ArrayList;

public class IronManDriver {
    
    public static void main (String[] args) {
        
        ArrayList<IronMan> suits = new ArrayList<IronMan>();
        
        suits.add(new IronMan());
        suits.add(new IronMan("Mark 1", "Silver", 3401, "Iron", 3, false, .17));
        suits.add(new IronMan("Mark 42", "Hot Rod Red", 850, "Adamantium", 33, true, .89));

        System.out.println(suits);
        
    }
    
}
