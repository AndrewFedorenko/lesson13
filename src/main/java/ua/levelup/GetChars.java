package ua.levelup;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.OptionHandler;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;

public class GetChars extends OptionHandler<CharContainer> {
    public GetChars(CmdLineParser parser, OptionDef option, Setter<? super CharContainer> setter) {
        super(parser, option, setter);
    }
    @Override
    public int parseArguments(Parameters params) throws CmdLineException, IllegalArgumentException {
            char ch1;
            char ch2;

            String parameter1 = params.getParameter(0);
            String parameter2 = params.getParameter(1);

            if (parameter1.length()  == 1) {
                ch1 = parameter1.charAt(0);
            }
                else {
                    throw new IllegalArgumentException("Incorrect length of par.1 -ch");
            }
            if (parameter2.length()  == 1) {
                ch2 = parameter2.charAt(0);
            }
            else {
                    throw new IllegalArgumentException("Incorrect length of par.2 -ch");
            }
            try {
                setter.addValue(new CharContainer(ch1, ch2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        return 2;
    }
    @Override
    public String getDefaultMetaVariable() {
        return null;
    }
}


