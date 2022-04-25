// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.gkehub_v1alpha2.outputs.AuthorityResponse;
import com.pulumi.googlenative.gkehub_v1alpha2.outputs.MembershipEndpointResponse;
import com.pulumi.googlenative.gkehub_v1alpha2.outputs.MembershipStateResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMembershipResult {
    /**
     * @return Optional. How to identify workloads from this Membership. See the documentation on Workload Identity for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * 
     */
    private final AuthorityResponse authority;
    /**
     * @return When the Membership was created.
     * 
     */
    private final String createTime;
    /**
     * @return When the Membership was deleted.
     * 
     */
    private final String deleteTime;
    /**
     * @return Description of this membership, limited to 63 characters. Must match the regex: `a-zA-Z0-9*` This field is present for legacy purposes.
     * 
     */
    private final String description;
    /**
     * @return Optional. Endpoint information to reach this member.
     * 
     */
    private final MembershipEndpointResponse endpoint;
    /**
     * @return Optional. An externally-generated and managed ID for this Membership. This ID may be modified after creation, but this is not recommended. For GKE clusters, external_id is managed by the Hub API and updates will be ignored. The ID must match the regex: `a-zA-Z0-9*` If this Membership represents a Kubernetes cluster, this value should be set to the UID of the `kube-system` namespace object.
     * 
     */
    private final String externalId;
    /**
     * @return Optional. The infrastructure type this Membership is running on.
     * 
     */
    private final String infrastructureType;
    /**
     * @return Optional. GCP labels for this membership.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return For clusters using Connect, the timestamp of the most recent connection established with Google Cloud. This time is updated every several minutes, not continuously. For clusters that do not use GKE Connect, or that have never connected successfully, this field will be unset.
     * 
     */
    private final String lastConnectionTime;
    /**
     * @return The full, unique name of this Membership resource in the format `projects/*{@literal /}locations/*{@literal /}memberships/{membership_id}`, set during creation. `membership_id` must be a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum length of 63 characters.
     * 
     */
    private final String name;
    /**
     * @return State of the Membership resource.
     * 
     */
    private final MembershipStateResponse state;
    /**
     * @return Google-generated UUID for this resource. This is unique across all Membership resources. If a Membership resource is deleted and another resource with the same name is created, it gets a different unique_id.
     * 
     */
    private final String uniqueId;
    /**
     * @return When the Membership was last updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetMembershipResult(
        @CustomType.Parameter("authority") AuthorityResponse authority,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deleteTime") String deleteTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("endpoint") MembershipEndpointResponse endpoint,
        @CustomType.Parameter("externalId") String externalId,
        @CustomType.Parameter("infrastructureType") String infrastructureType,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("lastConnectionTime") String lastConnectionTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") MembershipStateResponse state,
        @CustomType.Parameter("uniqueId") String uniqueId,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.authority = authority;
        this.createTime = createTime;
        this.deleteTime = deleteTime;
        this.description = description;
        this.endpoint = endpoint;
        this.externalId = externalId;
        this.infrastructureType = infrastructureType;
        this.labels = labels;
        this.lastConnectionTime = lastConnectionTime;
        this.name = name;
        this.state = state;
        this.uniqueId = uniqueId;
        this.updateTime = updateTime;
    }

    /**
     * @return Optional. How to identify workloads from this Membership. See the documentation on Workload Identity for more details: https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * 
     */
    public AuthorityResponse authority() {
        return this.authority;
    }
    /**
     * @return When the Membership was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return When the Membership was deleted.
     * 
     */
    public String deleteTime() {
        return this.deleteTime;
    }
    /**
     * @return Description of this membership, limited to 63 characters. Must match the regex: `a-zA-Z0-9*` This field is present for legacy purposes.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. Endpoint information to reach this member.
     * 
     */
    public MembershipEndpointResponse endpoint() {
        return this.endpoint;
    }
    /**
     * @return Optional. An externally-generated and managed ID for this Membership. This ID may be modified after creation, but this is not recommended. For GKE clusters, external_id is managed by the Hub API and updates will be ignored. The ID must match the regex: `a-zA-Z0-9*` If this Membership represents a Kubernetes cluster, this value should be set to the UID of the `kube-system` namespace object.
     * 
     */
    public String externalId() {
        return this.externalId;
    }
    /**
     * @return Optional. The infrastructure type this Membership is running on.
     * 
     */
    public String infrastructureType() {
        return this.infrastructureType;
    }
    /**
     * @return Optional. GCP labels for this membership.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return For clusters using Connect, the timestamp of the most recent connection established with Google Cloud. This time is updated every several minutes, not continuously. For clusters that do not use GKE Connect, or that have never connected successfully, this field will be unset.
     * 
     */
    public String lastConnectionTime() {
        return this.lastConnectionTime;
    }
    /**
     * @return The full, unique name of this Membership resource in the format `projects/*{@literal /}locations/*{@literal /}memberships/{membership_id}`, set during creation. `membership_id` must be a valid RFC 1123 compliant DNS label: 1. At most 63 characters in length 2. It must consist of lower case alphanumeric characters or `-` 3. It must start and end with an alphanumeric character Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`, with a maximum length of 63 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return State of the Membership resource.
     * 
     */
    public MembershipStateResponse state() {
        return this.state;
    }
    /**
     * @return Google-generated UUID for this resource. This is unique across all Membership resources. If a Membership resource is deleted and another resource with the same name is created, it gets a different unique_id.
     * 
     */
    public String uniqueId() {
        return this.uniqueId;
    }
    /**
     * @return When the Membership was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMembershipResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityResponse authority;
        private String createTime;
        private String deleteTime;
        private String description;
        private MembershipEndpointResponse endpoint;
        private String externalId;
        private String infrastructureType;
        private Map<String,String> labels;
        private String lastConnectionTime;
        private String name;
        private MembershipStateResponse state;
        private String uniqueId;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMembershipResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.externalId = defaults.externalId;
    	      this.infrastructureType = defaults.infrastructureType;
    	      this.labels = defaults.labels;
    	      this.lastConnectionTime = defaults.lastConnectionTime;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.uniqueId = defaults.uniqueId;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder authority(AuthorityResponse authority) {
            this.authority = Objects.requireNonNull(authority);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder deleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder endpoint(MembershipEndpointResponse endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder externalId(String externalId) {
            this.externalId = Objects.requireNonNull(externalId);
            return this;
        }
        public Builder infrastructureType(String infrastructureType) {
            this.infrastructureType = Objects.requireNonNull(infrastructureType);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder lastConnectionTime(String lastConnectionTime) {
            this.lastConnectionTime = Objects.requireNonNull(lastConnectionTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(MembershipStateResponse state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder uniqueId(String uniqueId) {
            this.uniqueId = Objects.requireNonNull(uniqueId);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetMembershipResult build() {
            return new GetMembershipResult(authority, createTime, deleteTime, description, endpoint, externalId, infrastructureType, labels, lastConnectionTime, name, state, uniqueId, updateTime);
        }
    }
}
