// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.enums.ReleaseChannelChannel;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ReleaseChannel indicates which release channel a cluster is subscribed to. Release channels are arranged in order of risk. When a cluster is subscribed to a release channel, Google maintains both the master version and the node version. Node auto-upgrade defaults to true and cannot be disabled.
 * 
 */
public final class ReleaseChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReleaseChannelArgs Empty = new ReleaseChannelArgs();

    /**
     * channel specifies which release channel the cluster is subscribed to.
     * 
     */
    @InputImport(name="channel")
    private final @Nullable Input<ReleaseChannelChannel> channel;

    public Input<ReleaseChannelChannel> getChannel() {
        return this.channel == null ? Input.empty() : this.channel;
    }

    public ReleaseChannelArgs(@Nullable Input<ReleaseChannelChannel> channel) {
        this.channel = channel;
    }

    private ReleaseChannelArgs() {
        this.channel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReleaseChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ReleaseChannelChannel> channel;

        public Builder() {
    	      // Empty
        }

        public Builder(ReleaseChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
        }

        public Builder setChannel(@Nullable Input<ReleaseChannelChannel> channel) {
            this.channel = channel;
            return this;
        }

        public Builder setChannel(@Nullable ReleaseChannelChannel channel) {
            this.channel = Input.ofNullable(channel);
            return this;
        }

        public ReleaseChannelArgs build() {
            return new ReleaseChannelArgs(channel);
        }
    }
}
