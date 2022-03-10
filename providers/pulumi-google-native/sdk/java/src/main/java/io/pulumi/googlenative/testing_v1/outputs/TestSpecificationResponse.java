// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.testing_v1.outputs.AndroidInstrumentationTestResponse;
import io.pulumi.googlenative.testing_v1.outputs.AndroidRoboTestResponse;
import io.pulumi.googlenative.testing_v1.outputs.AndroidTestLoopResponse;
import io.pulumi.googlenative.testing_v1.outputs.IosTestLoopResponse;
import io.pulumi.googlenative.testing_v1.outputs.IosTestSetupResponse;
import io.pulumi.googlenative.testing_v1.outputs.IosXcTestResponse;
import io.pulumi.googlenative.testing_v1.outputs.TestSetupResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TestSpecificationResponse {
    /**
     * An Android instrumentation test.
     * 
     */
    private final AndroidInstrumentationTestResponse androidInstrumentationTest;
    /**
     * An Android robo test.
     * 
     */
    private final AndroidRoboTestResponse androidRoboTest;
    /**
     * An Android Application with a Test Loop.
     * 
     */
    private final AndroidTestLoopResponse androidTestLoop;
    /**
     * Disables performance metrics recording. May reduce test latency.
     * 
     */
    private final Boolean disablePerformanceMetrics;
    /**
     * Disables video recording. May reduce test latency.
     * 
     */
    private final Boolean disableVideoRecording;
    /**
     * An iOS application with a test loop.
     * 
     */
    private final IosTestLoopResponse iosTestLoop;
    /**
     * Test setup requirements for iOS.
     * 
     */
    private final IosTestSetupResponse iosTestSetup;
    /**
     * An iOS XCTest, via an .xctestrun file.
     * 
     */
    private final IosXcTestResponse iosXcTest;
    /**
     * Test setup requirements for Android e.g. files to install, bootstrap scripts.
     * 
     */
    private final TestSetupResponse testSetup;
    /**
     * Max time a test execution is allowed to run before it is automatically cancelled. The default value is 5 min.
     * 
     */
    private final String testTimeout;

    @OutputCustomType.Constructor
    private TestSpecificationResponse(
        @OutputCustomType.Parameter("androidInstrumentationTest") AndroidInstrumentationTestResponse androidInstrumentationTest,
        @OutputCustomType.Parameter("androidRoboTest") AndroidRoboTestResponse androidRoboTest,
        @OutputCustomType.Parameter("androidTestLoop") AndroidTestLoopResponse androidTestLoop,
        @OutputCustomType.Parameter("disablePerformanceMetrics") Boolean disablePerformanceMetrics,
        @OutputCustomType.Parameter("disableVideoRecording") Boolean disableVideoRecording,
        @OutputCustomType.Parameter("iosTestLoop") IosTestLoopResponse iosTestLoop,
        @OutputCustomType.Parameter("iosTestSetup") IosTestSetupResponse iosTestSetup,
        @OutputCustomType.Parameter("iosXcTest") IosXcTestResponse iosXcTest,
        @OutputCustomType.Parameter("testSetup") TestSetupResponse testSetup,
        @OutputCustomType.Parameter("testTimeout") String testTimeout) {
        this.androidInstrumentationTest = androidInstrumentationTest;
        this.androidRoboTest = androidRoboTest;
        this.androidTestLoop = androidTestLoop;
        this.disablePerformanceMetrics = disablePerformanceMetrics;
        this.disableVideoRecording = disableVideoRecording;
        this.iosTestLoop = iosTestLoop;
        this.iosTestSetup = iosTestSetup;
        this.iosXcTest = iosXcTest;
        this.testSetup = testSetup;
        this.testTimeout = testTimeout;
    }

    /**
     * An Android instrumentation test.
     * 
    */
    public AndroidInstrumentationTestResponse getAndroidInstrumentationTest() {
        return this.androidInstrumentationTest;
    }
    /**
     * An Android robo test.
     * 
    */
    public AndroidRoboTestResponse getAndroidRoboTest() {
        return this.androidRoboTest;
    }
    /**
     * An Android Application with a Test Loop.
     * 
    */
    public AndroidTestLoopResponse getAndroidTestLoop() {
        return this.androidTestLoop;
    }
    /**
     * Disables performance metrics recording. May reduce test latency.
     * 
    */
    public Boolean getDisablePerformanceMetrics() {
        return this.disablePerformanceMetrics;
    }
    /**
     * Disables video recording. May reduce test latency.
     * 
    */
    public Boolean getDisableVideoRecording() {
        return this.disableVideoRecording;
    }
    /**
     * An iOS application with a test loop.
     * 
    */
    public IosTestLoopResponse getIosTestLoop() {
        return this.iosTestLoop;
    }
    /**
     * Test setup requirements for iOS.
     * 
    */
    public IosTestSetupResponse getIosTestSetup() {
        return this.iosTestSetup;
    }
    /**
     * An iOS XCTest, via an .xctestrun file.
     * 
    */
    public IosXcTestResponse getIosXcTest() {
        return this.iosXcTest;
    }
    /**
     * Test setup requirements for Android e.g. files to install, bootstrap scripts.
     * 
    */
    public TestSetupResponse getTestSetup() {
        return this.testSetup;
    }
    /**
     * Max time a test execution is allowed to run before it is automatically cancelled. The default value is 5 min.
     * 
    */
    public String getTestTimeout() {
        return this.testTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidInstrumentationTestResponse androidInstrumentationTest;
        private AndroidRoboTestResponse androidRoboTest;
        private AndroidTestLoopResponse androidTestLoop;
        private Boolean disablePerformanceMetrics;
        private Boolean disableVideoRecording;
        private IosTestLoopResponse iosTestLoop;
        private IosTestSetupResponse iosTestSetup;
        private IosXcTestResponse iosXcTest;
        private TestSetupResponse testSetup;
        private String testTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TestSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidInstrumentationTest = defaults.androidInstrumentationTest;
    	      this.androidRoboTest = defaults.androidRoboTest;
    	      this.androidTestLoop = defaults.androidTestLoop;
    	      this.disablePerformanceMetrics = defaults.disablePerformanceMetrics;
    	      this.disableVideoRecording = defaults.disableVideoRecording;
    	      this.iosTestLoop = defaults.iosTestLoop;
    	      this.iosTestSetup = defaults.iosTestSetup;
    	      this.iosXcTest = defaults.iosXcTest;
    	      this.testSetup = defaults.testSetup;
    	      this.testTimeout = defaults.testTimeout;
        }

        public Builder androidInstrumentationTest(AndroidInstrumentationTestResponse androidInstrumentationTest) {
            this.androidInstrumentationTest = Objects.requireNonNull(androidInstrumentationTest);
            return this;
        }

        public Builder androidRoboTest(AndroidRoboTestResponse androidRoboTest) {
            this.androidRoboTest = Objects.requireNonNull(androidRoboTest);
            return this;
        }

        public Builder androidTestLoop(AndroidTestLoopResponse androidTestLoop) {
            this.androidTestLoop = Objects.requireNonNull(androidTestLoop);
            return this;
        }

        public Builder disablePerformanceMetrics(Boolean disablePerformanceMetrics) {
            this.disablePerformanceMetrics = Objects.requireNonNull(disablePerformanceMetrics);
            return this;
        }

        public Builder disableVideoRecording(Boolean disableVideoRecording) {
            this.disableVideoRecording = Objects.requireNonNull(disableVideoRecording);
            return this;
        }

        public Builder iosTestLoop(IosTestLoopResponse iosTestLoop) {
            this.iosTestLoop = Objects.requireNonNull(iosTestLoop);
            return this;
        }

        public Builder iosTestSetup(IosTestSetupResponse iosTestSetup) {
            this.iosTestSetup = Objects.requireNonNull(iosTestSetup);
            return this;
        }

        public Builder iosXcTest(IosXcTestResponse iosXcTest) {
            this.iosXcTest = Objects.requireNonNull(iosXcTest);
            return this;
        }

        public Builder testSetup(TestSetupResponse testSetup) {
            this.testSetup = Objects.requireNonNull(testSetup);
            return this;
        }

        public Builder testTimeout(String testTimeout) {
            this.testTimeout = Objects.requireNonNull(testTimeout);
            return this;
        }
        public TestSpecificationResponse build() {
            return new TestSpecificationResponse(androidInstrumentationTest, androidRoboTest, androidTestLoop, disablePerformanceMetrics, disableVideoRecording, iosTestLoop, iosTestSetup, iosXcTest, testSetup, testTimeout);
        }
    }
}
