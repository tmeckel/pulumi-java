// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ResolverQueryLogConfigAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverQueryLogConfigAssociationArgs Empty = new ResolverQueryLogConfigAssociationArgs();

    /**
     * The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
     * 
     */
    @Import(name="resolverQueryLogConfigId", required=true)
      private final Output<String> resolverQueryLogConfigId;

    public Output<String> getResolverQueryLogConfigId() {
        return this.resolverQueryLogConfigId;
    }

    /**
     * The ID of a VPC that you want this query logging configuration to log queries for.
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId;
    }

    public ResolverQueryLogConfigAssociationArgs(
        Output<String> resolverQueryLogConfigId,
        Output<String> resourceId) {
        this.resolverQueryLogConfigId = Objects.requireNonNull(resolverQueryLogConfigId, "expected parameter 'resolverQueryLogConfigId' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private ResolverQueryLogConfigAssociationArgs() {
        this.resolverQueryLogConfigId = Codegen.empty();
        this.resourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverQueryLogConfigAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> resolverQueryLogConfigId;
        private Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverQueryLogConfigAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolverQueryLogConfigId = defaults.resolverQueryLogConfigId;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder resolverQueryLogConfigId(Output<String> resolverQueryLogConfigId) {
            this.resolverQueryLogConfigId = Objects.requireNonNull(resolverQueryLogConfigId);
            return this;
        }
        public Builder resolverQueryLogConfigId(String resolverQueryLogConfigId) {
            this.resolverQueryLogConfigId = Output.of(Objects.requireNonNull(resolverQueryLogConfigId));
            return this;
        }
        public Builder resourceId(Output<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Output.of(Objects.requireNonNull(resourceId));
            return this;
        }        public ResolverQueryLogConfigAssociationArgs build() {
            return new ResolverQueryLogConfigAssociationArgs(resolverQueryLogConfigId, resourceId);
        }
    }
}
