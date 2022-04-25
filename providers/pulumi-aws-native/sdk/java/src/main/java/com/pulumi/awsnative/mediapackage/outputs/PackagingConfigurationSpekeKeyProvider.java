// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PackagingConfigurationSpekeKeyProvider {
    private final String roleArn;
    /**
     * @return The system IDs to include in key requests.
     * 
     */
    private final List<String> systemIds;
    /**
     * @return The URL of the external key provider service.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private PackagingConfigurationSpekeKeyProvider(
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("systemIds") List<String> systemIds,
        @CustomType.Parameter("url") String url) {
        this.roleArn = roleArn;
        this.systemIds = systemIds;
        this.url = url;
    }

    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The system IDs to include in key requests.
     * 
     */
    public List<String> systemIds() {
        return this.systemIds;
    }
    /**
     * @return The URL of the external key provider service.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationSpekeKeyProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleArn;
        private List<String> systemIds;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationSpekeKeyProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.systemIds = defaults.systemIds;
    	      this.url = defaults.url;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder systemIds(List<String> systemIds) {
            this.systemIds = Objects.requireNonNull(systemIds);
            return this;
        }
        public Builder systemIds(String... systemIds) {
            return systemIds(List.of(systemIds));
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public PackagingConfigurationSpekeKeyProvider build() {
            return new PackagingConfigurationSpekeKeyProvider(roleArn, systemIds, url);
        }
    }
}
