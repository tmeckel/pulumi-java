// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the Connectors Platform add-on.
 * 
 */
public final class GoogleCloudApigeeV1ConnectorsPlatformConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1ConnectorsPlatformConfigArgs Empty = new GoogleCloudApigeeV1ConnectorsPlatformConfigArgs();

    /**
     * Flag that specifies whether the Connectors Platform add-on is enabled.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public GoogleCloudApigeeV1ConnectorsPlatformConfigArgs(@Nullable Input<Boolean> enabled) {
        this.enabled = enabled;
    }

    private GoogleCloudApigeeV1ConnectorsPlatformConfigArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1ConnectorsPlatformConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1ConnectorsPlatformConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }
        public GoogleCloudApigeeV1ConnectorsPlatformConfigArgs build() {
            return new GoogleCloudApigeeV1ConnectorsPlatformConfigArgs(enabled);
        }
    }
}
