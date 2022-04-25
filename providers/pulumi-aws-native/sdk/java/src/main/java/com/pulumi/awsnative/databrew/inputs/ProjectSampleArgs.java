// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.enums.ProjectSampleType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectSampleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectSampleArgs Empty = new ProjectSampleArgs();

    /**
     * Sample size
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return Sample size
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * Sample type
     * 
     */
    @Import(name="type", required=true)
    private Output<ProjectSampleType> type;

    /**
     * @return Sample type
     * 
     */
    public Output<ProjectSampleType> type() {
        return this.type;
    }

    private ProjectSampleArgs() {}

    private ProjectSampleArgs(ProjectSampleArgs $) {
        this.size = $.size;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectSampleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectSampleArgs $;

        public Builder() {
            $ = new ProjectSampleArgs();
        }

        public Builder(ProjectSampleArgs defaults) {
            $ = new ProjectSampleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param size Sample size
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Sample size
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param type Sample type
         * 
         * @return builder
         * 
         */
        public Builder type(Output<ProjectSampleType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Sample type
         * 
         * @return builder
         * 
         */
        public Builder type(ProjectSampleType type) {
            return type(Output.of(type));
        }

        public ProjectSampleArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
