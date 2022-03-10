// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaserules_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MetadataResponse {
    /**
     * Services that this ruleset has declarations for (e.g., "cloud.firestore"). There may be 0+ of these.
     * 
     */
    private final List<String> services;

    @OutputCustomType.Constructor
    private MetadataResponse(@OutputCustomType.Parameter("services") List<String> services) {
        this.services = services;
    }

    /**
     * Services that this ruleset has declarations for (e.g., "cloud.firestore"). There may be 0+ of these.
     * 
    */
    public List<String> getServices() {
        return this.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> services;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.services = defaults.services;
        }

        public Builder services(List<String> services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }
        public MetadataResponse build() {
            return new MetadataResponse(services);
        }
    }
}
