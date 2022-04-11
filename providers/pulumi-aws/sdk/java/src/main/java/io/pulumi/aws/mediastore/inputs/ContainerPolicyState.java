// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mediastore.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ContainerPolicyState Empty = new ContainerPolicyState();

    /**
     * The name of the container.
     * 
     */
    @Import(name="containerName")
      private final @Nullable Output<String> containerName;

    public Output<String> getContainerName() {
        return this.containerName == null ? Codegen.empty() : this.containerName;
    }

    /**
     * The contents of the policy.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    public ContainerPolicyState(
        @Nullable Output<String> containerName,
        @Nullable Output<String> policy) {
        this.containerName = containerName;
        this.policy = policy;
    }

    private ContainerPolicyState() {
        this.containerName = Codegen.empty();
        this.policy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerName;
        private @Nullable Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.policy = defaults.policy;
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = Codegen.ofNullable(containerName);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }        public ContainerPolicyState build() {
            return new ContainerPolicyState(containerName, policy);
        }
    }
}
