// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU parameters particular to a cluster instance.
 * 
 */
public final class ClusterSkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClusterSkuResponse Empty = new ClusterSkuResponse();

    /**
     * The quantity of Event Hubs Cluster Capacity Units contained in this cluster.
     * 
     */
    @Import(name="capacity")
    private @Nullable Integer capacity;

    /**
     * @return The quantity of Event Hubs Cluster Capacity Units contained in this cluster.
     * 
     */
    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * Name of this SKU.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of this SKU.
     * 
     */
    public String name() {
        return this.name;
    }

    private ClusterSkuResponse() {}

    private ClusterSkuResponse(ClusterSkuResponse $) {
        this.capacity = $.capacity;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterSkuResponse $;

        public Builder() {
            $ = new ClusterSkuResponse();
        }

        public Builder(ClusterSkuResponse defaults) {
            $ = new ClusterSkuResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity The quantity of Event Hubs Cluster Capacity Units contained in this cluster.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Integer capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param name Name of this SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public ClusterSkuResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
