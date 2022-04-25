// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ParquetWriteSettingsResponse {
    /**
     * @return Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileNamePrefix;
    /**
     * @return Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxRowsPerFile;
    /**
     * @return The write setting type.
     * Expected value is &#39;ParquetWriteSettings&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ParquetWriteSettingsResponse(
        @CustomType.Parameter("fileNamePrefix") @Nullable Object fileNamePrefix,
        @CustomType.Parameter("maxRowsPerFile") @Nullable Object maxRowsPerFile,
        @CustomType.Parameter("type") String type) {
        this.fileNamePrefix = fileNamePrefix;
        this.maxRowsPerFile = maxRowsPerFile;
        this.type = type;
    }

    /**
     * @return Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> fileNamePrefix() {
        return Optional.ofNullable(this.fileNamePrefix);
    }
    /**
     * @return Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> maxRowsPerFile() {
        return Optional.ofNullable(this.maxRowsPerFile);
    }
    /**
     * @return The write setting type.
     * Expected value is &#39;ParquetWriteSettings&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParquetWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object fileNamePrefix;
        private @Nullable Object maxRowsPerFile;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParquetWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileNamePrefix = defaults.fileNamePrefix;
    	      this.maxRowsPerFile = defaults.maxRowsPerFile;
    	      this.type = defaults.type;
        }

        public Builder fileNamePrefix(@Nullable Object fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }
        public Builder maxRowsPerFile(@Nullable Object maxRowsPerFile) {
            this.maxRowsPerFile = maxRowsPerFile;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ParquetWriteSettingsResponse build() {
            return new ParquetWriteSettingsResponse(fileNamePrefix, maxRowsPerFile, type);
        }
    }
}
