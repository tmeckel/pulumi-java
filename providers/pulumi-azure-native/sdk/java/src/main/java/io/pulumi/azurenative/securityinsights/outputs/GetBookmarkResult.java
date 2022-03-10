// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.IncidentInfoResponse;
import io.pulumi.azurenative.securityinsights.outputs.UserInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBookmarkResult {
    /**
     * The time the bookmark was created
     * 
     */
    private final @Nullable String created;
    /**
     * Describes a user that created the bookmark
     * 
     */
    private final @Nullable UserInfoResponse createdBy;
    /**
     * The display name of the bookmark
     * 
     */
    private final String displayName;
    /**
     * Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * The bookmark event time
     * 
     */
    private final @Nullable String eventTime;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * Describes an incident that relates to bookmark
     * 
     */
    private final @Nullable IncidentInfoResponse incidentInfo;
    /**
     * List of labels relevant to this bookmark
     * 
     */
    private final @Nullable List<String> labels;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * The notes of the bookmark
     * 
     */
    private final @Nullable String notes;
    /**
     * The query of the bookmark.
     * 
     */
    private final String query;
    /**
     * The end time for the query
     * 
     */
    private final @Nullable String queryEndTime;
    /**
     * The query result of the bookmark.
     * 
     */
    private final @Nullable String queryResult;
    /**
     * The start time for the query
     * 
     */
    private final @Nullable String queryStartTime;
    /**
     * Azure resource type
     * 
     */
    private final String type;
    /**
     * The last time the bookmark was updated
     * 
     */
    private final @Nullable String updated;
    /**
     * Describes a user that updated the bookmark
     * 
     */
    private final @Nullable UserInfoResponse updatedBy;

    @OutputCustomType.Constructor
    private GetBookmarkResult(
        @OutputCustomType.Parameter("created") @Nullable String created,
        @OutputCustomType.Parameter("createdBy") @Nullable UserInfoResponse createdBy,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("etag") @Nullable String etag,
        @OutputCustomType.Parameter("eventTime") @Nullable String eventTime,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("incidentInfo") @Nullable IncidentInfoResponse incidentInfo,
        @OutputCustomType.Parameter("labels") @Nullable List<String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("notes") @Nullable String notes,
        @OutputCustomType.Parameter("query") String query,
        @OutputCustomType.Parameter("queryEndTime") @Nullable String queryEndTime,
        @OutputCustomType.Parameter("queryResult") @Nullable String queryResult,
        @OutputCustomType.Parameter("queryStartTime") @Nullable String queryStartTime,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("updated") @Nullable String updated,
        @OutputCustomType.Parameter("updatedBy") @Nullable UserInfoResponse updatedBy) {
        this.created = created;
        this.createdBy = createdBy;
        this.displayName = displayName;
        this.etag = etag;
        this.eventTime = eventTime;
        this.id = id;
        this.incidentInfo = incidentInfo;
        this.labels = labels;
        this.name = name;
        this.notes = notes;
        this.query = query;
        this.queryEndTime = queryEndTime;
        this.queryResult = queryResult;
        this.queryStartTime = queryStartTime;
        this.type = type;
        this.updated = updated;
        this.updatedBy = updatedBy;
    }

    /**
     * The time the bookmark was created
     * 
    */
    public Optional<String> getCreated() {
        return Optional.ofNullable(this.created);
    }
    /**
     * Describes a user that created the bookmark
     * 
    */
    public Optional<UserInfoResponse> getCreatedBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * The display name of the bookmark
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Etag of the azure resource
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * The bookmark event time
     * 
    */
    public Optional<String> getEventTime() {
        return Optional.ofNullable(this.eventTime);
    }
    /**
     * Azure resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Describes an incident that relates to bookmark
     * 
    */
    public Optional<IncidentInfoResponse> getIncidentInfo() {
        return Optional.ofNullable(this.incidentInfo);
    }
    /**
     * List of labels relevant to this bookmark
     * 
    */
    public List<String> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * Azure resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The notes of the bookmark
     * 
    */
    public Optional<String> getNotes() {
        return Optional.ofNullable(this.notes);
    }
    /**
     * The query of the bookmark.
     * 
    */
    public String getQuery() {
        return this.query;
    }
    /**
     * The end time for the query
     * 
    */
    public Optional<String> getQueryEndTime() {
        return Optional.ofNullable(this.queryEndTime);
    }
    /**
     * The query result of the bookmark.
     * 
    */
    public Optional<String> getQueryResult() {
        return Optional.ofNullable(this.queryResult);
    }
    /**
     * The start time for the query
     * 
    */
    public Optional<String> getQueryStartTime() {
        return Optional.ofNullable(this.queryStartTime);
    }
    /**
     * Azure resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The last time the bookmark was updated
     * 
    */
    public Optional<String> getUpdated() {
        return Optional.ofNullable(this.updated);
    }
    /**
     * Describes a user that updated the bookmark
     * 
    */
    public Optional<UserInfoResponse> getUpdatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBookmarkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String created;
        private @Nullable UserInfoResponse createdBy;
        private String displayName;
        private @Nullable String etag;
        private @Nullable String eventTime;
        private String id;
        private @Nullable IncidentInfoResponse incidentInfo;
        private @Nullable List<String> labels;
        private String name;
        private @Nullable String notes;
        private String query;
        private @Nullable String queryEndTime;
        private @Nullable String queryResult;
        private @Nullable String queryStartTime;
        private String type;
        private @Nullable String updated;
        private @Nullable UserInfoResponse updatedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBookmarkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.createdBy = defaults.createdBy;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.eventTime = defaults.eventTime;
    	      this.id = defaults.id;
    	      this.incidentInfo = defaults.incidentInfo;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.query = defaults.query;
    	      this.queryEndTime = defaults.queryEndTime;
    	      this.queryResult = defaults.queryResult;
    	      this.queryStartTime = defaults.queryStartTime;
    	      this.type = defaults.type;
    	      this.updated = defaults.updated;
    	      this.updatedBy = defaults.updatedBy;
        }

        public Builder created(@Nullable String created) {
            this.created = created;
            return this;
        }

        public Builder createdBy(@Nullable UserInfoResponse createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder eventTime(@Nullable String eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder incidentInfo(@Nullable IncidentInfoResponse incidentInfo) {
            this.incidentInfo = incidentInfo;
            return this;
        }

        public Builder labels(@Nullable List<String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder notes(@Nullable String notes) {
            this.notes = notes;
            return this;
        }

        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder queryEndTime(@Nullable String queryEndTime) {
            this.queryEndTime = queryEndTime;
            return this;
        }

        public Builder queryResult(@Nullable String queryResult) {
            this.queryResult = queryResult;
            return this;
        }

        public Builder queryStartTime(@Nullable String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder updated(@Nullable String updated) {
            this.updated = updated;
            return this;
        }

        public Builder updatedBy(@Nullable UserInfoResponse updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public GetBookmarkResult build() {
            return new GetBookmarkResult(created, createdBy, displayName, etag, eventTime, id, incidentInfo, labels, name, notes, query, queryEndTime, queryResult, queryStartTime, type, updated, updatedBy);
        }
    }
}
