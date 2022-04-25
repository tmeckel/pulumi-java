// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies a metric to load balance a service during runtime.
 * 
 */
public final class ServiceLoadMetricDescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceLoadMetricDescriptionResponse Empty = new ServiceLoadMetricDescriptionResponse();

    /**
     * Used only for Stateless services. The default amount of load, as a number, that this service creates for this metric.
     * 
     */
    @Import(name="defaultLoad")
    private @Nullable Integer defaultLoad;

    /**
     * @return Used only for Stateless services. The default amount of load, as a number, that this service creates for this metric.
     * 
     */
    public Optional<Integer> defaultLoad() {
        return Optional.ofNullable(this.defaultLoad);
    }

    /**
     * The name of the metric. If the service chooses to report load during runtime, the load metric name should match the name that is specified in Name exactly. Note that metric names are case sensitive.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the metric. If the service chooses to report load during runtime, the load metric name should match the name that is specified in Name exactly. Note that metric names are case sensitive.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Primary replica.
     * 
     */
    @Import(name="primaryDefaultLoad")
    private @Nullable Integer primaryDefaultLoad;

    /**
     * @return Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Primary replica.
     * 
     */
    public Optional<Integer> primaryDefaultLoad() {
        return Optional.ofNullable(this.primaryDefaultLoad);
    }

    /**
     * Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Secondary replica.
     * 
     */
    @Import(name="secondaryDefaultLoad")
    private @Nullable Integer secondaryDefaultLoad;

    /**
     * @return Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Secondary replica.
     * 
     */
    public Optional<Integer> secondaryDefaultLoad() {
        return Optional.ofNullable(this.secondaryDefaultLoad);
    }

    /**
     * The service load metric relative weight, compared to other metrics configured for this service, as a number.
     * 
     */
    @Import(name="weight")
    private @Nullable String weight;

    /**
     * @return The service load metric relative weight, compared to other metrics configured for this service, as a number.
     * 
     */
    public Optional<String> weight() {
        return Optional.ofNullable(this.weight);
    }

    private ServiceLoadMetricDescriptionResponse() {}

    private ServiceLoadMetricDescriptionResponse(ServiceLoadMetricDescriptionResponse $) {
        this.defaultLoad = $.defaultLoad;
        this.name = $.name;
        this.primaryDefaultLoad = $.primaryDefaultLoad;
        this.secondaryDefaultLoad = $.secondaryDefaultLoad;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLoadMetricDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLoadMetricDescriptionResponse $;

        public Builder() {
            $ = new ServiceLoadMetricDescriptionResponse();
        }

        public Builder(ServiceLoadMetricDescriptionResponse defaults) {
            $ = new ServiceLoadMetricDescriptionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultLoad Used only for Stateless services. The default amount of load, as a number, that this service creates for this metric.
         * 
         * @return builder
         * 
         */
        public Builder defaultLoad(@Nullable Integer defaultLoad) {
            $.defaultLoad = defaultLoad;
            return this;
        }

        /**
         * @param name The name of the metric. If the service chooses to report load during runtime, the load metric name should match the name that is specified in Name exactly. Note that metric names are case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param primaryDefaultLoad Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Primary replica.
         * 
         * @return builder
         * 
         */
        public Builder primaryDefaultLoad(@Nullable Integer primaryDefaultLoad) {
            $.primaryDefaultLoad = primaryDefaultLoad;
            return this;
        }

        /**
         * @param secondaryDefaultLoad Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Secondary replica.
         * 
         * @return builder
         * 
         */
        public Builder secondaryDefaultLoad(@Nullable Integer secondaryDefaultLoad) {
            $.secondaryDefaultLoad = secondaryDefaultLoad;
            return this;
        }

        /**
         * @param weight The service load metric relative weight, compared to other metrics configured for this service, as a number.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable String weight) {
            $.weight = weight;
            return this;
        }

        public ServiceLoadMetricDescriptionResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
