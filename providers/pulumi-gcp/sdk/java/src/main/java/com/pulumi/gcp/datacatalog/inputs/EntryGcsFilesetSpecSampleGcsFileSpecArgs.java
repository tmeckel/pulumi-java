// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntryGcsFilesetSpecSampleGcsFileSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntryGcsFilesetSpecSampleGcsFileSpecArgs Empty = new EntryGcsFilesetSpecSampleGcsFileSpecArgs();

    /**
     * - 
     * The full file path
     * 
     */
    @Import(name="filePath")
    private @Nullable Output<String> filePath;

    /**
     * @return -
     * The full file path
     * 
     */
    public Optional<Output<String>> filePath() {
        return Optional.ofNullable(this.filePath);
    }

    /**
     * - 
     * The size of the file, in bytes.
     * 
     */
    @Import(name="sizeBytes")
    private @Nullable Output<Integer> sizeBytes;

    /**
     * @return -
     * The size of the file, in bytes.
     * 
     */
    public Optional<Output<Integer>> sizeBytes() {
        return Optional.ofNullable(this.sizeBytes);
    }

    private EntryGcsFilesetSpecSampleGcsFileSpecArgs() {}

    private EntryGcsFilesetSpecSampleGcsFileSpecArgs(EntryGcsFilesetSpecSampleGcsFileSpecArgs $) {
        this.filePath = $.filePath;
        this.sizeBytes = $.sizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntryGcsFilesetSpecSampleGcsFileSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntryGcsFilesetSpecSampleGcsFileSpecArgs $;

        public Builder() {
            $ = new EntryGcsFilesetSpecSampleGcsFileSpecArgs();
        }

        public Builder(EntryGcsFilesetSpecSampleGcsFileSpecArgs defaults) {
            $ = new EntryGcsFilesetSpecSampleGcsFileSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filePath -
         * The full file path
         * 
         * @return builder
         * 
         */
        public Builder filePath(@Nullable Output<String> filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param filePath -
         * The full file path
         * 
         * @return builder
         * 
         */
        public Builder filePath(String filePath) {
            return filePath(Output.of(filePath));
        }

        /**
         * @param sizeBytes -
         * The size of the file, in bytes.
         * 
         * @return builder
         * 
         */
        public Builder sizeBytes(@Nullable Output<Integer> sizeBytes) {
            $.sizeBytes = sizeBytes;
            return this;
        }

        /**
         * @param sizeBytes -
         * The size of the file, in bytes.
         * 
         * @return builder
         * 
         */
        public Builder sizeBytes(Integer sizeBytes) {
            return sizeBytes(Output.of(sizeBytes));
        }

        public EntryGcsFilesetSpecSampleGcsFileSpecArgs build() {
            return $;
        }
    }

}
