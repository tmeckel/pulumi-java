// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * EphemeralStorageConfig contains configuration for the ephemeral storage filesystem.
 * 
 */
public final class EphemeralStorageConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EphemeralStorageConfigArgs Empty = new EphemeralStorageConfigArgs();

    /**
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    @Import(name="localSsdCount")
    private @Nullable Output<Integer> localSsdCount;

    /**
     * @return Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    public Optional<Output<Integer>> localSsdCount() {
        return Optional.ofNullable(this.localSsdCount);
    }

    private EphemeralStorageConfigArgs() {}

    private EphemeralStorageConfigArgs(EphemeralStorageConfigArgs $) {
        this.localSsdCount = $.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EphemeralStorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EphemeralStorageConfigArgs $;

        public Builder() {
            $ = new EphemeralStorageConfigArgs();
        }

        public Builder(EphemeralStorageConfigArgs defaults) {
            $ = new EphemeralStorageConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localSsdCount Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
         * 
         * @return builder
         * 
         */
        public Builder localSsdCount(@Nullable Output<Integer> localSsdCount) {
            $.localSsdCount = localSsdCount;
            return this;
        }

        /**
         * @param localSsdCount Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
         * 
         * @return builder
         * 
         */
        public Builder localSsdCount(Integer localSsdCount) {
            return localSsdCount(Output.of(localSsdCount));
        }

        public EphemeralStorageConfigArgs build() {
            return $;
        }
    }

}
