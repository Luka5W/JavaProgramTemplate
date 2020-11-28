package com.github.luka5w.programtemplate;

import java.io.File;

public class Constants {
    public static final String PROGRAM_VERSION = (Constants.class.getPackage().getImplementationVersion() == null ? "debug-version" : Constants.class.getPackage().getImplementationVersion());
    public static final String PROGRAM_NAME = (Constants.class.getPackage().getImplementationTitle() == null ? "debug-config" : Constants.class.getPackage().getImplementationTitle());
    public static final File FILE_CONFIG = new File(PROGRAM_NAME.toLowerCase() + ".ini");
    public static final String HELP_HEADER = "This is a program template";
    public static final String HELP_FOOTER = "fork me at github: https://github.com/luka5w/JavaProgramTemplate/";
    public static final boolean HELP_AUTOUSAGE = true;
}
