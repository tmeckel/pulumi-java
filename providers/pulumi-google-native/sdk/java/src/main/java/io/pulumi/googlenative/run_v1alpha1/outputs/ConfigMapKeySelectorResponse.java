// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1alpha1.outputs.LocalObjectReferenceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConfigMapKeySelectorResponse {
    /**
     * The key to select.
     * 
     */
    private final String key;
    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
     * 
     */
    private final LocalObjectReferenceResponse localObjectReference;
    /**
     * The ConfigMap to select from.
     * 
     */
    private final String name;
    /**
     * (Optional) Specify whether the ConfigMap or its key must be defined
     * 
     */
    private final Boolean optional;

    @OutputCustomType.Constructor({"key","localObjectReference","name","optional"})
    private ConfigMapKeySelectorResponse(
        String key,
        LocalObjectReferenceResponse localObjectReference,
        String name,
        Boolean optional) {
        this.key = Objects.requireNonNull(key);
        this.localObjectReference = Objects.requireNonNull(localObjectReference);
        this.name = Objects.requireNonNull(name);
        this.optional = Objects.requireNonNull(optional);
    }

    /**
     * The key to select.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
     * 
     */
    public LocalObjectReferenceResponse getLocalObjectReference() {
        return this.localObjectReference;
    }
    /**
     * The ConfigMap to select from.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * (Optional) Specify whether the ConfigMap or its key must be defined
     * 
     */
    public Boolean getOptional() {
        return this.optional;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapKeySelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private LocalObjectReferenceResponse localObjectReference;
        private String name;
        private Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapKeySelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setLocalObjectReference(LocalObjectReferenceResponse localObjectReference) {
            this.localObjectReference = Objects.requireNonNull(localObjectReference);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOptional(Boolean optional) {
            this.optional = Objects.requireNonNull(optional);
            return this;
        }

        public ConfigMapKeySelectorResponse build() {
            return new ConfigMapKeySelectorResponse(key, localObjectReference, name, optional);
        }
    }
}
