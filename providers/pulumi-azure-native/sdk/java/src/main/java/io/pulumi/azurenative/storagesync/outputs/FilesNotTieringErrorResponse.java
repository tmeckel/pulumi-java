// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class FilesNotTieringErrorResponse {
    /**
     * Error code (HResult)
     * 
     */
    private final Integer errorCode;
    /**
     * Count of files with this error
     * 
     */
    private final Double fileCount;

    @OutputCustomType.Constructor
    private FilesNotTieringErrorResponse(
        @OutputCustomType.Parameter("errorCode") Integer errorCode,
        @OutputCustomType.Parameter("fileCount") Double fileCount) {
        this.errorCode = errorCode;
        this.fileCount = fileCount;
    }

    /**
     * Error code (HResult)
     * 
    */
    public Integer getErrorCode() {
        return this.errorCode;
    }
    /**
     * Count of files with this error
     * 
    */
    public Double getFileCount() {
        return this.fileCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilesNotTieringErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer errorCode;
        private Double fileCount;

        public Builder() {
    	      // Empty
        }

        public Builder(FilesNotTieringErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.fileCount = defaults.fileCount;
        }

        public Builder errorCode(Integer errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder fileCount(Double fileCount) {
            this.fileCount = Objects.requireNonNull(fileCount);
            return this;
        }
        public FilesNotTieringErrorResponse build() {
            return new FilesNotTieringErrorResponse(errorCode, fileCount);
        }
    }
}
