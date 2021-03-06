package pl.touk.sputnik.review.locator;

public class GradleBuildFileLocator extends AbstractBuildDirLocator {

    public GradleBuildFileLocator(String sourceDir, String testDir) {
	super(sourceDir, testDir);
    }

    @Override
    protected String getMainBuildDir() {
        return "build/classes/main";
    }

    @Override
    protected String getTestBuildDir() {
        return "build/classes/test";
    }
}
