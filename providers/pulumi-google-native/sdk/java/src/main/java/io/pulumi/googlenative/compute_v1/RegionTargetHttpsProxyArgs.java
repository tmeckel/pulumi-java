// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.RegionTargetHttpsProxyQuicOverride;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionTargetHttpsProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionTargetHttpsProxyArgs Empty = new RegionTargetHttpsProxyArgs();

    /**
     * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how the proxy should authorize inbound traffic. If left blank, access will not be restricted by an authorization policy. Refer to the AuthorizationPolicy resource for additional details. authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. Note: This field currently has no impact.
     * 
     */
    @InputImport(name="authorizationPolicy")
      private final @Nullable Input<String> authorizationPolicy;

    public Input<String> getAuthorizationPolicy() {
        return this.authorizationPolicy == null ? Input.empty() : this.authorizationPolicy;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED. When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when it receives them. The default is false.
     * 
     */
    @InputImport(name="proxyBind")
      private final @Nullable Input<Boolean> proxyBind;

    public Input<Boolean> getProxyBind() {
        return this.proxyBind == null ? Input.empty() : this.proxyBind;
    }

    /**
     * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE, ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used. - When quic-override is set to ENABLE, the load balancer uses QUIC when possible. - When quic-override is set to DISABLE, the load balancer doesn't use QUIC. - If the quic-override flag is not specified, NONE is implied.
     * 
     */
    @InputImport(name="quicOverride")
      private final @Nullable Input<RegionTargetHttpsProxyQuicOverride> quicOverride;

    public Input<RegionTargetHttpsProxyQuicOverride> getQuicOverride() {
        return this.quicOverride == null ? Input.empty() : this.quicOverride;
    }

    @InputImport(name="region", required=true)
      private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted. Note: This field currently has no impact.
     * 
     */
    @InputImport(name="serverTlsPolicy")
      private final @Nullable Input<String> serverTlsPolicy;

    public Input<String> getServerTlsPolicy() {
        return this.serverTlsPolicy == null ? Input.empty() : this.serverTlsPolicy;
    }

    /**
     * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="sslCertificates")
      private final @Nullable Input<List<String>> sslCertificates;

    public Input<List<String>> getSslCertificates() {
        return this.sslCertificates == null ? Input.empty() : this.sslCertificates;
    }

    /**
     * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource has no SSL policy configured.
     * 
     */
    @InputImport(name="sslPolicy")
      private final @Nullable Input<String> sslPolicy;

    public Input<String> getSslPolicy() {
        return this.sslPolicy == null ? Input.empty() : this.sslPolicy;
    }

    /**
     * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are all valid URLs for specifying a URL map: - https://www.googleapis.compute/v1/projects/project/global/urlMaps/ url-map - projects/project/global/urlMaps/url-map - global/urlMaps/url-map
     * 
     */
    @InputImport(name="urlMap")
      private final @Nullable Input<String> urlMap;

    public Input<String> getUrlMap() {
        return this.urlMap == null ? Input.empty() : this.urlMap;
    }

    public RegionTargetHttpsProxyArgs(
        @Nullable Input<String> authorizationPolicy,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> proxyBind,
        @Nullable Input<RegionTargetHttpsProxyQuicOverride> quicOverride,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<String> serverTlsPolicy,
        @Nullable Input<List<String>> sslCertificates,
        @Nullable Input<String> sslPolicy,
        @Nullable Input<String> urlMap) {
        this.authorizationPolicy = authorizationPolicy;
        this.description = description;
        this.name = name;
        this.project = project;
        this.proxyBind = proxyBind;
        this.quicOverride = quicOverride;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.serverTlsPolicy = serverTlsPolicy;
        this.sslCertificates = sslCertificates;
        this.sslPolicy = sslPolicy;
        this.urlMap = urlMap;
    }

    private RegionTargetHttpsProxyArgs() {
        this.authorizationPolicy = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.proxyBind = Input.empty();
        this.quicOverride = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.serverTlsPolicy = Input.empty();
        this.sslCertificates = Input.empty();
        this.sslPolicy = Input.empty();
        this.urlMap = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionTargetHttpsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizationPolicy;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> proxyBind;
        private @Nullable Input<RegionTargetHttpsProxyQuicOverride> quicOverride;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> serverTlsPolicy;
        private @Nullable Input<List<String>> sslCertificates;
        private @Nullable Input<String> sslPolicy;
        private @Nullable Input<String> urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionTargetHttpsProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationPolicy = defaults.authorizationPolicy;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyBind = defaults.proxyBind;
    	      this.quicOverride = defaults.quicOverride;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.serverTlsPolicy = defaults.serverTlsPolicy;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder authorizationPolicy(@Nullable Input<String> authorizationPolicy) {
            this.authorizationPolicy = authorizationPolicy;
            return this;
        }

        public Builder authorizationPolicy(@Nullable String authorizationPolicy) {
            this.authorizationPolicy = Input.ofNullable(authorizationPolicy);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder proxyBind(@Nullable Input<Boolean> proxyBind) {
            this.proxyBind = proxyBind;
            return this;
        }

        public Builder proxyBind(@Nullable Boolean proxyBind) {
            this.proxyBind = Input.ofNullable(proxyBind);
            return this;
        }

        public Builder quicOverride(@Nullable Input<RegionTargetHttpsProxyQuicOverride> quicOverride) {
            this.quicOverride = quicOverride;
            return this;
        }

        public Builder quicOverride(@Nullable RegionTargetHttpsProxyQuicOverride quicOverride) {
            this.quicOverride = Input.ofNullable(quicOverride);
            return this;
        }

        public Builder region(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder region(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder serverTlsPolicy(@Nullable Input<String> serverTlsPolicy) {
            this.serverTlsPolicy = serverTlsPolicy;
            return this;
        }

        public Builder serverTlsPolicy(@Nullable String serverTlsPolicy) {
            this.serverTlsPolicy = Input.ofNullable(serverTlsPolicy);
            return this;
        }

        public Builder sslCertificates(@Nullable Input<List<String>> sslCertificates) {
            this.sslCertificates = sslCertificates;
            return this;
        }

        public Builder sslCertificates(@Nullable List<String> sslCertificates) {
            this.sslCertificates = Input.ofNullable(sslCertificates);
            return this;
        }

        public Builder sslPolicy(@Nullable Input<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder sslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Input.ofNullable(sslPolicy);
            return this;
        }

        public Builder urlMap(@Nullable Input<String> urlMap) {
            this.urlMap = urlMap;
            return this;
        }

        public Builder urlMap(@Nullable String urlMap) {
            this.urlMap = Input.ofNullable(urlMap);
            return this;
        }
        public RegionTargetHttpsProxyArgs build() {
            return new RegionTargetHttpsProxyArgs(authorizationPolicy, description, name, project, proxyBind, quicOverride, region, requestId, serverTlsPolicy, sslCertificates, sslPolicy, urlMap);
        }
    }
}
