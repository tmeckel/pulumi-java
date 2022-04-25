// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.enums.ReservationAffinityConsumeReservationType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * [ReservationAffinity](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) is the configuration of desired reservation which instances could take capacity from.
 * 
 */
public final class ReservationAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationAffinityArgs Empty = new ReservationAffinityArgs();

    /**
     * Corresponds to the type of reservation consumption.
     * 
     */
    @Import(name="consumeReservationType")
    private @Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType;

    /**
     * @return Corresponds to the type of reservation consumption.
     * 
     */
    public Optional<Output<ReservationAffinityConsumeReservationType>> consumeReservationType() {
        return Optional.ofNullable(this.consumeReservationType);
    }

    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify &#34;googleapis.com/reservation-name&#34; as the key and specify the name of your reservation as its value.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify &#34;googleapis.com/reservation-name&#34; as the key and specify the name of your reservation as its value.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Corresponds to the label value(s) of reservation resource(s).
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return Corresponds to the label value(s) of reservation resource(s).
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ReservationAffinityArgs() {}

    private ReservationAffinityArgs(ReservationAffinityArgs $) {
        this.consumeReservationType = $.consumeReservationType;
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationAffinityArgs $;

        public Builder() {
            $ = new ReservationAffinityArgs();
        }

        public Builder(ReservationAffinityArgs defaults) {
            $ = new ReservationAffinityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumeReservationType Corresponds to the type of reservation consumption.
         * 
         * @return builder
         * 
         */
        public Builder consumeReservationType(@Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType) {
            $.consumeReservationType = consumeReservationType;
            return this;
        }

        /**
         * @param consumeReservationType Corresponds to the type of reservation consumption.
         * 
         * @return builder
         * 
         */
        public Builder consumeReservationType(ReservationAffinityConsumeReservationType consumeReservationType) {
            return consumeReservationType(Output.of(consumeReservationType));
        }

        /**
         * @param key Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify &#34;googleapis.com/reservation-name&#34; as the key and specify the name of your reservation as its value.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify &#34;googleapis.com/reservation-name&#34; as the key and specify the name of your reservation as its value.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param values Corresponds to the label value(s) of reservation resource(s).
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Corresponds to the label value(s) of reservation resource(s).
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Corresponds to the label value(s) of reservation resource(s).
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ReservationAffinityArgs build() {
            return $;
        }
    }

}
