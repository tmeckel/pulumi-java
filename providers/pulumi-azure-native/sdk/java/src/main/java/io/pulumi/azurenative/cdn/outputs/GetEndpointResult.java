// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.DeepCreatedOriginGroupResponse;
import io.pulumi.azurenative.cdn.outputs.DeepCreatedOriginResponse;
import io.pulumi.azurenative.cdn.outputs.EndpointPropertiesUpdateParametersResponseDeliveryPolicy;
import io.pulumi.azurenative.cdn.outputs.EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink;
import io.pulumi.azurenative.cdn.outputs.GeoFilterResponse;
import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.azurenative.cdn.outputs.UrlSigningKeyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEndpointResult {
    /**
     * List of content types on which compression applies. The value should be a valid MIME type.
     * 
     */
    private final @Nullable List<String> contentTypesToCompress;
    /**
     * A reference to the origin group.
     * 
     */
    private final @Nullable ResourceReferenceResponse defaultOriginGroup;
    /**
     * A policy that specifies the delivery rules to be used for an endpoint.
     * 
     */
    private final @Nullable EndpointPropertiesUpdateParametersResponseDeliveryPolicy deliveryPolicy;
    /**
     * List of rules defining the user's geo access within a CDN endpoint. Each geo filter defines an access rule to a specified path or content, e.g. block APAC for path /pictures/
     * 
     */
    private final @Nullable List<GeoFilterResponse> geoFilters;
    /**
     * The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g. contoso.azureedge.net
     * 
     */
    private final String hostName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Indicates whether content compression is enabled on CDN. Default value is false. If compression is enabled, content will be served as compressed if user requests for a compressed version. Content won't be compressed on CDN when requested content is smaller than 1 byte or larger than 1 MB.
     * 
     */
    private final @Nullable Boolean isCompressionEnabled;
    /**
     * Indicates whether HTTP traffic is allowed on the endpoint. Default value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     * 
     */
    private final @Nullable Boolean isHttpAllowed;
    /**
     * Indicates whether HTTPS traffic is allowed on the endpoint. Default value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     * 
     */
    private final @Nullable Boolean isHttpsAllowed;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Specifies what scenario the customer wants this CDN endpoint to optimize for, e.g. Download, Media services. With this information, CDN can apply scenario driven optimization.
     * 
     */
    private final @Nullable String optimizationType;
    /**
     * The origin groups comprising of origins that are used for load balancing the traffic based on availability.
     * 
     */
    private final @Nullable List<DeepCreatedOriginGroupResponse> originGroups;
    /**
     * The host header value sent to the origin with each request. This property at Endpoint is only allowed when endpoint uses single origin and can be overridden by the same property specified at origin.If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default.
     * 
     */
    private final @Nullable String originHostHeader;
    /**
     * A directory path on the origin that CDN can use to retrieve content from, e.g. contoso.cloudapp.net/originpath.
     * 
     */
    private final @Nullable String originPath;
    /**
     * The source of the content being delivered via CDN.
     * 
     */
    private final List<DeepCreatedOriginResponse> origins;
    /**
     * Path to a file hosted on the origin which helps accelerate delivery of the dynamic content and calculate the most optimal routes for the CDN. This is relative to the origin path. This property is only relevant when using a single origin.
     * 
     */
    private final @Nullable String probePath;
    /**
     * Provisioning status of the endpoint.
     * 
     */
    private final String provisioningState;
    /**
     * Defines how CDN caches requests that include query strings. You can ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being cached, or cache every request with a unique URL.
     * 
     */
    private final @Nullable String queryStringCachingBehavior;
    /**
     * Resource status of the endpoint.
     * 
     */
    private final String resourceState;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * List of keys used to validate the signed URL hashes.
     * 
     */
    private final @Nullable List<UrlSigningKeyResponse> urlSigningKeys;
    /**
     * Defines the Web Application Firewall policy for the endpoint (if applicable)
     * 
     */
    private final @Nullable EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink;

    @OutputCustomType.Constructor
    private GetEndpointResult(
        @OutputCustomType.Parameter("contentTypesToCompress") @Nullable List<String> contentTypesToCompress,
        @OutputCustomType.Parameter("defaultOriginGroup") @Nullable ResourceReferenceResponse defaultOriginGroup,
        @OutputCustomType.Parameter("deliveryPolicy") @Nullable EndpointPropertiesUpdateParametersResponseDeliveryPolicy deliveryPolicy,
        @OutputCustomType.Parameter("geoFilters") @Nullable List<GeoFilterResponse> geoFilters,
        @OutputCustomType.Parameter("hostName") String hostName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("isCompressionEnabled") @Nullable Boolean isCompressionEnabled,
        @OutputCustomType.Parameter("isHttpAllowed") @Nullable Boolean isHttpAllowed,
        @OutputCustomType.Parameter("isHttpsAllowed") @Nullable Boolean isHttpsAllowed,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("optimizationType") @Nullable String optimizationType,
        @OutputCustomType.Parameter("originGroups") @Nullable List<DeepCreatedOriginGroupResponse> originGroups,
        @OutputCustomType.Parameter("originHostHeader") @Nullable String originHostHeader,
        @OutputCustomType.Parameter("originPath") @Nullable String originPath,
        @OutputCustomType.Parameter("origins") List<DeepCreatedOriginResponse> origins,
        @OutputCustomType.Parameter("probePath") @Nullable String probePath,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("queryStringCachingBehavior") @Nullable String queryStringCachingBehavior,
        @OutputCustomType.Parameter("resourceState") String resourceState,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("urlSigningKeys") @Nullable List<UrlSigningKeyResponse> urlSigningKeys,
        @OutputCustomType.Parameter("webApplicationFirewallPolicyLink") @Nullable EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
        this.contentTypesToCompress = contentTypesToCompress;
        this.defaultOriginGroup = defaultOriginGroup;
        this.deliveryPolicy = deliveryPolicy;
        this.geoFilters = geoFilters;
        this.hostName = hostName;
        this.id = id;
        this.isCompressionEnabled = isCompressionEnabled;
        this.isHttpAllowed = isHttpAllowed;
        this.isHttpsAllowed = isHttpsAllowed;
        this.location = location;
        this.name = name;
        this.optimizationType = optimizationType;
        this.originGroups = originGroups;
        this.originHostHeader = originHostHeader;
        this.originPath = originPath;
        this.origins = origins;
        this.probePath = probePath;
        this.provisioningState = provisioningState;
        this.queryStringCachingBehavior = queryStringCachingBehavior;
        this.resourceState = resourceState;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
        this.urlSigningKeys = urlSigningKeys;
        this.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
    }

    /**
     * List of content types on which compression applies. The value should be a valid MIME type.
     * 
    */
    public List<String> getContentTypesToCompress() {
        return this.contentTypesToCompress == null ? List.of() : this.contentTypesToCompress;
    }
    /**
     * A reference to the origin group.
     * 
    */
    public Optional<ResourceReferenceResponse> getDefaultOriginGroup() {
        return Optional.ofNullable(this.defaultOriginGroup);
    }
    /**
     * A policy that specifies the delivery rules to be used for an endpoint.
     * 
    */
    public Optional<EndpointPropertiesUpdateParametersResponseDeliveryPolicy> getDeliveryPolicy() {
        return Optional.ofNullable(this.deliveryPolicy);
    }
    /**
     * List of rules defining the user's geo access within a CDN endpoint. Each geo filter defines an access rule to a specified path or content, e.g. block APAC for path /pictures/
     * 
    */
    public List<GeoFilterResponse> getGeoFilters() {
        return this.geoFilters == null ? List.of() : this.geoFilters;
    }
    /**
     * The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g. contoso.azureedge.net
     * 
    */
    public String getHostName() {
        return this.hostName;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Indicates whether content compression is enabled on CDN. Default value is false. If compression is enabled, content will be served as compressed if user requests for a compressed version. Content won't be compressed on CDN when requested content is smaller than 1 byte or larger than 1 MB.
     * 
    */
    public Optional<Boolean> getIsCompressionEnabled() {
        return Optional.ofNullable(this.isCompressionEnabled);
    }
    /**
     * Indicates whether HTTP traffic is allowed on the endpoint. Default value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     * 
    */
    public Optional<Boolean> getIsHttpAllowed() {
        return Optional.ofNullable(this.isHttpAllowed);
    }
    /**
     * Indicates whether HTTPS traffic is allowed on the endpoint. Default value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     * 
    */
    public Optional<Boolean> getIsHttpsAllowed() {
        return Optional.ofNullable(this.isHttpsAllowed);
    }
    /**
     * Resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies what scenario the customer wants this CDN endpoint to optimize for, e.g. Download, Media services. With this information, CDN can apply scenario driven optimization.
     * 
    */
    public Optional<String> getOptimizationType() {
        return Optional.ofNullable(this.optimizationType);
    }
    /**
     * The origin groups comprising of origins that are used for load balancing the traffic based on availability.
     * 
    */
    public List<DeepCreatedOriginGroupResponse> getOriginGroups() {
        return this.originGroups == null ? List.of() : this.originGroups;
    }
    /**
     * The host header value sent to the origin with each request. This property at Endpoint is only allowed when endpoint uses single origin and can be overridden by the same property specified at origin.If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default.
     * 
    */
    public Optional<String> getOriginHostHeader() {
        return Optional.ofNullable(this.originHostHeader);
    }
    /**
     * A directory path on the origin that CDN can use to retrieve content from, e.g. contoso.cloudapp.net/originpath.
     * 
    */
    public Optional<String> getOriginPath() {
        return Optional.ofNullable(this.originPath);
    }
    /**
     * The source of the content being delivered via CDN.
     * 
    */
    public List<DeepCreatedOriginResponse> getOrigins() {
        return this.origins;
    }
    /**
     * Path to a file hosted on the origin which helps accelerate delivery of the dynamic content and calculate the most optimal routes for the CDN. This is relative to the origin path. This property is only relevant when using a single origin.
     * 
    */
    public Optional<String> getProbePath() {
        return Optional.ofNullable(this.probePath);
    }
    /**
     * Provisioning status of the endpoint.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Defines how CDN caches requests that include query strings. You can ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being cached, or cache every request with a unique URL.
     * 
    */
    public Optional<String> getQueryStringCachingBehavior() {
        return Optional.ofNullable(this.queryStringCachingBehavior);
    }
    /**
     * Resource status of the endpoint.
     * 
    */
    public String getResourceState() {
        return this.resourceState;
    }
    /**
     * Read only system data
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * List of keys used to validate the signed URL hashes.
     * 
    */
    public List<UrlSigningKeyResponse> getUrlSigningKeys() {
        return this.urlSigningKeys == null ? List.of() : this.urlSigningKeys;
    }
    /**
     * Defines the Web Application Firewall policy for the endpoint (if applicable)
     * 
    */
    public Optional<EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink> getWebApplicationFirewallPolicyLink() {
        return Optional.ofNullable(this.webApplicationFirewallPolicyLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> contentTypesToCompress;
        private @Nullable ResourceReferenceResponse defaultOriginGroup;
        private @Nullable EndpointPropertiesUpdateParametersResponseDeliveryPolicy deliveryPolicy;
        private @Nullable List<GeoFilterResponse> geoFilters;
        private String hostName;
        private String id;
        private @Nullable Boolean isCompressionEnabled;
        private @Nullable Boolean isHttpAllowed;
        private @Nullable Boolean isHttpsAllowed;
        private String location;
        private String name;
        private @Nullable String optimizationType;
        private @Nullable List<DeepCreatedOriginGroupResponse> originGroups;
        private @Nullable String originHostHeader;
        private @Nullable String originPath;
        private List<DeepCreatedOriginResponse> origins;
        private @Nullable String probePath;
        private String provisioningState;
        private @Nullable String queryStringCachingBehavior;
        private String resourceState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<UrlSigningKeyResponse> urlSigningKeys;
        private @Nullable EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentTypesToCompress = defaults.contentTypesToCompress;
    	      this.defaultOriginGroup = defaults.defaultOriginGroup;
    	      this.deliveryPolicy = defaults.deliveryPolicy;
    	      this.geoFilters = defaults.geoFilters;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.isCompressionEnabled = defaults.isCompressionEnabled;
    	      this.isHttpAllowed = defaults.isHttpAllowed;
    	      this.isHttpsAllowed = defaults.isHttpsAllowed;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.optimizationType = defaults.optimizationType;
    	      this.originGroups = defaults.originGroups;
    	      this.originHostHeader = defaults.originHostHeader;
    	      this.originPath = defaults.originPath;
    	      this.origins = defaults.origins;
    	      this.probePath = defaults.probePath;
    	      this.provisioningState = defaults.provisioningState;
    	      this.queryStringCachingBehavior = defaults.queryStringCachingBehavior;
    	      this.resourceState = defaults.resourceState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.urlSigningKeys = defaults.urlSigningKeys;
    	      this.webApplicationFirewallPolicyLink = defaults.webApplicationFirewallPolicyLink;
        }

        public Builder contentTypesToCompress(@Nullable List<String> contentTypesToCompress) {
            this.contentTypesToCompress = contentTypesToCompress;
            return this;
        }

        public Builder defaultOriginGroup(@Nullable ResourceReferenceResponse defaultOriginGroup) {
            this.defaultOriginGroup = defaultOriginGroup;
            return this;
        }

        public Builder deliveryPolicy(@Nullable EndpointPropertiesUpdateParametersResponseDeliveryPolicy deliveryPolicy) {
            this.deliveryPolicy = deliveryPolicy;
            return this;
        }

        public Builder geoFilters(@Nullable List<GeoFilterResponse> geoFilters) {
            this.geoFilters = geoFilters;
            return this;
        }

        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder isCompressionEnabled(@Nullable Boolean isCompressionEnabled) {
            this.isCompressionEnabled = isCompressionEnabled;
            return this;
        }

        public Builder isHttpAllowed(@Nullable Boolean isHttpAllowed) {
            this.isHttpAllowed = isHttpAllowed;
            return this;
        }

        public Builder isHttpsAllowed(@Nullable Boolean isHttpsAllowed) {
            this.isHttpsAllowed = isHttpsAllowed;
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder optimizationType(@Nullable String optimizationType) {
            this.optimizationType = optimizationType;
            return this;
        }

        public Builder originGroups(@Nullable List<DeepCreatedOriginGroupResponse> originGroups) {
            this.originGroups = originGroups;
            return this;
        }

        public Builder originHostHeader(@Nullable String originHostHeader) {
            this.originHostHeader = originHostHeader;
            return this;
        }

        public Builder originPath(@Nullable String originPath) {
            this.originPath = originPath;
            return this;
        }

        public Builder origins(List<DeepCreatedOriginResponse> origins) {
            this.origins = Objects.requireNonNull(origins);
            return this;
        }

        public Builder probePath(@Nullable String probePath) {
            this.probePath = probePath;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder queryStringCachingBehavior(@Nullable String queryStringCachingBehavior) {
            this.queryStringCachingBehavior = queryStringCachingBehavior;
            return this;
        }

        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder urlSigningKeys(@Nullable List<UrlSigningKeyResponse> urlSigningKeys) {
            this.urlSigningKeys = urlSigningKeys;
            return this;
        }

        public Builder webApplicationFirewallPolicyLink(@Nullable EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
            this.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
            return this;
        }
        public GetEndpointResult build() {
            return new GetEndpointResult(contentTypesToCompress, defaultOriginGroup, deliveryPolicy, geoFilters, hostName, id, isCompressionEnabled, isHttpAllowed, isHttpsAllowed, location, name, optimizationType, originGroups, originHostHeader, originPath, origins, probePath, provisioningState, queryStringCachingBehavior, resourceState, systemData, tags, type, urlSigningKeys, webApplicationFirewallPolicyLink);
        }
    }
}
