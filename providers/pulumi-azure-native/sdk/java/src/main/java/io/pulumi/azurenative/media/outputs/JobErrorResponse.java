// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.JobErrorDetailResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class JobErrorResponse {
    /**
     * Helps with categorization of errors.
     * 
     */
    private final String category;
    /**
     * Error code describing the error.
     * 
     */
    private final String code;
    /**
     * An array of details about specific errors that led to this reported error.
     * 
     */
    private final List<JobErrorDetailResponse> details;
    /**
     * A human-readable language-dependent representation of the error.
     * 
     */
    private final String message;
    /**
     * Indicates that it may be possible to retry the Job. If retry is unsuccessful, please contact Azure support via Azure Portal.
     * 
     */
    private final String retry;

    @OutputCustomType.Constructor
    private JobErrorResponse(
        @OutputCustomType.Parameter("category") String category,
        @OutputCustomType.Parameter("code") String code,
        @OutputCustomType.Parameter("details") List<JobErrorDetailResponse> details,
        @OutputCustomType.Parameter("message") String message,
        @OutputCustomType.Parameter("retry") String retry) {
        this.category = category;
        this.code = code;
        this.details = details;
        this.message = message;
        this.retry = retry;
    }

    /**
     * Helps with categorization of errors.
     * 
    */
    public String getCategory() {
        return this.category;
    }
    /**
     * Error code describing the error.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * An array of details about specific errors that led to this reported error.
     * 
    */
    public List<JobErrorDetailResponse> getDetails() {
        return this.details;
    }
    /**
     * A human-readable language-dependent representation of the error.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * Indicates that it may be possible to retry the Job. If retry is unsuccessful, please contact Azure support via Azure Portal.
     * 
    */
    public String getRetry() {
        return this.retry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String category;
        private String code;
        private List<JobErrorDetailResponse> details;
        private String message;
        private String retry;

        public Builder() {
    	      // Empty
        }

        public Builder(JobErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.retry = defaults.retry;
        }

        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder details(List<JobErrorDetailResponse> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder retry(String retry) {
            this.retry = Objects.requireNonNull(retry);
            return this;
        }
        public JobErrorResponse build() {
            return new JobErrorResponse(category, code, details, message, retry);
        }
    }
}
