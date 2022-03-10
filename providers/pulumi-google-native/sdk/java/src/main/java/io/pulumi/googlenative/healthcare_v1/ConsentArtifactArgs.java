// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.inputs.ImageArgs;
import io.pulumi.googlenative.healthcare_v1.inputs.SignatureArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsentArtifactArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsentArtifactArgs Empty = new ConsentArtifactArgs();

    /**
     * Optional. Screenshots, PDFs, or other binary information documenting the user's consent.
     * 
     */
    @InputImport(name="consentContentScreenshots")
      private final @Nullable Input<List<ImageArgs>> consentContentScreenshots;

    public Input<List<ImageArgs>> getConsentContentScreenshots() {
        return this.consentContentScreenshots == null ? Input.empty() : this.consentContentScreenshots;
    }

    /**
     * Optional. An string indicating the version of the consent information shown to the user.
     * 
     */
    @InputImport(name="consentContentVersion")
      private final @Nullable Input<String> consentContentVersion;

    public Input<String> getConsentContentVersion() {
        return this.consentContentVersion == null ? Input.empty() : this.consentContentVersion;
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
     * Optional. A signature from a guardian.
     * 
     */
    @InputImport(name="guardianSignature")
      private final @Nullable Input<SignatureArgs> guardianSignature;

    public Input<SignatureArgs> getGuardianSignature() {
        return this.guardianSignature == null ? Input.empty() : this.guardianSignature;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
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

    /**
     * Optional. User's signature.
     * 
     */
    @InputImport(name="userSignature")
      private final @Nullable Input<SignatureArgs> userSignature;

    public Input<SignatureArgs> getUserSignature() {
        return this.userSignature == null ? Input.empty() : this.userSignature;
    }

    /**
     * Optional. A signature from a witness.
     * 
     */
    @InputImport(name="witnessSignature")
      private final @Nullable Input<SignatureArgs> witnessSignature;

    public Input<SignatureArgs> getWitnessSignature() {
        return this.witnessSignature == null ? Input.empty() : this.witnessSignature;
    }

    public ConsentArtifactArgs(
        @Nullable Input<List<ImageArgs>> consentContentScreenshots,
        @Nullable Input<String> consentContentVersion,
        Input<String> consentStoreId,
        Input<String> datasetId,
        @Nullable Input<SignatureArgs> guardianSignature,
        @Nullable Input<String> location,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<String> userId,
        @Nullable Input<SignatureArgs> userSignature,
        @Nullable Input<SignatureArgs> witnessSignature) {
        this.consentContentScreenshots = consentContentScreenshots;
        this.consentContentVersion = consentContentVersion;
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.guardianSignature = guardianSignature;
        this.location = location;
        this.metadata = metadata;
        this.name = name;
        this.project = project;
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
        this.userSignature = userSignature;
        this.witnessSignature = witnessSignature;
    }

    private ConsentArtifactArgs() {
        this.consentContentScreenshots = Input.empty();
        this.consentContentVersion = Input.empty();
        this.consentStoreId = Input.empty();
        this.datasetId = Input.empty();
        this.guardianSignature = Input.empty();
        this.location = Input.empty();
        this.metadata = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.userId = Input.empty();
        this.userSignature = Input.empty();
        this.witnessSignature = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ImageArgs>> consentContentScreenshots;
        private @Nullable Input<String> consentContentVersion;
        private Input<String> consentStoreId;
        private Input<String> datasetId;
        private @Nullable Input<SignatureArgs> guardianSignature;
        private @Nullable Input<String> location;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> userId;
        private @Nullable Input<SignatureArgs> userSignature;
        private @Nullable Input<SignatureArgs> witnessSignature;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentArtifactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentContentScreenshots = defaults.consentContentScreenshots;
    	      this.consentContentVersion = defaults.consentContentVersion;
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.datasetId = defaults.datasetId;
    	      this.guardianSignature = defaults.guardianSignature;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.userId = defaults.userId;
    	      this.userSignature = defaults.userSignature;
    	      this.witnessSignature = defaults.witnessSignature;
        }

        public Builder consentContentScreenshots(@Nullable Input<List<ImageArgs>> consentContentScreenshots) {
            this.consentContentScreenshots = consentContentScreenshots;
            return this;
        }

        public Builder consentContentScreenshots(@Nullable List<ImageArgs> consentContentScreenshots) {
            this.consentContentScreenshots = Input.ofNullable(consentContentScreenshots);
            return this;
        }

        public Builder consentContentVersion(@Nullable Input<String> consentContentVersion) {
            this.consentContentVersion = consentContentVersion;
            return this;
        }

        public Builder consentContentVersion(@Nullable String consentContentVersion) {
            this.consentContentVersion = Input.ofNullable(consentContentVersion);
            return this;
        }

        public Builder consentStoreId(Input<String> consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }

        public Builder consentStoreId(String consentStoreId) {
            this.consentStoreId = Input.of(Objects.requireNonNull(consentStoreId));
            return this;
        }

        public Builder datasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder guardianSignature(@Nullable Input<SignatureArgs> guardianSignature) {
            this.guardianSignature = guardianSignature;
            return this;
        }

        public Builder guardianSignature(@Nullable SignatureArgs guardianSignature) {
            this.guardianSignature = Input.ofNullable(guardianSignature);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder metadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder userId(Input<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Input.of(Objects.requireNonNull(userId));
            return this;
        }

        public Builder userSignature(@Nullable Input<SignatureArgs> userSignature) {
            this.userSignature = userSignature;
            return this;
        }

        public Builder userSignature(@Nullable SignatureArgs userSignature) {
            this.userSignature = Input.ofNullable(userSignature);
            return this;
        }

        public Builder witnessSignature(@Nullable Input<SignatureArgs> witnessSignature) {
            this.witnessSignature = witnessSignature;
            return this;
        }

        public Builder witnessSignature(@Nullable SignatureArgs witnessSignature) {
            this.witnessSignature = Input.ofNullable(witnessSignature);
            return this;
        }
        public ConsentArtifactArgs build() {
            return new ConsentArtifactArgs(consentContentScreenshots, consentContentVersion, consentStoreId, datasetId, guardianSignature, location, metadata, name, project, userId, userSignature, witnessSignature);
        }
    }
}
