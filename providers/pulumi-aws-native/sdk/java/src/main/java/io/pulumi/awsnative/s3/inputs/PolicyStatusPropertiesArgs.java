// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * The Policy Status associated with this Multi Region Access Point
 * 
 */
public final class PolicyStatusPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyStatusPropertiesArgs Empty = new PolicyStatusPropertiesArgs();

    /**
     * Specifies whether the policy is public or not.
     * 
     */
    @Import(name="isPublic", required=true)
      private final Output<MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic> isPublic;

    public Output<MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic> getIsPublic() {
        return this.isPublic;
    }

    public PolicyStatusPropertiesArgs(Output<MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic> isPublic) {
        this.isPublic = Objects.requireNonNull(isPublic, "expected parameter 'isPublic' to be non-null");
    }

    private PolicyStatusPropertiesArgs() {
        this.isPublic = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyStatusPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic> isPublic;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyStatusPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPublic = defaults.isPublic;
        }

        public Builder isPublic(Output<MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic> isPublic) {
            this.isPublic = Objects.requireNonNull(isPublic);
            return this;
        }
        public Builder isPublic(MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic isPublic) {
            this.isPublic = Output.of(Objects.requireNonNull(isPublic));
            return this;
        }        public PolicyStatusPropertiesArgs build() {
            return new PolicyStatusPropertiesArgs(isPublic);
        }
    }
}
