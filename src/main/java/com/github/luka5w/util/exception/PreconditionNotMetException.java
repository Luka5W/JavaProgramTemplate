package com.github.luka5w.util.exception;

public class PreconditionNotMetException extends RuntimeException {
    public PreconditionNotMetException() {
        super();
    }

    public PreconditionNotMetException(String s) {
        super(s);
    }

    public PreconditionNotMetException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public PreconditionNotMetException(Throwable throwable) {
        super(throwable);
    }

    public PreconditionNotMetException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
