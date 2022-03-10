// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerEnvFromConfigMapRefArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvFromConfigMapRefArgs Empty = new ServiceTemplateSpecContainerEnvFromConfigMapRefArgs();

    /**
     * The Secret to select from.
     * Structure is documented below.
     * 
     */
    @InputImport(name="localObjectReference")
      private final @Nullable Input<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceArgs> localObjectReference;

    public Input<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceArgs> getLocalObjectReference() {
        return this.localObjectReference == null ? Input.empty() : this.localObjectReference;
    }

    /**
     * Specify whether the Secret must be defined
     * 
     */
    @InputImport(name="optional")
      private final @Nullable Input<Boolean> optional;

    public Input<Boolean> getOptional() {
        return this.optional == null ? Input.empty() : this.optional;
    }

    public ServiceTemplateSpecContainerEnvFromConfigMapRefArgs(
        @Nullable Input<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceArgs> localObjectReference,
        @Nullable Input<Boolean> optional) {
        this.localObjectReference = localObjectReference;
        this.optional = optional;
    }

    private ServiceTemplateSpecContainerEnvFromConfigMapRefArgs() {
        this.localObjectReference = Input.empty();
        this.optional = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvFromConfigMapRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceArgs> localObjectReference;
        private @Nullable Input<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvFromConfigMapRefArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.optional = defaults.optional;
        }

        public Builder localObjectReference(@Nullable Input<ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceArgs> localObjectReference) {
            this.localObjectReference = localObjectReference;
            return this;
        }

        public Builder localObjectReference(@Nullable ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceArgs localObjectReference) {
            this.localObjectReference = Input.ofNullable(localObjectReference);
            return this;
        }

        public Builder optional(@Nullable Input<Boolean> optional) {
            this.optional = optional;
            return this;
        }

        public Builder optional(@Nullable Boolean optional) {
            this.optional = Input.ofNullable(optional);
            return this;
        }
        public ServiceTemplateSpecContainerEnvFromConfigMapRefArgs build() {
            return new ServiceTemplateSpecContainerEnvFromConfigMapRefArgs(localObjectReference, optional);
        }
    }
}
