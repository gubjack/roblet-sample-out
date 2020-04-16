
package org.roblet.sample.out.far;

import java.io.IOException;
import java.io.OutputStream;


class  NearOutputStream
    extends OutputStream
{

    public  NearOutputStream (Near near)
    {
        this.near = near;
    }
    private final Near  near;

    @Override
    public void  write (int b)
        throws IOException
    {
        near. write (b);
    }

    @Override
    public void  write (byte buf[], int off, int len)
        throws IOException
    {
        if (buf == null)
            throw new NullPointerException ();
        byte[]  bufSend = new byte [len];
        System. arraycopy (buf, off, bufSend, 0, len);
        near. write (bufSend);
    }

}
