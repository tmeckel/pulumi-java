// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BackendResponse {
    /**
     * @return Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see Connection balancing mode. Backends must use compatible balancing modes. For more information, see Supported balancing modes and target capacity settings and Restrictions and guidance for instance groups. Note: Currently, if you use the API to configure incompatible balancing modes, the configuration might be accepted even though it has no impact and is ignored. Specifically, Backend.maxUtilization is ignored when Backend.balancingMode is RATE. In the future, this incompatible combination will be rejected.
     * 
     */
    private final String balancingMode;
    /**
     * @return A multiplier applied to the backend&#39;s target capacity of its balancing mode. The default value is 1, which means the group serves up to 100% of its configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service.
     * 
     */
    private final Double capacityScaler;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService.
     * 
     */
    private final Boolean failover;
    /**
     * @return The fully-qualified URL of an instance group or network endpoint group (NEG) resource. To determine what types of backends a load balancer supports, see the [Backend services overview](https://cloud.google.com/load-balancing/docs/backend-service#backends). You must use the *fully-qualified* URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
     * 
     */
    private final String group;
    /**
     * @return Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
     * 
     */
    private final Integer maxConnections;
    /**
     * @return Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
     * 
     */
    private final Integer maxConnectionsPerEndpoint;
    /**
     * @return Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
     * 
     */
    private final Integer maxConnectionsPerInstance;
    /**
     * @return Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
     * 
     */
    private final Integer maxRate;
    /**
     * @return Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
     * 
     */
    private final Double maxRatePerEndpoint;
    /**
     * @return Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
     * 
     */
    private final Double maxRatePerInstance;
    /**
     * @return Optional parameter to define a target capacity for the UTILIZATIONbalancing mode. The valid range is [0.0, 1.0]. For usage guidelines, see Utilization balancing mode.
     * 
     */
    private final Double maxUtilization;

    @CustomType.Constructor
    private BackendResponse(
        @CustomType.Parameter("balancingMode") String balancingMode,
        @CustomType.Parameter("capacityScaler") Double capacityScaler,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("failover") Boolean failover,
        @CustomType.Parameter("group") String group,
        @CustomType.Parameter("maxConnections") Integer maxConnections,
        @CustomType.Parameter("maxConnectionsPerEndpoint") Integer maxConnectionsPerEndpoint,
        @CustomType.Parameter("maxConnectionsPerInstance") Integer maxConnectionsPerInstance,
        @CustomType.Parameter("maxRate") Integer maxRate,
        @CustomType.Parameter("maxRatePerEndpoint") Double maxRatePerEndpoint,
        @CustomType.Parameter("maxRatePerInstance") Double maxRatePerInstance,
        @CustomType.Parameter("maxUtilization") Double maxUtilization) {
        this.balancingMode = balancingMode;
        this.capacityScaler = capacityScaler;
        this.description = description;
        this.failover = failover;
        this.group = group;
        this.maxConnections = maxConnections;
        this.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
        this.maxConnectionsPerInstance = maxConnectionsPerInstance;
        this.maxRate = maxRate;
        this.maxRatePerEndpoint = maxRatePerEndpoint;
        this.maxRatePerInstance = maxRatePerInstance;
        this.maxUtilization = maxUtilization;
    }

    /**
     * @return Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see Connection balancing mode. Backends must use compatible balancing modes. For more information, see Supported balancing modes and target capacity settings and Restrictions and guidance for instance groups. Note: Currently, if you use the API to configure incompatible balancing modes, the configuration might be accepted even though it has no impact and is ignored. Specifically, Backend.maxUtilization is ignored when Backend.balancingMode is RATE. In the future, this incompatible combination will be rejected.
     * 
     */
    public String balancingMode() {
        return this.balancingMode;
    }
    /**
     * @return A multiplier applied to the backend&#39;s target capacity of its balancing mode. The default value is 1, which means the group serves up to 100% of its configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service.
     * 
     */
    public Double capacityScaler() {
        return this.capacityScaler;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService.
     * 
     */
    public Boolean failover() {
        return this.failover;
    }
    /**
     * @return The fully-qualified URL of an instance group or network endpoint group (NEG) resource. To determine what types of backends a load balancer supports, see the [Backend services overview](https://cloud.google.com/load-balancing/docs/backend-service#backends). You must use the *fully-qualified* URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
     * 
     */
    public String group() {
        return this.group;
    }
    /**
     * @return Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
     * 
     */
    public Integer maxConnections() {
        return this.maxConnections;
    }
    /**
     * @return Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
     * 
     */
    public Integer maxConnectionsPerEndpoint() {
        return this.maxConnectionsPerEndpoint;
    }
    /**
     * @return Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is RATE.
     * 
     */
    public Integer maxConnectionsPerInstance() {
        return this.maxConnectionsPerInstance;
    }
    /**
     * @return Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
     * 
     */
    public Integer maxRate() {
        return this.maxRate;
    }
    /**
     * @return Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
     * 
     */
    public Double maxRatePerEndpoint() {
        return this.maxRatePerEndpoint;
    }
    /**
     * @return Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend&#39;s balancingMode is CONNECTION.
     * 
     */
    public Double maxRatePerInstance() {
        return this.maxRatePerInstance;
    }
    /**
     * @return Optional parameter to define a target capacity for the UTILIZATIONbalancing mode. The valid range is [0.0, 1.0]. For usage guidelines, see Utilization balancing mode.
     * 
     */
    public Double maxUtilization() {
        return this.maxUtilization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String balancingMode;
        private Double capacityScaler;
        private String description;
        private Boolean failover;
        private String group;
        private Integer maxConnections;
        private Integer maxConnectionsPerEndpoint;
        private Integer maxConnectionsPerInstance;
        private Integer maxRate;
        private Double maxRatePerEndpoint;
        private Double maxRatePerInstance;
        private Double maxUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.balancingMode = defaults.balancingMode;
    	      this.capacityScaler = defaults.capacityScaler;
    	      this.description = defaults.description;
    	      this.failover = defaults.failover;
    	      this.group = defaults.group;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxConnectionsPerEndpoint = defaults.maxConnectionsPerEndpoint;
    	      this.maxConnectionsPerInstance = defaults.maxConnectionsPerInstance;
    	      this.maxRate = defaults.maxRate;
    	      this.maxRatePerEndpoint = defaults.maxRatePerEndpoint;
    	      this.maxRatePerInstance = defaults.maxRatePerInstance;
    	      this.maxUtilization = defaults.maxUtilization;
        }

        public Builder balancingMode(String balancingMode) {
            this.balancingMode = Objects.requireNonNull(balancingMode);
            return this;
        }
        public Builder capacityScaler(Double capacityScaler) {
            this.capacityScaler = Objects.requireNonNull(capacityScaler);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder failover(Boolean failover) {
            this.failover = Objects.requireNonNull(failover);
            return this;
        }
        public Builder group(String group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }
        public Builder maxConnectionsPerEndpoint(Integer maxConnectionsPerEndpoint) {
            this.maxConnectionsPerEndpoint = Objects.requireNonNull(maxConnectionsPerEndpoint);
            return this;
        }
        public Builder maxConnectionsPerInstance(Integer maxConnectionsPerInstance) {
            this.maxConnectionsPerInstance = Objects.requireNonNull(maxConnectionsPerInstance);
            return this;
        }
        public Builder maxRate(Integer maxRate) {
            this.maxRate = Objects.requireNonNull(maxRate);
            return this;
        }
        public Builder maxRatePerEndpoint(Double maxRatePerEndpoint) {
            this.maxRatePerEndpoint = Objects.requireNonNull(maxRatePerEndpoint);
            return this;
        }
        public Builder maxRatePerInstance(Double maxRatePerInstance) {
            this.maxRatePerInstance = Objects.requireNonNull(maxRatePerInstance);
            return this;
        }
        public Builder maxUtilization(Double maxUtilization) {
            this.maxUtilization = Objects.requireNonNull(maxUtilization);
            return this;
        }        public BackendResponse build() {
            return new BackendResponse(balancingMode, capacityScaler, description, failover, group, maxConnections, maxConnectionsPerEndpoint, maxConnectionsPerInstance, maxRate, maxRatePerEndpoint, maxRatePerInstance, maxUtilization);
        }
    }
}
