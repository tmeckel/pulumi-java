// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.testing_v1.outputs.AppBundleResponse;
import com.pulumi.googlenative.testing_v1.outputs.FileReferenceResponse;
import com.pulumi.googlenative.testing_v1.outputs.ShardingOptionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AndroidInstrumentationTestResponse {
    /**
     * @return The APK for the application under test.
     * 
     */
    private final FileReferenceResponse appApk;
    /**
     * @return A multi-apk app bundle for the application under test.
     * 
     */
    private final AppBundleResponse appBundle;
    /**
     * @return The java package for the application under test. The default value is determined by examining the application&#39;s manifest.
     * 
     */
    private final String appPackageId;
    /**
     * @return The option of whether running each test within its own invocation of instrumentation with Android Test Orchestrator or not. ** Orchestrator is only compatible with AndroidJUnitRunner version 1.1 or higher! ** Orchestrator offers the following benefits: - No shared state - Crashes are isolated - Logs are scoped per test See for more information about Android Test Orchestrator. If not set, the test will be run without the orchestrator.
     * 
     */
    private final String orchestratorOption;
    /**
     * @return The option to run tests in multiple shards in parallel.
     * 
     */
    private final ShardingOptionResponse shardingOption;
    /**
     * @return The APK containing the test code to be executed.
     * 
     */
    private final FileReferenceResponse testApk;
    /**
     * @return The java package for the test to be executed. The default value is determined by examining the application&#39;s manifest.
     * 
     */
    private final String testPackageId;
    /**
     * @return The InstrumentationTestRunner class. The default value is determined by examining the application&#39;s manifest.
     * 
     */
    private final String testRunnerClass;
    /**
     * @return Each target must be fully qualified with the package name or class name, in one of these formats: - &#34;package package_name&#34; - &#34;class package_name.class_name&#34; - &#34;class package_name.class_name#method_name&#34; If empty, all targets in the module will be run.
     * 
     */
    private final List<String> testTargets;

    @CustomType.Constructor
    private AndroidInstrumentationTestResponse(
        @CustomType.Parameter("appApk") FileReferenceResponse appApk,
        @CustomType.Parameter("appBundle") AppBundleResponse appBundle,
        @CustomType.Parameter("appPackageId") String appPackageId,
        @CustomType.Parameter("orchestratorOption") String orchestratorOption,
        @CustomType.Parameter("shardingOption") ShardingOptionResponse shardingOption,
        @CustomType.Parameter("testApk") FileReferenceResponse testApk,
        @CustomType.Parameter("testPackageId") String testPackageId,
        @CustomType.Parameter("testRunnerClass") String testRunnerClass,
        @CustomType.Parameter("testTargets") List<String> testTargets) {
        this.appApk = appApk;
        this.appBundle = appBundle;
        this.appPackageId = appPackageId;
        this.orchestratorOption = orchestratorOption;
        this.shardingOption = shardingOption;
        this.testApk = testApk;
        this.testPackageId = testPackageId;
        this.testRunnerClass = testRunnerClass;
        this.testTargets = testTargets;
    }

    /**
     * @return The APK for the application under test.
     * 
     */
    public FileReferenceResponse appApk() {
        return this.appApk;
    }
    /**
     * @return A multi-apk app bundle for the application under test.
     * 
     */
    public AppBundleResponse appBundle() {
        return this.appBundle;
    }
    /**
     * @return The java package for the application under test. The default value is determined by examining the application&#39;s manifest.
     * 
     */
    public String appPackageId() {
        return this.appPackageId;
    }
    /**
     * @return The option of whether running each test within its own invocation of instrumentation with Android Test Orchestrator or not. ** Orchestrator is only compatible with AndroidJUnitRunner version 1.1 or higher! ** Orchestrator offers the following benefits: - No shared state - Crashes are isolated - Logs are scoped per test See for more information about Android Test Orchestrator. If not set, the test will be run without the orchestrator.
     * 
     */
    public String orchestratorOption() {
        return this.orchestratorOption;
    }
    /**
     * @return The option to run tests in multiple shards in parallel.
     * 
     */
    public ShardingOptionResponse shardingOption() {
        return this.shardingOption;
    }
    /**
     * @return The APK containing the test code to be executed.
     * 
     */
    public FileReferenceResponse testApk() {
        return this.testApk;
    }
    /**
     * @return The java package for the test to be executed. The default value is determined by examining the application&#39;s manifest.
     * 
     */
    public String testPackageId() {
        return this.testPackageId;
    }
    /**
     * @return The InstrumentationTestRunner class. The default value is determined by examining the application&#39;s manifest.
     * 
     */
    public String testRunnerClass() {
        return this.testRunnerClass;
    }
    /**
     * @return Each target must be fully qualified with the package name or class name, in one of these formats: - &#34;package package_name&#34; - &#34;class package_name.class_name&#34; - &#34;class package_name.class_name#method_name&#34; If empty, all targets in the module will be run.
     * 
     */
    public List<String> testTargets() {
        return this.testTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidInstrumentationTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileReferenceResponse appApk;
        private AppBundleResponse appBundle;
        private String appPackageId;
        private String orchestratorOption;
        private ShardingOptionResponse shardingOption;
        private FileReferenceResponse testApk;
        private String testPackageId;
        private String testRunnerClass;
        private List<String> testTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidInstrumentationTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appApk = defaults.appApk;
    	      this.appBundle = defaults.appBundle;
    	      this.appPackageId = defaults.appPackageId;
    	      this.orchestratorOption = defaults.orchestratorOption;
    	      this.shardingOption = defaults.shardingOption;
    	      this.testApk = defaults.testApk;
    	      this.testPackageId = defaults.testPackageId;
    	      this.testRunnerClass = defaults.testRunnerClass;
    	      this.testTargets = defaults.testTargets;
        }

        public Builder appApk(FileReferenceResponse appApk) {
            this.appApk = Objects.requireNonNull(appApk);
            return this;
        }
        public Builder appBundle(AppBundleResponse appBundle) {
            this.appBundle = Objects.requireNonNull(appBundle);
            return this;
        }
        public Builder appPackageId(String appPackageId) {
            this.appPackageId = Objects.requireNonNull(appPackageId);
            return this;
        }
        public Builder orchestratorOption(String orchestratorOption) {
            this.orchestratorOption = Objects.requireNonNull(orchestratorOption);
            return this;
        }
        public Builder shardingOption(ShardingOptionResponse shardingOption) {
            this.shardingOption = Objects.requireNonNull(shardingOption);
            return this;
        }
        public Builder testApk(FileReferenceResponse testApk) {
            this.testApk = Objects.requireNonNull(testApk);
            return this;
        }
        public Builder testPackageId(String testPackageId) {
            this.testPackageId = Objects.requireNonNull(testPackageId);
            return this;
        }
        public Builder testRunnerClass(String testRunnerClass) {
            this.testRunnerClass = Objects.requireNonNull(testRunnerClass);
            return this;
        }
        public Builder testTargets(List<String> testTargets) {
            this.testTargets = Objects.requireNonNull(testTargets);
            return this;
        }
        public Builder testTargets(String... testTargets) {
            return testTargets(List.of(testTargets));
        }        public AndroidInstrumentationTestResponse build() {
            return new AndroidInstrumentationTestResponse(appApk, appBundle, appPackageId, orchestratorOption, shardingOption, testApk, testPackageId, testRunnerClass, testTargets);
        }
    }
}
