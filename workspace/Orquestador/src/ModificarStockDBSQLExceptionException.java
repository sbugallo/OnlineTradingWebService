
/**
 * ModificarStockDBSQLExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */



public class ModificarStockDBSQLExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1430785784104L;
    
    private ModificarStockDBStub.ModificarStockDBSQLException faultMessage;

    
        public ModificarStockDBSQLExceptionException() {
            super("ModificarStockDBSQLExceptionException");
        }

        public ModificarStockDBSQLExceptionException(java.lang.String s) {
           super(s);
        }

        public ModificarStockDBSQLExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ModificarStockDBSQLExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(ModificarStockDBStub.ModificarStockDBSQLException msg){
       faultMessage = msg;
    }
    
    public ModificarStockDBStub.ModificarStockDBSQLException getFaultMessage(){
       return faultMessage;
    }
}
    