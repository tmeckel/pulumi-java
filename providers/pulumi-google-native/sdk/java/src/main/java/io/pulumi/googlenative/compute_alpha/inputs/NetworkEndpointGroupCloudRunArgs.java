// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a Cloud Run network endpoint group (NEG). The service must be provided explicitly or in the URL mask. The tag is optional, may be provided explicitly or in the URL mask. Note: Cloud Run service must be in the same project and located in the same region as the Serverless NEG.
 * 
 */
public final class NetworkEndpointGroupCloudRunArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointGroupCloudRunArgs Empty = new NetworkEndpointGroupCloudRunArgs();

    /**
     * Cloud Run service is the main resource of Cloud Run. The service must be 1-63 characters long, and comply with RFC1035. Example value: "run-service".
     * 
     */
    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    /**
     * Optional Cloud Run tag represents the "named-revision" to provide additional fine-grained traffic routing information. The tag must be 1-63 characters long, and comply with RFC1035. Example value: "revision-0010".
     * 
     */
    @InputImport(name="tag")
    private final @Nullable Input<String> tag;

    public Input<String> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    /**
     * A template to parse service and tag fields from a request URL. URL mask allows for routing to multiple Run services without having to create multiple network endpoint groups and backend services. For example, request URLs "foo1.domain.com/bar1" and "foo1.domain.com/bar2" can be backed by the same Serverless Network Endpoint Group (NEG) with URL mask ".domain.com/". The URL mask will parse them to { service="bar1", tag="foo1" } and { service="bar2", tag="foo2" } respectively.
     * 
     */
    @InputImport(name="urlMask")
    private final @Nullable Input<String> urlMask;

    public Input<String> getUrlMask() {
        return this.urlMask == null ? Input.empty() : this.urlMask;
    }

    public NetworkEndpointGroupCloudRunArgs(
        @Nullable Input<String> service,
        @Nullable Input<String> tag,
        @Nullable Input<String> urlMask) {
        this.service = service;
        this.tag = tag;
        this.urlMask = urlMask;
    }

    private NetworkEndpointGroupCloudRunArgs() {
        this.service = Input.empty();
        this.tag = Input.empty();
        this.urlMask = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupCloudRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> service;
        private @Nullable Input<String> tag;
        private @Nullable Input<String> urlMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupCloudRunArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.tag = defaults.tag;
    	      this.urlMask = defaults.urlMask;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder setTag(@Nullable Input<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = Input.ofNullable(tag);
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

        public NetworkEndpointGroupCloudRunArgs build() {
            return new NetworkEndpointGroupCloudRunArgs(service, tag, urlMask);
        }
    }
}
