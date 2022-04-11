// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedTransitVirtualInterfaceAcceptorState extends io.pulumi.resources.ResourceArgs {

    public static final HostedTransitVirtualInterfaceAcceptorState Empty = new HostedTransitVirtualInterfaceAcceptorState();

    /**
     * The ARN of the virtual interface.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The ID of the Direct Connect gateway to which to connect the virtual interface.
     * 
     */
    @Import(name="dxGatewayId")
      private final @Nullable Output<String> dxGatewayId;

    public Output<String> getDxGatewayId() {
        return this.dxGatewayId == null ? Codegen.empty() : this.dxGatewayId;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The ID of the Direct Connect virtual interface to accept.
     * 
     */
    @Import(name="virtualInterfaceId")
      private final @Nullable Output<String> virtualInterfaceId;

    public Output<String> getVirtualInterfaceId() {
        return this.virtualInterfaceId == null ? Codegen.empty() : this.virtualInterfaceId;
    }

    public HostedTransitVirtualInterfaceAcceptorState(
        @Nullable Output<String> arn,
        @Nullable Output<String> dxGatewayId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> virtualInterfaceId) {
        this.arn = arn;
        this.dxGatewayId = dxGatewayId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.virtualInterfaceId = virtualInterfaceId;
    }

    private HostedTransitVirtualInterfaceAcceptorState() {
        this.arn = Codegen.empty();
        this.dxGatewayId = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.virtualInterfaceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedTransitVirtualInterfaceAcceptorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> dxGatewayId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> virtualInterfaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedTransitVirtualInterfaceAcceptorState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dxGatewayId = defaults.dxGatewayId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.virtualInterfaceId = defaults.virtualInterfaceId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder dxGatewayId(@Nullable Output<String> dxGatewayId) {
            this.dxGatewayId = dxGatewayId;
            return this;
        }
        public Builder dxGatewayId(@Nullable String dxGatewayId) {
            this.dxGatewayId = Codegen.ofNullable(dxGatewayId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder virtualInterfaceId(@Nullable Output<String> virtualInterfaceId) {
            this.virtualInterfaceId = virtualInterfaceId;
            return this;
        }
        public Builder virtualInterfaceId(@Nullable String virtualInterfaceId) {
            this.virtualInterfaceId = Codegen.ofNullable(virtualInterfaceId);
            return this;
        }        public HostedTransitVirtualInterfaceAcceptorState build() {
            return new HostedTransitVirtualInterfaceAcceptorState(arn, dxGatewayId, tags, tagsAll, virtualInterfaceId);
        }
    }
}
