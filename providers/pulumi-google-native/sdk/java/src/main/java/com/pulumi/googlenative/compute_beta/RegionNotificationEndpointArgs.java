// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.NotificationEndpointGrpcSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionNotificationEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionNotificationEndpointArgs Empty = new RegionNotificationEndpointArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Settings of the gRPC notification endpoint including the endpoint URL and the retry duration.
     * 
     */
    @Import(name="grpcSettings")
    private @Nullable Output<NotificationEndpointGrpcSettingsArgs> grpcSettings;

    /**
     * @return Settings of the gRPC notification endpoint including the endpoint URL and the retry duration.
     * 
     */
    public Optional<Output<NotificationEndpointGrpcSettingsArgs>> grpcSettings() {
        return Optional.ofNullable(this.grpcSettings);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    private RegionNotificationEndpointArgs() {}

    private RegionNotificationEndpointArgs(RegionNotificationEndpointArgs $) {
        this.description = $.description;
        this.grpcSettings = $.grpcSettings;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionNotificationEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionNotificationEndpointArgs $;

        public Builder() {
            $ = new RegionNotificationEndpointArgs();
        }

        public Builder(RegionNotificationEndpointArgs defaults) {
            $ = new RegionNotificationEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param grpcSettings Settings of the gRPC notification endpoint including the endpoint URL and the retry duration.
         * 
         * @return builder
         * 
         */
        public Builder grpcSettings(@Nullable Output<NotificationEndpointGrpcSettingsArgs> grpcSettings) {
            $.grpcSettings = grpcSettings;
            return this;
        }

        /**
         * @param grpcSettings Settings of the gRPC notification endpoint including the endpoint URL and the retry duration.
         * 
         * @return builder
         * 
         */
        public Builder grpcSettings(NotificationEndpointGrpcSettingsArgs grpcSettings) {
            return grpcSettings(Output.of(grpcSettings));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public RegionNotificationEndpointArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
