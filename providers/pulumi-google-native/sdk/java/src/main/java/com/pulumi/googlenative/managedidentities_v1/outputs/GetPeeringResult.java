// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetPeeringResult {
    /**
     * @return The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
     * 
     */
    private final String authorizedNetwork;
    /**
     * @return The time the instance was created.
     * 
     */
    private final String createTime;
    /**
     * @return Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form: `projects/{project_id}/locations/global/domains/{domain_name}`
     * 
     */
    private final String domainResource;
    /**
     * @return Optional. Resource labels to represent user-provided metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Unique name of the peering in this scope including projects and location using the form: `projects/{project_id}/locations/global/peerings/{peering_id}`.
     * 
     */
    private final String name;
    /**
     * @return The current state of this Peering.
     * 
     */
    private final String state;
    /**
     * @return Additional information about the current status of this peering, if available.
     * 
     */
    private final String statusMessage;
    /**
     * @return Last update time.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetPeeringResult(
        @CustomType.Parameter("authorizedNetwork") String authorizedNetwork,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("domainResource") String domainResource,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("statusMessage") String statusMessage,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.authorizedNetwork = authorizedNetwork;
        this.createTime = createTime;
        this.domainResource = domainResource;
        this.labels = labels;
        this.name = name;
        this.state = state;
        this.statusMessage = statusMessage;
        this.updateTime = updateTime;
    }

    /**
     * @return The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
     * 
     */
    public String authorizedNetwork() {
        return this.authorizedNetwork;
    }
    /**
     * @return The time the instance was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form: `projects/{project_id}/locations/global/domains/{domain_name}`
     * 
     */
    public String domainResource() {
        return this.domainResource;
    }
    /**
     * @return Optional. Resource labels to represent user-provided metadata.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Unique name of the peering in this scope including projects and location using the form: `projects/{project_id}/locations/global/peerings/{peering_id}`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current state of this Peering.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Additional information about the current status of this peering, if available.
     * 
     */
    public String statusMessage() {
        return this.statusMessage;
    }
    /**
     * @return Last update time.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizedNetwork;
        private String createTime;
        private String domainResource;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String statusMessage;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPeeringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.createTime = defaults.createTime;
    	      this.domainResource = defaults.domainResource;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder authorizedNetwork(String authorizedNetwork) {
            this.authorizedNetwork = Objects.requireNonNull(authorizedNetwork);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder domainResource(String domainResource) {
            this.domainResource = Objects.requireNonNull(domainResource);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetPeeringResult build() {
            return new GetPeeringResult(authorizedNetwork, createTime, domainResource, labels, name, state, statusMessage, updateTime);
        }
    }
}
