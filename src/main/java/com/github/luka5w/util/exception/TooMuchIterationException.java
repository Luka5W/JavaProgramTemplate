package com.github.luka5w.util.exception;

public class TooMuchIterationException extends RuntimeException {
    public TooMuchIterationException() {
        super();
    }

    public TooMuchIterationException(String s) {
        super(s);
    }

    public TooMuchIterationException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public TooMuchIterationException(Throwable throwable) {
        super(throwable);
    }

    public TooMuchIterationException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
