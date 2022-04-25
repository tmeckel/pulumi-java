// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceTemplateReservationAffinitySpecificReservation extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateReservationAffinitySpecificReservation Empty = new GetInstanceTemplateReservationAffinitySpecificReservation();

    /**
     * The key for the node affinity label.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return The key for the node affinity label.
     * 
     */
    public String key() {
        return this.key;
    }

    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetInstanceTemplateReservationAffinitySpecificReservation() {}

    private GetInstanceTemplateReservationAffinitySpecificReservation(GetInstanceTemplateReservationAffinitySpecificReservation $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTemplateReservationAffinitySpecificReservation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTemplateReservationAffinitySpecificReservation $;

        public Builder() {
            $ = new GetInstanceTemplateReservationAffinitySpecificReservation();
        }

        public Builder(GetInstanceTemplateReservationAffinitySpecificReservation defaults) {
            $ = new GetInstanceTemplateReservationAffinitySpecificReservation(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key for the node affinity label.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetInstanceTemplateReservationAffinitySpecificReservation build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
