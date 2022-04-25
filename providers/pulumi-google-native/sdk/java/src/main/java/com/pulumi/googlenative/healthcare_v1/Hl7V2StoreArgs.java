// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1.inputs.Hl7V2NotificationConfigArgs;
import com.pulumi.googlenative.healthcare_v1.inputs.ParserConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Hl7V2StoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final Hl7V2StoreArgs Empty = new Hl7V2StoreArgs();

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    @Import(name="hl7V2StoreId")
    private @Nullable Output<String> hl7V2StoreId;

    public Optional<Output<String>> hl7V2StoreId() {
        return Optional.ofNullable(this.hl7V2StoreId);
    }

    /**
     * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource name of the HL7v2 store, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name of the HL7v2 store, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of notification configs. Each configuration uses a filter to determine whether to publish a message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name is sent as part of the notification. Supplied by the client.
     * 
     */
    @Import(name="notificationConfigs")
    private @Nullable Output<List<Hl7V2NotificationConfigArgs>> notificationConfigs;

    /**
     * @return A list of notification configs. Each configuration uses a filter to determine whether to publish a message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name is sent as part of the notification. Supplied by the client.
     * 
     */
    public Optional<Output<List<Hl7V2NotificationConfigArgs>>> notificationConfigs() {
        return Optional.ofNullable(this.notificationConfigs);
    }

    /**
     * The configuration for the parser. It determines how the server parses the messages.
     * 
     */
    @Import(name="parserConfig")
    private @Nullable Output<ParserConfigArgs> parserConfig;

    /**
     * @return The configuration for the parser. It determines how the server parses the messages.
     * 
     */
    public Optional<Output<ParserConfigArgs>> parserConfig() {
        return Optional.ofNullable(this.parserConfig);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Determines whether to reject duplicate messages. A duplicate message is a message with the same raw bytes as a message that has already been ingested/created in this HL7v2 store. The default value is false, meaning that the store accepts the duplicate messages and it also returns the same ACK message in the IngestMessageResponse as has been returned previously. Note that only one resource is created in the store. When this field is set to true, CreateMessage/IngestMessage requests with a duplicate message will be rejected by the store, and IngestMessageErrorDetail returns a NACK message upon rejection.
     * 
     */
    @Import(name="rejectDuplicateMessage")
    private @Nullable Output<Boolean> rejectDuplicateMessage;

    /**
     * @return Determines whether to reject duplicate messages. A duplicate message is a message with the same raw bytes as a message that has already been ingested/created in this HL7v2 store. The default value is false, meaning that the store accepts the duplicate messages and it also returns the same ACK message in the IngestMessageResponse as has been returned previously. Note that only one resource is created in the store. When this field is set to true, CreateMessage/IngestMessage requests with a duplicate message will be rejected by the store, and IngestMessageErrorDetail returns a NACK message upon rejection.
     * 
     */
    public Optional<Output<Boolean>> rejectDuplicateMessage() {
        return Optional.ofNullable(this.rejectDuplicateMessage);
    }

    private Hl7V2StoreArgs() {}

    private Hl7V2StoreArgs(Hl7V2StoreArgs $) {
        this.datasetId = $.datasetId;
        this.hl7V2StoreId = $.hl7V2StoreId;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.notificationConfigs = $.notificationConfigs;
        this.parserConfig = $.parserConfig;
        this.project = $.project;
        this.rejectDuplicateMessage = $.rejectDuplicateMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Hl7V2StoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Hl7V2StoreArgs $;

        public Builder() {
            $ = new Hl7V2StoreArgs();
        }

        public Builder(Hl7V2StoreArgs defaults) {
            $ = new Hl7V2StoreArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public Builder hl7V2StoreId(@Nullable Output<String> hl7V2StoreId) {
            $.hl7V2StoreId = hl7V2StoreId;
            return this;
        }

        public Builder hl7V2StoreId(String hl7V2StoreId) {
            return hl7V2StoreId(Output.of(hl7V2StoreId));
        }

        /**
         * @param labels User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Resource name of the HL7v2 store, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of the HL7v2 store, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationConfigs A list of notification configs. Each configuration uses a filter to determine whether to publish a message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name is sent as part of the notification. Supplied by the client.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfigs(@Nullable Output<List<Hl7V2NotificationConfigArgs>> notificationConfigs) {
            $.notificationConfigs = notificationConfigs;
            return this;
        }

        /**
         * @param notificationConfigs A list of notification configs. Each configuration uses a filter to determine whether to publish a message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name is sent as part of the notification. Supplied by the client.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfigs(List<Hl7V2NotificationConfigArgs> notificationConfigs) {
            return notificationConfigs(Output.of(notificationConfigs));
        }

        /**
         * @param notificationConfigs A list of notification configs. Each configuration uses a filter to determine whether to publish a message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name is sent as part of the notification. Supplied by the client.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfigs(Hl7V2NotificationConfigArgs... notificationConfigs) {
            return notificationConfigs(List.of(notificationConfigs));
        }

        /**
         * @param parserConfig The configuration for the parser. It determines how the server parses the messages.
         * 
         * @return builder
         * 
         */
        public Builder parserConfig(@Nullable Output<ParserConfigArgs> parserConfig) {
            $.parserConfig = parserConfig;
            return this;
        }

        /**
         * @param parserConfig The configuration for the parser. It determines how the server parses the messages.
         * 
         * @return builder
         * 
         */
        public Builder parserConfig(ParserConfigArgs parserConfig) {
            return parserConfig(Output.of(parserConfig));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param rejectDuplicateMessage Determines whether to reject duplicate messages. A duplicate message is a message with the same raw bytes as a message that has already been ingested/created in this HL7v2 store. The default value is false, meaning that the store accepts the duplicate messages and it also returns the same ACK message in the IngestMessageResponse as has been returned previously. Note that only one resource is created in the store. When this field is set to true, CreateMessage/IngestMessage requests with a duplicate message will be rejected by the store, and IngestMessageErrorDetail returns a NACK message upon rejection.
         * 
         * @return builder
         * 
         */
        public Builder rejectDuplicateMessage(@Nullable Output<Boolean> rejectDuplicateMessage) {
            $.rejectDuplicateMessage = rejectDuplicateMessage;
            return this;
        }

        /**
         * @param rejectDuplicateMessage Determines whether to reject duplicate messages. A duplicate message is a message with the same raw bytes as a message that has already been ingested/created in this HL7v2 store. The default value is false, meaning that the store accepts the duplicate messages and it also returns the same ACK message in the IngestMessageResponse as has been returned previously. Note that only one resource is created in the store. When this field is set to true, CreateMessage/IngestMessage requests with a duplicate message will be rejected by the store, and IngestMessageErrorDetail returns a NACK message upon rejection.
         * 
         * @return builder
         * 
         */
        public Builder rejectDuplicateMessage(Boolean rejectDuplicateMessage) {
            return rejectDuplicateMessage(Output.of(rejectDuplicateMessage));
        }

        public Hl7V2StoreArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            return $;
        }
    }

}
