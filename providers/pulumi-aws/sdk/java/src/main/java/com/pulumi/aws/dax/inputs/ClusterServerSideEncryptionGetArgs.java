// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dax.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterServerSideEncryptionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterServerSideEncryptionGetArgs Empty = new ClusterServerSideEncryptionGetArgs();

    /**
     * Whether to enable encryption at rest. Defaults to `false`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable encryption at rest. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ClusterServerSideEncryptionGetArgs() {}

    private ClusterServerSideEncryptionGetArgs(ClusterServerSideEncryptionGetArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterServerSideEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterServerSideEncryptionGetArgs $;

        public Builder() {
            $ = new ClusterServerSideEncryptionGetArgs();
        }

        public Builder(ClusterServerSideEncryptionGetArgs defaults) {
            $ = new ClusterServerSideEncryptionGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to enable encryption at rest. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable encryption at rest. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterServerSideEncryptionGetArgs build() {
            return $;
        }
    }

}
