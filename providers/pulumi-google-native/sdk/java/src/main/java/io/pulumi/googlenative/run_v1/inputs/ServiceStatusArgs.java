// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1.inputs.AddressableArgs;
import io.pulumi.googlenative.run_v1.inputs.GoogleCloudRunV1ConditionArgs;
import io.pulumi.googlenative.run_v1.inputs.TrafficTargetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The current state of the Service. Output only.
 * 
 */
public final class ServiceStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceStatusArgs Empty = new ServiceStatusArgs();

    /**
     * From RouteStatus. Similar to url, information on where the service is available on HTTP.
     * 
     */
    @InputImport(name="address")
    private final @Nullable Input<AddressableArgs> address;

    public Input<AddressableArgs> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    /**
     * Conditions communicates information about ongoing/complete reconciliation processes that bring the "spec" inline with the observed state of the world. Service-specific conditions include: * "ConfigurationsReady": true when the underlying Configuration is ready. * "RoutesReady": true when the underlying Route is ready. * "Ready": true when both the underlying Route and Configuration are ready.
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<GoogleCloudRunV1ConditionArgs>> conditions;

    public Input<List<GoogleCloudRunV1ConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * From ConfigurationStatus. LatestCreatedRevisionName is the last revision that was created from this Service's Configuration. It might not be ready yet, for that use LatestReadyRevisionName.
     * 
     */
    @InputImport(name="latestCreatedRevisionName")
    private final @Nullable Input<String> latestCreatedRevisionName;

    public Input<String> getLatestCreatedRevisionName() {
        return this.latestCreatedRevisionName == null ? Input.empty() : this.latestCreatedRevisionName;
    }

    /**
     * From ConfigurationStatus. LatestReadyRevisionName holds the name of the latest Revision stamped out from this Service's Configuration that has had its "Ready" condition become "True".
     * 
     */
    @InputImport(name="latestReadyRevisionName")
    private final @Nullable Input<String> latestReadyRevisionName;

    public Input<String> getLatestReadyRevisionName() {
        return this.latestReadyRevisionName == null ? Input.empty() : this.latestReadyRevisionName;
    }

    /**
     * ObservedGeneration is the 'Generation' of the Route that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition's status is True or False.
     * 
     */
    @InputImport(name="observedGeneration")
    private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    /**
     * From RouteStatus. Traffic holds the configured traffic distribution. These entries will always contain RevisionName references. When ConfigurationName appears in the spec, this will hold the LatestReadyRevisionName that we last observed.
     * 
     */
    @InputImport(name="traffic")
    private final @Nullable Input<List<TrafficTargetArgs>> traffic;

    public Input<List<TrafficTargetArgs>> getTraffic() {
        return this.traffic == null ? Input.empty() : this.traffic;
    }

    /**
     * From RouteStatus. URL holds the url that will distribute traffic over the provided traffic targets. It generally has the form https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
     * 
     */
    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public ServiceStatusArgs(
        @Nullable Input<AddressableArgs> address,
        @Nullable Input<List<GoogleCloudRunV1ConditionArgs>> conditions,
        @Nullable Input<String> latestCreatedRevisionName,
        @Nullable Input<String> latestReadyRevisionName,
        @Nullable Input<Integer> observedGeneration,
        @Nullable Input<List<TrafficTargetArgs>> traffic,
        @Nullable Input<String> url) {
        this.address = address;
        this.conditions = conditions;
        this.latestCreatedRevisionName = latestCreatedRevisionName;
        this.latestReadyRevisionName = latestReadyRevisionName;
        this.observedGeneration = observedGeneration;
        this.traffic = traffic;
        this.url = url;
    }

    private ServiceStatusArgs() {
        this.address = Input.empty();
        this.conditions = Input.empty();
        this.latestCreatedRevisionName = Input.empty();
        this.latestReadyRevisionName = Input.empty();
        this.observedGeneration = Input.empty();
        this.traffic = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AddressableArgs> address;
        private @Nullable Input<List<GoogleCloudRunV1ConditionArgs>> conditions;
        private @Nullable Input<String> latestCreatedRevisionName;
        private @Nullable Input<String> latestReadyRevisionName;
        private @Nullable Input<Integer> observedGeneration;
        private @Nullable Input<List<TrafficTargetArgs>> traffic;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.conditions = defaults.conditions;
    	      this.latestCreatedRevisionName = defaults.latestCreatedRevisionName;
    	      this.latestReadyRevisionName = defaults.latestReadyRevisionName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.traffic = defaults.traffic;
    	      this.url = defaults.url;
        }

        public Builder setAddress(@Nullable Input<AddressableArgs> address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(@Nullable AddressableArgs address) {
            this.address = Input.ofNullable(address);
            return this;
        }

        public Builder setConditions(@Nullable Input<List<GoogleCloudRunV1ConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<GoogleCloudRunV1ConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setLatestCreatedRevisionName(@Nullable Input<String> latestCreatedRevisionName) {
            this.latestCreatedRevisionName = latestCreatedRevisionName;
            return this;
        }

        public Builder setLatestCreatedRevisionName(@Nullable String latestCreatedRevisionName) {
            this.latestCreatedRevisionName = Input.ofNullable(latestCreatedRevisionName);
            return this;
        }

        public Builder setLatestReadyRevisionName(@Nullable Input<String> latestReadyRevisionName) {
            this.latestReadyRevisionName = latestReadyRevisionName;
            return this;
        }

        public Builder setLatestReadyRevisionName(@Nullable String latestReadyRevisionName) {
            this.latestReadyRevisionName = Input.ofNullable(latestReadyRevisionName);
            return this;
        }

        public Builder setObservedGeneration(@Nullable Input<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Input.ofNullable(observedGeneration);
            return this;
        }

        public Builder setTraffic(@Nullable Input<List<TrafficTargetArgs>> traffic) {
            this.traffic = traffic;
            return this;
        }

        public Builder setTraffic(@Nullable List<TrafficTargetArgs> traffic) {
            this.traffic = Input.ofNullable(traffic);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public ServiceStatusArgs build() {
            return new ServiceStatusArgs(address, conditions, latestCreatedRevisionName, latestReadyRevisionName, observedGeneration, traffic, url);
        }
    }
}
