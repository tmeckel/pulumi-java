// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Virtual Private Cloud (VPC) configuration for a bucket access point.
 * 
 */
public final class AccessPointVpcConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointVpcConfigurationArgs Empty = new AccessPointVpcConfigurationArgs();

    /**
     * If this field is specified, this access point will only allow connections from the specified VPC ID.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public AccessPointVpcConfigurationArgs(@Nullable Output<String> vpcId) {
        this.vpcId = vpcId;
    }

    private AccessPointVpcConfigurationArgs() {
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointVpcConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointVpcConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcId = defaults.vpcId;
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public AccessPointVpcConfigurationArgs build() {
            return new AccessPointVpcConfigurationArgs(vpcId);
        }
    }
}
