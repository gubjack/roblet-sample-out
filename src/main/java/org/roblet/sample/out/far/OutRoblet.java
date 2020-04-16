
package org.roblet.sample.out.far;

import java.io.Serializable;

import org.roblet.Roblet;
import org.roblet.Robot;


public class  OutRoblet
    implements Roblet, Serializable
{

    @Override
    public Object  execute (Robot robot)
        throws Exception
    {
        System.out.println ("far hello");
        return null;
    }

}
