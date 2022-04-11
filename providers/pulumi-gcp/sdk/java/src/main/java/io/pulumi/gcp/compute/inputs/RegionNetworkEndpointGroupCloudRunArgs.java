// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionNetworkEndpointGroupCloudRunArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionNetworkEndpointGroupCloudRunArgs Empty = new RegionNetworkEndpointGroupCloudRunArgs();

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
     * Cloud Run tag represents the "named-revision" to provide
     * additional fine-grained traffic routing information.
     * The tag must be 1-63 characters long, and comply with RFC1035.
     * Example value: "revision-0010".
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> getTag() {
        return this.tag == null ? Codegen.empty() : this.tag;
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

    public RegionNetworkEndpointGroupCloudRunArgs(
        @Nullable Output<String> service,
        @Nullable Output<String> tag,
        @Nullable Output<String> urlMask) {
        this.service = service;
        this.tag = tag;
        this.urlMask = urlMask;
    }

    private RegionNetworkEndpointGroupCloudRunArgs() {
        this.service = Codegen.empty();
        this.tag = Codegen.empty();
        this.urlMask = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionNetworkEndpointGroupCloudRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> service;
        private @Nullable Output<String> tag;
        private @Nullable Output<String> urlMask;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionNetworkEndpointGroupCloudRunArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.tag = defaults.tag;
    	      this.urlMask = defaults.urlMask;
        }

        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }
        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = Codegen.ofNullable(tag);
            return this;
        }
        public Builder urlMask(@Nullable Output<String> urlMask) {
            this.urlMask = urlMask;
            return this;
        }
        public Builder urlMask(@Nullable String urlMask) {
            this.urlMask = Codegen.ofNullable(urlMask);
            return this;
        }        public RegionNetworkEndpointGroupCloudRunArgs build() {
            return new RegionNetworkEndpointGroupCloudRunArgs(service, tag, urlMask);
        }
    }
}
