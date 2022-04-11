// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.InternetGatewayTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InternetGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final InternetGatewayArgs Empty = new InternetGatewayArgs();

    /**
     * Any tags to assign to the internet gateway.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<InternetGatewayTagArgs>> tags;

    public Output<List<InternetGatewayTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public InternetGatewayArgs(@Nullable Output<List<InternetGatewayTagArgs>> tags) {
        this.tags = tags;
    }

    private InternetGatewayArgs() {
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InternetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<InternetGatewayTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(InternetGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
        }

        public Builder tags(@Nullable Output<List<InternetGatewayTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<InternetGatewayTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(InternetGatewayTagArgs... tags) {
            return tags(List.of(tags));
        }        public InternetGatewayArgs build() {
            return new InternetGatewayArgs(tags);
        }
    }
}
