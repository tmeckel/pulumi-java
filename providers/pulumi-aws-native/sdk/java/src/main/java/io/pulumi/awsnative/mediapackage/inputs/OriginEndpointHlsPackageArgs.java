// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointAdsOnDeliveryRestrictions;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsPackageAdMarkers;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsPackageAdTriggersItem;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsPackagePlaylistType;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointHlsEncryptionArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointStreamSelectionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An HTTP Live Streaming (HLS) packaging configuration.
 * 
 */
public final class OriginEndpointHlsPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointHlsPackageArgs Empty = new OriginEndpointHlsPackageArgs();

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source. "DATERANGE" inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
     * 
     */
    @Import(name="adMarkers")
      private final @Nullable Output<OriginEndpointHlsPackageAdMarkers> adMarkers;

    public Output<OriginEndpointHlsPackageAdMarkers> getAdMarkers() {
        return this.adMarkers == null ? Codegen.empty() : this.adMarkers;
    }

    /**
     * A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
     */
    @Import(name="adTriggers")
      private final @Nullable Output<List<OriginEndpointHlsPackageAdTriggersItem>> adTriggers;

    public Output<List<OriginEndpointHlsPackageAdTriggersItem>> getAdTriggers() {
        return this.adTriggers == null ? Codegen.empty() : this.adTriggers;
    }

    @Import(name="adsOnDeliveryRestrictions")
      private final @Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions;

    public Output<OriginEndpointAdsOnDeliveryRestrictions> getAdsOnDeliveryRestrictions() {
        return this.adsOnDeliveryRestrictions == null ? Codegen.empty() : this.adsOnDeliveryRestrictions;
    }

    @Import(name="encryption")
      private final @Nullable Output<OriginEndpointHlsEncryptionArgs> encryption;

    public Output<OriginEndpointHlsEncryptionArgs> getEncryption() {
        return this.encryption == null ? Codegen.empty() : this.encryption;
    }

    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     */
    @Import(name="includeIframeOnlyStream")
      private final @Nullable Output<Boolean> includeIframeOnlyStream;

    public Output<Boolean> getIncludeIframeOnlyStream() {
        return this.includeIframeOnlyStream == null ? Codegen.empty() : this.includeIframeOnlyStream;
    }

    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     */
    @Import(name="playlistType")
      private final @Nullable Output<OriginEndpointHlsPackagePlaylistType> playlistType;

    public Output<OriginEndpointHlsPackagePlaylistType> getPlaylistType() {
        return this.playlistType == null ? Codegen.empty() : this.playlistType;
    }

    /**
     * Time window (in seconds) contained in each parent manifest.
     * 
     */
    @Import(name="playlistWindowSeconds")
      private final @Nullable Output<Integer> playlistWindowSeconds;

    public Output<Integer> getPlaylistWindowSeconds() {
        return this.playlistWindowSeconds == null ? Codegen.empty() : this.playlistWindowSeconds;
    }

    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     */
    @Import(name="programDateTimeIntervalSeconds")
      private final @Nullable Output<Integer> programDateTimeIntervalSeconds;

    public Output<Integer> getProgramDateTimeIntervalSeconds() {
        return this.programDateTimeIntervalSeconds == null ? Codegen.empty() : this.programDateTimeIntervalSeconds;
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source fragment duration.
     * 
     */
    @Import(name="segmentDurationSeconds")
      private final @Nullable Output<Integer> segmentDurationSeconds;

    public Output<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Codegen.empty() : this.segmentDurationSeconds;
    }

    @Import(name="streamSelection")
      private final @Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection;

    public Output<OriginEndpointStreamSelectionArgs> getStreamSelection() {
        return this.streamSelection == null ? Codegen.empty() : this.streamSelection;
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     */
    @Import(name="useAudioRenditionGroup")
      private final @Nullable Output<Boolean> useAudioRenditionGroup;

    public Output<Boolean> getUseAudioRenditionGroup() {
        return this.useAudioRenditionGroup == null ? Codegen.empty() : this.useAudioRenditionGroup;
    }

    public OriginEndpointHlsPackageArgs(
        @Nullable Output<OriginEndpointHlsPackageAdMarkers> adMarkers,
        @Nullable Output<List<OriginEndpointHlsPackageAdTriggersItem>> adTriggers,
        @Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions,
        @Nullable Output<OriginEndpointHlsEncryptionArgs> encryption,
        @Nullable Output<Boolean> includeIframeOnlyStream,
        @Nullable Output<OriginEndpointHlsPackagePlaylistType> playlistType,
        @Nullable Output<Integer> playlistWindowSeconds,
        @Nullable Output<Integer> programDateTimeIntervalSeconds,
        @Nullable Output<Integer> segmentDurationSeconds,
        @Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection,
        @Nullable Output<Boolean> useAudioRenditionGroup) {
        this.adMarkers = adMarkers;
        this.adTriggers = adTriggers;
        this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
        this.encryption = encryption;
        this.includeIframeOnlyStream = includeIframeOnlyStream;
        this.playlistType = playlistType;
        this.playlistWindowSeconds = playlistWindowSeconds;
        this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.streamSelection = streamSelection;
        this.useAudioRenditionGroup = useAudioRenditionGroup;
    }

    private OriginEndpointHlsPackageArgs() {
        this.adMarkers = Codegen.empty();
        this.adTriggers = Codegen.empty();
        this.adsOnDeliveryRestrictions = Codegen.empty();
        this.encryption = Codegen.empty();
        this.includeIframeOnlyStream = Codegen.empty();
        this.playlistType = Codegen.empty();
        this.playlistWindowSeconds = Codegen.empty();
        this.programDateTimeIntervalSeconds = Codegen.empty();
        this.segmentDurationSeconds = Codegen.empty();
        this.streamSelection = Codegen.empty();
        this.useAudioRenditionGroup = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointHlsPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OriginEndpointHlsPackageAdMarkers> adMarkers;
        private @Nullable Output<List<OriginEndpointHlsPackageAdTriggersItem>> adTriggers;
        private @Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions;
        private @Nullable Output<OriginEndpointHlsEncryptionArgs> encryption;
        private @Nullable Output<Boolean> includeIframeOnlyStream;
        private @Nullable Output<OriginEndpointHlsPackagePlaylistType> playlistType;
        private @Nullable Output<Integer> playlistWindowSeconds;
        private @Nullable Output<Integer> programDateTimeIntervalSeconds;
        private @Nullable Output<Integer> segmentDurationSeconds;
        private @Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection;
        private @Nullable Output<Boolean> useAudioRenditionGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointHlsPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adMarkers = defaults.adMarkers;
    	      this.adTriggers = defaults.adTriggers;
    	      this.adsOnDeliveryRestrictions = defaults.adsOnDeliveryRestrictions;
    	      this.encryption = defaults.encryption;
    	      this.includeIframeOnlyStream = defaults.includeIframeOnlyStream;
    	      this.playlistType = defaults.playlistType;
    	      this.playlistWindowSeconds = defaults.playlistWindowSeconds;
    	      this.programDateTimeIntervalSeconds = defaults.programDateTimeIntervalSeconds;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.streamSelection = defaults.streamSelection;
    	      this.useAudioRenditionGroup = defaults.useAudioRenditionGroup;
        }

        public Builder adMarkers(@Nullable Output<OriginEndpointHlsPackageAdMarkers> adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }
        public Builder adMarkers(@Nullable OriginEndpointHlsPackageAdMarkers adMarkers) {
            this.adMarkers = Codegen.ofNullable(adMarkers);
            return this;
        }
        public Builder adTriggers(@Nullable Output<List<OriginEndpointHlsPackageAdTriggersItem>> adTriggers) {
            this.adTriggers = adTriggers;
            return this;
        }
        public Builder adTriggers(@Nullable List<OriginEndpointHlsPackageAdTriggersItem> adTriggers) {
            this.adTriggers = Codegen.ofNullable(adTriggers);
            return this;
        }
        public Builder adTriggers(OriginEndpointHlsPackageAdTriggersItem... adTriggers) {
            return adTriggers(List.of(adTriggers));
        }
        public Builder adsOnDeliveryRestrictions(@Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
            return this;
        }
        public Builder adsOnDeliveryRestrictions(@Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = Codegen.ofNullable(adsOnDeliveryRestrictions);
            return this;
        }
        public Builder encryption(@Nullable Output<OriginEndpointHlsEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable OriginEndpointHlsEncryptionArgs encryption) {
            this.encryption = Codegen.ofNullable(encryption);
            return this;
        }
        public Builder includeIframeOnlyStream(@Nullable Output<Boolean> includeIframeOnlyStream) {
            this.includeIframeOnlyStream = includeIframeOnlyStream;
            return this;
        }
        public Builder includeIframeOnlyStream(@Nullable Boolean includeIframeOnlyStream) {
            this.includeIframeOnlyStream = Codegen.ofNullable(includeIframeOnlyStream);
            return this;
        }
        public Builder playlistType(@Nullable Output<OriginEndpointHlsPackagePlaylistType> playlistType) {
            this.playlistType = playlistType;
            return this;
        }
        public Builder playlistType(@Nullable OriginEndpointHlsPackagePlaylistType playlistType) {
            this.playlistType = Codegen.ofNullable(playlistType);
            return this;
        }
        public Builder playlistWindowSeconds(@Nullable Output<Integer> playlistWindowSeconds) {
            this.playlistWindowSeconds = playlistWindowSeconds;
            return this;
        }
        public Builder playlistWindowSeconds(@Nullable Integer playlistWindowSeconds) {
            this.playlistWindowSeconds = Codegen.ofNullable(playlistWindowSeconds);
            return this;
        }
        public Builder programDateTimeIntervalSeconds(@Nullable Output<Integer> programDateTimeIntervalSeconds) {
            this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
            return this;
        }
        public Builder programDateTimeIntervalSeconds(@Nullable Integer programDateTimeIntervalSeconds) {
            this.programDateTimeIntervalSeconds = Codegen.ofNullable(programDateTimeIntervalSeconds);
            return this;
        }
        public Builder segmentDurationSeconds(@Nullable Output<Integer> segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }
        public Builder segmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = Codegen.ofNullable(segmentDurationSeconds);
            return this;
        }
        public Builder streamSelection(@Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }
        public Builder streamSelection(@Nullable OriginEndpointStreamSelectionArgs streamSelection) {
            this.streamSelection = Codegen.ofNullable(streamSelection);
            return this;
        }
        public Builder useAudioRenditionGroup(@Nullable Output<Boolean> useAudioRenditionGroup) {
            this.useAudioRenditionGroup = useAudioRenditionGroup;
            return this;
        }
        public Builder useAudioRenditionGroup(@Nullable Boolean useAudioRenditionGroup) {
            this.useAudioRenditionGroup = Codegen.ofNullable(useAudioRenditionGroup);
            return this;
        }        public OriginEndpointHlsPackageArgs build() {
            return new OriginEndpointHlsPackageArgs(adMarkers, adTriggers, adsOnDeliveryRestrictions, encryption, includeIframeOnlyStream, playlistType, playlistWindowSeconds, programDateTimeIntervalSeconds, segmentDurationSeconds, streamSelection, useAudioRenditionGroup);
        }
    }
}
