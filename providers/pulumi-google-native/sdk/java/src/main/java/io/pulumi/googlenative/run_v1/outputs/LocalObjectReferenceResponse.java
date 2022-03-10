// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LocalObjectReferenceResponse {
    /**
     * (Optional) Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private LocalObjectReferenceResponse(@OutputCustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * (Optional) Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalObjectReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalObjectReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public LocalObjectReferenceResponse build() {
            return new LocalObjectReferenceResponse(name);
        }
    }
}
