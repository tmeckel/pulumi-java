// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FilterFileDetailsResponse {
    /**
     * @return Path of the file that contains the details of all items to transfer.
     * 
     */
    private final String filterFilePath;
    /**
     * @return Type of the filter file.
     * 
     */
    private final String filterFileType;

    @CustomType.Constructor
    private FilterFileDetailsResponse(
        @CustomType.Parameter("filterFilePath") String filterFilePath,
        @CustomType.Parameter("filterFileType") String filterFileType) {
        this.filterFilePath = filterFilePath;
        this.filterFileType = filterFileType;
    }

    /**
     * @return Path of the file that contains the details of all items to transfer.
     * 
     */
    public String filterFilePath() {
        return this.filterFilePath;
    }
    /**
     * @return Type of the filter file.
     * 
     */
    public String filterFileType() {
        return this.filterFileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterFileDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filterFilePath;
        private String filterFileType;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterFileDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterFilePath = defaults.filterFilePath;
    	      this.filterFileType = defaults.filterFileType;
        }

        public Builder filterFilePath(String filterFilePath) {
            this.filterFilePath = Objects.requireNonNull(filterFilePath);
            return this;
        }
        public Builder filterFileType(String filterFileType) {
            this.filterFileType = Objects.requireNonNull(filterFileType);
            return this;
        }        public FilterFileDetailsResponse build() {
            return new FilterFileDetailsResponse(filterFilePath, filterFileType);
        }
    }
}
