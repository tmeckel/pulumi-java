// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorProfileVeevaConnectorProfileProperties {
    /**
     * @return The location of the Veeva resource
     * 
     */
    private final String instanceUrl;

    @CustomType.Constructor
    private ConnectorProfileVeevaConnectorProfileProperties(@CustomType.Parameter("instanceUrl") String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    /**
     * @return The location of the Veeva resource
     * 
     */
    public String instanceUrl() {
        return this.instanceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileVeevaConnectorProfileProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileVeevaConnectorProfileProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceUrl = defaults.instanceUrl;
        }

        public Builder instanceUrl(String instanceUrl) {
            this.instanceUrl = Objects.requireNonNull(instanceUrl);
            return this;
        }        public ConnectorProfileVeevaConnectorProfileProperties build() {
            return new ConnectorProfileVeevaConnectorProfileProperties(instanceUrl);
        }
    }
}
