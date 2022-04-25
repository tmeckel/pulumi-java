// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run_v1alpha1.outputs.LocalObjectReferenceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConfigMapKeySelectorResponse {
    /**
     * @return The key to select.
     * 
     */
    private final String key;
    /**
     * @return This field should not be used directly as it is meant to be inlined directly into the message. Use the &#34;name&#34; field instead.
     * 
     */
    private final LocalObjectReferenceResponse localObjectReference;
    /**
     * @return The ConfigMap to select from.
     * 
     */
    private final String name;
    /**
     * @return (Optional) Specify whether the ConfigMap or its key must be defined
     * 
     */
    private final Boolean optional;

    @CustomType.Constructor
    private ConfigMapKeySelectorResponse(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("localObjectReference") LocalObjectReferenceResponse localObjectReference,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("optional") Boolean optional) {
        this.key = key;
        this.localObjectReference = localObjectReference;
        this.name = name;
        this.optional = optional;
    }

    /**
     * @return The key to select.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return This field should not be used directly as it is meant to be inlined directly into the message. Use the &#34;name&#34; field instead.
     * 
     */
    public LocalObjectReferenceResponse localObjectReference() {
        return this.localObjectReference;
    }
    /**
     * @return The ConfigMap to select from.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Optional) Specify whether the ConfigMap or its key must be defined
     * 
     */
    public Boolean optional() {
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

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder localObjectReference(LocalObjectReferenceResponse localObjectReference) {
            this.localObjectReference = Objects.requireNonNull(localObjectReference);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder optional(Boolean optional) {
            this.optional = Objects.requireNonNull(optional);
            return this;
        }        public ConfigMapKeySelectorResponse build() {
            return new ConfigMapKeySelectorResponse(key, localObjectReference, name, optional);
        }
    }
}
