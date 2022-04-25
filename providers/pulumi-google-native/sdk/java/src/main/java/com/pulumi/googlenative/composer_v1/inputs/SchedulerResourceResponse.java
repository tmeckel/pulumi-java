// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configuration for resources used by Airflow schedulers.
 * 
 */
public final class SchedulerResourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SchedulerResourceResponse Empty = new SchedulerResourceResponse();

    /**
     * Optional. The number of schedulers.
     * 
     */
    @Import(name="count", required=true)
    private Integer count;

    /**
     * @return Optional. The number of schedulers.
     * 
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Optional. CPU request and limit for a single Airflow scheduler replica.
     * 
     */
    @Import(name="cpu", required=true)
    private Double cpu;

    /**
     * @return Optional. CPU request and limit for a single Airflow scheduler replica.
     * 
     */
    public Double cpu() {
        return this.cpu;
    }

    /**
     * Optional. Memory (GB) request and limit for a single Airflow scheduler replica.
     * 
     */
    @Import(name="memoryGb", required=true)
    private Double memoryGb;

    /**
     * @return Optional. Memory (GB) request and limit for a single Airflow scheduler replica.
     * 
     */
    public Double memoryGb() {
        return this.memoryGb;
    }

    /**
     * Optional. Storage (GB) request and limit for a single Airflow scheduler replica.
     * 
     */
    @Import(name="storageGb", required=true)
    private Double storageGb;

    /**
     * @return Optional. Storage (GB) request and limit for a single Airflow scheduler replica.
     * 
     */
    public Double storageGb() {
        return this.storageGb;
    }

    private SchedulerResourceResponse() {}

    private SchedulerResourceResponse(SchedulerResourceResponse $) {
        this.count = $.count;
        this.cpu = $.cpu;
        this.memoryGb = $.memoryGb;
        this.storageGb = $.storageGb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulerResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulerResourceResponse $;

        public Builder() {
            $ = new SchedulerResourceResponse();
        }

        public Builder(SchedulerResourceResponse defaults) {
            $ = new SchedulerResourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Optional. The number of schedulers.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            $.count = count;
            return this;
        }

        /**
         * @param cpu Optional. CPU request and limit for a single Airflow scheduler replica.
         * 
         * @return builder
         * 
         */
        public Builder cpu(Double cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param memoryGb Optional. Memory (GB) request and limit for a single Airflow scheduler replica.
         * 
         * @return builder
         * 
         */
        public Builder memoryGb(Double memoryGb) {
            $.memoryGb = memoryGb;
            return this;
        }

        /**
         * @param storageGb Optional. Storage (GB) request and limit for a single Airflow scheduler replica.
         * 
         * @return builder
         * 
         */
        public Builder storageGb(Double storageGb) {
            $.storageGb = storageGb;
            return this;
        }

        public SchedulerResourceResponse build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.cpu = Objects.requireNonNull($.cpu, "expected parameter 'cpu' to be non-null");
            $.memoryGb = Objects.requireNonNull($.memoryGb, "expected parameter 'memoryGb' to be non-null");
            $.storageGb = Objects.requireNonNull($.storageGb, "expected parameter 'storageGb' to be non-null");
            return $;
        }
    }

}
