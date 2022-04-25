// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Reference to an asset via its path in a job output.
 * 
 */
public final class OutputPathAssetReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutputPathAssetReferenceArgs Empty = new OutputPathAssetReferenceArgs();

    /**
     * ARM resource ID of the job.
     * 
     */
    @Import(name="jobId")
    private @Nullable Output<String> jobId;

    /**
     * @return ARM resource ID of the job.
     * 
     */
    public Optional<Output<String>> jobId() {
        return Optional.ofNullable(this.jobId);
    }

    /**
     * The path of the file/directory in the job output.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path of the file/directory in the job output.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Enum to determine which reference method to use for an asset.
     * Expected value is &#39;OutputPath&#39;.
     * 
     */
    @Import(name="referenceType", required=true)
    private Output<String> referenceType;

    /**
     * @return Enum to determine which reference method to use for an asset.
     * Expected value is &#39;OutputPath&#39;.
     * 
     */
    public Output<String> referenceType() {
        return this.referenceType;
    }

    private OutputPathAssetReferenceArgs() {}

    private OutputPathAssetReferenceArgs(OutputPathAssetReferenceArgs $) {
        this.jobId = $.jobId;
        this.path = $.path;
        this.referenceType = $.referenceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputPathAssetReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputPathAssetReferenceArgs $;

        public Builder() {
            $ = new OutputPathAssetReferenceArgs();
        }

        public Builder(OutputPathAssetReferenceArgs defaults) {
            $ = new OutputPathAssetReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobId ARM resource ID of the job.
         * 
         * @return builder
         * 
         */
        public Builder jobId(@Nullable Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobId ARM resource ID of the job.
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        /**
         * @param path The path of the file/directory in the job output.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path of the file/directory in the job output.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param referenceType Enum to determine which reference method to use for an asset.
         * Expected value is &#39;OutputPath&#39;.
         * 
         * @return builder
         * 
         */
        public Builder referenceType(Output<String> referenceType) {
            $.referenceType = referenceType;
            return this;
        }

        /**
         * @param referenceType Enum to determine which reference method to use for an asset.
         * Expected value is &#39;OutputPath&#39;.
         * 
         * @return builder
         * 
         */
        public Builder referenceType(String referenceType) {
            return referenceType(Output.of(referenceType));
        }

        public OutputPathAssetReferenceArgs build() {
            $.referenceType = Codegen.stringProp("referenceType").output().arg($.referenceType).require();
            return $;
        }
    }

}
