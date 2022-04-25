// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3;

import com.pulumi.awsnative.s3.inputs.StorageLensConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.StorageLensTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StorageLensArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageLensArgs Empty = new StorageLensArgs();

    @Import(name="storageLensConfiguration", required=true)
    private Output<StorageLensConfigurationArgs> storageLensConfiguration;

    public Output<StorageLensConfigurationArgs> storageLensConfiguration() {
        return this.storageLensConfiguration;
    }

    /**
     * A set of tags (key-value pairs) for this Amazon S3 Storage Lens configuration.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<StorageLensTagArgs>> tags;

    /**
     * @return A set of tags (key-value pairs) for this Amazon S3 Storage Lens configuration.
     * 
     */
    public Optional<Output<List<StorageLensTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private StorageLensArgs() {}

    private StorageLensArgs(StorageLensArgs $) {
        this.storageLensConfiguration = $.storageLensConfiguration;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageLensArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageLensArgs $;

        public Builder() {
            $ = new StorageLensArgs();
        }

        public Builder(StorageLensArgs defaults) {
            $ = new StorageLensArgs(Objects.requireNonNull(defaults));
        }

        public Builder storageLensConfiguration(Output<StorageLensConfigurationArgs> storageLensConfiguration) {
            $.storageLensConfiguration = storageLensConfiguration;
            return this;
        }

        public Builder storageLensConfiguration(StorageLensConfigurationArgs storageLensConfiguration) {
            return storageLensConfiguration(Output.of(storageLensConfiguration));
        }

        /**
         * @param tags A set of tags (key-value pairs) for this Amazon S3 Storage Lens configuration.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<StorageLensTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A set of tags (key-value pairs) for this Amazon S3 Storage Lens configuration.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<StorageLensTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A set of tags (key-value pairs) for this Amazon S3 Storage Lens configuration.
         * 
         * @return builder
         * 
         */
        public Builder tags(StorageLensTagArgs... tags) {
            return tags(List.of(tags));
        }

        public StorageLensArgs build() {
            $.storageLensConfiguration = Objects.requireNonNull($.storageLensConfiguration, "expected parameter 'storageLensConfiguration' to be non-null");
            return $;
        }
    }

}
