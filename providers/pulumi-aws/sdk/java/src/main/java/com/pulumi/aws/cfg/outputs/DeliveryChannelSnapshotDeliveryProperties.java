// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryChannelSnapshotDeliveryProperties {
    /**
     * @return - The frequency with which AWS Config recurringly delivers configuration snapshotsE.g., `One_Hour` or `Three_Hours`. Valid values are listed [here](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html#API_ConfigSnapshotDeliveryProperties_Contents).
     * 
     */
    private final @Nullable String deliveryFrequency;

    @CustomType.Constructor
    private DeliveryChannelSnapshotDeliveryProperties(@CustomType.Parameter("deliveryFrequency") @Nullable String deliveryFrequency) {
        this.deliveryFrequency = deliveryFrequency;
    }

    /**
     * @return - The frequency with which AWS Config recurringly delivers configuration snapshotsE.g., `One_Hour` or `Three_Hours`. Valid values are listed [here](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html#API_ConfigSnapshotDeliveryProperties_Contents).
     * 
     */
    public Optional<String> deliveryFrequency() {
        return Optional.ofNullable(this.deliveryFrequency);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryChannelSnapshotDeliveryProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deliveryFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryChannelSnapshotDeliveryProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryFrequency = defaults.deliveryFrequency;
        }

        public Builder deliveryFrequency(@Nullable String deliveryFrequency) {
            this.deliveryFrequency = deliveryFrequency;
            return this;
        }        public DeliveryChannelSnapshotDeliveryProperties build() {
            return new DeliveryChannelSnapshotDeliveryProperties(deliveryFrequency);
        }
    }
}
