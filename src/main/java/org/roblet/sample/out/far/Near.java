
package org.roblet.sample.out.far;

import java.io.IOException;


/**
 * This interface will be implemented on application side.
 */
public interface  Near
{

    public void  write (int b);
    public void  write (byte[] buf) throws IOException;

}
