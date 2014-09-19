import org.jruby.CompatVersion;
import org.jruby.util.cli.OutputStrings;

public class Hello {
    public static void main(String[] args) {
        System.out.println("version: " + OutputStrings.getVersionString(CompatVersion.RUBY2_0));
    }
}
