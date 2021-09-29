package com.volante.mtmx;
import com.tplus.transform.runtime.handler.*;
import com.tplus.transform.runtime.*;

public class StopTranslation implements IInvokable {

    public Object run(Object[] args, TransformContext cxt) throws TransformException {
       String reason = (String) args[0];
       // perform the operation here
       TransformException tx = new TransformException(reason);
       if(args.length > 1) {
       		String location = (String)args[1];
	       tx.setFieldID(location);
       }
       tx.setErrorCode("STOP");
       throw tx;
    }
}