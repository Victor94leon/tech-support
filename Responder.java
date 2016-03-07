import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
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
    // Coleccion de objetos String para guardar respuestas aleatorias
    private ArrayList<String> respuestasAleatorias;
    // Colección de objetos String para guardar respuestas predeterminadas 
    private HashMap<String,String> respuestasPredeterminadas;

    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        respuestasAleatorias = new ArrayList<String>();
        respuestasPredeterminadas = new HashMap<String,String>();
        // Respuestas aleatorias
        respuestasAleatorias.add("That sounds interesting. Tell me more...");
        respuestasAleatorias.add("I need more information");
        respuestasAleatorias.add("I dont know his problem. please tell me more...");
        respuestasAleatorias.add("I have little information to help you. Tell me more...");
        respuestasAleatorias.add("Follow tell me your problem");
        // Respuestas predeterminadas
        respuestasPredeterminadas.put("hi","Hi. Please, tell me your problem");
        respuestasPredeterminadas.put("error","If you have an error try to reset the system");
        respuestasPredeterminadas.put("virus","You should install an anti-virus");
        respuestasPredeterminadas.put("freeze","If your system have freeze try to uninstall programs");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String palabraBuscada)
    {
        String respuesta;
        if (respuestasPredeterminadas.get(palabraBuscada)!=null){
            respuesta = respuestasPredeterminadas.get(palabraBuscada);
        }
        else {
            respuesta = respuestasAleatorias.get(random.nextInt(respuestasAleatorias.size()));
        }
        return respuesta;
    }
}
