// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionNetworkEndpointGroupAppEngineArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionNetworkEndpointGroupAppEngineArgs Empty = new RegionNetworkEndpointGroupAppEngineArgs();

    /**
     * Optional serving service.
     * The service name must be 1-63 characters long, and comply with RFC1035.
     * Example value: "default", "my-service".
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    /**
     * A template to parse function field from a request URL. URL mask allows
     * for routing to multiple Cloud Functions without having to create
     * multiple Network Endpoint Groups and backend services.
     * For example, request URLs "mydomain.com/function1" and "mydomain.com/function2"
     * can be backed by the same Serverless NEG with URL mask "/". The URL mask
     * will parse them to { function = "function1" } and { function = "function2" } respectively.
     * 
     */
    @Import(name="urlMask")
      private final @Nullable Output<String> urlMask;

    public Output<String> getUrlMask() {
        return this.urlMask == null ? Codegen.empty() : this.urlMask;
    }

    /**
     * Optional serving version.
     * The version must be 1-63 characters long, and comply with RFC1035.
     * Example value: "v1", "v2".
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public RegionNetworkEndpointGroupAppEngineArgs(
        @Nullable Output<String> service,
        @Nullable Output<String> urlMask,
        @Nullable Output<String> version) {
        this.service = service;
        this.urlMask = urlMask;
        this.version = version;
    }

    private RegionNetworkEndpointGroupAppEngineArgs() {
        this.service = Codegen.empty();
        this.urlMask = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionNetworkEndpointGroupAppEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> service;
        private @Nullable Output<String> urlMask;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionNetworkEndpointGroupAppEngineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.urlMask = defaults.urlMask;
    	      this.version = defaults.version;
        }

        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }
        public Builder urlMask(@Nullable Output<String> urlMask) {
            this.urlMask = urlMask;
            return this;
        }
        public Builder urlMask(@Nullable String urlMask) {
            this.urlMask = Codegen.ofNullable(urlMask);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public RegionNetworkEndpointGroupAppEngineArgs build() {
            return new RegionNetworkEndpointGroupAppEngineArgs(service, urlMask, version);
        }
    }
}
