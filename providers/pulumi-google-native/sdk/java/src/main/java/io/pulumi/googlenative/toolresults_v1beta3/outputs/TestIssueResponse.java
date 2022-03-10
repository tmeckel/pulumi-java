// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.AnyResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TestIssueResponse {
    /**
     * Category of issue. Required.
     * 
     */
    private final String category;
    /**
     * A brief human-readable message describing the issue. Required.
     * 
     */
    private final String errorMessage;
    /**
     * Severity of issue. Required.
     * 
     */
    private final String severity;
    /**
     * Type of issue. Required.
     * 
     */
    private final String type;
    /**
     * Warning message with additional details of the issue. Should always be a message from com.google.devtools.toolresults.v1.warnings
     * 
     */
    private final AnyResponse warning;

    @OutputCustomType.Constructor
    private TestIssueResponse(
        @OutputCustomType.Parameter("category") String category,
        @OutputCustomType.Parameter("errorMessage") String errorMessage,
        @OutputCustomType.Parameter("severity") String severity,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("warning") AnyResponse warning) {
        this.category = category;
        this.errorMessage = errorMessage;
        this.severity = severity;
        this.type = type;
        this.warning = warning;
    }

    /**
     * Category of issue. Required.
     * 
    */
    public String getCategory() {
        return this.category;
    }
    /**
     * A brief human-readable message describing the issue. Required.
     * 
    */
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * Severity of issue. Required.
     * 
    */
    public String getSeverity() {
        return this.severity;
    }
    /**
     * Type of issue. Required.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Warning message with additional details of the issue. Should always be a message from com.google.devtools.toolresults.v1.warnings
     * 
    */
    public AnyResponse getWarning() {
        return this.warning;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestIssueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String category;
        private String errorMessage;
        private String severity;
        private String type;
        private AnyResponse warning;

        public Builder() {
    	      // Empty
        }

        public Builder(TestIssueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.errorMessage = defaults.errorMessage;
    	      this.severity = defaults.severity;
    	      this.type = defaults.type;
    	      this.warning = defaults.warning;
        }

        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder warning(AnyResponse warning) {
            this.warning = Objects.requireNonNull(warning);
            return this;
        }
        public TestIssueResponse build() {
            return new TestIssueResponse(category, errorMessage, severity, type, warning);
        }
    }
}
