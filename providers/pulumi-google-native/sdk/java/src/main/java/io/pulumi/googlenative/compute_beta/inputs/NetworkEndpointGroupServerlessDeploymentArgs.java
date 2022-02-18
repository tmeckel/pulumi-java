// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a serverless network endpoint group (NEG). The platform must be provided. Note: The target backend service must be in the same project and located in the same region as the Serverless NEG.
 * 
 */
public final class NetworkEndpointGroupServerlessDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointGroupServerlessDeploymentArgs Empty = new NetworkEndpointGroupServerlessDeploymentArgs();

    /**
     * The platform of the backend target(s) of this NEG. Possible values include: 1. API Gateway: apigateway.googleapis.com 2. App Engine: appengine.googleapis.com 3. Cloud Functions: cloudfunctions.googleapis.com 4. Cloud Run: run.googleapis.com
     * 
     */
    @InputImport(name="platform")
    private final @Nullable Input<String> platform;

    public Input<String> getPlatform() {
        return this.platform == null ? Input.empty() : this.platform;
    }

    /**
     * The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask. The resource identified by this value is platform-specific and is as follows: 1. API Gateway: The gateway ID 2. App Engine: The service name 3. Cloud Functions: The function name 4. Cloud Run: The service name
     * 
     */
    @InputImport(name="resource")
    private final @Nullable Input<String> resource;

    public Input<String> getResource() {
        return this.resource == null ? Input.empty() : this.resource;
    }

    /**
     * A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources. The fields parsed by this template are platform-specific and are as follows: 1. API Gateway: The gateway ID 2. App Engine: The service and version 3. Cloud Functions: The function name 4. Cloud Run: The service and tag
     * 
     */
    @InputImport(name="urlMask")
    private final @Nullable Input<String> urlMask;

    public Input<String> getUrlMask() {
        return this.urlMask == null ? Input.empty() : this.urlMask;
    }

    /**
     * The optional resource version. The version identified by this value is platform-specific and is follows: 1. API Gateway: Unused 2. App Engine: The service version 3. Cloud Functions: Unused 4. Cloud Run: The service tag
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public NetworkEndpointGroupServerlessDeploymentArgs(
        @Nullable Input<String> platform,
        @Nullable Input<String> resource,
        @Nullable Input<String> urlMask,
        @Nullable Input<String> version) {
        this.platform = platform;
        this.resource = resource;
        this.urlMask = urlMask;
        this.version = version;
    }

    private NetworkEndpointGroupServerlessDeploymentArgs() {
        this.platform = Input.empty();
        this.resource = Input.empty();
        this.urlMask = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupServerlessDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> platform;
        private @Nullable Input<String> resource;
        private @Nullable Input<String> urlMask;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupServerlessDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.platform = defaults.platform;
    	      this.resource = defaults.resource;
    	      this.urlMask = defaults.urlMask;
    	      this.version = defaults.version;
        }

        public Builder setPlatform(@Nullable Input<String> platform) {
            this.platform = platform;
            return this;
        }

        public Builder setPlatform(@Nullable String platform) {
            this.platform = Input.ofNullable(platform);
            return this;
        }

        public Builder setResource(@Nullable Input<String> resource) {
            this.resource = resource;
            return this;
        }

        public Builder setResource(@Nullable String resource) {
            this.resource = Input.ofNullable(resource);
            return this;
        }

        public Builder setUrlMask(@Nullable Input<String> urlMask) {
            this.urlMask = urlMask;
            return this;
        }

        public Builder setUrlMask(@Nullable String urlMask) {
            this.urlMask = Input.ofNullable(urlMask);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public NetworkEndpointGroupServerlessDeploymentArgs build() {
            return new NetworkEndpointGroupServerlessDeploymentArgs(platform, resource, urlMask, version);
        }
    }
}
