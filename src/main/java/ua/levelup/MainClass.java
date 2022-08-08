package ua.levelup;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class MainClass {
    @Option(name = "-s", aliases = "-string", required = true)
    String str;
    @Option(name = "-ch", aliases = "-change", handler = GetChars.class)
    CharContainer symbols;
    @Option(name = "-r", aliases = "-reverse")
    boolean reverse;

    public static void main(String[] args) {
        MainClass main = new MainClass();
        CmdLineParser parser = new CmdLineParser(main);

        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            e.printStackTrace();
            return;
        }

        main.str = main.repl(main.str, main.symbols.chFrom, main.symbols.chTo);
        main.str = main.rev(main.str, main.reverse);

        System.out.println("Final string is " + main.str);
    }
    public String repl(String strIn, char ch1, char ch2){
        if(ch1 != 0 && ch2 != 0){
            return strIn.replace(ch1, ch2);
        }
        return strIn;
    }
    public String rev(String strIn, boolean rew){
        if (rew == true){
            return new StringBuilder(strIn).reverse().toString();
        };
        return strIn;
    }
}
