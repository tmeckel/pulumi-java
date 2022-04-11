// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogDestinationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogDestinationPolicyArgs Empty = new LogDestinationPolicyArgs();

    /**
     * The policy document. This is a JSON formatted string.
     * 
     */
    @Import(name="accessPolicy", required=true)
      private final Output<String> accessPolicy;

    public Output<String> getAccessPolicy() {
        return this.accessPolicy;
    }

    /**
     * A name for the subscription filter
     * 
     */
    @Import(name="destinationName", required=true)
      private final Output<String> destinationName;

    public Output<String> getDestinationName() {
        return this.destinationName;
    }

    /**
     * Specify true if you are updating an existing destination policy to grant permission to an organization ID instead of granting permission to individual AWS accounts.
     * 
     */
    @Import(name="forceUpdate")
      private final @Nullable Output<Boolean> forceUpdate;

    public Output<Boolean> getForceUpdate() {
        return this.forceUpdate == null ? Codegen.empty() : this.forceUpdate;
    }

    public LogDestinationPolicyArgs(
        Output<String> accessPolicy,
        Output<String> destinationName,
        @Nullable Output<Boolean> forceUpdate) {
        this.accessPolicy = Objects.requireNonNull(accessPolicy, "expected parameter 'accessPolicy' to be non-null");
        this.destinationName = Objects.requireNonNull(destinationName, "expected parameter 'destinationName' to be non-null");
        this.forceUpdate = forceUpdate;
    }

    private LogDestinationPolicyArgs() {
        this.accessPolicy = Codegen.empty();
        this.destinationName = Codegen.empty();
        this.forceUpdate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogDestinationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accessPolicy;
        private Output<String> destinationName;
        private @Nullable Output<Boolean> forceUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(LogDestinationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicy = defaults.accessPolicy;
    	      this.destinationName = defaults.destinationName;
    	      this.forceUpdate = defaults.forceUpdate;
        }

        public Builder accessPolicy(Output<String> accessPolicy) {
            this.accessPolicy = Objects.requireNonNull(accessPolicy);
            return this;
        }
        public Builder accessPolicy(String accessPolicy) {
            this.accessPolicy = Output.of(Objects.requireNonNull(accessPolicy));
            return this;
        }
        public Builder destinationName(Output<String> destinationName) {
            this.destinationName = Objects.requireNonNull(destinationName);
            return this;
        }
        public Builder destinationName(String destinationName) {
            this.destinationName = Output.of(Objects.requireNonNull(destinationName));
            return this;
        }
        public Builder forceUpdate(@Nullable Output<Boolean> forceUpdate) {
            this.forceUpdate = forceUpdate;
            return this;
        }
        public Builder forceUpdate(@Nullable Boolean forceUpdate) {
            this.forceUpdate = Codegen.ofNullable(forceUpdate);
            return this;
        }        public LogDestinationPolicyArgs build() {
            return new LogDestinationPolicyArgs(accessPolicy, destinationName, forceUpdate);
        }
    }
}
