
package org.roblet.sample.out;

import java.io.IOException;

import org.roblet.sample.out.far.Near;


public class  NearImpl
    implements Near
{

    public void  write (int b)
    {
        System.out. write (b);
    }

    public void  write (byte[] buf)
        throws IOException
    {
        System.out. write (buf);
    }

}
