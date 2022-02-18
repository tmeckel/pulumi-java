// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.enums.ConsentState;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.GoogleCloudHealthcareV1beta1ConsentPolicyArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsentArgs Empty = new ConsentArgs();

    /**
     * The resource name of the Consent artifact that contains proof of the end user's consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
     * 
     */
    @InputImport(name="consentArtifact", required=true)
    private final Input<String> consentArtifact;

    public Input<String> getConsentArtifact() {
        return this.consentArtifact;
    }

    @InputImport(name="consentStoreId", required=true)
    private final Input<String> consentStoreId;

    public Input<String> getConsentStoreId() {
        return this.consentStoreId;
    }

    @InputImport(name="datasetId", required=true)
    private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * Timestamp in UTC of when this Consent is considered expired.
     * 
     */
    @InputImport(name="expireTime")
    private final @Nullable Input<String> expireTime;

    public Input<String> getExpireTime() {
        return this.expireTime == null ? Input.empty() : this.expireTime;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Optional. Represents a user's consent in terms of the resources that can be accessed and under what conditions.
     * 
     */
    @InputImport(name="policies")
    private final @Nullable Input<List<GoogleCloudHealthcareV1beta1ConsentPolicyArgs>> policies;

    public Input<List<GoogleCloudHealthcareV1beta1ConsentPolicyArgs>> getPolicies() {
        return this.policies == null ? Input.empty() : this.policies;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Indicates the current state of this Consent.
     * 
     */
    @InputImport(name="state", required=true)
    private final Input<ConsentState> state;

    public Input<ConsentState> getState() {
        return this.state;
    }

    /**
     * Input only. The time to live for this Consent from when it is created.
     * 
     */
    @InputImport(name="ttl")
    private final @Nullable Input<String> ttl;

    public Input<String> getTtl() {
        return this.ttl == null ? Input.empty() : this.ttl;
    }

    /**
     * User's UUID provided by the client.
     * 
     */
    @InputImport(name="userId", required=true)
    private final Input<String> userId;

    public Input<String> getUserId() {
        return this.userId;
    }

    public ConsentArgs(
        Input<String> consentArtifact,
        Input<String> consentStoreId,
        Input<String> datasetId,
        @Nullable Input<String> expireTime,
        @Nullable Input<String> location,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<String> name,
        @Nullable Input<List<GoogleCloudHealthcareV1beta1ConsentPolicyArgs>> policies,
        @Nullable Input<String> project,
        Input<ConsentState> state,
        @Nullable Input<String> ttl,
        Input<String> userId) {
        this.consentArtifact = Objects.requireNonNull(consentArtifact, "expected parameter 'consentArtifact' to be non-null");
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.expireTime = expireTime;
        this.location = location;
        this.metadata = metadata;
        this.name = name;
        this.policies = policies;
        this.project = project;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.ttl = ttl;
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private ConsentArgs() {
        this.consentArtifact = Input.empty();
        this.consentStoreId = Input.empty();
        this.datasetId = Input.empty();
        this.expireTime = Input.empty();
        this.location = Input.empty();
        this.metadata = Input.empty();
        this.name = Input.empty();
        this.policies = Input.empty();
        this.project = Input.empty();
        this.state = Input.empty();
        this.ttl = Input.empty();
        this.userId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> consentArtifact;
        private Input<String> consentStoreId;
        private Input<String> datasetId;
        private @Nullable Input<String> expireTime;
        private @Nullable Input<String> location;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<String> name;
        private @Nullable Input<List<GoogleCloudHealthcareV1beta1ConsentPolicyArgs>> policies;
        private @Nullable Input<String> project;
        private Input<ConsentState> state;
        private @Nullable Input<String> ttl;
        private Input<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentArtifact = defaults.consentArtifact;
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.datasetId = defaults.datasetId;
    	      this.expireTime = defaults.expireTime;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.policies = defaults.policies;
    	      this.project = defaults.project;
    	      this.state = defaults.state;
    	      this.ttl = defaults.ttl;
    	      this.userId = defaults.userId;
        }

        public Builder setConsentArtifact(Input<String> consentArtifact) {
            this.consentArtifact = Objects.requireNonNull(consentArtifact);
            return this;
        }

        public Builder setConsentArtifact(String consentArtifact) {
            this.consentArtifact = Input.of(Objects.requireNonNull(consentArtifact));
            return this;
        }

        public Builder setConsentStoreId(Input<String> consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }

        public Builder setConsentStoreId(String consentStoreId) {
            this.consentStoreId = Input.of(Objects.requireNonNull(consentStoreId));
            return this;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder setExpireTime(@Nullable Input<String> expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public Builder setExpireTime(@Nullable String expireTime) {
            this.expireTime = Input.ofNullable(expireTime);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPolicies(@Nullable Input<List<GoogleCloudHealthcareV1beta1ConsentPolicyArgs>> policies) {
            this.policies = policies;
            return this;
        }

        public Builder setPolicies(@Nullable List<GoogleCloudHealthcareV1beta1ConsentPolicyArgs> policies) {
            this.policies = Input.ofNullable(policies);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setState(Input<ConsentState> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setState(ConsentState state) {
            this.state = Input.of(Objects.requireNonNull(state));
            return this;
        }

        public Builder setTtl(@Nullable Input<String> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder setTtl(@Nullable String ttl) {
            this.ttl = Input.ofNullable(ttl);
            return this;
        }

        public Builder setUserId(Input<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Input.of(Objects.requireNonNull(userId));
            return this;
        }

        public ConsentArgs build() {
            return new ConsentArgs(consentArtifact, consentStoreId, datasetId, expireTime, location, metadata, name, policies, project, state, ttl, userId);
        }
    }
}
