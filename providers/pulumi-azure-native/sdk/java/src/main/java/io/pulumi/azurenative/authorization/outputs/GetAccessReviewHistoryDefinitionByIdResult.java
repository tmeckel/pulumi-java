// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.azurenative.authorization.outputs.AccessReviewHistoryInstanceResponse;
import io.pulumi.azurenative.authorization.outputs.AccessReviewScopeResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccessReviewHistoryDefinitionByIdResult {
    /**
     * Date time when history definition was created
     * 
     */
    private final String createdDateTime;
    /**
     * Collection of review decisions which the history data should be filtered on. For example if Approve and Deny are supplied the data will only contain review results in which the decision maker approved or denied a review request.
     * 
     */
    private final @Nullable List<String> decisions;
    /**
     * The display name for the history definition.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The DateTime when the review is scheduled to end. Required if type is endDate
     * 
     */
    private final @Nullable String endDate;
    /**
     * The access review history definition id.
     * 
     */
    private final String id;
    /**
     * Set of access review history instances for this history definition.
     * 
     */
    private final @Nullable List<AccessReviewHistoryInstanceResponse> instances;
    /**
     * The interval for recurrence. For a quarterly review, the interval is 3 for type : absoluteMonthly.
     * 
     */
    private final @Nullable Integer interval;
    /**
     * The access review history definition unique id.
     * 
     */
    private final String name;
    /**
     * The number of times to repeat the access review. Required and must be positive if type is numbered.
     * 
     */
    private final @Nullable Integer numberOfOccurrences;
    /**
     * The identity id
     * 
     */
    private final String principalId;
    /**
     * The identity display name
     * 
     */
    private final String principalName;
    /**
     * The identity type : user/servicePrincipal
     * 
     */
    private final String principalType;
    /**
     * Date time used when selecting review data, all reviews included in data end on or before this date. For use only with one-time/non-recurring reports.
     * 
     */
    private final String reviewHistoryPeriodEndDateTime;
    /**
     * Date time used when selecting review data, all reviews included in data start on or after this date. For use only with one-time/non-recurring reports.
     * 
     */
    private final String reviewHistoryPeriodStartDateTime;
    /**
     * A collection of scopes used when selecting review history data
     * 
     */
    private final @Nullable List<AccessReviewScopeResponse> scopes;
    /**
     * The DateTime when the review is scheduled to be start. This could be a date in the future. Required on create.
     * 
     */
    private final @Nullable String startDate;
    /**
     * This read-only field specifies the of the requested review history data. This is either requested, in-progress, done or error.
     * 
     */
    private final String status;
    /**
     * The resource type.
     * 
     */
    private final String type;
    /**
     * The user principal name(if valid)
     * 
     */
    private final String userPrincipalName;

    @OutputCustomType.Constructor
    private GetAccessReviewHistoryDefinitionByIdResult(
        @OutputCustomType.Parameter("createdDateTime") String createdDateTime,
        @OutputCustomType.Parameter("decisions") @Nullable List<String> decisions,
        @OutputCustomType.Parameter("displayName") @Nullable String displayName,
        @OutputCustomType.Parameter("endDate") @Nullable String endDate,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("instances") @Nullable List<AccessReviewHistoryInstanceResponse> instances,
        @OutputCustomType.Parameter("interval") @Nullable Integer interval,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("numberOfOccurrences") @Nullable Integer numberOfOccurrences,
        @OutputCustomType.Parameter("principalId") String principalId,
        @OutputCustomType.Parameter("principalName") String principalName,
        @OutputCustomType.Parameter("principalType") String principalType,
        @OutputCustomType.Parameter("reviewHistoryPeriodEndDateTime") String reviewHistoryPeriodEndDateTime,
        @OutputCustomType.Parameter("reviewHistoryPeriodStartDateTime") String reviewHistoryPeriodStartDateTime,
        @OutputCustomType.Parameter("scopes") @Nullable List<AccessReviewScopeResponse> scopes,
        @OutputCustomType.Parameter("startDate") @Nullable String startDate,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userPrincipalName") String userPrincipalName) {
        this.createdDateTime = createdDateTime;
        this.decisions = decisions;
        this.displayName = displayName;
        this.endDate = endDate;
        this.id = id;
        this.instances = instances;
        this.interval = interval;
        this.name = name;
        this.numberOfOccurrences = numberOfOccurrences;
        this.principalId = principalId;
        this.principalName = principalName;
        this.principalType = principalType;
        this.reviewHistoryPeriodEndDateTime = reviewHistoryPeriodEndDateTime;
        this.reviewHistoryPeriodStartDateTime = reviewHistoryPeriodStartDateTime;
        this.scopes = scopes;
        this.startDate = startDate;
        this.status = status;
        this.type = type;
        this.userPrincipalName = userPrincipalName;
    }

    /**
     * Date time when history definition was created
     * 
    */
    public String getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Collection of review decisions which the history data should be filtered on. For example if Approve and Deny are supplied the data will only contain review results in which the decision maker approved or denied a review request.
     * 
    */
    public List<String> getDecisions() {
        return this.decisions == null ? List.of() : this.decisions;
    }
    /**
     * The display name for the history definition.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The DateTime when the review is scheduled to end. Required if type is endDate
     * 
    */
    public Optional<String> getEndDate() {
        return Optional.ofNullable(this.endDate);
    }
    /**
     * The access review history definition id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Set of access review history instances for this history definition.
     * 
    */
    public List<AccessReviewHistoryInstanceResponse> getInstances() {
        return this.instances == null ? List.of() : this.instances;
    }
    /**
     * The interval for recurrence. For a quarterly review, the interval is 3 for type : absoluteMonthly.
     * 
    */
    public Optional<Integer> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * The access review history definition unique id.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The number of times to repeat the access review. Required and must be positive if type is numbered.
     * 
    */
    public Optional<Integer> getNumberOfOccurrences() {
        return Optional.ofNullable(this.numberOfOccurrences);
    }
    /**
     * The identity id
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The identity display name
     * 
    */
    public String getPrincipalName() {
        return this.principalName;
    }
    /**
     * The identity type : user/servicePrincipal
     * 
    */
    public String getPrincipalType() {
        return this.principalType;
    }
    /**
     * Date time used when selecting review data, all reviews included in data end on or before this date. For use only with one-time/non-recurring reports.
     * 
    */
    public String getReviewHistoryPeriodEndDateTime() {
        return this.reviewHistoryPeriodEndDateTime;
    }
    /**
     * Date time used when selecting review data, all reviews included in data start on or after this date. For use only with one-time/non-recurring reports.
     * 
    */
    public String getReviewHistoryPeriodStartDateTime() {
        return this.reviewHistoryPeriodStartDateTime;
    }
    /**
     * A collection of scopes used when selecting review history data
     * 
    */
    public List<AccessReviewScopeResponse> getScopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }
    /**
     * The DateTime when the review is scheduled to be start. This could be a date in the future. Required on create.
     * 
    */
    public Optional<String> getStartDate() {
        return Optional.ofNullable(this.startDate);
    }
    /**
     * This read-only field specifies the of the requested review history data. This is either requested, in-progress, done or error.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The user principal name(if valid)
     * 
    */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessReviewHistoryDefinitionByIdResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDateTime;
        private @Nullable List<String> decisions;
        private @Nullable String displayName;
        private @Nullable String endDate;
        private String id;
        private @Nullable List<AccessReviewHistoryInstanceResponse> instances;
        private @Nullable Integer interval;
        private String name;
        private @Nullable Integer numberOfOccurrences;
        private String principalId;
        private String principalName;
        private String principalType;
        private String reviewHistoryPeriodEndDateTime;
        private String reviewHistoryPeriodStartDateTime;
        private @Nullable List<AccessReviewScopeResponse> scopes;
        private @Nullable String startDate;
        private String status;
        private String type;
        private String userPrincipalName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessReviewHistoryDefinitionByIdResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDateTime = defaults.createdDateTime;
    	      this.decisions = defaults.decisions;
    	      this.displayName = defaults.displayName;
    	      this.endDate = defaults.endDate;
    	      this.id = defaults.id;
    	      this.instances = defaults.instances;
    	      this.interval = defaults.interval;
    	      this.name = defaults.name;
    	      this.numberOfOccurrences = defaults.numberOfOccurrences;
    	      this.principalId = defaults.principalId;
    	      this.principalName = defaults.principalName;
    	      this.principalType = defaults.principalType;
    	      this.reviewHistoryPeriodEndDateTime = defaults.reviewHistoryPeriodEndDateTime;
    	      this.reviewHistoryPeriodStartDateTime = defaults.reviewHistoryPeriodStartDateTime;
    	      this.scopes = defaults.scopes;
    	      this.startDate = defaults.startDate;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.userPrincipalName = defaults.userPrincipalName;
        }

        public Builder createdDateTime(String createdDateTime) {
            this.createdDateTime = Objects.requireNonNull(createdDateTime);
            return this;
        }

        public Builder decisions(@Nullable List<String> decisions) {
            this.decisions = decisions;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder endDate(@Nullable String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder instances(@Nullable List<AccessReviewHistoryInstanceResponse> instances) {
            this.instances = instances;
            return this;
        }

        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder numberOfOccurrences(@Nullable Integer numberOfOccurrences) {
            this.numberOfOccurrences = numberOfOccurrences;
            return this;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder principalName(String principalName) {
            this.principalName = Objects.requireNonNull(principalName);
            return this;
        }

        public Builder principalType(String principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }

        public Builder reviewHistoryPeriodEndDateTime(String reviewHistoryPeriodEndDateTime) {
            this.reviewHistoryPeriodEndDateTime = Objects.requireNonNull(reviewHistoryPeriodEndDateTime);
            return this;
        }

        public Builder reviewHistoryPeriodStartDateTime(String reviewHistoryPeriodStartDateTime) {
            this.reviewHistoryPeriodStartDateTime = Objects.requireNonNull(reviewHistoryPeriodStartDateTime);
            return this;
        }

        public Builder scopes(@Nullable List<AccessReviewScopeResponse> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder startDate(@Nullable String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userPrincipalName(String userPrincipalName) {
            this.userPrincipalName = Objects.requireNonNull(userPrincipalName);
            return this;
        }
        public GetAccessReviewHistoryDefinitionByIdResult build() {
            return new GetAccessReviewHistoryDefinitionByIdResult(createdDateTime, decisions, displayName, endDate, id, instances, interval, name, numberOfOccurrences, principalId, principalName, principalType, reviewHistoryPeriodEndDateTime, reviewHistoryPeriodStartDateTime, scopes, startDate, status, type, userPrincipalName);
        }
    }
}
