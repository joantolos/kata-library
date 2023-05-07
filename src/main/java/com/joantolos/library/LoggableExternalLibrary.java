package com.joantolos.library;

public class LoggableExternalLibrary extends LogDecorator implements ExternalLibrarySystem {
    LoggableExternalLibrary(ExternalLibrarySystem externalLibrary) {
        super(externalLibrary);
    }
}
