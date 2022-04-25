// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.AndroidInstrumentationTestResponse;
import com.pulumi.googlenative.testing_v1.inputs.AndroidRoboTestResponse;
import com.pulumi.googlenative.testing_v1.inputs.AndroidTestLoopResponse;
import com.pulumi.googlenative.testing_v1.inputs.IosTestLoopResponse;
import com.pulumi.googlenative.testing_v1.inputs.IosTestSetupResponse;
import com.pulumi.googlenative.testing_v1.inputs.IosXcTestResponse;
import com.pulumi.googlenative.testing_v1.inputs.TestSetupResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A description of how to run the test.
 * 
 */
public final class TestSpecificationResponse extends com.pulumi.resources.InvokeArgs {

    public static final TestSpecificationResponse Empty = new TestSpecificationResponse();

    /**
     * An Android instrumentation test.
     * 
     */
    @Import(name="androidInstrumentationTest", required=true)
    private AndroidInstrumentationTestResponse androidInstrumentationTest;

    /**
     * @return An Android instrumentation test.
     * 
     */
    public AndroidInstrumentationTestResponse androidInstrumentationTest() {
        return this.androidInstrumentationTest;
    }

    /**
     * An Android robo test.
     * 
     */
    @Import(name="androidRoboTest", required=true)
    private AndroidRoboTestResponse androidRoboTest;

    /**
     * @return An Android robo test.
     * 
     */
    public AndroidRoboTestResponse androidRoboTest() {
        return this.androidRoboTest;
    }

    /**
     * An Android Application with a Test Loop.
     * 
     */
    @Import(name="androidTestLoop", required=true)
    private AndroidTestLoopResponse androidTestLoop;

    /**
     * @return An Android Application with a Test Loop.
     * 
     */
    public AndroidTestLoopResponse androidTestLoop() {
        return this.androidTestLoop;
    }

    /**
     * Disables performance metrics recording. May reduce test latency.
     * 
     */
    @Import(name="disablePerformanceMetrics", required=true)
    private Boolean disablePerformanceMetrics;

    /**
     * @return Disables performance metrics recording. May reduce test latency.
     * 
     */
    public Boolean disablePerformanceMetrics() {
        return this.disablePerformanceMetrics;
    }

    /**
     * Disables video recording. May reduce test latency.
     * 
     */
    @Import(name="disableVideoRecording", required=true)
    private Boolean disableVideoRecording;

    /**
     * @return Disables video recording. May reduce test latency.
     * 
     */
    public Boolean disableVideoRecording() {
        return this.disableVideoRecording;
    }

    /**
     * An iOS application with a test loop.
     * 
     */
    @Import(name="iosTestLoop", required=true)
    private IosTestLoopResponse iosTestLoop;

    /**
     * @return An iOS application with a test loop.
     * 
     */
    public IosTestLoopResponse iosTestLoop() {
        return this.iosTestLoop;
    }

    /**
     * Test setup requirements for iOS.
     * 
     */
    @Import(name="iosTestSetup", required=true)
    private IosTestSetupResponse iosTestSetup;

    /**
     * @return Test setup requirements for iOS.
     * 
     */
    public IosTestSetupResponse iosTestSetup() {
        return this.iosTestSetup;
    }

    /**
     * An iOS XCTest, via an .xctestrun file.
     * 
     */
    @Import(name="iosXcTest", required=true)
    private IosXcTestResponse iosXcTest;

    /**
     * @return An iOS XCTest, via an .xctestrun file.
     * 
     */
    public IosXcTestResponse iosXcTest() {
        return this.iosXcTest;
    }

    /**
     * Test setup requirements for Android e.g. files to install, bootstrap scripts.
     * 
     */
    @Import(name="testSetup", required=true)
    private TestSetupResponse testSetup;

    /**
     * @return Test setup requirements for Android e.g. files to install, bootstrap scripts.
     * 
     */
    public TestSetupResponse testSetup() {
        return this.testSetup;
    }

    /**
     * Max time a test execution is allowed to run before it is automatically cancelled. The default value is 5 min.
     * 
     */
    @Import(name="testTimeout", required=true)
    private String testTimeout;

    /**
     * @return Max time a test execution is allowed to run before it is automatically cancelled. The default value is 5 min.
     * 
     */
    public String testTimeout() {
        return this.testTimeout;
    }

    private TestSpecificationResponse() {}

    private TestSpecificationResponse(TestSpecificationResponse $) {
        this.androidInstrumentationTest = $.androidInstrumentationTest;
        this.androidRoboTest = $.androidRoboTest;
        this.androidTestLoop = $.androidTestLoop;
        this.disablePerformanceMetrics = $.disablePerformanceMetrics;
        this.disableVideoRecording = $.disableVideoRecording;
        this.iosTestLoop = $.iosTestLoop;
        this.iosTestSetup = $.iosTestSetup;
        this.iosXcTest = $.iosXcTest;
        this.testSetup = $.testSetup;
        this.testTimeout = $.testTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TestSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TestSpecificationResponse $;

        public Builder() {
            $ = new TestSpecificationResponse();
        }

        public Builder(TestSpecificationResponse defaults) {
            $ = new TestSpecificationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param androidInstrumentationTest An Android instrumentation test.
         * 
         * @return builder
         * 
         */
        public Builder androidInstrumentationTest(AndroidInstrumentationTestResponse androidInstrumentationTest) {
            $.androidInstrumentationTest = androidInstrumentationTest;
            return this;
        }

        /**
         * @param androidRoboTest An Android robo test.
         * 
         * @return builder
         * 
         */
        public Builder androidRoboTest(AndroidRoboTestResponse androidRoboTest) {
            $.androidRoboTest = androidRoboTest;
            return this;
        }

        /**
         * @param androidTestLoop An Android Application with a Test Loop.
         * 
         * @return builder
         * 
         */
        public Builder androidTestLoop(AndroidTestLoopResponse androidTestLoop) {
            $.androidTestLoop = androidTestLoop;
            return this;
        }

        /**
         * @param disablePerformanceMetrics Disables performance metrics recording. May reduce test latency.
         * 
         * @return builder
         * 
         */
        public Builder disablePerformanceMetrics(Boolean disablePerformanceMetrics) {
            $.disablePerformanceMetrics = disablePerformanceMetrics;
            return this;
        }

        /**
         * @param disableVideoRecording Disables video recording. May reduce test latency.
         * 
         * @return builder
         * 
         */
        public Builder disableVideoRecording(Boolean disableVideoRecording) {
            $.disableVideoRecording = disableVideoRecording;
            return this;
        }

        /**
         * @param iosTestLoop An iOS application with a test loop.
         * 
         * @return builder
         * 
         */
        public Builder iosTestLoop(IosTestLoopResponse iosTestLoop) {
            $.iosTestLoop = iosTestLoop;
            return this;
        }

        /**
         * @param iosTestSetup Test setup requirements for iOS.
         * 
         * @return builder
         * 
         */
        public Builder iosTestSetup(IosTestSetupResponse iosTestSetup) {
            $.iosTestSetup = iosTestSetup;
            return this;
        }

        /**
         * @param iosXcTest An iOS XCTest, via an .xctestrun file.
         * 
         * @return builder
         * 
         */
        public Builder iosXcTest(IosXcTestResponse iosXcTest) {
            $.iosXcTest = iosXcTest;
            return this;
        }

        /**
         * @param testSetup Test setup requirements for Android e.g. files to install, bootstrap scripts.
         * 
         * @return builder
         * 
         */
        public Builder testSetup(TestSetupResponse testSetup) {
            $.testSetup = testSetup;
            return this;
        }

        /**
         * @param testTimeout Max time a test execution is allowed to run before it is automatically cancelled. The default value is 5 min.
         * 
         * @return builder
         * 
         */
        public Builder testTimeout(String testTimeout) {
            $.testTimeout = testTimeout;
            return this;
        }

        public TestSpecificationResponse build() {
            $.androidInstrumentationTest = Objects.requireNonNull($.androidInstrumentationTest, "expected parameter 'androidInstrumentationTest' to be non-null");
            $.androidRoboTest = Objects.requireNonNull($.androidRoboTest, "expected parameter 'androidRoboTest' to be non-null");
            $.androidTestLoop = Objects.requireNonNull($.androidTestLoop, "expected parameter 'androidTestLoop' to be non-null");
            $.disablePerformanceMetrics = Objects.requireNonNull($.disablePerformanceMetrics, "expected parameter 'disablePerformanceMetrics' to be non-null");
            $.disableVideoRecording = Objects.requireNonNull($.disableVideoRecording, "expected parameter 'disableVideoRecording' to be non-null");
            $.iosTestLoop = Objects.requireNonNull($.iosTestLoop, "expected parameter 'iosTestLoop' to be non-null");
            $.iosTestSetup = Objects.requireNonNull($.iosTestSetup, "expected parameter 'iosTestSetup' to be non-null");
            $.iosXcTest = Objects.requireNonNull($.iosXcTest, "expected parameter 'iosXcTest' to be non-null");
            $.testSetup = Objects.requireNonNull($.testSetup, "expected parameter 'testSetup' to be non-null");
            $.testTimeout = Objects.requireNonNull($.testTimeout, "expected parameter 'testTimeout' to be non-null");
            return $;
        }
    }

}
