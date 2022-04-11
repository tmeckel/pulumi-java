// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointAdsOnDeliveryRestrictions;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestAdMarkers;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestAdTriggersItem;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestPlaylistType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A HTTP Live Streaming (HLS) manifest configuration.
 * 
 */
public final class OriginEndpointHlsManifestArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointHlsManifestArgs Empty = new OriginEndpointHlsManifestArgs();

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source. "DATERANGE" inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
     * 
     */
    @Import(name="adMarkers")
      private final @Nullable Output<OriginEndpointHlsManifestAdMarkers> adMarkers;

    public Output<OriginEndpointHlsManifestAdMarkers> getAdMarkers() {
        return this.adMarkers == null ? Codegen.empty() : this.adMarkers;
    }

    /**
     * A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
     */
    @Import(name="adTriggers")
      private final @Nullable Output<List<OriginEndpointHlsManifestAdTriggersItem>> adTriggers;

    public Output<List<OriginEndpointHlsManifestAdTriggersItem>> getAdTriggers() {
        return this.adTriggers == null ? Codegen.empty() : this.adTriggers;
    }

    @Import(name="adsOnDeliveryRestrictions")
      private final @Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions;

    public Output<OriginEndpointAdsOnDeliveryRestrictions> getAdsOnDeliveryRestrictions() {
        return this.adsOnDeliveryRestrictions == null ? Codegen.empty() : this.adsOnDeliveryRestrictions;
    }

    /**
     * The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
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
     * An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
     * 
     */
    @Import(name="manifestName")
      private final @Nullable Output<String> manifestName;

    public Output<String> getManifestName() {
        return this.manifestName == null ? Codegen.empty() : this.manifestName;
    }

    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     */
    @Import(name="playlistType")
      private final @Nullable Output<OriginEndpointHlsManifestPlaylistType> playlistType;

    public Output<OriginEndpointHlsManifestPlaylistType> getPlaylistType() {
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
     * The URL of the packaged OriginEndpoint for consumption.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    public OriginEndpointHlsManifestArgs(
        @Nullable Output<OriginEndpointHlsManifestAdMarkers> adMarkers,
        @Nullable Output<List<OriginEndpointHlsManifestAdTriggersItem>> adTriggers,
        @Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions,
        Output<String> id,
        @Nullable Output<Boolean> includeIframeOnlyStream,
        @Nullable Output<String> manifestName,
        @Nullable Output<OriginEndpointHlsManifestPlaylistType> playlistType,
        @Nullable Output<Integer> playlistWindowSeconds,
        @Nullable Output<Integer> programDateTimeIntervalSeconds,
        @Nullable Output<String> url) {
        this.adMarkers = adMarkers;
        this.adTriggers = adTriggers;
        this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.includeIframeOnlyStream = includeIframeOnlyStream;
        this.manifestName = manifestName;
        this.playlistType = playlistType;
        this.playlistWindowSeconds = playlistWindowSeconds;
        this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
        this.url = url;
    }

    private OriginEndpointHlsManifestArgs() {
        this.adMarkers = Codegen.empty();
        this.adTriggers = Codegen.empty();
        this.adsOnDeliveryRestrictions = Codegen.empty();
        this.id = Codegen.empty();
        this.includeIframeOnlyStream = Codegen.empty();
        this.manifestName = Codegen.empty();
        this.playlistType = Codegen.empty();
        this.playlistWindowSeconds = Codegen.empty();
        this.programDateTimeIntervalSeconds = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointHlsManifestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OriginEndpointHlsManifestAdMarkers> adMarkers;
        private @Nullable Output<List<OriginEndpointHlsManifestAdTriggersItem>> adTriggers;
        private @Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions;
        private Output<String> id;
        private @Nullable Output<Boolean> includeIframeOnlyStream;
        private @Nullable Output<String> manifestName;
        private @Nullable Output<OriginEndpointHlsManifestPlaylistType> playlistType;
        private @Nullable Output<Integer> playlistWindowSeconds;
        private @Nullable Output<Integer> programDateTimeIntervalSeconds;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointHlsManifestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adMarkers = defaults.adMarkers;
    	      this.adTriggers = defaults.adTriggers;
    	      this.adsOnDeliveryRestrictions = defaults.adsOnDeliveryRestrictions;
    	      this.id = defaults.id;
    	      this.includeIframeOnlyStream = defaults.includeIframeOnlyStream;
    	      this.manifestName = defaults.manifestName;
    	      this.playlistType = defaults.playlistType;
    	      this.playlistWindowSeconds = defaults.playlistWindowSeconds;
    	      this.programDateTimeIntervalSeconds = defaults.programDateTimeIntervalSeconds;
    	      this.url = defaults.url;
        }

        public Builder adMarkers(@Nullable Output<OriginEndpointHlsManifestAdMarkers> adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }
        public Builder adMarkers(@Nullable OriginEndpointHlsManifestAdMarkers adMarkers) {
            this.adMarkers = Codegen.ofNullable(adMarkers);
            return this;
        }
        public Builder adTriggers(@Nullable Output<List<OriginEndpointHlsManifestAdTriggersItem>> adTriggers) {
            this.adTriggers = adTriggers;
            return this;
        }
        public Builder adTriggers(@Nullable List<OriginEndpointHlsManifestAdTriggersItem> adTriggers) {
            this.adTriggers = Codegen.ofNullable(adTriggers);
            return this;
        }
        public Builder adTriggers(OriginEndpointHlsManifestAdTriggersItem... adTriggers) {
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
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
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
        public Builder manifestName(@Nullable Output<String> manifestName) {
            this.manifestName = manifestName;
            return this;
        }
        public Builder manifestName(@Nullable String manifestName) {
            this.manifestName = Codegen.ofNullable(manifestName);
            return this;
        }
        public Builder playlistType(@Nullable Output<OriginEndpointHlsManifestPlaylistType> playlistType) {
            this.playlistType = playlistType;
            return this;
        }
        public Builder playlistType(@Nullable OriginEndpointHlsManifestPlaylistType playlistType) {
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
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }        public OriginEndpointHlsManifestArgs build() {
            return new OriginEndpointHlsManifestArgs(adMarkers, adTriggers, adsOnDeliveryRestrictions, id, includeIframeOnlyStream, manifestName, playlistType, playlistWindowSeconds, programDateTimeIntervalSeconds, url);
        }
    }
}
