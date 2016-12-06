package mq.uag.apachelogviewer;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Manuel RIAM on 05/12/2016.
 *
 * Classe statique pour opération de transformation / Traitement de logs
 */

public class LogManager {


    /**
     * Préconditions:
     * - Recoit une ligne de texte de Log brut en argument
     * Postconditions:
     * - Doit retourner:
     *      -Un <A DETERMINER> instancié si après parsing par expression régulière
     *      -Null en cas de Skip du masque d'expression régulière
     * @param rawLine
     * @return LogEntry
     */

     public  static Object /*A Remplacer*/ rawLogLineToEntry(String rawLine)
     {
         /*A vous de coder !!!!*/
         return 0; /*A Remplacer*/
     }

    /**
     * Précondition : Recoit <A DETERMINER>
     * PostCondition : Renvoie une <A DETERMINER> permettant l'affichage dans le ListView mainLV
     * @return
     */
    public static Object/*A remplacer*/ getDisplayList(Object/*A Remplacer*/ lle)
    {
        return null; /*A Remplacer*/
    }
}
