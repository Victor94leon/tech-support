import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    // Objeto de la clase Random para generar números aleatorios
    private Random random;
    // Coleccion de objetos String para guardar respuestas
    private ArrayList<String> respuestas;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        respuestas = new ArrayList<String>();
        respuestas.add("That sounds interesting. Tell me more...");
        respuestas.add("I need more information");
        respuestas.add("I dont know his problem. please tell me more...");
        respuestas.add("I have little information to help you. Tell me more...");
        respuestas.add("Follow tell me your problem");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int respuestaAleatoria = random.nextInt(respuestas.size());
        return respuestas.get(respuestaAleatoria);
    }
}
