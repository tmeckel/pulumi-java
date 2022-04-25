// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.DnsSettingsResponse;
import com.pulumi.azurenative.network.outputs.FirewallPolicyInsightsResponse;
import com.pulumi.azurenative.network.outputs.FirewallPolicyIntrusionDetectionResponse;
import com.pulumi.azurenative.network.outputs.FirewallPolicySNATResponse;
import com.pulumi.azurenative.network.outputs.FirewallPolicySkuResponse;
import com.pulumi.azurenative.network.outputs.FirewallPolicyThreatIntelWhitelistResponse;
import com.pulumi.azurenative.network.outputs.FirewallPolicyTransportSecurityResponse;
import com.pulumi.azurenative.network.outputs.ManagedServiceIdentityResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFirewallPolicyResult {
    /**
     * @return The parent firewall policy from which rules are inherited.
     * 
     */
    private final @Nullable SubResourceResponse basePolicy;
    /**
     * @return List of references to Child Firewall Policies.
     * 
     */
    private final List<SubResourceResponse> childPolicies;
    /**
     * @return DNS Proxy Settings definition.
     * 
     */
    private final @Nullable DnsSettingsResponse dnsSettings;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return List of references to Azure Firewalls that this Firewall Policy is associated with.
     * 
     */
    private final List<SubResourceResponse> firewalls;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return The identity of the firewall policy.
     * 
     */
    private final @Nullable ManagedServiceIdentityResponse identity;
    /**
     * @return Insights on Firewall Policy.
     * 
     */
    private final @Nullable FirewallPolicyInsightsResponse insights;
    /**
     * @return The configuration for Intrusion detection.
     * 
     */
    private final @Nullable FirewallPolicyIntrusionDetectionResponse intrusionDetection;
    /**
     * @return Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The provisioning state of the firewall policy resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return List of references to FirewallPolicyRuleCollectionGroups.
     * 
     */
    private final List<SubResourceResponse> ruleCollectionGroups;
    /**
     * @return The Firewall Policy SKU.
     * 
     */
    private final @Nullable FirewallPolicySkuResponse sku;
    /**
     * @return The private IP addresses/IP ranges to which traffic will not be SNAT.
     * 
     */
    private final @Nullable FirewallPolicySNATResponse snat;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The operation mode for Threat Intelligence.
     * 
     */
    private final @Nullable String threatIntelMode;
    /**
     * @return ThreatIntel Whitelist for Firewall Policy.
     * 
     */
    private final @Nullable FirewallPolicyThreatIntelWhitelistResponse threatIntelWhitelist;
    /**
     * @return TLS Configuration definition.
     * 
     */
    private final @Nullable FirewallPolicyTransportSecurityResponse transportSecurity;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetFirewallPolicyResult(
        @CustomType.Parameter("basePolicy") @Nullable SubResourceResponse basePolicy,
        @CustomType.Parameter("childPolicies") List<SubResourceResponse> childPolicies,
        @CustomType.Parameter("dnsSettings") @Nullable DnsSettingsResponse dnsSettings,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("firewalls") List<SubResourceResponse> firewalls,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("identity") @Nullable ManagedServiceIdentityResponse identity,
        @CustomType.Parameter("insights") @Nullable FirewallPolicyInsightsResponse insights,
        @CustomType.Parameter("intrusionDetection") @Nullable FirewallPolicyIntrusionDetectionResponse intrusionDetection,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("ruleCollectionGroups") List<SubResourceResponse> ruleCollectionGroups,
        @CustomType.Parameter("sku") @Nullable FirewallPolicySkuResponse sku,
        @CustomType.Parameter("snat") @Nullable FirewallPolicySNATResponse snat,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("threatIntelMode") @Nullable String threatIntelMode,
        @CustomType.Parameter("threatIntelWhitelist") @Nullable FirewallPolicyThreatIntelWhitelistResponse threatIntelWhitelist,
        @CustomType.Parameter("transportSecurity") @Nullable FirewallPolicyTransportSecurityResponse transportSecurity,
        @CustomType.Parameter("type") String type) {
        this.basePolicy = basePolicy;
        this.childPolicies = childPolicies;
        this.dnsSettings = dnsSettings;
        this.etag = etag;
        this.firewalls = firewalls;
        this.id = id;
        this.identity = identity;
        this.insights = insights;
        this.intrusionDetection = intrusionDetection;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.ruleCollectionGroups = ruleCollectionGroups;
        this.sku = sku;
        this.snat = snat;
        this.tags = tags;
        this.threatIntelMode = threatIntelMode;
        this.threatIntelWhitelist = threatIntelWhitelist;
        this.transportSecurity = transportSecurity;
        this.type = type;
    }

    /**
     * @return The parent firewall policy from which rules are inherited.
     * 
     */
    public Optional<SubResourceResponse> basePolicy() {
        return Optional.ofNullable(this.basePolicy);
    }
    /**
     * @return List of references to Child Firewall Policies.
     * 
     */
    public List<SubResourceResponse> childPolicies() {
        return this.childPolicies;
    }
    /**
     * @return DNS Proxy Settings definition.
     * 
     */
    public Optional<DnsSettingsResponse> dnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return List of references to Azure Firewalls that this Firewall Policy is associated with.
     * 
     */
    public List<SubResourceResponse> firewalls() {
        return this.firewalls;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The identity of the firewall policy.
     * 
     */
    public Optional<ManagedServiceIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return Insights on Firewall Policy.
     * 
     */
    public Optional<FirewallPolicyInsightsResponse> insights() {
        return Optional.ofNullable(this.insights);
    }
    /**
     * @return The configuration for Intrusion detection.
     * 
     */
    public Optional<FirewallPolicyIntrusionDetectionResponse> intrusionDetection() {
        return Optional.ofNullable(this.intrusionDetection);
    }
    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The provisioning state of the firewall policy resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return List of references to FirewallPolicyRuleCollectionGroups.
     * 
     */
    public List<SubResourceResponse> ruleCollectionGroups() {
        return this.ruleCollectionGroups;
    }
    /**
     * @return The Firewall Policy SKU.
     * 
     */
    public Optional<FirewallPolicySkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return The private IP addresses/IP ranges to which traffic will not be SNAT.
     * 
     */
    public Optional<FirewallPolicySNATResponse> snat() {
        return Optional.ofNullable(this.snat);
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The operation mode for Threat Intelligence.
     * 
     */
    public Optional<String> threatIntelMode() {
        return Optional.ofNullable(this.threatIntelMode);
    }
    /**
     * @return ThreatIntel Whitelist for Firewall Policy.
     * 
     */
    public Optional<FirewallPolicyThreatIntelWhitelistResponse> threatIntelWhitelist() {
        return Optional.ofNullable(this.threatIntelWhitelist);
    }
    /**
     * @return TLS Configuration definition.
     * 
     */
    public Optional<FirewallPolicyTransportSecurityResponse> transportSecurity() {
        return Optional.ofNullable(this.transportSecurity);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse basePolicy;
        private List<SubResourceResponse> childPolicies;
        private @Nullable DnsSettingsResponse dnsSettings;
        private String etag;
        private List<SubResourceResponse> firewalls;
        private @Nullable String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private @Nullable FirewallPolicyInsightsResponse insights;
        private @Nullable FirewallPolicyIntrusionDetectionResponse intrusionDetection;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private List<SubResourceResponse> ruleCollectionGroups;
        private @Nullable FirewallPolicySkuResponse sku;
        private @Nullable FirewallPolicySNATResponse snat;
        private @Nullable Map<String,String> tags;
        private @Nullable String threatIntelMode;
        private @Nullable FirewallPolicyThreatIntelWhitelistResponse threatIntelWhitelist;
        private @Nullable FirewallPolicyTransportSecurityResponse transportSecurity;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basePolicy = defaults.basePolicy;
    	      this.childPolicies = defaults.childPolicies;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.etag = defaults.etag;
    	      this.firewalls = defaults.firewalls;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.insights = defaults.insights;
    	      this.intrusionDetection = defaults.intrusionDetection;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.ruleCollectionGroups = defaults.ruleCollectionGroups;
    	      this.sku = defaults.sku;
    	      this.snat = defaults.snat;
    	      this.tags = defaults.tags;
    	      this.threatIntelMode = defaults.threatIntelMode;
    	      this.threatIntelWhitelist = defaults.threatIntelWhitelist;
    	      this.transportSecurity = defaults.transportSecurity;
    	      this.type = defaults.type;
        }

        public Builder basePolicy(@Nullable SubResourceResponse basePolicy) {
            this.basePolicy = basePolicy;
            return this;
        }
        public Builder childPolicies(List<SubResourceResponse> childPolicies) {
            this.childPolicies = Objects.requireNonNull(childPolicies);
            return this;
        }
        public Builder childPolicies(SubResourceResponse... childPolicies) {
            return childPolicies(List.of(childPolicies));
        }
        public Builder dnsSettings(@Nullable DnsSettingsResponse dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder firewalls(List<SubResourceResponse> firewalls) {
            this.firewalls = Objects.requireNonNull(firewalls);
            return this;
        }
        public Builder firewalls(SubResourceResponse... firewalls) {
            return firewalls(List.of(firewalls));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder insights(@Nullable FirewallPolicyInsightsResponse insights) {
            this.insights = insights;
            return this;
        }
        public Builder intrusionDetection(@Nullable FirewallPolicyIntrusionDetectionResponse intrusionDetection) {
            this.intrusionDetection = intrusionDetection;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder ruleCollectionGroups(List<SubResourceResponse> ruleCollectionGroups) {
            this.ruleCollectionGroups = Objects.requireNonNull(ruleCollectionGroups);
            return this;
        }
        public Builder ruleCollectionGroups(SubResourceResponse... ruleCollectionGroups) {
            return ruleCollectionGroups(List.of(ruleCollectionGroups));
        }
        public Builder sku(@Nullable FirewallPolicySkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder snat(@Nullable FirewallPolicySNATResponse snat) {
            this.snat = snat;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder threatIntelMode(@Nullable String threatIntelMode) {
            this.threatIntelMode = threatIntelMode;
            return this;
        }
        public Builder threatIntelWhitelist(@Nullable FirewallPolicyThreatIntelWhitelistResponse threatIntelWhitelist) {
            this.threatIntelWhitelist = threatIntelWhitelist;
            return this;
        }
        public Builder transportSecurity(@Nullable FirewallPolicyTransportSecurityResponse transportSecurity) {
            this.transportSecurity = transportSecurity;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetFirewallPolicyResult build() {
            return new GetFirewallPolicyResult(basePolicy, childPolicies, dnsSettings, etag, firewalls, id, identity, insights, intrusionDetection, location, name, provisioningState, ruleCollectionGroups, sku, snat, tags, threatIntelMode, threatIntelWhitelist, transportSecurity, type);
        }
    }
}
