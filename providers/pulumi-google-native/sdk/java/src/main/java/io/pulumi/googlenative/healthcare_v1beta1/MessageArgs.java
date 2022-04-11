// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.PatientIdArgs;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.SchematizedDataArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final MessageArgs Empty = new MessageArgs();

    /**
     * Raw message bytes.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<String> data;

    public Output<String> getData() {
        return this.data == null ? Codegen.empty() : this.data;
    }

    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    @Import(name="hl7V2StoreId", required=true)
      private final Output<String> hl7V2StoreId;

    public Output<String> getHl7V2StoreId() {
        return this.hl7V2StoreId;
    }

    /**
     * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The message type for this message. MSH-9.1.
     * 
     */
    @Import(name="messageType")
      private final @Nullable Output<String> messageType;

    public Output<String> getMessageType() {
        return this.messageType == null ? Codegen.empty() : this.messageType;
    }

    /**
     * Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
     * 
     */
    @Import(name="patientIds")
      private final @Nullable Output<List<PatientIdArgs>> patientIds;

    public Output<List<PatientIdArgs>> getPatientIds() {
        return this.patientIds == null ? Codegen.empty() : this.patientIds;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The parsed version of the raw message data schematized according to this store's schemas and type definitions.
     * 
     */
    @Import(name="schematizedData")
      private final @Nullable Output<SchematizedDataArgs> schematizedData;

    public Output<SchematizedDataArgs> getSchematizedData() {
        return this.schematizedData == null ? Codegen.empty() : this.schematizedData;
    }

    /**
     * The hospital that this message came from. MSH-4.
     * 
     */
    @Import(name="sendFacility")
      private final @Nullable Output<String> sendFacility;

    public Output<String> getSendFacility() {
        return this.sendFacility == null ? Codegen.empty() : this.sendFacility;
    }

    /**
     * The datetime the sending application sent this message. MSH-7.
     * 
     */
    @Import(name="sendTime")
      private final @Nullable Output<String> sendTime;

    public Output<String> getSendTime() {
        return this.sendTime == null ? Codegen.empty() : this.sendTime;
    }

    public MessageArgs(
        @Nullable Output<String> data,
        Output<String> datasetId,
        Output<String> hl7V2StoreId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> messageType,
        @Nullable Output<String> name,
        @Nullable Output<List<PatientIdArgs>> patientIds,
        @Nullable Output<String> project,
        @Nullable Output<SchematizedDataArgs> schematizedData,
        @Nullable Output<String> sendFacility,
        @Nullable Output<String> sendTime) {
        this.data = data;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.hl7V2StoreId = Objects.requireNonNull(hl7V2StoreId, "expected parameter 'hl7V2StoreId' to be non-null");
        this.labels = labels;
        this.location = location;
        this.messageType = messageType;
        this.name = name;
        this.patientIds = patientIds;
        this.project = project;
        this.schematizedData = schematizedData;
        this.sendFacility = sendFacility;
        this.sendTime = sendTime;
    }

    private MessageArgs() {
        this.data = Codegen.empty();
        this.datasetId = Codegen.empty();
        this.hl7V2StoreId = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.messageType = Codegen.empty();
        this.name = Codegen.empty();
        this.patientIds = Codegen.empty();
        this.project = Codegen.empty();
        this.schematizedData = Codegen.empty();
        this.sendFacility = Codegen.empty();
        this.sendTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> data;
        private Output<String> datasetId;
        private Output<String> hl7V2StoreId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> messageType;
        private @Nullable Output<String> name;
        private @Nullable Output<List<PatientIdArgs>> patientIds;
        private @Nullable Output<String> project;
        private @Nullable Output<SchematizedDataArgs> schematizedData;
        private @Nullable Output<String> sendFacility;
        private @Nullable Output<String> sendTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.datasetId = defaults.datasetId;
    	      this.hl7V2StoreId = defaults.hl7V2StoreId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.messageType = defaults.messageType;
    	      this.name = defaults.name;
    	      this.patientIds = defaults.patientIds;
    	      this.project = defaults.project;
    	      this.schematizedData = defaults.schematizedData;
    	      this.sendFacility = defaults.sendFacility;
    	      this.sendTime = defaults.sendTime;
        }

        public Builder data(@Nullable Output<String> data) {
            this.data = data;
            return this;
        }
        public Builder data(@Nullable String data) {
            this.data = Codegen.ofNullable(data);
            return this;
        }
        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder hl7V2StoreId(Output<String> hl7V2StoreId) {
            this.hl7V2StoreId = Objects.requireNonNull(hl7V2StoreId);
            return this;
        }
        public Builder hl7V2StoreId(String hl7V2StoreId) {
            this.hl7V2StoreId = Output.of(Objects.requireNonNull(hl7V2StoreId));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder messageType(@Nullable Output<String> messageType) {
            this.messageType = messageType;
            return this;
        }
        public Builder messageType(@Nullable String messageType) {
            this.messageType = Codegen.ofNullable(messageType);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder patientIds(@Nullable Output<List<PatientIdArgs>> patientIds) {
            this.patientIds = patientIds;
            return this;
        }
        public Builder patientIds(@Nullable List<PatientIdArgs> patientIds) {
            this.patientIds = Codegen.ofNullable(patientIds);
            return this;
        }
        public Builder patientIds(PatientIdArgs... patientIds) {
            return patientIds(List.of(patientIds));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder schematizedData(@Nullable Output<SchematizedDataArgs> schematizedData) {
            this.schematizedData = schematizedData;
            return this;
        }
        public Builder schematizedData(@Nullable SchematizedDataArgs schematizedData) {
            this.schematizedData = Codegen.ofNullable(schematizedData);
            return this;
        }
        public Builder sendFacility(@Nullable Output<String> sendFacility) {
            this.sendFacility = sendFacility;
            return this;
        }
        public Builder sendFacility(@Nullable String sendFacility) {
            this.sendFacility = Codegen.ofNullable(sendFacility);
            return this;
        }
        public Builder sendTime(@Nullable Output<String> sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public Builder sendTime(@Nullable String sendTime) {
            this.sendTime = Codegen.ofNullable(sendTime);
            return this;
        }        public MessageArgs build() {
            return new MessageArgs(data, datasetId, hl7V2StoreId, labels, location, messageType, name, patientIds, project, schematizedData, sendFacility, sendTime);
        }
    }
}
