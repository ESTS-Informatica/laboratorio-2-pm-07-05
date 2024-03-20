import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste PropertyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class PropertyTest{
    public PropertyTest(){
        
    }
    
    @Test
    public void testConstructor(){
        Property property1 = new Property("T3 Monte Belo", 150000);
        
        assertEquals("T3 Monte Belo", property1.getDescription());
        assertEquals(150000.0, property1.getPrice()); 
    }
    
    @Test
    public void testToString(){
        Property property1 = new Property("T3 Monte Belo", 150000.0);
        
        assertEquals("Descrição : T3 Monte Belo\npreco : 150000.0 euros", property1.toString());
    }
}
