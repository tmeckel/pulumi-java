// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.guestconfiguration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConfigurationInfoResponse {
    /**
     * @return Name of the configuration.
     * 
     */
    private final String name;
    /**
     * @return Version of the configuration.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private ConfigurationInfoResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("version") String version) {
        this.name = name;
        this.version = version;
    }

    /**
     * @return Name of the configuration.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Version of the configuration.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public ConfigurationInfoResponse build() {
            return new ConfigurationInfoResponse(name, version);
        }
    }
}
