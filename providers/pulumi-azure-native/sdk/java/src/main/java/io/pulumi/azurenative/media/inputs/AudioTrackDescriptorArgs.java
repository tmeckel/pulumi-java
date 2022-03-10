// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.ChannelMapping;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A TrackSelection to select audio tracks.
 * 
 */
public final class AudioTrackDescriptorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AudioTrackDescriptorArgs Empty = new AudioTrackDescriptorArgs();

    /**
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     * 
     */
    @InputImport(name="channelMapping")
      private final @Nullable Input<Either<String,ChannelMapping>> channelMapping;

    public Input<Either<String,ChannelMapping>> getChannelMapping() {
        return this.channelMapping == null ? Input.empty() : this.channelMapping;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AudioTrackDescriptor'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public AudioTrackDescriptorArgs(
        @Nullable Input<Either<String,ChannelMapping>> channelMapping,
        Input<String> odataType) {
        this.channelMapping = channelMapping;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private AudioTrackDescriptorArgs() {
        this.channelMapping = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioTrackDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ChannelMapping>> channelMapping;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioTrackDescriptorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelMapping = defaults.channelMapping;
    	      this.odataType = defaults.odataType;
        }

        public Builder channelMapping(@Nullable Input<Either<String,ChannelMapping>> channelMapping) {
            this.channelMapping = channelMapping;
            return this;
        }

        public Builder channelMapping(@Nullable Either<String,ChannelMapping> channelMapping) {
            this.channelMapping = Input.ofNullable(channelMapping);
            return this;
        }

        public Builder odataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }
        public AudioTrackDescriptorArgs build() {
            return new AudioTrackDescriptorArgs(channelMapping, odataType);
        }
    }
}
