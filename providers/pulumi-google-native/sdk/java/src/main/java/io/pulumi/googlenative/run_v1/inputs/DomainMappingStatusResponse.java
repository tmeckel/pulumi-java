// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1.inputs.GoogleCloudRunV1ConditionResponse;
import io.pulumi.googlenative.run_v1.inputs.ResourceRecordResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The current state of the Domain Mapping.
 * 
 */
public final class DomainMappingStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final DomainMappingStatusResponse Empty = new DomainMappingStatusResponse();

    /**
     * Array of observed DomainMappingConditions, indicating the current state of the DomainMapping.
     * 
     */
    @InputImport(name="conditions", required=true)
    private final List<GoogleCloudRunV1ConditionResponse> conditions;

    public List<GoogleCloudRunV1ConditionResponse> getConditions() {
        return this.conditions;
    }

    /**
     * The name of the route that the mapping currently points to.
     * 
     */
    @InputImport(name="mappedRouteName", required=true)
    private final String mappedRouteName;

    public String getMappedRouteName() {
        return this.mappedRouteName;
    }

    /**
     * ObservedGeneration is the 'Generation' of the DomainMapping that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition's status is True or False.
     * 
     */
    @InputImport(name="observedGeneration", required=true)
    private final Integer observedGeneration;

    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }

    /**
     * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain mapping.
     * 
     */
    @InputImport(name="resourceRecords", required=true)
    private final List<ResourceRecordResponse> resourceRecords;

    public List<ResourceRecordResponse> getResourceRecords() {
        return this.resourceRecords;
    }

    /**
     * Optional. Cloud Run fully managed: not supported Cloud Run on GKE: supported Holds the URL that will serve the traffic of the DomainMapping.
     * 
     */
    @InputImport(name="url", required=true)
    private final String url;

    public String getUrl() {
        return this.url;
    }

    public DomainMappingStatusResponse(
        List<GoogleCloudRunV1ConditionResponse> conditions,
        String mappedRouteName,
        Integer observedGeneration,
        List<ResourceRecordResponse> resourceRecords,
        String url) {
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
        this.mappedRouteName = Objects.requireNonNull(mappedRouteName, "expected parameter 'mappedRouteName' to be non-null");
        this.observedGeneration = Objects.requireNonNull(observedGeneration, "expected parameter 'observedGeneration' to be non-null");
        this.resourceRecords = Objects.requireNonNull(resourceRecords, "expected parameter 'resourceRecords' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private DomainMappingStatusResponse() {
        this.conditions = List.of();
        this.mappedRouteName = null;
        this.observedGeneration = null;
        this.resourceRecords = List.of();
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudRunV1ConditionResponse> conditions;
        private String mappedRouteName;
        private Integer observedGeneration;
        private List<ResourceRecordResponse> resourceRecords;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.mappedRouteName = defaults.mappedRouteName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.resourceRecords = defaults.resourceRecords;
    	      this.url = defaults.url;
        }

        public Builder setConditions(List<GoogleCloudRunV1ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setMappedRouteName(String mappedRouteName) {
            this.mappedRouteName = Objects.requireNonNull(mappedRouteName);
            return this;
        }

        public Builder setObservedGeneration(Integer observedGeneration) {
            this.observedGeneration = Objects.requireNonNull(observedGeneration);
            return this;
        }

        public Builder setResourceRecords(List<ResourceRecordResponse> resourceRecords) {
            this.resourceRecords = Objects.requireNonNull(resourceRecords);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public DomainMappingStatusResponse build() {
            return new DomainMappingStatusResponse(conditions, mappedRouteName, observedGeneration, resourceRecords, url);
        }
    }
}
