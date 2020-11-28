package com.github.luka5w.programtemplate;

import com.github.luka5w.util.program.MainClass;
import com.github.luka5w.util.program.Program;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

import java.io.File;

public class Main implements MainClass {

    public static void main(String[] args) {
        Main main = new Main();
        Program program = new Program(main, args, Program.DEFAULT_OPTIONS, Constants.FILE_CONFIG, Constants.PROGRAM_NAME, Constants.PROGRAM_VERSION, Constants.HELP_HEADER, Constants.HELP_FOOTER, Constants.HELP_AUTOUSAGE);
        program.init();
        program.exec();
    }

    @Override
    public void getOptions(Options options) {
        /**
         * usage
         * @see Options#addOption(Option)
         * @see Options#addOption(String, String)
         * @see Options#addOption(String, boolean, String)
         * @see Options#addOption(String, String, boolean, String)
         */
    }

    @Override
    public void setup(CommandLine cmd, File configFile) {

    }

    @Override
    public void main(CommandLine cmd, File configFile) {
        System.out.println("test");
    }
}
