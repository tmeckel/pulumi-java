// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codepipeline.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PipelineArtifactStoreEncryptionKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineArtifactStoreEncryptionKeyArgs Empty = new PipelineArtifactStoreEncryptionKeyArgs();

    /**
     * The KMS key ARN or ID
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The KMS key ARN or ID
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The type of key; currently only `KMS` is supported
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of key; currently only `KMS` is supported
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private PipelineArtifactStoreEncryptionKeyArgs() {}

    private PipelineArtifactStoreEncryptionKeyArgs(PipelineArtifactStoreEncryptionKeyArgs $) {
        this.id = $.id;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineArtifactStoreEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineArtifactStoreEncryptionKeyArgs $;

        public Builder() {
            $ = new PipelineArtifactStoreEncryptionKeyArgs();
        }

        public Builder(PipelineArtifactStoreEncryptionKeyArgs defaults) {
            $ = new PipelineArtifactStoreEncryptionKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The KMS key ARN or ID
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The KMS key ARN or ID
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param type The type of key; currently only `KMS` is supported
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of key; currently only `KMS` is supported
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PipelineArtifactStoreEncryptionKeyArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
