
package org.roblet.sample.out;

import org.roblet.sample.out.far.OutRoblet;

import genRob.genControl.client.Client;
import genRob.genControl.client.Slot;


public class  OutApp
{

    public static void  main (String[] args)
        throws Exception
    {
        System.out.println ("app hello");

        Slot  slot = new Client ()
                        . getServer ("localhost")
                        . getSlot ();
        slot. offerRemote (new NearImpl ());

        slot. run (new OutRoblet ());
    }

}
