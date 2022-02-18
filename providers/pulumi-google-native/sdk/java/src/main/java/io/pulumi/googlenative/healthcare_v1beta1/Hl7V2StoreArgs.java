// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.Hl7V2NotificationConfigArgs;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.NotificationConfigArgs;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.ParserConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Hl7V2StoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final Hl7V2StoreArgs Empty = new Hl7V2StoreArgs();

    @InputImport(name="datasetId", required=true)
    private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    @InputImport(name="hl7V2StoreId")
    private final @Nullable Input<String> hl7V2StoreId;

    public Input<String> getHl7V2StoreId() {
        return this.hl7V2StoreId == null ? Input.empty() : this.hl7V2StoreId;
    }

    /**
     * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
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
     * Resource name of the HL7v2 store, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The notification destination all messages (both Ingest & Create) are published on. Only the message name is sent as part of the notification. If this is unset, no notifications are sent. Supplied by the client.
     * 
     */
    @InputImport(name="notificationConfig")
    private final @Nullable Input<NotificationConfigArgs> notificationConfig;

    public Input<NotificationConfigArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Input.empty() : this.notificationConfig;
    }

    /**
     * A list of notification configs. Each configuration uses a filter to determine whether to publish a message (both Ingest & Create) on the corresponding notification destination. Only the message name is sent as part of the notification. Supplied by the client.
     * 
     */
    @InputImport(name="notificationConfigs")
    private final @Nullable Input<List<Hl7V2NotificationConfigArgs>> notificationConfigs;

    public Input<List<Hl7V2NotificationConfigArgs>> getNotificationConfigs() {
        return this.notificationConfigs == null ? Input.empty() : this.notificationConfigs;
    }

    /**
     * The configuration for the parser. It determines how the server parses the messages.
     * 
     */
    @InputImport(name="parserConfig")
    private final @Nullable Input<ParserConfigArgs> parserConfig;

    public Input<ParserConfigArgs> getParserConfig() {
        return this.parserConfig == null ? Input.empty() : this.parserConfig;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Determines whether to reject duplicate messages. A duplicate message is a message with the same raw bytes as a message that has already been ingested/created in this HL7v2 store. The default value is false, meaning that the store accepts the duplicate messages and it also returns the same ACK message in the IngestMessageResponse as has been returned previously. Note that only one resource is created in the store. When this field is set to true, CreateMessage/IngestMessage requests with a duplicate message will be rejected by the store, and IngestMessageErrorDetail returns a NACK message upon rejection.
     * 
     */
    @InputImport(name="rejectDuplicateMessage")
    private final @Nullable Input<Boolean> rejectDuplicateMessage;

    public Input<Boolean> getRejectDuplicateMessage() {
        return this.rejectDuplicateMessage == null ? Input.empty() : this.rejectDuplicateMessage;
    }

    public Hl7V2StoreArgs(
        Input<String> datasetId,
        @Nullable Input<String> hl7V2StoreId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<NotificationConfigArgs> notificationConfig,
        @Nullable Input<List<Hl7V2NotificationConfigArgs>> notificationConfigs,
        @Nullable Input<ParserConfigArgs> parserConfig,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> rejectDuplicateMessage) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.hl7V2StoreId = hl7V2StoreId;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.notificationConfigs = notificationConfigs;
        this.parserConfig = parserConfig;
        this.project = project;
        this.rejectDuplicateMessage = rejectDuplicateMessage;
    }

    private Hl7V2StoreArgs() {
        this.datasetId = Input.empty();
        this.hl7V2StoreId = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.notificationConfig = Input.empty();
        this.notificationConfigs = Input.empty();
        this.parserConfig = Input.empty();
        this.project = Input.empty();
        this.rejectDuplicateMessage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7V2StoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetId;
        private @Nullable Input<String> hl7V2StoreId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<NotificationConfigArgs> notificationConfig;
        private @Nullable Input<List<Hl7V2NotificationConfigArgs>> notificationConfigs;
        private @Nullable Input<ParserConfigArgs> parserConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> rejectDuplicateMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7V2StoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.hl7V2StoreId = defaults.hl7V2StoreId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.notificationConfigs = defaults.notificationConfigs;
    	      this.parserConfig = defaults.parserConfig;
    	      this.project = defaults.project;
    	      this.rejectDuplicateMessage = defaults.rejectDuplicateMessage;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder setHl7V2StoreId(@Nullable Input<String> hl7V2StoreId) {
            this.hl7V2StoreId = hl7V2StoreId;
            return this;
        }

        public Builder setHl7V2StoreId(@Nullable String hl7V2StoreId) {
            this.hl7V2StoreId = Input.ofNullable(hl7V2StoreId);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNotificationConfig(@Nullable Input<NotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder setNotificationConfig(@Nullable NotificationConfigArgs notificationConfig) {
            this.notificationConfig = Input.ofNullable(notificationConfig);
            return this;
        }

        public Builder setNotificationConfigs(@Nullable Input<List<Hl7V2NotificationConfigArgs>> notificationConfigs) {
            this.notificationConfigs = notificationConfigs;
            return this;
        }

        public Builder setNotificationConfigs(@Nullable List<Hl7V2NotificationConfigArgs> notificationConfigs) {
            this.notificationConfigs = Input.ofNullable(notificationConfigs);
            return this;
        }

        public Builder setParserConfig(@Nullable Input<ParserConfigArgs> parserConfig) {
            this.parserConfig = parserConfig;
            return this;
        }

        public Builder setParserConfig(@Nullable ParserConfigArgs parserConfig) {
            this.parserConfig = Input.ofNullable(parserConfig);
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

        public Builder setRejectDuplicateMessage(@Nullable Input<Boolean> rejectDuplicateMessage) {
            this.rejectDuplicateMessage = rejectDuplicateMessage;
            return this;
        }

        public Builder setRejectDuplicateMessage(@Nullable Boolean rejectDuplicateMessage) {
            this.rejectDuplicateMessage = Input.ofNullable(rejectDuplicateMessage);
            return this;
        }

        public Hl7V2StoreArgs build() {
            return new Hl7V2StoreArgs(datasetId, hl7V2StoreId, labels, location, name, notificationConfig, notificationConfigs, parserConfig, project, rejectDuplicateMessage);
        }
    }
}
