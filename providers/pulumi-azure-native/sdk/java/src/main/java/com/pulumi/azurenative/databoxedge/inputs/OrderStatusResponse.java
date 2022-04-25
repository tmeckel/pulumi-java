// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.azurenative.databoxedge.inputs.TrackingInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a single status change.
 * 
 */
public final class OrderStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final OrderStatusResponse Empty = new OrderStatusResponse();

    /**
     * Dictionary to hold generic information which is not stored
     * by the already existing properties
     * 
     */
    @Import(name="additionalOrderDetails", required=true)
    private Map<String,String> additionalOrderDetails;

    /**
     * @return Dictionary to hold generic information which is not stored
     * by the already existing properties
     * 
     */
    public Map<String,String> additionalOrderDetails() {
        return this.additionalOrderDetails;
    }

    /**
     * Comments related to this status change.
     * 
     */
    @Import(name="comments")
    private @Nullable String comments;

    /**
     * @return Comments related to this status change.
     * 
     */
    public Optional<String> comments() {
        return Optional.ofNullable(this.comments);
    }

    /**
     * Status of the order as per the allowed status types.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return Status of the order as per the allowed status types.
     * 
     */
    public String status() {
        return this.status;
    }

    /**
     * Tracking information related to the state in the ordering flow
     * 
     */
    @Import(name="trackingInformation", required=true)
    private TrackingInfoResponse trackingInformation;

    /**
     * @return Tracking information related to the state in the ordering flow
     * 
     */
    public TrackingInfoResponse trackingInformation() {
        return this.trackingInformation;
    }

    /**
     * Time of status update.
     * 
     */
    @Import(name="updateDateTime", required=true)
    private String updateDateTime;

    /**
     * @return Time of status update.
     * 
     */
    public String updateDateTime() {
        return this.updateDateTime;
    }

    private OrderStatusResponse() {}

    private OrderStatusResponse(OrderStatusResponse $) {
        this.additionalOrderDetails = $.additionalOrderDetails;
        this.comments = $.comments;
        this.status = $.status;
        this.trackingInformation = $.trackingInformation;
        this.updateDateTime = $.updateDateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrderStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrderStatusResponse $;

        public Builder() {
            $ = new OrderStatusResponse();
        }

        public Builder(OrderStatusResponse defaults) {
            $ = new OrderStatusResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalOrderDetails Dictionary to hold generic information which is not stored
         * by the already existing properties
         * 
         * @return builder
         * 
         */
        public Builder additionalOrderDetails(Map<String,String> additionalOrderDetails) {
            $.additionalOrderDetails = additionalOrderDetails;
            return this;
        }

        /**
         * @param comments Comments related to this status change.
         * 
         * @return builder
         * 
         */
        public Builder comments(@Nullable String comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param status Status of the order as per the allowed status types.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        /**
         * @param trackingInformation Tracking information related to the state in the ordering flow
         * 
         * @return builder
         * 
         */
        public Builder trackingInformation(TrackingInfoResponse trackingInformation) {
            $.trackingInformation = trackingInformation;
            return this;
        }

        /**
         * @param updateDateTime Time of status update.
         * 
         * @return builder
         * 
         */
        public Builder updateDateTime(String updateDateTime) {
            $.updateDateTime = updateDateTime;
            return this;
        }

        public OrderStatusResponse build() {
            $.additionalOrderDetails = Objects.requireNonNull($.additionalOrderDetails, "expected parameter 'additionalOrderDetails' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.trackingInformation = Objects.requireNonNull($.trackingInformation, "expected parameter 'trackingInformation' to be non-null");
            $.updateDateTime = Objects.requireNonNull($.updateDateTime, "expected parameter 'updateDateTime' to be non-null");
            return $;
        }
    }

}
