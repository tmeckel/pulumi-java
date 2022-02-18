// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.GcsDestinationConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DestinationConfigResponse {
    /**
     * Destination connection profile identifier.
     * 
     */
    private final String destinationConnectionProfileName;
    /**
     * GCS destination configuration.
     * 
     */
    private final GcsDestinationConfigResponse gcsDestinationConfig;

    @OutputCustomType.Constructor({"destinationConnectionProfileName","gcsDestinationConfig"})
    private DestinationConfigResponse(
        String destinationConnectionProfileName,
        GcsDestinationConfigResponse gcsDestinationConfig) {
        this.destinationConnectionProfileName = Objects.requireNonNull(destinationConnectionProfileName);
        this.gcsDestinationConfig = Objects.requireNonNull(gcsDestinationConfig);
    }

    /**
     * Destination connection profile identifier.
     * 
     */
    public String getDestinationConnectionProfileName() {
        return this.destinationConnectionProfileName;
    }
    /**
     * GCS destination configuration.
     * 
     */
    public GcsDestinationConfigResponse getGcsDestinationConfig() {
        return this.gcsDestinationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationConnectionProfileName;
        private GcsDestinationConfigResponse gcsDestinationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationConnectionProfileName = defaults.destinationConnectionProfileName;
    	      this.gcsDestinationConfig = defaults.gcsDestinationConfig;
        }

        public Builder setDestinationConnectionProfileName(String destinationConnectionProfileName) {
            this.destinationConnectionProfileName = Objects.requireNonNull(destinationConnectionProfileName);
            return this;
        }

        public Builder setGcsDestinationConfig(GcsDestinationConfigResponse gcsDestinationConfig) {
            this.gcsDestinationConfig = Objects.requireNonNull(gcsDestinationConfig);
            return this;
        }

        public DestinationConfigResponse build() {
            return new DestinationConfigResponse(destinationConnectionProfileName, gcsDestinationConfig);
        }
    }
}
