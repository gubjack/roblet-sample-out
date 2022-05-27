
package org.roblet.sample.out.far;

import java.io.IOException;

import org.roblet.Remote;


/**
 * This interface will be implemented on application side.
 */
public interface  Near
    extends Remote
{

    public void  write (int b);
    public void  write (byte[] buf) throws IOException;

}
