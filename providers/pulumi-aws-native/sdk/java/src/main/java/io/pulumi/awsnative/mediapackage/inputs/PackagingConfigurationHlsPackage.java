// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationHlsEncryption;
import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationHlsManifest;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An HTTP Live Streaming (HLS) packaging configuration.
 * 
 */
public final class PackagingConfigurationHlsPackage extends io.pulumi.resources.InvokeArgs {

    public static final PackagingConfigurationHlsPackage Empty = new PackagingConfigurationHlsPackage();

    @InputImport(name="encryption")
      private final @Nullable PackagingConfigurationHlsEncryption encryption;

    public Optional<PackagingConfigurationHlsEncryption> getEncryption() {
        return this.encryption == null ? Optional.empty() : Optional.ofNullable(this.encryption);
    }

    /**
     * A list of HLS manifest configurations.
     * 
     */
    @InputImport(name="hlsManifests", required=true)
      private final List<PackagingConfigurationHlsManifest> hlsManifests;

    public List<PackagingConfigurationHlsManifest> getHlsManifests() {
        return this.hlsManifests;
    }

    @InputImport(name="segmentDurationSeconds")
      private final @Nullable Integer segmentDurationSeconds;

    public Optional<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Optional.empty() : Optional.ofNullable(this.segmentDurationSeconds);
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     */
    @InputImport(name="useAudioRenditionGroup")
      private final @Nullable Boolean useAudioRenditionGroup;

    public Optional<Boolean> getUseAudioRenditionGroup() {
        return this.useAudioRenditionGroup == null ? Optional.empty() : Optional.ofNullable(this.useAudioRenditionGroup);
    }

    public PackagingConfigurationHlsPackage(
        @Nullable PackagingConfigurationHlsEncryption encryption,
        List<PackagingConfigurationHlsManifest> hlsManifests,
        @Nullable Integer segmentDurationSeconds,
        @Nullable Boolean useAudioRenditionGroup) {
        this.encryption = encryption;
        this.hlsManifests = Objects.requireNonNull(hlsManifests, "expected parameter 'hlsManifests' to be non-null");
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.useAudioRenditionGroup = useAudioRenditionGroup;
    }

    private PackagingConfigurationHlsPackage() {
        this.encryption = null;
        this.hlsManifests = List.of();
        this.segmentDurationSeconds = null;
        this.useAudioRenditionGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationHlsPackage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PackagingConfigurationHlsEncryption encryption;
        private List<PackagingConfigurationHlsManifest> hlsManifests;
        private @Nullable Integer segmentDurationSeconds;
        private @Nullable Boolean useAudioRenditionGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationHlsPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.hlsManifests = defaults.hlsManifests;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.useAudioRenditionGroup = defaults.useAudioRenditionGroup;
        }

        public Builder encryption(@Nullable PackagingConfigurationHlsEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder hlsManifests(List<PackagingConfigurationHlsManifest> hlsManifests) {
            this.hlsManifests = Objects.requireNonNull(hlsManifests);
            return this;
        }

        public Builder segmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }

        public Builder useAudioRenditionGroup(@Nullable Boolean useAudioRenditionGroup) {
            this.useAudioRenditionGroup = useAudioRenditionGroup;
            return this;
        }
        public PackagingConfigurationHlsPackage build() {
            return new PackagingConfigurationHlsPackage(encryption, hlsManifests, segmentDurationSeconds, useAudioRenditionGroup);
        }
    }
}
