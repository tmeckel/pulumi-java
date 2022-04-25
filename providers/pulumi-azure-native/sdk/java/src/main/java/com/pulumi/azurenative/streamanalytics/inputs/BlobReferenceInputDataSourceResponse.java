// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.azurenative.streamanalytics.inputs.StorageAccountResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a blob input data source that contains reference data.
 * 
 */
public final class BlobReferenceInputDataSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final BlobReferenceInputDataSourceResponse Empty = new BlobReferenceInputDataSourceResponse();

    /**
     * The name of a container within the associated Storage account. This container contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="container")
    private @Nullable String container;

    /**
     * @return The name of a container within the associated Storage account. This container contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> container() {
        return Optional.ofNullable(this.container);
    }

    /**
     * The date format. Wherever {date} appears in pathPattern, the value of this property is used as the date format instead.
     * 
     */
    @Import(name="dateFormat")
    private @Nullable String dateFormat;

    /**
     * @return The date format. Wherever {date} appears in pathPattern, the value of this property is used as the date format instead.
     * 
     */
    public Optional<String> dateFormat() {
        return Optional.ofNullable(this.dateFormat);
    }

    /**
     * The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation and example.
     * 
     */
    @Import(name="pathPattern")
    private @Nullable String pathPattern;

    /**
     * @return The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation and example.
     * 
     */
    public Optional<String> pathPattern() {
        return Optional.ofNullable(this.pathPattern);
    }

    /**
     * A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="storageAccounts")
    private @Nullable List<StorageAccountResponse> storageAccounts;

    /**
     * @return A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<List<StorageAccountResponse>> storageAccounts() {
        return Optional.ofNullable(this.storageAccounts);
    }

    /**
     * The time format. Wherever {time} appears in pathPattern, the value of this property is used as the time format instead.
     * 
     */
    @Import(name="timeFormat")
    private @Nullable String timeFormat;

    /**
     * @return The time format. Wherever {time} appears in pathPattern, the value of this property is used as the time format instead.
     * 
     */
    public Optional<String> timeFormat() {
        return Optional.ofNullable(this.timeFormat);
    }

    /**
     * Indicates the type of input data source containing reference data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.Storage/Blob&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Indicates the type of input data source containing reference data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.Storage/Blob&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private BlobReferenceInputDataSourceResponse() {}

    private BlobReferenceInputDataSourceResponse(BlobReferenceInputDataSourceResponse $) {
        this.container = $.container;
        this.dateFormat = $.dateFormat;
        this.pathPattern = $.pathPattern;
        this.storageAccounts = $.storageAccounts;
        this.timeFormat = $.timeFormat;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobReferenceInputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobReferenceInputDataSourceResponse $;

        public Builder() {
            $ = new BlobReferenceInputDataSourceResponse();
        }

        public Builder(BlobReferenceInputDataSourceResponse defaults) {
            $ = new BlobReferenceInputDataSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param container The name of a container within the associated Storage account. This container contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder container(@Nullable String container) {
            $.container = container;
            return this;
        }

        /**
         * @param dateFormat The date format. Wherever {date} appears in pathPattern, the value of this property is used as the date format instead.
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(@Nullable String dateFormat) {
            $.dateFormat = dateFormat;
            return this;
        }

        /**
         * @param pathPattern The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation and example.
         * 
         * @return builder
         * 
         */
        public Builder pathPattern(@Nullable String pathPattern) {
            $.pathPattern = pathPattern;
            return this;
        }

        /**
         * @param storageAccounts A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(@Nullable List<StorageAccountResponse> storageAccounts) {
            $.storageAccounts = storageAccounts;
            return this;
        }

        /**
         * @param storageAccounts A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(StorageAccountResponse... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
        }

        /**
         * @param timeFormat The time format. Wherever {time} appears in pathPattern, the value of this property is used as the time format instead.
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(@Nullable String timeFormat) {
            $.timeFormat = timeFormat;
            return this;
        }

        /**
         * @param type Indicates the type of input data source containing reference data. Required on PUT (CreateOrReplace) requests.
         * Expected value is &#39;Microsoft.Storage/Blob&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public BlobReferenceInputDataSourceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
