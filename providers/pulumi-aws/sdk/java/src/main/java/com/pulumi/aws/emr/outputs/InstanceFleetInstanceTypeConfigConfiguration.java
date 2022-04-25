// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceFleetInstanceTypeConfigConfiguration {
    /**
     * @return The classification within a configuration.
     * 
     */
    private final @Nullable String classification;
    /**
     * @return A map of properties specified within a configuration classification
     * 
     */
    private final @Nullable Map<String,Object> properties;

    @CustomType.Constructor
    private InstanceFleetInstanceTypeConfigConfiguration(
        @CustomType.Parameter("classification") @Nullable String classification,
        @CustomType.Parameter("properties") @Nullable Map<String,Object> properties) {
        this.classification = classification;
        this.properties = properties;
    }

    /**
     * @return The classification within a configuration.
     * 
     */
    public Optional<String> classification() {
        return Optional.ofNullable(this.classification);
    }
    /**
     * @return A map of properties specified within a configuration classification
     * 
     */
    public Map<String,Object> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetInstanceTypeConfigConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String classification;
        private @Nullable Map<String,Object> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFleetInstanceTypeConfigConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.properties = defaults.properties;
        }

        public Builder classification(@Nullable String classification) {
            this.classification = classification;
            return this;
        }
        public Builder properties(@Nullable Map<String,Object> properties) {
            this.properties = properties;
            return this;
        }        public InstanceFleetInstanceTypeConfigConfiguration build() {
            return new InstanceFleetInstanceTypeConfigConfiguration(classification, properties);
        }
    }
}
