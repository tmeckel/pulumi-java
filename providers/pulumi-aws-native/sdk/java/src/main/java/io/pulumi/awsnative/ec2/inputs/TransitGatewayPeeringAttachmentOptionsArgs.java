// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayPeeringAttachmentOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayPeeringAttachmentOptionsArgs Empty = new TransitGatewayPeeringAttachmentOptionsArgs();

    /**
     * Whether to enable dynamic routing. (enable/disable)
     * 
     */
    @Import(name="dynamicRouting")
      private final @Nullable Output<String> dynamicRouting;

    public Output<String> getDynamicRouting() {
        return this.dynamicRouting == null ? Codegen.empty() : this.dynamicRouting;
    }

    public TransitGatewayPeeringAttachmentOptionsArgs(@Nullable Output<String> dynamicRouting) {
        this.dynamicRouting = dynamicRouting;
    }

    private TransitGatewayPeeringAttachmentOptionsArgs() {
        this.dynamicRouting = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayPeeringAttachmentOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dynamicRouting;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayPeeringAttachmentOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dynamicRouting = defaults.dynamicRouting;
        }

        public Builder dynamicRouting(@Nullable Output<String> dynamicRouting) {
            this.dynamicRouting = dynamicRouting;
            return this;
        }
        public Builder dynamicRouting(@Nullable String dynamicRouting) {
            this.dynamicRouting = Codegen.ofNullable(dynamicRouting);
            return this;
        }        public TransitGatewayPeeringAttachmentOptionsArgs build() {
            return new TransitGatewayPeeringAttachmentOptionsArgs(dynamicRouting);
        }
    }
}
