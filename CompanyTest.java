import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest{ 
    private Company company1;
    private User client1;
    private User client2;
    private User seller1;
    private User seller2;

    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest(){
        
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp(){
        company1 = new Company();
        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
    }
    
    
    @Test
    public void testConstructor(){
        assertNotNull(company1);
        assertNotNull(client1);
        assertNotNull(client2);
        assertNotNull(seller1);
        assertNotNull(seller2);
    }
}
