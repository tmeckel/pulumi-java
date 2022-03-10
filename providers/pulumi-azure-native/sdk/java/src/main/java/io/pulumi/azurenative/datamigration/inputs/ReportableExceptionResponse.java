// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Exception object for all custom exceptions
 * 
 */
public final class ReportableExceptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportableExceptionResponse Empty = new ReportableExceptionResponse();

    /**
     * Actionable steps for this exception
     * 
     */
    @InputImport(name="actionableMessage")
      private final @Nullable String actionableMessage;

    public Optional<String> getActionableMessage() {
        return this.actionableMessage == null ? Optional.empty() : Optional.ofNullable(this.actionableMessage);
    }

    /**
     * The path to the file where exception occurred
     * 
     */
    @InputImport(name="filePath", required=true)
      private final String filePath;

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * Coded numerical value that is assigned to a specific exception
     * 
     */
    @InputImport(name="hResult", required=true)
      private final Integer hResult;

    public Integer getHResult() {
        return this.hResult;
    }

    /**
     * The line number where exception occurred
     * 
     */
    @InputImport(name="lineNumber", required=true)
      private final String lineNumber;

    public String getLineNumber() {
        return this.lineNumber;
    }

    /**
     * Error message
     * 
     */
    @InputImport(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * Stack trace
     * 
     */
    @InputImport(name="stackTrace", required=true)
      private final String stackTrace;

    public String getStackTrace() {
        return this.stackTrace;
    }

    public ReportableExceptionResponse(
        @Nullable String actionableMessage,
        String filePath,
        Integer hResult,
        String lineNumber,
        String message,
        String stackTrace) {
        this.actionableMessage = actionableMessage;
        this.filePath = Objects.requireNonNull(filePath, "expected parameter 'filePath' to be non-null");
        this.hResult = Objects.requireNonNull(hResult, "expected parameter 'hResult' to be non-null");
        this.lineNumber = Objects.requireNonNull(lineNumber, "expected parameter 'lineNumber' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.stackTrace = Objects.requireNonNull(stackTrace, "expected parameter 'stackTrace' to be non-null");
    }

    private ReportableExceptionResponse() {
        this.actionableMessage = null;
        this.filePath = null;
        this.hResult = null;
        this.lineNumber = null;
        this.message = null;
        this.stackTrace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportableExceptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionableMessage;
        private String filePath;
        private Integer hResult;
        private String lineNumber;
        private String message;
        private String stackTrace;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportableExceptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionableMessage = defaults.actionableMessage;
    	      this.filePath = defaults.filePath;
    	      this.hResult = defaults.hResult;
    	      this.lineNumber = defaults.lineNumber;
    	      this.message = defaults.message;
    	      this.stackTrace = defaults.stackTrace;
        }

        public Builder actionableMessage(@Nullable String actionableMessage) {
            this.actionableMessage = actionableMessage;
            return this;
        }

        public Builder filePath(String filePath) {
            this.filePath = Objects.requireNonNull(filePath);
            return this;
        }

        public Builder hResult(Integer hResult) {
            this.hResult = Objects.requireNonNull(hResult);
            return this;
        }

        public Builder lineNumber(String lineNumber) {
            this.lineNumber = Objects.requireNonNull(lineNumber);
            return this;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder stackTrace(String stackTrace) {
            this.stackTrace = Objects.requireNonNull(stackTrace);
            return this;
        }
        public ReportableExceptionResponse build() {
            return new ReportableExceptionResponse(actionableMessage, filePath, hResult, lineNumber, message, stackTrace);
        }
    }
}
