// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.azurenative.securityinsights.outputs.IncidentAdditionalDataResponse;
import com.pulumi.azurenative.securityinsights.outputs.IncidentLabelResponse;
import com.pulumi.azurenative.securityinsights.outputs.IncidentOwnerInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIncidentResult {
    /**
     * @return Additional data on the incident
     * 
     */
    private final IncidentAdditionalDataResponse additionalData;
    /**
     * @return The reason the incident was closed
     * 
     */
    private final @Nullable String classification;
    /**
     * @return Describes the reason the incident was closed
     * 
     */
    private final @Nullable String classificationComment;
    /**
     * @return The classification reason the incident was closed with
     * 
     */
    private final @Nullable String classificationReason;
    /**
     * @return The time the incident was created
     * 
     */
    private final String createdTimeUtc;
    /**
     * @return The description of the incident
     * 
     */
    private final @Nullable String description;
    /**
     * @return Etag of the azure resource
     * 
     */
    private final @Nullable String etag;
    /**
     * @return The time of the first activity in the incident
     * 
     */
    private final @Nullable String firstActivityTimeUtc;
    /**
     * @return Azure resource Id
     * 
     */
    private final String id;
    /**
     * @return A sequential number
     * 
     */
    private final Integer incidentNumber;
    /**
     * @return The deep-link url to the incident in Azure portal
     * 
     */
    private final String incidentUrl;
    /**
     * @return List of labels relevant to this incident
     * 
     */
    private final @Nullable List<IncidentLabelResponse> labels;
    /**
     * @return The time of the last activity in the incident
     * 
     */
    private final @Nullable String lastActivityTimeUtc;
    /**
     * @return The last time the incident was updated
     * 
     */
    private final String lastModifiedTimeUtc;
    /**
     * @return Azure resource name
     * 
     */
    private final String name;
    /**
     * @return Describes a user that the incident is assigned to
     * 
     */
    private final @Nullable IncidentOwnerInfoResponse owner;
    /**
     * @return List of resource ids of Analytic rules related to the incident
     * 
     */
    private final List<String> relatedAnalyticRuleIds;
    /**
     * @return The severity of the incident
     * 
     */
    private final String severity;
    /**
     * @return The status of the incident
     * 
     */
    private final String status;
    /**
     * @return The title of the incident
     * 
     */
    private final String title;
    /**
     * @return Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetIncidentResult(
        @CustomType.Parameter("additionalData") IncidentAdditionalDataResponse additionalData,
        @CustomType.Parameter("classification") @Nullable String classification,
        @CustomType.Parameter("classificationComment") @Nullable String classificationComment,
        @CustomType.Parameter("classificationReason") @Nullable String classificationReason,
        @CustomType.Parameter("createdTimeUtc") String createdTimeUtc,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("firstActivityTimeUtc") @Nullable String firstActivityTimeUtc,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("incidentNumber") Integer incidentNumber,
        @CustomType.Parameter("incidentUrl") String incidentUrl,
        @CustomType.Parameter("labels") @Nullable List<IncidentLabelResponse> labels,
        @CustomType.Parameter("lastActivityTimeUtc") @Nullable String lastActivityTimeUtc,
        @CustomType.Parameter("lastModifiedTimeUtc") String lastModifiedTimeUtc,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("owner") @Nullable IncidentOwnerInfoResponse owner,
        @CustomType.Parameter("relatedAnalyticRuleIds") List<String> relatedAnalyticRuleIds,
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("title") String title,
        @CustomType.Parameter("type") String type) {
        this.additionalData = additionalData;
        this.classification = classification;
        this.classificationComment = classificationComment;
        this.classificationReason = classificationReason;
        this.createdTimeUtc = createdTimeUtc;
        this.description = description;
        this.etag = etag;
        this.firstActivityTimeUtc = firstActivityTimeUtc;
        this.id = id;
        this.incidentNumber = incidentNumber;
        this.incidentUrl = incidentUrl;
        this.labels = labels;
        this.lastActivityTimeUtc = lastActivityTimeUtc;
        this.lastModifiedTimeUtc = lastModifiedTimeUtc;
        this.name = name;
        this.owner = owner;
        this.relatedAnalyticRuleIds = relatedAnalyticRuleIds;
        this.severity = severity;
        this.status = status;
        this.title = title;
        this.type = type;
    }

    /**
     * @return Additional data on the incident
     * 
     */
    public IncidentAdditionalDataResponse additionalData() {
        return this.additionalData;
    }
    /**
     * @return The reason the incident was closed
     * 
     */
    public Optional<String> classification() {
        return Optional.ofNullable(this.classification);
    }
    /**
     * @return Describes the reason the incident was closed
     * 
     */
    public Optional<String> classificationComment() {
        return Optional.ofNullable(this.classificationComment);
    }
    /**
     * @return The classification reason the incident was closed with
     * 
     */
    public Optional<String> classificationReason() {
        return Optional.ofNullable(this.classificationReason);
    }
    /**
     * @return The time the incident was created
     * 
     */
    public String createdTimeUtc() {
        return this.createdTimeUtc;
    }
    /**
     * @return The description of the incident
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Etag of the azure resource
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return The time of the first activity in the incident
     * 
     */
    public Optional<String> firstActivityTimeUtc() {
        return Optional.ofNullable(this.firstActivityTimeUtc);
    }
    /**
     * @return Azure resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A sequential number
     * 
     */
    public Integer incidentNumber() {
        return this.incidentNumber;
    }
    /**
     * @return The deep-link url to the incident in Azure portal
     * 
     */
    public String incidentUrl() {
        return this.incidentUrl;
    }
    /**
     * @return List of labels relevant to this incident
     * 
     */
    public List<IncidentLabelResponse> labels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * @return The time of the last activity in the incident
     * 
     */
    public Optional<String> lastActivityTimeUtc() {
        return Optional.ofNullable(this.lastActivityTimeUtc);
    }
    /**
     * @return The last time the incident was updated
     * 
     */
    public String lastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    /**
     * @return Azure resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Describes a user that the incident is assigned to
     * 
     */
    public Optional<IncidentOwnerInfoResponse> owner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * @return List of resource ids of Analytic rules related to the incident
     * 
     */
    public List<String> relatedAnalyticRuleIds() {
        return this.relatedAnalyticRuleIds;
    }
    /**
     * @return The severity of the incident
     * 
     */
    public String severity() {
        return this.severity;
    }
    /**
     * @return The status of the incident
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The title of the incident
     * 
     */
    public String title() {
        return this.title;
    }
    /**
     * @return Azure resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIncidentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IncidentAdditionalDataResponse additionalData;
        private @Nullable String classification;
        private @Nullable String classificationComment;
        private @Nullable String classificationReason;
        private String createdTimeUtc;
        private @Nullable String description;
        private @Nullable String etag;
        private @Nullable String firstActivityTimeUtc;
        private String id;
        private Integer incidentNumber;
        private String incidentUrl;
        private @Nullable List<IncidentLabelResponse> labels;
        private @Nullable String lastActivityTimeUtc;
        private String lastModifiedTimeUtc;
        private String name;
        private @Nullable IncidentOwnerInfoResponse owner;
        private List<String> relatedAnalyticRuleIds;
        private String severity;
        private String status;
        private String title;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIncidentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalData = defaults.additionalData;
    	      this.classification = defaults.classification;
    	      this.classificationComment = defaults.classificationComment;
    	      this.classificationReason = defaults.classificationReason;
    	      this.createdTimeUtc = defaults.createdTimeUtc;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.firstActivityTimeUtc = defaults.firstActivityTimeUtc;
    	      this.id = defaults.id;
    	      this.incidentNumber = defaults.incidentNumber;
    	      this.incidentUrl = defaults.incidentUrl;
    	      this.labels = defaults.labels;
    	      this.lastActivityTimeUtc = defaults.lastActivityTimeUtc;
    	      this.lastModifiedTimeUtc = defaults.lastModifiedTimeUtc;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.relatedAnalyticRuleIds = defaults.relatedAnalyticRuleIds;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder additionalData(IncidentAdditionalDataResponse additionalData) {
            this.additionalData = Objects.requireNonNull(additionalData);
            return this;
        }
        public Builder classification(@Nullable String classification) {
            this.classification = classification;
            return this;
        }
        public Builder classificationComment(@Nullable String classificationComment) {
            this.classificationComment = classificationComment;
            return this;
        }
        public Builder classificationReason(@Nullable String classificationReason) {
            this.classificationReason = classificationReason;
            return this;
        }
        public Builder createdTimeUtc(String createdTimeUtc) {
            this.createdTimeUtc = Objects.requireNonNull(createdTimeUtc);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder firstActivityTimeUtc(@Nullable String firstActivityTimeUtc) {
            this.firstActivityTimeUtc = firstActivityTimeUtc;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder incidentNumber(Integer incidentNumber) {
            this.incidentNumber = Objects.requireNonNull(incidentNumber);
            return this;
        }
        public Builder incidentUrl(String incidentUrl) {
            this.incidentUrl = Objects.requireNonNull(incidentUrl);
            return this;
        }
        public Builder labels(@Nullable List<IncidentLabelResponse> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(IncidentLabelResponse... labels) {
            return labels(List.of(labels));
        }
        public Builder lastActivityTimeUtc(@Nullable String lastActivityTimeUtc) {
            this.lastActivityTimeUtc = lastActivityTimeUtc;
            return this;
        }
        public Builder lastModifiedTimeUtc(String lastModifiedTimeUtc) {
            this.lastModifiedTimeUtc = Objects.requireNonNull(lastModifiedTimeUtc);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder owner(@Nullable IncidentOwnerInfoResponse owner) {
            this.owner = owner;
            return this;
        }
        public Builder relatedAnalyticRuleIds(List<String> relatedAnalyticRuleIds) {
            this.relatedAnalyticRuleIds = Objects.requireNonNull(relatedAnalyticRuleIds);
            return this;
        }
        public Builder relatedAnalyticRuleIds(String... relatedAnalyticRuleIds) {
            return relatedAnalyticRuleIds(List.of(relatedAnalyticRuleIds));
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetIncidentResult build() {
            return new GetIncidentResult(additionalData, classification, classificationComment, classificationReason, createdTimeUtc, description, etag, firstActivityTimeUtc, id, incidentNumber, incidentUrl, labels, lastActivityTimeUtc, lastModifiedTimeUtc, name, owner, relatedAnalyticRuleIds, severity, status, title, type);
        }
    }
}
