
package org.roblet.sample.out;

import org.roblet.sample.out.far.OutRoblet;

import genRob.genControl.client.Client;


public class  OutApp
{

    public static void  main (String[] args)
        throws Exception
    {
        System.out.println ("local hello");

        new Client ()
            . getServer ("localhost")
            . getSlot ()
            . run (new OutRoblet ());
    }

}
