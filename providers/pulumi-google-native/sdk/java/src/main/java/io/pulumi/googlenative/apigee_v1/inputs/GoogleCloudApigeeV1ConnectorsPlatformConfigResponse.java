// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for the Connectors Platform add-on.
 * 
 */
public final class GoogleCloudApigeeV1ConnectorsPlatformConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1ConnectorsPlatformConfigResponse Empty = new GoogleCloudApigeeV1ConnectorsPlatformConfigResponse();

    /**
     * Flag that specifies whether the Connectors Platform add-on is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Time at which the Connectors Platform add-on expires in milliseconds since epoch. If unspecified, the add-on will never expire.
     * 
     */
    @InputImport(name="expiresAt", required=true)
    private final String expiresAt;

    public String getExpiresAt() {
        return this.expiresAt;
    }

    public GoogleCloudApigeeV1ConnectorsPlatformConfigResponse(
        Boolean enabled,
        String expiresAt) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.expiresAt = Objects.requireNonNull(expiresAt, "expected parameter 'expiresAt' to be non-null");
    }

    private GoogleCloudApigeeV1ConnectorsPlatformConfigResponse() {
        this.enabled = null;
        this.expiresAt = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1ConnectorsPlatformConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String expiresAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1ConnectorsPlatformConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.expiresAt = defaults.expiresAt;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setExpiresAt(String expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }

        public GoogleCloudApigeeV1ConnectorsPlatformConfigResponse build() {
            return new GoogleCloudApigeeV1ConnectorsPlatformConfigResponse(enabled, expiresAt);
        }
    }
}
