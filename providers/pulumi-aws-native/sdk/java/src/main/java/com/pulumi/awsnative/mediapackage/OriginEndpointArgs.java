// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage;

import com.pulumi.awsnative.mediapackage.enums.OriginEndpointOrigination;
import com.pulumi.awsnative.mediapackage.inputs.OriginEndpointAuthorizationArgs;
import com.pulumi.awsnative.mediapackage.inputs.OriginEndpointCmafPackageArgs;
import com.pulumi.awsnative.mediapackage.inputs.OriginEndpointDashPackageArgs;
import com.pulumi.awsnative.mediapackage.inputs.OriginEndpointHlsPackageArgs;
import com.pulumi.awsnative.mediapackage.inputs.OriginEndpointMssPackageArgs;
import com.pulumi.awsnative.mediapackage.inputs.OriginEndpointTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OriginEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final OriginEndpointArgs Empty = new OriginEndpointArgs();

    @Import(name="authorization")
    private @Nullable Output<OriginEndpointAuthorizationArgs> authorization;

    public Optional<Output<OriginEndpointAuthorizationArgs>> authorization() {
        return Optional.ofNullable(this.authorization);
    }

    /**
     * The ID of the Channel the OriginEndpoint is associated with.
     * 
     */
    @Import(name="channelId", required=true)
    private Output<String> channelId;

    /**
     * @return The ID of the Channel the OriginEndpoint is associated with.
     * 
     */
    public Output<String> channelId() {
        return this.channelId;
    }

    @Import(name="cmafPackage")
    private @Nullable Output<OriginEndpointCmafPackageArgs> cmafPackage;

    public Optional<Output<OriginEndpointCmafPackageArgs>> cmafPackage() {
        return Optional.ofNullable(this.cmafPackage);
    }

    @Import(name="dashPackage")
    private @Nullable Output<OriginEndpointDashPackageArgs> dashPackage;

    public Optional<Output<OriginEndpointDashPackageArgs>> dashPackage() {
        return Optional.ofNullable(this.dashPackage);
    }

    /**
     * A short text description of the OriginEndpoint.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A short text description of the OriginEndpoint.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="hlsPackage")
    private @Nullable Output<OriginEndpointHlsPackageArgs> hlsPackage;

    public Optional<Output<OriginEndpointHlsPackageArgs>> hlsPackage() {
        return Optional.ofNullable(this.hlsPackage);
    }

    /**
     * A short string appended to the end of the OriginEndpoint URL.
     * 
     */
    @Import(name="manifestName")
    private @Nullable Output<String> manifestName;

    /**
     * @return A short string appended to the end of the OriginEndpoint URL.
     * 
     */
    public Optional<Output<String>> manifestName() {
        return Optional.ofNullable(this.manifestName);
    }

    @Import(name="mssPackage")
    private @Nullable Output<OriginEndpointMssPackageArgs> mssPackage;

    public Optional<Output<OriginEndpointMssPackageArgs>> mssPackage() {
        return Optional.ofNullable(this.mssPackage);
    }

    /**
     * Control whether origination of video is allowed for this OriginEndpoint. If set to ALLOW, the OriginEndpoint may by requested, pursuant to any other form of access control. If set to DENY, the OriginEndpoint may not be requested. This can be helpful for Live to VOD harvesting, or for temporarily disabling origination
     * 
     */
    @Import(name="origination")
    private @Nullable Output<OriginEndpointOrigination> origination;

    /**
     * @return Control whether origination of video is allowed for this OriginEndpoint. If set to ALLOW, the OriginEndpoint may by requested, pursuant to any other form of access control. If set to DENY, the OriginEndpoint may not be requested. This can be helpful for Live to VOD harvesting, or for temporarily disabling origination
     * 
     */
    public Optional<Output<OriginEndpointOrigination>> origination() {
        return Optional.ofNullable(this.origination);
    }

    /**
     * Maximum duration (seconds) of content to retain for startover playback. If not specified, startover playback will be disabled for the OriginEndpoint.
     * 
     */
    @Import(name="startoverWindowSeconds")
    private @Nullable Output<Integer> startoverWindowSeconds;

    /**
     * @return Maximum duration (seconds) of content to retain for startover playback. If not specified, startover playback will be disabled for the OriginEndpoint.
     * 
     */
    public Optional<Output<Integer>> startoverWindowSeconds() {
        return Optional.ofNullable(this.startoverWindowSeconds);
    }

    /**
     * A collection of tags associated with a resource
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<OriginEndpointTagArgs>> tags;

    /**
     * @return A collection of tags associated with a resource
     * 
     */
    public Optional<Output<List<OriginEndpointTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no time delay in effect for the OriginEndpoint.
     * 
     */
    @Import(name="timeDelaySeconds")
    private @Nullable Output<Integer> timeDelaySeconds;

    /**
     * @return Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no time delay in effect for the OriginEndpoint.
     * 
     */
    public Optional<Output<Integer>> timeDelaySeconds() {
        return Optional.ofNullable(this.timeDelaySeconds);
    }

    /**
     * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
     * 
     */
    @Import(name="whitelist")
    private @Nullable Output<List<String>> whitelist;

    /**
     * @return A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
     * 
     */
    public Optional<Output<List<String>>> whitelist() {
        return Optional.ofNullable(this.whitelist);
    }

    private OriginEndpointArgs() {}

    private OriginEndpointArgs(OriginEndpointArgs $) {
        this.authorization = $.authorization;
        this.channelId = $.channelId;
        this.cmafPackage = $.cmafPackage;
        this.dashPackage = $.dashPackage;
        this.description = $.description;
        this.hlsPackage = $.hlsPackage;
        this.manifestName = $.manifestName;
        this.mssPackage = $.mssPackage;
        this.origination = $.origination;
        this.startoverWindowSeconds = $.startoverWindowSeconds;
        this.tags = $.tags;
        this.timeDelaySeconds = $.timeDelaySeconds;
        this.whitelist = $.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginEndpointArgs $;

        public Builder() {
            $ = new OriginEndpointArgs();
        }

        public Builder(OriginEndpointArgs defaults) {
            $ = new OriginEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorization(@Nullable Output<OriginEndpointAuthorizationArgs> authorization) {
            $.authorization = authorization;
            return this;
        }

        public Builder authorization(OriginEndpointAuthorizationArgs authorization) {
            return authorization(Output.of(authorization));
        }

        /**
         * @param channelId The ID of the Channel the OriginEndpoint is associated with.
         * 
         * @return builder
         * 
         */
        public Builder channelId(Output<String> channelId) {
            $.channelId = channelId;
            return this;
        }

        /**
         * @param channelId The ID of the Channel the OriginEndpoint is associated with.
         * 
         * @return builder
         * 
         */
        public Builder channelId(String channelId) {
            return channelId(Output.of(channelId));
        }

        public Builder cmafPackage(@Nullable Output<OriginEndpointCmafPackageArgs> cmafPackage) {
            $.cmafPackage = cmafPackage;
            return this;
        }

        public Builder cmafPackage(OriginEndpointCmafPackageArgs cmafPackage) {
            return cmafPackage(Output.of(cmafPackage));
        }

        public Builder dashPackage(@Nullable Output<OriginEndpointDashPackageArgs> dashPackage) {
            $.dashPackage = dashPackage;
            return this;
        }

        public Builder dashPackage(OriginEndpointDashPackageArgs dashPackage) {
            return dashPackage(Output.of(dashPackage));
        }

        /**
         * @param description A short text description of the OriginEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A short text description of the OriginEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder hlsPackage(@Nullable Output<OriginEndpointHlsPackageArgs> hlsPackage) {
            $.hlsPackage = hlsPackage;
            return this;
        }

        public Builder hlsPackage(OriginEndpointHlsPackageArgs hlsPackage) {
            return hlsPackage(Output.of(hlsPackage));
        }

        /**
         * @param manifestName A short string appended to the end of the OriginEndpoint URL.
         * 
         * @return builder
         * 
         */
        public Builder manifestName(@Nullable Output<String> manifestName) {
            $.manifestName = manifestName;
            return this;
        }

        /**
         * @param manifestName A short string appended to the end of the OriginEndpoint URL.
         * 
         * @return builder
         * 
         */
        public Builder manifestName(String manifestName) {
            return manifestName(Output.of(manifestName));
        }

        public Builder mssPackage(@Nullable Output<OriginEndpointMssPackageArgs> mssPackage) {
            $.mssPackage = mssPackage;
            return this;
        }

        public Builder mssPackage(OriginEndpointMssPackageArgs mssPackage) {
            return mssPackage(Output.of(mssPackage));
        }

        /**
         * @param origination Control whether origination of video is allowed for this OriginEndpoint. If set to ALLOW, the OriginEndpoint may by requested, pursuant to any other form of access control. If set to DENY, the OriginEndpoint may not be requested. This can be helpful for Live to VOD harvesting, or for temporarily disabling origination
         * 
         * @return builder
         * 
         */
        public Builder origination(@Nullable Output<OriginEndpointOrigination> origination) {
            $.origination = origination;
            return this;
        }

        /**
         * @param origination Control whether origination of video is allowed for this OriginEndpoint. If set to ALLOW, the OriginEndpoint may by requested, pursuant to any other form of access control. If set to DENY, the OriginEndpoint may not be requested. This can be helpful for Live to VOD harvesting, or for temporarily disabling origination
         * 
         * @return builder
         * 
         */
        public Builder origination(OriginEndpointOrigination origination) {
            return origination(Output.of(origination));
        }

        /**
         * @param startoverWindowSeconds Maximum duration (seconds) of content to retain for startover playback. If not specified, startover playback will be disabled for the OriginEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder startoverWindowSeconds(@Nullable Output<Integer> startoverWindowSeconds) {
            $.startoverWindowSeconds = startoverWindowSeconds;
            return this;
        }

        /**
         * @param startoverWindowSeconds Maximum duration (seconds) of content to retain for startover playback. If not specified, startover playback will be disabled for the OriginEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder startoverWindowSeconds(Integer startoverWindowSeconds) {
            return startoverWindowSeconds(Output.of(startoverWindowSeconds));
        }

        /**
         * @param tags A collection of tags associated with a resource
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<OriginEndpointTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A collection of tags associated with a resource
         * 
         * @return builder
         * 
         */
        public Builder tags(List<OriginEndpointTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A collection of tags associated with a resource
         * 
         * @return builder
         * 
         */
        public Builder tags(OriginEndpointTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param timeDelaySeconds Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no time delay in effect for the OriginEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder timeDelaySeconds(@Nullable Output<Integer> timeDelaySeconds) {
            $.timeDelaySeconds = timeDelaySeconds;
            return this;
        }

        /**
         * @param timeDelaySeconds Amount of delay (seconds) to enforce on the playback of live content. If not specified, there will be no time delay in effect for the OriginEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder timeDelaySeconds(Integer timeDelaySeconds) {
            return timeDelaySeconds(Output.of(timeDelaySeconds));
        }

        /**
         * @param whitelist A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder whitelist(@Nullable Output<List<String>> whitelist) {
            $.whitelist = whitelist;
            return this;
        }

        /**
         * @param whitelist A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder whitelist(List<String> whitelist) {
            return whitelist(Output.of(whitelist));
        }

        /**
         * @param whitelist A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder whitelist(String... whitelist) {
            return whitelist(List.of(whitelist));
        }

        public OriginEndpointArgs build() {
            $.channelId = Objects.requireNonNull($.channelId, "expected parameter 'channelId' to be non-null");
            return $;
        }
    }

}
