// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of Confidential Instance options.
 * 
 */
public final class ConfidentialInstanceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfidentialInstanceConfigArgs Empty = new ConfidentialInstanceConfigArgs();

    /**
     * Defines whether the instance should have confidential compute enabled.
     * 
     */
    @InputImport(name="enableConfidentialCompute")
    private final @Nullable Input<Boolean> enableConfidentialCompute;

    public Input<Boolean> getEnableConfidentialCompute() {
        return this.enableConfidentialCompute == null ? Input.empty() : this.enableConfidentialCompute;
    }

    public ConfidentialInstanceConfigArgs(@Nullable Input<Boolean> enableConfidentialCompute) {
        this.enableConfidentialCompute = enableConfidentialCompute;
    }

    private ConfidentialInstanceConfigArgs() {
        this.enableConfidentialCompute = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfidentialInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfidentialInstanceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder setEnableConfidentialCompute(@Nullable Input<Boolean> enableConfidentialCompute) {
            this.enableConfidentialCompute = enableConfidentialCompute;
            return this;
        }

        public Builder setEnableConfidentialCompute(@Nullable Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Input.ofNullable(enableConfidentialCompute);
            return this;
        }

        public ConfidentialInstanceConfigArgs build() {
            return new ConfidentialInstanceConfigArgs(enableConfidentialCompute);
        }
    }
}
