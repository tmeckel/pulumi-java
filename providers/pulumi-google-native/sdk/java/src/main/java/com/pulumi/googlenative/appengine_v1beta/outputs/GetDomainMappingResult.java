// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.appengine_v1beta.outputs.ResourceRecordResponse;
import com.pulumi.googlenative.appengine_v1beta.outputs.SslSettingsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDomainMappingResult {
    /**
     * @return Full path to the DomainMapping resource in the API. Example: apps/myapp/domainMapping/example.com.
     * 
     */
    private final String name;
    /**
     * @return The resource records required to configure this domain mapping. These records must be added to the domain&#39;s DNS configuration in order to serve the application via this domain mapping.
     * 
     */
    private final List<ResourceRecordResponse> resourceRecords;
    /**
     * @return SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * 
     */
    private final SslSettingsResponse sslSettings;

    @CustomType.Constructor
    private GetDomainMappingResult(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceRecords") List<ResourceRecordResponse> resourceRecords,
        @CustomType.Parameter("sslSettings") SslSettingsResponse sslSettings) {
        this.name = name;
        this.resourceRecords = resourceRecords;
        this.sslSettings = sslSettings;
    }

    /**
     * @return Full path to the DomainMapping resource in the API. Example: apps/myapp/domainMapping/example.com.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource records required to configure this domain mapping. These records must be added to the domain&#39;s DNS configuration in order to serve the application via this domain mapping.
     * 
     */
    public List<ResourceRecordResponse> resourceRecords() {
        return this.resourceRecords;
    }
    /**
     * @return SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * 
     */
    public SslSettingsResponse sslSettings() {
        return this.sslSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<ResourceRecordResponse> resourceRecords;
        private SslSettingsResponse sslSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceRecords = defaults.resourceRecords;
    	      this.sslSettings = defaults.sslSettings;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceRecords(List<ResourceRecordResponse> resourceRecords) {
            this.resourceRecords = Objects.requireNonNull(resourceRecords);
            return this;
        }
        public Builder resourceRecords(ResourceRecordResponse... resourceRecords) {
            return resourceRecords(List.of(resourceRecords));
        }
        public Builder sslSettings(SslSettingsResponse sslSettings) {
            this.sslSettings = Objects.requireNonNull(sslSettings);
            return this;
        }        public GetDomainMappingResult build() {
            return new GetDomainMappingResult(name, resourceRecords, sslSettings);
        }
    }
}
