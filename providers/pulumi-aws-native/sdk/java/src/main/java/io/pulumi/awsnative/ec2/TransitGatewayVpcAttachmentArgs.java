// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.OptionsPropertiesArgs;
import io.pulumi.awsnative.ec2.inputs.TransitGatewayVpcAttachmentTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayVpcAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayVpcAttachmentArgs Empty = new TransitGatewayVpcAttachmentArgs();

    @Import(name="addSubnetIds")
      private final @Nullable Output<List<String>> addSubnetIds;

    public Output<List<String>> getAddSubnetIds() {
        return this.addSubnetIds == null ? Codegen.empty() : this.addSubnetIds;
    }

    /**
     * The options for the transit gateway vpc attachment.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<OptionsPropertiesArgs> options;

    public Output<OptionsPropertiesArgs> getOptions() {
        return this.options == null ? Codegen.empty() : this.options;
    }

    @Import(name="removeSubnetIds")
      private final @Nullable Output<List<String>> removeSubnetIds;

    public Output<List<String>> getRemoveSubnetIds() {
        return this.removeSubnetIds == null ? Codegen.empty() : this.removeSubnetIds;
    }

    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Codegen.empty() : this.subnetIds;
    }

    @Import(name="tags")
      private final @Nullable Output<List<TransitGatewayVpcAttachmentTagArgs>> tags;

    public Output<List<TransitGatewayVpcAttachmentTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="transitGatewayId")
      private final @Nullable Output<String> transitGatewayId;

    public Output<String> getTransitGatewayId() {
        return this.transitGatewayId == null ? Codegen.empty() : this.transitGatewayId;
    }

    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public TransitGatewayVpcAttachmentArgs(
        @Nullable Output<List<String>> addSubnetIds,
        @Nullable Output<OptionsPropertiesArgs> options,
        @Nullable Output<List<String>> removeSubnetIds,
        @Nullable Output<List<String>> subnetIds,
        @Nullable Output<List<TransitGatewayVpcAttachmentTagArgs>> tags,
        @Nullable Output<String> transitGatewayId,
        @Nullable Output<String> vpcId) {
        this.addSubnetIds = addSubnetIds;
        this.options = options;
        this.removeSubnetIds = removeSubnetIds;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.transitGatewayId = transitGatewayId;
        this.vpcId = vpcId;
    }

    private TransitGatewayVpcAttachmentArgs() {
        this.addSubnetIds = Codegen.empty();
        this.options = Codegen.empty();
        this.removeSubnetIds = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.tags = Codegen.empty();
        this.transitGatewayId = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayVpcAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> addSubnetIds;
        private @Nullable Output<OptionsPropertiesArgs> options;
        private @Nullable Output<List<String>> removeSubnetIds;
        private @Nullable Output<List<String>> subnetIds;
        private @Nullable Output<List<TransitGatewayVpcAttachmentTagArgs>> tags;
        private @Nullable Output<String> transitGatewayId;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayVpcAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addSubnetIds = defaults.addSubnetIds;
    	      this.options = defaults.options;
    	      this.removeSubnetIds = defaults.removeSubnetIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder addSubnetIds(@Nullable Output<List<String>> addSubnetIds) {
            this.addSubnetIds = addSubnetIds;
            return this;
        }
        public Builder addSubnetIds(@Nullable List<String> addSubnetIds) {
            this.addSubnetIds = Codegen.ofNullable(addSubnetIds);
            return this;
        }
        public Builder addSubnetIds(String... addSubnetIds) {
            return addSubnetIds(List.of(addSubnetIds));
        }
        public Builder options(@Nullable Output<OptionsPropertiesArgs> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable OptionsPropertiesArgs options) {
            this.options = Codegen.ofNullable(options);
            return this;
        }
        public Builder removeSubnetIds(@Nullable Output<List<String>> removeSubnetIds) {
            this.removeSubnetIds = removeSubnetIds;
            return this;
        }
        public Builder removeSubnetIds(@Nullable List<String> removeSubnetIds) {
            this.removeSubnetIds = Codegen.ofNullable(removeSubnetIds);
            return this;
        }
        public Builder removeSubnetIds(String... removeSubnetIds) {
            return removeSubnetIds(List.of(removeSubnetIds));
        }
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Codegen.ofNullable(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Output<List<TransitGatewayVpcAttachmentTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<TransitGatewayVpcAttachmentTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(TransitGatewayVpcAttachmentTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder transitGatewayId(@Nullable Output<String> transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }
        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = Codegen.ofNullable(transitGatewayId);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public TransitGatewayVpcAttachmentArgs build() {
            return new TransitGatewayVpcAttachmentArgs(addSubnetIds, options, removeSubnetIds, subnetIds, tags, transitGatewayId, vpcId);
        }
    }
}
