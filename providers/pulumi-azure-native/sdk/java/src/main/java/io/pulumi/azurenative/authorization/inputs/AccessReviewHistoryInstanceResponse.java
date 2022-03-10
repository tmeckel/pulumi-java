// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Access Review History Definition Instance.
 * 
 */
public final class AccessReviewHistoryInstanceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AccessReviewHistoryInstanceResponse Empty = new AccessReviewHistoryInstanceResponse();

    /**
     * The display name for the parent history definition.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Uri which can be used to retrieve review history data. To generate this Uri, generateDownloadUri() must be called for a specific accessReviewHistoryDefinitionInstance. The link expires after a 24 hour period. Callers can see the expiration date time by looking at the 'se' parameter in the generated uri.
     * 
     */
    @InputImport(name="downloadUri", required=true)
      private final String downloadUri;

    public String getDownloadUri() {
        return this.downloadUri;
    }

    /**
     * Date time when history data report expires and the associated data is deleted.
     * 
     */
    @InputImport(name="expiration")
      private final @Nullable String expiration;

    public Optional<String> getExpiration() {
        return this.expiration == null ? Optional.empty() : Optional.ofNullable(this.expiration);
    }

    /**
     * Date time when the history data report is scheduled to be generated.
     * 
     */
    @InputImport(name="fulfilledDateTime")
      private final @Nullable String fulfilledDateTime;

    public Optional<String> getFulfilledDateTime() {
        return this.fulfilledDateTime == null ? Optional.empty() : Optional.ofNullable(this.fulfilledDateTime);
    }

    /**
     * The access review history definition instance id.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The access review history definition instance unique id.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Date time used when selecting review data, all reviews included in data end on or before this date. For use only with one-time/non-recurring reports.
     * 
     */
    @InputImport(name="reviewHistoryPeriodEndDateTime")
      private final @Nullable String reviewHistoryPeriodEndDateTime;

    public Optional<String> getReviewHistoryPeriodEndDateTime() {
        return this.reviewHistoryPeriodEndDateTime == null ? Optional.empty() : Optional.ofNullable(this.reviewHistoryPeriodEndDateTime);
    }

    /**
     * Date time used when selecting review data, all reviews included in data start on or after this date. For use only with one-time/non-recurring reports.
     * 
     */
    @InputImport(name="reviewHistoryPeriodStartDateTime")
      private final @Nullable String reviewHistoryPeriodStartDateTime;

    public Optional<String> getReviewHistoryPeriodStartDateTime() {
        return this.reviewHistoryPeriodStartDateTime == null ? Optional.empty() : Optional.ofNullable(this.reviewHistoryPeriodStartDateTime);
    }

    /**
     * Date time when the history data report is scheduled to be generated.
     * 
     */
    @InputImport(name="runDateTime")
      private final @Nullable String runDateTime;

    public Optional<String> getRunDateTime() {
        return this.runDateTime == null ? Optional.empty() : Optional.ofNullable(this.runDateTime);
    }

    /**
     * Status of the requested review history instance data. This is either requested, in-progress, done or error. The state transitions are as follows - Requested -> InProgress -> Done -> Expired
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * The resource type.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public AccessReviewHistoryInstanceResponse(
        @Nullable String displayName,
        String downloadUri,
        @Nullable String expiration,
        @Nullable String fulfilledDateTime,
        String id,
        String name,
        @Nullable String reviewHistoryPeriodEndDateTime,
        @Nullable String reviewHistoryPeriodStartDateTime,
        @Nullable String runDateTime,
        String status,
        String type) {
        this.displayName = displayName;
        this.downloadUri = Objects.requireNonNull(downloadUri, "expected parameter 'downloadUri' to be non-null");
        this.expiration = expiration;
        this.fulfilledDateTime = fulfilledDateTime;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.reviewHistoryPeriodEndDateTime = reviewHistoryPeriodEndDateTime;
        this.reviewHistoryPeriodStartDateTime = reviewHistoryPeriodStartDateTime;
        this.runDateTime = runDateTime;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AccessReviewHistoryInstanceResponse() {
        this.displayName = null;
        this.downloadUri = null;
        this.expiration = null;
        this.fulfilledDateTime = null;
        this.id = null;
        this.name = null;
        this.reviewHistoryPeriodEndDateTime = null;
        this.reviewHistoryPeriodStartDateTime = null;
        this.runDateTime = null;
        this.status = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessReviewHistoryInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private String downloadUri;
        private @Nullable String expiration;
        private @Nullable String fulfilledDateTime;
        private String id;
        private String name;
        private @Nullable String reviewHistoryPeriodEndDateTime;
        private @Nullable String reviewHistoryPeriodStartDateTime;
        private @Nullable String runDateTime;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessReviewHistoryInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.downloadUri = defaults.downloadUri;
    	      this.expiration = defaults.expiration;
    	      this.fulfilledDateTime = defaults.fulfilledDateTime;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.reviewHistoryPeriodEndDateTime = defaults.reviewHistoryPeriodEndDateTime;
    	      this.reviewHistoryPeriodStartDateTime = defaults.reviewHistoryPeriodStartDateTime;
    	      this.runDateTime = defaults.runDateTime;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder downloadUri(String downloadUri) {
            this.downloadUri = Objects.requireNonNull(downloadUri);
            return this;
        }

        public Builder expiration(@Nullable String expiration) {
            this.expiration = expiration;
            return this;
        }

        public Builder fulfilledDateTime(@Nullable String fulfilledDateTime) {
            this.fulfilledDateTime = fulfilledDateTime;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder reviewHistoryPeriodEndDateTime(@Nullable String reviewHistoryPeriodEndDateTime) {
            this.reviewHistoryPeriodEndDateTime = reviewHistoryPeriodEndDateTime;
            return this;
        }

        public Builder reviewHistoryPeriodStartDateTime(@Nullable String reviewHistoryPeriodStartDateTime) {
            this.reviewHistoryPeriodStartDateTime = reviewHistoryPeriodStartDateTime;
            return this;
        }

        public Builder runDateTime(@Nullable String runDateTime) {
            this.runDateTime = runDateTime;
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
        public AccessReviewHistoryInstanceResponse build() {
            return new AccessReviewHistoryInstanceResponse(displayName, downloadUri, expiration, fulfilledDateTime, id, name, reviewHistoryPeriodEndDateTime, reviewHistoryPeriodStartDateTime, runDateTime, status, type);
        }
    }
}
