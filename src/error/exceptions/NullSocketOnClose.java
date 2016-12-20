/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error.exceptions;

/**
 *
 * @author Angelo
 */
public class NullSocketOnClose extends CustomException {

    public NullSocketOnClose(String errorMsg) {
        super(errorMsg);
        this.customErrorMsg = ErrorMessage.NULL_POINTER_FOR_SOCKET_ON_CLOSE;
    }

    public NullSocketOnClose(String errorMsg, Throwable throwable) {
        super(errorMsg, throwable);
        this.customErrorMsg = ErrorMessage.NULL_POINTER_FOR_SOCKET_ON_CLOSE;
    }

    @Override
    public void showCustomMessage() {
        System.err.println(this.customErrorMsg);
    }
}
