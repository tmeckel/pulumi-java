// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamHttpEndpointRequestConfigurationContentEncoding;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamHttpEndpointCommonAttributeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamHttpEndpointRequestConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamHttpEndpointRequestConfigurationArgs Empty = new DeliveryStreamHttpEndpointRequestConfigurationArgs();

    @Import(name="commonAttributes")
      private final @Nullable Output<List<DeliveryStreamHttpEndpointCommonAttributeArgs>> commonAttributes;

    public Output<List<DeliveryStreamHttpEndpointCommonAttributeArgs>> getCommonAttributes() {
        return this.commonAttributes == null ? Codegen.empty() : this.commonAttributes;
    }

    @Import(name="contentEncoding")
      private final @Nullable Output<DeliveryStreamHttpEndpointRequestConfigurationContentEncoding> contentEncoding;

    public Output<DeliveryStreamHttpEndpointRequestConfigurationContentEncoding> getContentEncoding() {
        return this.contentEncoding == null ? Codegen.empty() : this.contentEncoding;
    }

    public DeliveryStreamHttpEndpointRequestConfigurationArgs(
        @Nullable Output<List<DeliveryStreamHttpEndpointCommonAttributeArgs>> commonAttributes,
        @Nullable Output<DeliveryStreamHttpEndpointRequestConfigurationContentEncoding> contentEncoding) {
        this.commonAttributes = commonAttributes;
        this.contentEncoding = contentEncoding;
    }

    private DeliveryStreamHttpEndpointRequestConfigurationArgs() {
        this.commonAttributes = Codegen.empty();
        this.contentEncoding = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamHttpEndpointRequestConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DeliveryStreamHttpEndpointCommonAttributeArgs>> commonAttributes;
        private @Nullable Output<DeliveryStreamHttpEndpointRequestConfigurationContentEncoding> contentEncoding;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamHttpEndpointRequestConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonAttributes = defaults.commonAttributes;
    	      this.contentEncoding = defaults.contentEncoding;
        }

        public Builder commonAttributes(@Nullable Output<List<DeliveryStreamHttpEndpointCommonAttributeArgs>> commonAttributes) {
            this.commonAttributes = commonAttributes;
            return this;
        }
        public Builder commonAttributes(@Nullable List<DeliveryStreamHttpEndpointCommonAttributeArgs> commonAttributes) {
            this.commonAttributes = Codegen.ofNullable(commonAttributes);
            return this;
        }
        public Builder commonAttributes(DeliveryStreamHttpEndpointCommonAttributeArgs... commonAttributes) {
            return commonAttributes(List.of(commonAttributes));
        }
        public Builder contentEncoding(@Nullable Output<DeliveryStreamHttpEndpointRequestConfigurationContentEncoding> contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }
        public Builder contentEncoding(@Nullable DeliveryStreamHttpEndpointRequestConfigurationContentEncoding contentEncoding) {
            this.contentEncoding = Codegen.ofNullable(contentEncoding);
            return this;
        }        public DeliveryStreamHttpEndpointRequestConfigurationArgs build() {
            return new DeliveryStreamHttpEndpointRequestConfigurationArgs(commonAttributes, contentEncoding);
        }
    }
}
