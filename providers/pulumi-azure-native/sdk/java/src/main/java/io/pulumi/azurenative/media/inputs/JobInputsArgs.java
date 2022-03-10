// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.JobInputAssetArgs;
import io.pulumi.azurenative.media.inputs.JobInputClipArgs;
import io.pulumi.azurenative.media.inputs.JobInputHttpArgs;
import io.pulumi.azurenative.media.inputs.JobInputSequenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a list of inputs to a Job.
 * 
 */
public final class JobInputsArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobInputsArgs Empty = new JobInputsArgs();

    /**
     * List of inputs to a Job.
     * 
     */
    @InputImport(name="inputs")
      private final @Nullable Input<List<Object>> inputs;

    public Input<List<Object>> getInputs() {
        return this.inputs == null ? Input.empty() : this.inputs;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobInputs'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public JobInputsArgs(
        @Nullable Input<List<Object>> inputs,
        Input<String> odataType) {
        this.inputs = inputs;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private JobInputsArgs() {
        this.inputs = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobInputsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> inputs;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(JobInputsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
    	      this.odataType = defaults.odataType;
        }

        public Builder inputs(@Nullable Input<List<Object>> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder inputs(@Nullable List<Object> inputs) {
            this.inputs = Input.ofNullable(inputs);
            return this;
        }

        public Builder odataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }
        public JobInputsArgs build() {
            return new JobInputsArgs(inputs, odataType);
        }
    }
}
