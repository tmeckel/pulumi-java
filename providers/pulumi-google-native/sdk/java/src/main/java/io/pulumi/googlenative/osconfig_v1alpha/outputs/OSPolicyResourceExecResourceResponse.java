// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyResourceExecResourceExecResponse;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyResourceExecResourceResponse {
    /**
     * What to run to bring this resource into the desired state. An exit code of 100 indicates "success", any other exit code indicates a failure running enforce.
     * 
     */
    private final OSPolicyResourceExecResourceExecResponse enforce;
    /**
     * What to run to validate this resource is in the desired state. An exit code of 100 indicates "in desired state", and exit code of 101 indicates "not in desired state". Any other exit code indicates a failure running validate.
     * 
     */
    private final OSPolicyResourceExecResourceExecResponse validate;

    @OutputCustomType.Constructor
    private OSPolicyResourceExecResourceResponse(
        @OutputCustomType.Parameter("enforce") OSPolicyResourceExecResourceExecResponse enforce,
        @OutputCustomType.Parameter("validate") OSPolicyResourceExecResourceExecResponse validate) {
        this.enforce = enforce;
        this.validate = validate;
    }

    /**
     * What to run to bring this resource into the desired state. An exit code of 100 indicates "success", any other exit code indicates a failure running enforce.
     * 
    */
    public OSPolicyResourceExecResourceExecResponse getEnforce() {
        return this.enforce;
    }
    /**
     * What to run to validate this resource is in the desired state. An exit code of 100 indicates "in desired state", and exit code of 101 indicates "not in desired state". Any other exit code indicates a failure running validate.
     * 
    */
    public OSPolicyResourceExecResourceExecResponse getValidate() {
        return this.validate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceExecResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceExecResourceExecResponse enforce;
        private OSPolicyResourceExecResourceExecResponse validate;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceExecResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforce = defaults.enforce;
    	      this.validate = defaults.validate;
        }

        public Builder enforce(OSPolicyResourceExecResourceExecResponse enforce) {
            this.enforce = Objects.requireNonNull(enforce);
            return this;
        }

        public Builder validate(OSPolicyResourceExecResourceExecResponse validate) {
            this.validate = Objects.requireNonNull(validate);
            return this;
        }
        public OSPolicyResourceExecResourceResponse build() {
            return new OSPolicyResourceExecResourceResponse(enforce, validate);
        }
    }
}
