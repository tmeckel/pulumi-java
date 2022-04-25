// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Delimited text write settings.
 * 
 */
public final class DelimitedTextWriteSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DelimitedTextWriteSettingsResponse Empty = new DelimitedTextWriteSettingsResponse();

    /**
     * The file extension used to create the files. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileExtension", required=true)
    private Object fileExtension;

    /**
     * @return The file extension used to create the files. Type: string (or Expression with resultType string).
     * 
     */
    public Object fileExtension() {
        return this.fileExtension;
    }

    /**
     * Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileNamePrefix")
    private @Nullable Object fileNamePrefix;

    /**
     * @return Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> fileNamePrefix() {
        return Optional.ofNullable(this.fileNamePrefix);
    }

    /**
     * Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxRowsPerFile")
    private @Nullable Object maxRowsPerFile;

    /**
     * @return Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> maxRowsPerFile() {
        return Optional.ofNullable(this.maxRowsPerFile);
    }

    /**
     * Indicates whether string values should always be enclosed with quotes. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="quoteAllText")
    private @Nullable Object quoteAllText;

    /**
     * @return Indicates whether string values should always be enclosed with quotes. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> quoteAllText() {
        return Optional.ofNullable(this.quoteAllText);
    }

    /**
     * The write setting type.
     * Expected value is &#39;DelimitedTextWriteSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The write setting type.
     * Expected value is &#39;DelimitedTextWriteSettings&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private DelimitedTextWriteSettingsResponse() {}

    private DelimitedTextWriteSettingsResponse(DelimitedTextWriteSettingsResponse $) {
        this.fileExtension = $.fileExtension;
        this.fileNamePrefix = $.fileNamePrefix;
        this.maxRowsPerFile = $.maxRowsPerFile;
        this.quoteAllText = $.quoteAllText;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DelimitedTextWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DelimitedTextWriteSettingsResponse $;

        public Builder() {
            $ = new DelimitedTextWriteSettingsResponse();
        }

        public Builder(DelimitedTextWriteSettingsResponse defaults) {
            $ = new DelimitedTextWriteSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileExtension The file extension used to create the files. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileExtension(Object fileExtension) {
            $.fileExtension = fileExtension;
            return this;
        }

        /**
         * @param fileNamePrefix Specifies the file name pattern &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without partitionOptions. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileNamePrefix(@Nullable Object fileNamePrefix) {
            $.fileNamePrefix = fileNamePrefix;
            return this;
        }

        /**
         * @param maxRowsPerFile Limit the written file&#39;s row count to be smaller than or equal to the specified count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxRowsPerFile(@Nullable Object maxRowsPerFile) {
            $.maxRowsPerFile = maxRowsPerFile;
            return this;
        }

        /**
         * @param quoteAllText Indicates whether string values should always be enclosed with quotes. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder quoteAllText(@Nullable Object quoteAllText) {
            $.quoteAllText = quoteAllText;
            return this;
        }

        /**
         * @param type The write setting type.
         * Expected value is &#39;DelimitedTextWriteSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public DelimitedTextWriteSettingsResponse build() {
            $.fileExtension = Objects.requireNonNull($.fileExtension, "expected parameter 'fileExtension' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
