package mq.uag.apachelogviewer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by DaKi on 05/12/2016.
 */

public class LogEntry {

    /*private*/ String _remoteHost;

   /*private*/ String _url;
    /*private*/ int _http_code;
    /*private*/ int _content_length;
    public Date entryDate;

    /**
     * Constructeur de la classe LogEntry
     * -Préconditions : Recoit un tableau contenant les groupes extraits par expressions régulières
     * -Postconditions : Initialise entièrement l'object y compris la propriété  Date entrydate
     * @param parsedLine
     */
    public LogEntry(String[] parsedLine){
        /*A vous de coder !!!!*/
    }

}
