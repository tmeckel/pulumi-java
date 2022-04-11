// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecLoggingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecLoggingGetArgs Empty = new VirtualGatewaySpecLoggingGetArgs();

    /**
     * The access log configuration for a virtual gateway.
     * 
     */
    @Import(name="accessLog")
      private final @Nullable Output<VirtualGatewaySpecLoggingAccessLogGetArgs> accessLog;

    public Output<VirtualGatewaySpecLoggingAccessLogGetArgs> getAccessLog() {
        return this.accessLog == null ? Codegen.empty() : this.accessLog;
    }

    public VirtualGatewaySpecLoggingGetArgs(@Nullable Output<VirtualGatewaySpecLoggingAccessLogGetArgs> accessLog) {
        this.accessLog = accessLog;
    }

    private VirtualGatewaySpecLoggingGetArgs() {
        this.accessLog = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecLoggingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualGatewaySpecLoggingAccessLogGetArgs> accessLog;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecLoggingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLog = defaults.accessLog;
        }

        public Builder accessLog(@Nullable Output<VirtualGatewaySpecLoggingAccessLogGetArgs> accessLog) {
            this.accessLog = accessLog;
            return this;
        }
        public Builder accessLog(@Nullable VirtualGatewaySpecLoggingAccessLogGetArgs accessLog) {
            this.accessLog = Codegen.ofNullable(accessLog);
            return this;
        }        public VirtualGatewaySpecLoggingGetArgs build() {
            return new VirtualGatewaySpecLoggingGetArgs(accessLog);
        }
    }
}
