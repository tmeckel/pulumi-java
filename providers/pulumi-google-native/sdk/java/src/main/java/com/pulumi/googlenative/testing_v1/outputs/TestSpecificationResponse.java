// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.testing_v1.outputs.AndroidInstrumentationTestResponse;
import com.pulumi.googlenative.testing_v1.outputs.AndroidRoboTestResponse;
import com.pulumi.googlenative.testing_v1.outputs.AndroidTestLoopResponse;
import com.pulumi.googlenative.testing_v1.outputs.IosTestLoopResponse;
import com.pulumi.googlenative.testing_v1.outputs.IosTestSetupResponse;
import com.pulumi.googlenative.testing_v1.outputs.IosXcTestResponse;
import com.pulumi.googlenative.testing_v1.outputs.TestSetupResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TestSpecificationResponse {
    /**
     * @return An Android instrumentation test.
     * 
     */
    private final AndroidInstrumentationTestResponse androidInstrumentationTest;
    /**
     * @return An Android robo test.
     * 
     */
    private final AndroidRoboTestResponse androidRoboTest;
    /**
     * @return An Android Application with a Test Loop.
     * 
     */
    private final AndroidTestLoopResponse androidTestLoop;
    /**
     * @return Disables performance metrics recording. May reduce test latency.
     * 
     */
    private final Boolean disablePerformanceMetrics;
    /**
     * @return Disables video recording. May reduce test latency.
     * 
     */
    private final Boolean disableVideoRecording;
    /**
     * @return An iOS application with a test loop.
     * 
     */
    private final IosTestLoopResponse iosTestLoop;
    /**
     * @return Test setup requirements for iOS.
     * 
     */
    private final IosTestSetupResponse iosTestSetup;
    /**
     * @return An iOS XCTest, via an .xctestrun file.
     * 
     */
    private final IosXcTestResponse iosXcTest;
    /**
     * @return Test setup requirements for Android e.g. files to install, bootstrap scripts.
     * 
     */
    private final TestSetupResponse testSetup;
    /**
     * @return Max time a test execution is allowed to run before it is automatically cancelled. The default value is 5 min.
     * 
     */
    private final String testTimeout;

    @CustomType.Constructor
    private TestSpecificationResponse(
        @CustomType.Parameter("androidInstrumentationTest") AndroidInstrumentationTestResponse androidInstrumentationTest,
        @CustomType.Parameter("androidRoboTest") AndroidRoboTestResponse androidRoboTest,
        @CustomType.Parameter("androidTestLoop") AndroidTestLoopResponse androidTestLoop,
        @CustomType.Parameter("disablePerformanceMetrics") Boolean disablePerformanceMetrics,
        @CustomType.Parameter("disableVideoRecording") Boolean disableVideoRecording,
        @CustomType.Parameter("iosTestLoop") IosTestLoopResponse iosTestLoop,
        @CustomType.Parameter("iosTestSetup") IosTestSetupResponse iosTestSetup,
        @CustomType.Parameter("iosXcTest") IosXcTestResponse iosXcTest,
        @CustomType.Parameter("testSetup") TestSetupResponse testSetup,
        @CustomType.Parameter("testTimeout") String testTimeout) {
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
     * @return An Android instrumentation test.
     * 
     */
    public AndroidInstrumentationTestResponse androidInstrumentationTest() {
        return this.androidInstrumentationTest;
    }
    /**
     * @return An Android robo test.
     * 
     */
    public AndroidRoboTestResponse androidRoboTest() {
        return this.androidRoboTest;
    }
    /**
     * @return An Android Application with a Test Loop.
     * 
     */
    public AndroidTestLoopResponse androidTestLoop() {
        return this.androidTestLoop;
    }
    /**
     * @return Disables performance metrics recording. May reduce test latency.
     * 
     */
    public Boolean disablePerformanceMetrics() {
        return this.disablePerformanceMetrics;
    }
    /**
     * @return Disables video recording. May reduce test latency.
     * 
     */
    public Boolean disableVideoRecording() {
        return this.disableVideoRecording;
    }
    /**
     * @return An iOS application with a test loop.
     * 
     */
    public IosTestLoopResponse iosTestLoop() {
        return this.iosTestLoop;
    }
    /**
     * @return Test setup requirements for iOS.
     * 
     */
    public IosTestSetupResponse iosTestSetup() {
        return this.iosTestSetup;
    }
    /**
     * @return An iOS XCTest, via an .xctestrun file.
     * 
     */
    public IosXcTestResponse iosXcTest() {
        return this.iosXcTest;
    }
    /**
     * @return Test setup requirements for Android e.g. files to install, bootstrap scripts.
     * 
     */
    public TestSetupResponse testSetup() {
        return this.testSetup;
    }
    /**
     * @return Max time a test execution is allowed to run before it is automatically cancelled. The default value is 5 min.
     * 
     */
    public String testTimeout() {
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
        }        public TestSpecificationResponse build() {
            return new TestSpecificationResponse(androidInstrumentationTest, androidRoboTest, androidTestLoop, disablePerformanceMetrics, disableVideoRecording, iosTestLoop, iosTestSetup, iosXcTest, testSetup, testTimeout);
        }
    }
}
