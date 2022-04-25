// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.awsnative.ec2.outputs.TransitGatewayPeeringAttachmentPeeringAttachmentStatus;
import com.pulumi.awsnative.ec2.outputs.TransitGatewayPeeringAttachmentTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTransitGatewayPeeringAttachmentResult {
    /**
     * @return The time the transit gateway peering attachment was created.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * @return The state of the transit gateway peering attachment. Note that the initiating state has been deprecated.
     * 
     */
    private final @Nullable String state;
    /**
     * @return The status of the transit gateway peering attachment.
     * 
     */
    private final @Nullable TransitGatewayPeeringAttachmentPeeringAttachmentStatus status;
    /**
     * @return The tags for the transit gateway peering attachment.
     * 
     */
    private final @Nullable List<TransitGatewayPeeringAttachmentTag> tags;
    /**
     * @return The ID of the transit gateway peering attachment.
     * 
     */
    private final @Nullable String transitGatewayAttachmentId;

    @CustomType.Constructor
    private GetTransitGatewayPeeringAttachmentResult(
        @CustomType.Parameter("creationTime") @Nullable String creationTime,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("status") @Nullable TransitGatewayPeeringAttachmentPeeringAttachmentStatus status,
        @CustomType.Parameter("tags") @Nullable List<TransitGatewayPeeringAttachmentTag> tags,
        @CustomType.Parameter("transitGatewayAttachmentId") @Nullable String transitGatewayAttachmentId) {
        this.creationTime = creationTime;
        this.state = state;
        this.status = status;
        this.tags = tags;
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * @return The time the transit gateway peering attachment was created.
     * 
     */
    public Optional<String> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * @return The state of the transit gateway peering attachment. Note that the initiating state has been deprecated.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return The status of the transit gateway peering attachment.
     * 
     */
    public Optional<TransitGatewayPeeringAttachmentPeeringAttachmentStatus> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The tags for the transit gateway peering attachment.
     * 
     */
    public List<TransitGatewayPeeringAttachmentTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The ID of the transit gateway peering attachment.
     * 
     */
    public Optional<String> transitGatewayAttachmentId() {
        return Optional.ofNullable(this.transitGatewayAttachmentId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayPeeringAttachmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable String state;
        private @Nullable TransitGatewayPeeringAttachmentPeeringAttachmentStatus status;
        private @Nullable List<TransitGatewayPeeringAttachmentTag> tags;
        private @Nullable String transitGatewayAttachmentId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayPeeringAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
        }

        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder status(@Nullable TransitGatewayPeeringAttachmentPeeringAttachmentStatus status) {
            this.status = status;
            return this;
        }
        public Builder tags(@Nullable List<TransitGatewayPeeringAttachmentTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(TransitGatewayPeeringAttachmentTag... tags) {
            return tags(List.of(tags));
        }
        public Builder transitGatewayAttachmentId(@Nullable String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }        public GetTransitGatewayPeeringAttachmentResult build() {
            return new GetTransitGatewayPeeringAttachmentResult(creationTime, state, status, tags, transitGatewayAttachmentId);
        }
    }
}
