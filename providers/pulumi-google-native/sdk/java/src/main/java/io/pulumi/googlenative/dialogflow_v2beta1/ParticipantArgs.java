// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.ParticipantRole;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParticipantArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParticipantArgs Empty = new ParticipantArgs();

    @InputImport(name="conversationId", required=true)
    private final Input<String> conversationId;

    public Input<String> getConversationId() {
        return this.conversationId;
    }

    /**
     * Optional. Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have 'US' or 'CA' in their market metadata values and 'agent' in their user metadata values will be ```documents_metadata_filters { key: "market" value: "US,CA" } documents_metadata_filters { key: "user" value: "agent" }```
     * 
     */
    @InputImport(name="documentsMetadataFilters")
    private final @Nullable Input<Map<String,String>> documentsMetadataFilters;

    public Input<Map<String,String>> getDocumentsMetadataFilters() {
        return this.documentsMetadataFilters == null ? Input.empty() : this.documentsMetadataFilters;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Optional. Obfuscated user id that should be associated with the created participant. You can specify a user id as follows: 1. If you set this field in CreateParticipantRequest or UpdateParticipantRequest, Dialogflow adds the obfuscated user id with the participant. 2. If you set this field in AnalyzeContent or StreamingAnalyzeContent, Dialogflow will update Participant.obfuscated_external_user_id. Dialogflow uses this user id for following purposes: 1) Billing and measurement. If user with the same obfuscated_external_user_id is created in a later conversation, dialogflow will know it's the same user. 2) Agent assist suggestion personalization. For example, Dialogflow can use it to provide personalized smart reply suggestions for this user. Note: * Please never pass raw user ids to Dialogflow. Always obfuscate your user id first. * Dialogflow only accepts a UTF-8 encoded string, e.g., a hex digest of a hash function like SHA-512. * The length of the user id must be <= 256 characters.
     * 
     */
    @InputImport(name="obfuscatedExternalUserId")
    private final @Nullable Input<String> obfuscatedExternalUserId;

    public Input<String> getObfuscatedExternalUserId() {
        return this.obfuscatedExternalUserId == null ? Input.empty() : this.obfuscatedExternalUserId;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<ParticipantRole> role;

    public Input<ParticipantRole> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public ParticipantArgs(
        Input<String> conversationId,
        @Nullable Input<Map<String,String>> documentsMetadataFilters,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> obfuscatedExternalUserId,
        @Nullable Input<String> project,
        @Nullable Input<ParticipantRole> role) {
        this.conversationId = Objects.requireNonNull(conversationId, "expected parameter 'conversationId' to be non-null");
        this.documentsMetadataFilters = documentsMetadataFilters;
        this.location = location;
        this.name = name;
        this.obfuscatedExternalUserId = obfuscatedExternalUserId;
        this.project = project;
        this.role = role;
    }

    private ParticipantArgs() {
        this.conversationId = Input.empty();
        this.documentsMetadataFilters = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.obfuscatedExternalUserId = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParticipantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> conversationId;
        private @Nullable Input<Map<String,String>> documentsMetadataFilters;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> obfuscatedExternalUserId;
        private @Nullable Input<String> project;
        private @Nullable Input<ParticipantRole> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ParticipantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationId = defaults.conversationId;
    	      this.documentsMetadataFilters = defaults.documentsMetadataFilters;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.obfuscatedExternalUserId = defaults.obfuscatedExternalUserId;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder setConversationId(Input<String> conversationId) {
            this.conversationId = Objects.requireNonNull(conversationId);
            return this;
        }

        public Builder setConversationId(String conversationId) {
            this.conversationId = Input.of(Objects.requireNonNull(conversationId));
            return this;
        }

        public Builder setDocumentsMetadataFilters(@Nullable Input<Map<String,String>> documentsMetadataFilters) {
            this.documentsMetadataFilters = documentsMetadataFilters;
            return this;
        }

        public Builder setDocumentsMetadataFilters(@Nullable Map<String,String> documentsMetadataFilters) {
            this.documentsMetadataFilters = Input.ofNullable(documentsMetadataFilters);
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

        public Builder setObfuscatedExternalUserId(@Nullable Input<String> obfuscatedExternalUserId) {
            this.obfuscatedExternalUserId = obfuscatedExternalUserId;
            return this;
        }

        public Builder setObfuscatedExternalUserId(@Nullable String obfuscatedExternalUserId) {
            this.obfuscatedExternalUserId = Input.ofNullable(obfuscatedExternalUserId);
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

        public Builder setRole(@Nullable Input<ParticipantRole> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable ParticipantRole role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public ParticipantArgs build() {
            return new ParticipantArgs(conversationId, documentsMetadataFilters, location, name, obfuscatedExternalUserId, project, role);
        }
    }
}
