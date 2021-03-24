
package org.roblet.sample.out.far;

import java.io.PrintStream;
import java.io.Serializable;

import org.roblet.Roblet;
import org.roblet.Robot;

import genRob.genControl.unit.Proxies;


public class  OutRoblet
    implements Roblet, Serializable
{

    @Override
    public Object  execute (Robot robot)
        throws Exception
    {
        PrintStream  out = out (robot);

        out. println ("roblet hello");
        out. flush ();

        return null;
    }

    private PrintStream  out (Robot robot)
        throws Exception
    {
        Proxies  proxies = robot. getUnit (Proxies.class);
        if (proxies == null)
            throw new Exception ("Unit " + Proxies.class + " missing");

        Near  near = (Near) proxies. obtain (Near.class);

        return new PrintStream (new NearOutputStream (near));
    }

}
