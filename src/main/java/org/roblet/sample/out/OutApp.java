
package org.roblet.sample.out;

import org.roblet.client.Slot;
import org.roblet.sample.out.far.OutRoblet;


public class  OutApp
{

    public static void  main (String[] args)
        throws Exception
    {
        System.out.println ("app hello");

        try (Slot slot = new Slot ("localhost")) {
            slot. offer (new NearImpl ());
            slot. run (new OutRoblet ());
        }
    }

}
