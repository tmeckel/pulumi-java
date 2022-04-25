// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This type describes the resource limits for a given container. It describes the most amount of resources a container is allowed to use before being restarted.
 * 
 */
public final class ResourceLimitsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceLimitsResponse Empty = new ResourceLimitsResponse();

    /**
     * CPU limits in cores. At present, only full cores are supported.
     * 
     */
    @Import(name="cpu")
    private @Nullable Double cpu;

    /**
     * @return CPU limits in cores. At present, only full cores are supported.
     * 
     */
    public Optional<Double> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * The memory limit in GB.
     * 
     */
    @Import(name="memoryInGB")
    private @Nullable Double memoryInGB;

    /**
     * @return The memory limit in GB.
     * 
     */
    public Optional<Double> memoryInGB() {
        return Optional.ofNullable(this.memoryInGB);
    }

    private ResourceLimitsResponse() {}

    private ResourceLimitsResponse(ResourceLimitsResponse $) {
        this.cpu = $.cpu;
        this.memoryInGB = $.memoryInGB;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceLimitsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceLimitsResponse $;

        public Builder() {
            $ = new ResourceLimitsResponse();
        }

        public Builder(ResourceLimitsResponse defaults) {
            $ = new ResourceLimitsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpu CPU limits in cores. At present, only full cores are supported.
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Double cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param memoryInGB The memory limit in GB.
         * 
         * @return builder
         * 
         */
        public Builder memoryInGB(@Nullable Double memoryInGB) {
            $.memoryInGB = memoryInGB;
            return this;
        }

        public ResourceLimitsResponse build() {
            return $;
        }
    }

}
