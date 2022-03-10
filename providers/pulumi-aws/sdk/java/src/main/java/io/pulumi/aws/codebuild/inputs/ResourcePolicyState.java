// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyState Empty = new ResourcePolicyState();

    /**
     * A JSON-formatted resource policy. For more information, see [Sharing a Projec](https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share) and [Sharing a Report Group](https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share).
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * The ARN of the Project or ReportGroup resource you want to associate with a resource policy.
     * 
     */
    @InputImport(name="resourceArn")
      private final @Nullable Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn == null ? Input.empty() : this.resourceArn;
    }

    public ResourcePolicyState(
        @Nullable Input<String> policy,
        @Nullable Input<String> resourceArn) {
        this.policy = policy;
        this.resourceArn = resourceArn;
    }

    private ResourcePolicyState() {
        this.policy = Input.empty();
        this.resourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> policy;
        private @Nullable Input<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder policy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable String policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder resourceArn(@Nullable Input<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        public Builder resourceArn(@Nullable String resourceArn) {
            this.resourceArn = Input.ofNullable(resourceArn);
            return this;
        }
        public ResourcePolicyState build() {
            return new ResourcePolicyState(policy, resourceArn);
        }
    }
}
