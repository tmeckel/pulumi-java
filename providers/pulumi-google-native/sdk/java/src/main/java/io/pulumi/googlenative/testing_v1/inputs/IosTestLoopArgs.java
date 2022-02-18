// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.FileReferenceArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A test of an iOS application that implements one or more game loop scenarios. This test type accepts an archived application (.ipa file) and a list of integer scenarios that will be executed on the app sequentially.
 * 
 */
public final class IosTestLoopArgs extends io.pulumi.resources.ResourceArgs {

    public static final IosTestLoopArgs Empty = new IosTestLoopArgs();

    /**
     * The .ipa of the application to test.
     * 
     */
    @InputImport(name="appIpa", required=true)
    private final Input<FileReferenceArgs> appIpa;

    public Input<FileReferenceArgs> getAppIpa() {
        return this.appIpa;
    }

    /**
     * The list of scenarios that should be run during the test. Defaults to the single scenario 0 if unspecified.
     * 
     */
    @InputImport(name="scenarios")
    private final @Nullable Input<List<Integer>> scenarios;

    public Input<List<Integer>> getScenarios() {
        return this.scenarios == null ? Input.empty() : this.scenarios;
    }

    public IosTestLoopArgs(
        Input<FileReferenceArgs> appIpa,
        @Nullable Input<List<Integer>> scenarios) {
        this.appIpa = Objects.requireNonNull(appIpa, "expected parameter 'appIpa' to be non-null");
        this.scenarios = scenarios;
    }

    private IosTestLoopArgs() {
        this.appIpa = Input.empty();
        this.scenarios = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosTestLoopArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FileReferenceArgs> appIpa;
        private @Nullable Input<List<Integer>> scenarios;

        public Builder() {
    	      // Empty
        }

        public Builder(IosTestLoopArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appIpa = defaults.appIpa;
    	      this.scenarios = defaults.scenarios;
        }

        public Builder setAppIpa(Input<FileReferenceArgs> appIpa) {
            this.appIpa = Objects.requireNonNull(appIpa);
            return this;
        }

        public Builder setAppIpa(FileReferenceArgs appIpa) {
            this.appIpa = Input.of(Objects.requireNonNull(appIpa));
            return this;
        }

        public Builder setScenarios(@Nullable Input<List<Integer>> scenarios) {
            this.scenarios = scenarios;
            return this;
        }

        public Builder setScenarios(@Nullable List<Integer> scenarios) {
            this.scenarios = Input.ofNullable(scenarios);
            return this;
        }

        public IosTestLoopArgs build() {
            return new IosTestLoopArgs(appIpa, scenarios);
        }
    }
}
