import com.intellij.testFramework.ParsingTestCase;
import com.uncivildev.sliq.lang.core.parser.SliqParserDefinition;

public class SliqParsingTest extends ParsingTestCase {
    public SliqParsingTest() {
        super("", "liquid", new SliqParserDefinition());
    }

    public void testParsingTestData() {
        doTest(true);
    }

    /**
     * @return path to test data file directory relative to the root of this module.
     */
    @Override
    protected String getTestDataPath() {
        return "src/test/testData";
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}
