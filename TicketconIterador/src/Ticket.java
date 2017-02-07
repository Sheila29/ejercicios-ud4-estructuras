import com.company.LineaTicket;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sheila on 07/02/2017.
 */
public class Ticket {

    private List<LineaTicket> lineas = new LinkedList<>();


    Iterator<LineaTicket> it = lineas.iterator();

    while(it.hasNext)) {
        LineaTicket lt = it.next();
        System.out.println(lt);
    }
}
