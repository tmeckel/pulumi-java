// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.azurenative.streamanalytics.inputs.StorageAccountArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a blob input data source that contains stream data.
 * 
 */
public final class BlobStreamInputDataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlobStreamInputDataSourceArgs Empty = new BlobStreamInputDataSourceArgs();

    /**
     * The name of a container within the associated Storage account. This container contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="container")
    private @Nullable Output<String> container;

    /**
     * @return The name of a container within the associated Storage account. This container contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Output<String>> container() {
        return Optional.ofNullable(this.container);
    }

    /**
     * The date format. Wherever {date} appears in pathPattern, the value of this property is used as the date format instead.
     * 
     */
    @Import(name="dateFormat")
    private @Nullable Output<String> dateFormat;

    /**
     * @return The date format. Wherever {date} appears in pathPattern, the value of this property is used as the date format instead.
     * 
     */
    public Optional<Output<String>> dateFormat() {
        return Optional.ofNullable(this.dateFormat);
    }

    /**
     * The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation and example.
     * 
     */
    @Import(name="pathPattern")
    private @Nullable Output<String> pathPattern;

    /**
     * @return The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation and example.
     * 
     */
    public Optional<Output<String>> pathPattern() {
        return Optional.ofNullable(this.pathPattern);
    }

    /**
     * The partition count of the blob input data source. Range 1 - 256.
     * 
     */
    @Import(name="sourcePartitionCount")
    private @Nullable Output<Integer> sourcePartitionCount;

    /**
     * @return The partition count of the blob input data source. Range 1 - 256.
     * 
     */
    public Optional<Output<Integer>> sourcePartitionCount() {
        return Optional.ofNullable(this.sourcePartitionCount);
    }

    /**
     * A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="storageAccounts")
    private @Nullable Output<List<StorageAccountArgs>> storageAccounts;

    /**
     * @return A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Output<List<StorageAccountArgs>>> storageAccounts() {
        return Optional.ofNullable(this.storageAccounts);
    }

    /**
     * The time format. Wherever {time} appears in pathPattern, the value of this property is used as the time format instead.
     * 
     */
    @Import(name="timeFormat")
    private @Nullable Output<String> timeFormat;

    /**
     * @return The time format. Wherever {time} appears in pathPattern, the value of this property is used as the time format instead.
     * 
     */
    public Optional<Output<String>> timeFormat() {
        return Optional.ofNullable(this.timeFormat);
    }

    /**
     * Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.Storage/Blob&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.Storage/Blob&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private BlobStreamInputDataSourceArgs() {}

    private BlobStreamInputDataSourceArgs(BlobStreamInputDataSourceArgs $) {
        this.container = $.container;
        this.dateFormat = $.dateFormat;
        this.pathPattern = $.pathPattern;
        this.sourcePartitionCount = $.sourcePartitionCount;
        this.storageAccounts = $.storageAccounts;
        this.timeFormat = $.timeFormat;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobStreamInputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobStreamInputDataSourceArgs $;

        public Builder() {
            $ = new BlobStreamInputDataSourceArgs();
        }

        public Builder(BlobStreamInputDataSourceArgs defaults) {
            $ = new BlobStreamInputDataSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param container The name of a container within the associated Storage account. This container contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder container(@Nullable Output<String> container) {
            $.container = container;
            return this;
        }

        /**
         * @param container The name of a container within the associated Storage account. This container contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder container(String container) {
            return container(Output.of(container));
        }

        /**
         * @param dateFormat The date format. Wherever {date} appears in pathPattern, the value of this property is used as the date format instead.
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(@Nullable Output<String> dateFormat) {
            $.dateFormat = dateFormat;
            return this;
        }

        /**
         * @param dateFormat The date format. Wherever {date} appears in pathPattern, the value of this property is used as the date format instead.
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(String dateFormat) {
            return dateFormat(Output.of(dateFormat));
        }

        /**
         * @param pathPattern The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation and example.
         * 
         * @return builder
         * 
         */
        public Builder pathPattern(@Nullable Output<String> pathPattern) {
            $.pathPattern = pathPattern;
            return this;
        }

        /**
         * @param pathPattern The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation and example.
         * 
         * @return builder
         * 
         */
        public Builder pathPattern(String pathPattern) {
            return pathPattern(Output.of(pathPattern));
        }

        /**
         * @param sourcePartitionCount The partition count of the blob input data source. Range 1 - 256.
         * 
         * @return builder
         * 
         */
        public Builder sourcePartitionCount(@Nullable Output<Integer> sourcePartitionCount) {
            $.sourcePartitionCount = sourcePartitionCount;
            return this;
        }

        /**
         * @param sourcePartitionCount The partition count of the blob input data source. Range 1 - 256.
         * 
         * @return builder
         * 
         */
        public Builder sourcePartitionCount(Integer sourcePartitionCount) {
            return sourcePartitionCount(Output.of(sourcePartitionCount));
        }

        /**
         * @param storageAccounts A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(@Nullable Output<List<StorageAccountArgs>> storageAccounts) {
            $.storageAccounts = storageAccounts;
            return this;
        }

        /**
         * @param storageAccounts A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(List<StorageAccountArgs> storageAccounts) {
            return storageAccounts(Output.of(storageAccounts));
        }

        /**
         * @param storageAccounts A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(StorageAccountArgs... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
        }

        /**
         * @param timeFormat The time format. Wherever {time} appears in pathPattern, the value of this property is used as the time format instead.
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(@Nullable Output<String> timeFormat) {
            $.timeFormat = timeFormat;
            return this;
        }

        /**
         * @param timeFormat The time format. Wherever {time} appears in pathPattern, the value of this property is used as the time format instead.
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(String timeFormat) {
            return timeFormat(Output.of(timeFormat));
        }

        /**
         * @param type Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
         * Expected value is &#39;Microsoft.Storage/Blob&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
         * Expected value is &#39;Microsoft.Storage/Blob&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public BlobStreamInputDataSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
