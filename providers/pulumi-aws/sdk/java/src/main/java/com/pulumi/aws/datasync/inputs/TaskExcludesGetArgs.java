// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskExcludesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskExcludesGetArgs Empty = new TaskExcludesGetArgs();

    /**
     * The type of filter rule to apply. Valid values: `SIMPLE_PATTERN`.
     * 
     */
    @Import(name="filterType")
    private @Nullable Output<String> filterType;

    /**
     * @return The type of filter rule to apply. Valid values: `SIMPLE_PATTERN`.
     * 
     */
    public Optional<Output<String>> filterType() {
        return Optional.ofNullable(this.filterType);
    }

    /**
     * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by &#34;|&#34; (that is, a pipe), for example: `/folder1|/folder2`
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return A single filter string that consists of the patterns to include or exclude. The patterns are delimited by &#34;|&#34; (that is, a pipe), for example: `/folder1|/folder2`
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private TaskExcludesGetArgs() {}

    private TaskExcludesGetArgs(TaskExcludesGetArgs $) {
        this.filterType = $.filterType;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskExcludesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskExcludesGetArgs $;

        public Builder() {
            $ = new TaskExcludesGetArgs();
        }

        public Builder(TaskExcludesGetArgs defaults) {
            $ = new TaskExcludesGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filterType The type of filter rule to apply. Valid values: `SIMPLE_PATTERN`.
         * 
         * @return builder
         * 
         */
        public Builder filterType(@Nullable Output<String> filterType) {
            $.filterType = filterType;
            return this;
        }

        /**
         * @param filterType The type of filter rule to apply. Valid values: `SIMPLE_PATTERN`.
         * 
         * @return builder
         * 
         */
        public Builder filterType(String filterType) {
            return filterType(Output.of(filterType));
        }

        /**
         * @param value A single filter string that consists of the patterns to include or exclude. The patterns are delimited by &#34;|&#34; (that is, a pipe), for example: `/folder1|/folder2`
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value A single filter string that consists of the patterns to include or exclude. The patterns are delimited by &#34;|&#34; (that is, a pipe), for example: `/folder1|/folder2`
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TaskExcludesGetArgs build() {
            return $;
        }
    }

}
