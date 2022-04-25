// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.awsnative.ec2.outputs.TransitGatewayConnectTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTransitGatewayConnectResult {
    /**
     * @return The creation time.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * @return The state of the attachment.
     * 
     */
    private final @Nullable String state;
    /**
     * @return The tags for the attachment.
     * 
     */
    private final @Nullable List<TransitGatewayConnectTag> tags;
    /**
     * @return The ID of the Connect attachment.
     * 
     */
    private final @Nullable String transitGatewayAttachmentId;
    /**
     * @return The ID of the transit gateway.
     * 
     */
    private final @Nullable String transitGatewayId;

    @CustomType.Constructor
    private GetTransitGatewayConnectResult(
        @CustomType.Parameter("creationTime") @Nullable String creationTime,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("tags") @Nullable List<TransitGatewayConnectTag> tags,
        @CustomType.Parameter("transitGatewayAttachmentId") @Nullable String transitGatewayAttachmentId,
        @CustomType.Parameter("transitGatewayId") @Nullable String transitGatewayId) {
        this.creationTime = creationTime;
        this.state = state;
        this.tags = tags;
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * @return The creation time.
     * 
     */
    public Optional<String> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * @return The state of the attachment.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return The tags for the attachment.
     * 
     */
    public List<TransitGatewayConnectTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The ID of the Connect attachment.
     * 
     */
    public Optional<String> transitGatewayAttachmentId() {
        return Optional.ofNullable(this.transitGatewayAttachmentId);
    }
    /**
     * @return The ID of the transit gateway.
     * 
     */
    public Optional<String> transitGatewayId() {
        return Optional.ofNullable(this.transitGatewayId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayConnectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable String state;
        private @Nullable List<TransitGatewayConnectTag> tags;
        private @Nullable String transitGatewayAttachmentId;
        private @Nullable String transitGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayConnectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder tags(@Nullable List<TransitGatewayConnectTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(TransitGatewayConnectTag... tags) {
            return tags(List.of(tags));
        }
        public Builder transitGatewayAttachmentId(@Nullable String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }
        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }        public GetTransitGatewayConnectResult build() {
            return new GetTransitGatewayConnectResult(creationTime, state, tags, transitGatewayAttachmentId, transitGatewayId);
        }
    }
}
