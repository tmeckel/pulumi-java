// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.enums.FhirStoreVersion;
import io.pulumi.googlenative.healthcare_v1.inputs.NotificationConfigArgs;
import io.pulumi.googlenative.healthcare_v1.inputs.StreamConfigArgs;
import io.pulumi.googlenative.healthcare_v1.inputs.ValidationConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreArgs Empty = new FhirStoreArgs();

    @InputImport(name="datasetId", required=true)
      private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * If true, overrides the default search behavior for this FHIR store to `handling=strict` which returns an error for unrecognized search parameters. If false, uses the FHIR specification default `handling=lenient` which ignores unrecognized search parameters. The handling can always be changed from the default on an individual API call by setting the HTTP header `Prefer: handling=strict` or `Prefer: handling=lenient`.
     * 
     */
    @InputImport(name="defaultSearchHandlingStrict")
      private final @Nullable Input<Boolean> defaultSearchHandlingStrict;

    public Input<Boolean> getDefaultSearchHandlingStrict() {
        return this.defaultSearchHandlingStrict == null ? Input.empty() : this.defaultSearchHandlingStrict;
    }

    /**
     * Immutable. Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR store creation. The default value is false, meaning that the API enforces referential integrity and fails the requests that result in inconsistent state in the FHIR store. When this field is set to true, the API skips referential integrity checks. Consequently, operations that rely on references, such as GetPatientEverything, do not return all the results if broken references exist.
     * 
     */
    @InputImport(name="disableReferentialIntegrity")
      private final @Nullable Input<Boolean> disableReferentialIntegrity;

    public Input<Boolean> getDisableReferentialIntegrity() {
        return this.disableReferentialIntegrity == null ? Input.empty() : this.disableReferentialIntegrity;
    }

    /**
     * Immutable. Whether to disable resource versioning for this FHIR store. This field can not be changed after the creation of FHIR store. If set to false, which is the default behavior, all write operations cause historical versions to be recorded automatically. The historical versions can be fetched through the history APIs, but cannot be updated. If set to true, no historical versions are kept. The server sends errors for attempts to read the historical versions.
     * 
     */
    @InputImport(name="disableResourceVersioning")
      private final @Nullable Input<Boolean> disableResourceVersioning;

    public Input<Boolean> getDisableResourceVersioning() {
        return this.disableResourceVersioning == null ? Input.empty() : this.disableResourceVersioning;
    }

    /**
     * Whether this FHIR store has the [updateCreate capability](https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.resource.updateCreate). This determines if the client can use an Update operation to create a new resource with a client-specified ID. If false, all IDs are server-assigned through the Create operation and attempts to update a non-existent resource return errors. It is strongly advised not to include or encode any sensitive data such as patient identifiers in client-specified resource IDs. Those IDs are part of the FHIR resource path recorded in Cloud audit logs and Pub/Sub notifications. Those IDs can also be contained in reference fields within other resources.
     * 
     */
    @InputImport(name="enableUpdateCreate")
      private final @Nullable Input<Boolean> enableUpdateCreate;

    public Input<Boolean> getEnableUpdateCreate() {
        return this.enableUpdateCreate == null ? Input.empty() : this.enableUpdateCreate;
    }

    @InputImport(name="fhirStoreId")
      private final @Nullable Input<String> fhirStoreId;

    public Input<String> getFhirStoreId() {
        return this.fhirStoreId == null ? Input.empty() : this.fhirStoreId;
    }

    /**
     * User-supplied key-value pairs used to organize FHIR stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * If non-empty, publish all resource modifications of this FHIR store to this destination. The Pub/Sub message attributes contain a map with a string describing the action that has triggered the notification. For example, "action":"CreateResource".
     * 
     */
    @InputImport(name="notificationConfig")
      private final @Nullable Input<NotificationConfigArgs> notificationConfig;

    public Input<NotificationConfigArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Input.empty() : this.notificationConfig;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * A list of streaming configs that configure the destinations of streaming export for every resource mutation in this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next resource mutation is streamed to the new location in addition to the existing ones. When a location is removed from the list, the server stops streaming to that location. Before adding a new config, you must add the required [`bigquery.dataEditor`](https://cloud.google.com/bigquery/docs/access-control#bigquery.dataEditor) role to your project's **Cloud Healthcare Service Agent** [service account](https://cloud.google.com/iam/docs/service-accounts). Some lag (typically on the order of dozens of seconds) is expected before the results show up in the streaming destination.
     * 
     */
    @InputImport(name="streamConfigs")
      private final @Nullable Input<List<StreamConfigArgs>> streamConfigs;

    public Input<List<StreamConfigArgs>> getStreamConfigs() {
        return this.streamConfigs == null ? Input.empty() : this.streamConfigs;
    }

    /**
     * Configuration for how to validate incoming FHIR resources against configured profiles.
     * 
     */
    @InputImport(name="validationConfig")
      private final @Nullable Input<ValidationConfigArgs> validationConfig;

    public Input<ValidationConfigArgs> getValidationConfig() {
        return this.validationConfig == null ? Input.empty() : this.validationConfig;
    }

    /**
     * Immutable. The FHIR specification version that this FHIR store supports natively. This field is immutable after store creation. Requests are rejected if they contain FHIR resources of a different version. Version is required for every FHIR store.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<FhirStoreVersion> version;

    public Input<FhirStoreVersion> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public FhirStoreArgs(
        Input<String> datasetId,
        @Nullable Input<Boolean> defaultSearchHandlingStrict,
        @Nullable Input<Boolean> disableReferentialIntegrity,
        @Nullable Input<Boolean> disableResourceVersioning,
        @Nullable Input<Boolean> enableUpdateCreate,
        @Nullable Input<String> fhirStoreId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<NotificationConfigArgs> notificationConfig,
        @Nullable Input<String> project,
        @Nullable Input<List<StreamConfigArgs>> streamConfigs,
        @Nullable Input<ValidationConfigArgs> validationConfig,
        @Nullable Input<FhirStoreVersion> version) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.defaultSearchHandlingStrict = defaultSearchHandlingStrict;
        this.disableReferentialIntegrity = disableReferentialIntegrity;
        this.disableResourceVersioning = disableResourceVersioning;
        this.enableUpdateCreate = enableUpdateCreate;
        this.fhirStoreId = fhirStoreId;
        this.labels = labels;
        this.location = location;
        this.notificationConfig = notificationConfig;
        this.project = project;
        this.streamConfigs = streamConfigs;
        this.validationConfig = validationConfig;
        this.version = version;
    }

    private FhirStoreArgs() {
        this.datasetId = Input.empty();
        this.defaultSearchHandlingStrict = Input.empty();
        this.disableReferentialIntegrity = Input.empty();
        this.disableResourceVersioning = Input.empty();
        this.enableUpdateCreate = Input.empty();
        this.fhirStoreId = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.notificationConfig = Input.empty();
        this.project = Input.empty();
        this.streamConfigs = Input.empty();
        this.validationConfig = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetId;
        private @Nullable Input<Boolean> defaultSearchHandlingStrict;
        private @Nullable Input<Boolean> disableReferentialIntegrity;
        private @Nullable Input<Boolean> disableResourceVersioning;
        private @Nullable Input<Boolean> enableUpdateCreate;
        private @Nullable Input<String> fhirStoreId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<NotificationConfigArgs> notificationConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<List<StreamConfigArgs>> streamConfigs;
        private @Nullable Input<ValidationConfigArgs> validationConfig;
        private @Nullable Input<FhirStoreVersion> version;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.defaultSearchHandlingStrict = defaults.defaultSearchHandlingStrict;
    	      this.disableReferentialIntegrity = defaults.disableReferentialIntegrity;
    	      this.disableResourceVersioning = defaults.disableResourceVersioning;
    	      this.enableUpdateCreate = defaults.enableUpdateCreate;
    	      this.fhirStoreId = defaults.fhirStoreId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.project = defaults.project;
    	      this.streamConfigs = defaults.streamConfigs;
    	      this.validationConfig = defaults.validationConfig;
    	      this.version = defaults.version;
        }

        public Builder datasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder defaultSearchHandlingStrict(@Nullable Input<Boolean> defaultSearchHandlingStrict) {
            this.defaultSearchHandlingStrict = defaultSearchHandlingStrict;
            return this;
        }

        public Builder defaultSearchHandlingStrict(@Nullable Boolean defaultSearchHandlingStrict) {
            this.defaultSearchHandlingStrict = Input.ofNullable(defaultSearchHandlingStrict);
            return this;
        }

        public Builder disableReferentialIntegrity(@Nullable Input<Boolean> disableReferentialIntegrity) {
            this.disableReferentialIntegrity = disableReferentialIntegrity;
            return this;
        }

        public Builder disableReferentialIntegrity(@Nullable Boolean disableReferentialIntegrity) {
            this.disableReferentialIntegrity = Input.ofNullable(disableReferentialIntegrity);
            return this;
        }

        public Builder disableResourceVersioning(@Nullable Input<Boolean> disableResourceVersioning) {
            this.disableResourceVersioning = disableResourceVersioning;
            return this;
        }

        public Builder disableResourceVersioning(@Nullable Boolean disableResourceVersioning) {
            this.disableResourceVersioning = Input.ofNullable(disableResourceVersioning);
            return this;
        }

        public Builder enableUpdateCreate(@Nullable Input<Boolean> enableUpdateCreate) {
            this.enableUpdateCreate = enableUpdateCreate;
            return this;
        }

        public Builder enableUpdateCreate(@Nullable Boolean enableUpdateCreate) {
            this.enableUpdateCreate = Input.ofNullable(enableUpdateCreate);
            return this;
        }

        public Builder fhirStoreId(@Nullable Input<String> fhirStoreId) {
            this.fhirStoreId = fhirStoreId;
            return this;
        }

        public Builder fhirStoreId(@Nullable String fhirStoreId) {
            this.fhirStoreId = Input.ofNullable(fhirStoreId);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder notificationConfig(@Nullable Input<NotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder notificationConfig(@Nullable NotificationConfigArgs notificationConfig) {
            this.notificationConfig = Input.ofNullable(notificationConfig);
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

        public Builder streamConfigs(@Nullable Input<List<StreamConfigArgs>> streamConfigs) {
            this.streamConfigs = streamConfigs;
            return this;
        }

        public Builder streamConfigs(@Nullable List<StreamConfigArgs> streamConfigs) {
            this.streamConfigs = Input.ofNullable(streamConfigs);
            return this;
        }

        public Builder validationConfig(@Nullable Input<ValidationConfigArgs> validationConfig) {
            this.validationConfig = validationConfig;
            return this;
        }

        public Builder validationConfig(@Nullable ValidationConfigArgs validationConfig) {
            this.validationConfig = Input.ofNullable(validationConfig);
            return this;
        }

        public Builder version(@Nullable Input<FhirStoreVersion> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable FhirStoreVersion version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public FhirStoreArgs build() {
            return new FhirStoreArgs(datasetId, defaultSearchHandlingStrict, disableReferentialIntegrity, disableResourceVersioning, enableUpdateCreate, fhirStoreId, labels, location, notificationConfig, project, streamConfigs, validationConfig, version);
        }
    }
}
