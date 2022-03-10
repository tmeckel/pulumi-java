// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.healthlake.outputs;

import io.pulumi.awsnative.healthlake.enums.FHIRDatastorePreloadDataConfigPreloadDataType;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class FHIRDatastorePreloadDataConfig {
    /**
     * The type of preloaded data. Only Synthea preloaded data is supported.
     * 
     */
    private final FHIRDatastorePreloadDataConfigPreloadDataType preloadDataType;

    @OutputCustomType.Constructor
    private FHIRDatastorePreloadDataConfig(@OutputCustomType.Parameter("preloadDataType") FHIRDatastorePreloadDataConfigPreloadDataType preloadDataType) {
        this.preloadDataType = preloadDataType;
    }

    /**
     * The type of preloaded data. Only Synthea preloaded data is supported.
     * 
    */
    public FHIRDatastorePreloadDataConfigPreloadDataType getPreloadDataType() {
        return this.preloadDataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FHIRDatastorePreloadDataConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FHIRDatastorePreloadDataConfigPreloadDataType preloadDataType;

        public Builder() {
    	      // Empty
        }

        public Builder(FHIRDatastorePreloadDataConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preloadDataType = defaults.preloadDataType;
        }

        public Builder preloadDataType(FHIRDatastorePreloadDataConfigPreloadDataType preloadDataType) {
            this.preloadDataType = Objects.requireNonNull(preloadDataType);
            return this;
        }
        public FHIRDatastorePreloadDataConfig build() {
            return new FHIRDatastorePreloadDataConfig(preloadDataType);
        }
    }
}
