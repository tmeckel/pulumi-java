// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Label object for Deployments
 * 
 */
public final class DeploymentLabelEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentLabelEntryArgs Empty = new DeploymentLabelEntryArgs();

    /**
     * Key of the label
     * 
     */
    @InputImport(name="key")
      private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Value of the label
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public DeploymentLabelEntryArgs(
        @Nullable Input<String> key,
        @Nullable Input<String> value) {
        this.key = key;
        this.value = value;
    }

    private DeploymentLabelEntryArgs() {
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentLabelEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentLabelEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder value(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public DeploymentLabelEntryArgs build() {
            return new DeploymentLabelEntryArgs(key, value);
        }
    }
}
