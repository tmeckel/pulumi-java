// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.metastore_v1alpha.inputs.ConsumerArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network configuration for the Dataproc Metastore service.
 * 
 */
public final class NetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkConfigArgs Empty = new NetworkConfigArgs();

    /**
     * Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
     * 
     */
    @Import(name="consumers")
    private @Nullable Output<List<ConsumerArgs>> consumers;

    /**
     * @return Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
     * 
     */
    public Optional<Output<List<ConsumerArgs>>> consumers() {
        return Optional.ofNullable(this.consumers);
    }

    private NetworkConfigArgs() {}

    private NetworkConfigArgs(NetworkConfigArgs $) {
        this.consumers = $.consumers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkConfigArgs $;

        public Builder() {
            $ = new NetworkConfigArgs();
        }

        public Builder(NetworkConfigArgs defaults) {
            $ = new NetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumers Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
         * 
         * @return builder
         * 
         */
        public Builder consumers(@Nullable Output<List<ConsumerArgs>> consumers) {
            $.consumers = consumers;
            return this;
        }

        /**
         * @param consumers Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
         * 
         * @return builder
         * 
         */
        public Builder consumers(List<ConsumerArgs> consumers) {
            return consumers(Output.of(consumers));
        }

        /**
         * @param consumers Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
         * 
         * @return builder
         * 
         */
        public Builder consumers(ConsumerArgs... consumers) {
            return consumers(List.of(consumers));
        }

        public NetworkConfigArgs build() {
            return $;
        }
    }

}
