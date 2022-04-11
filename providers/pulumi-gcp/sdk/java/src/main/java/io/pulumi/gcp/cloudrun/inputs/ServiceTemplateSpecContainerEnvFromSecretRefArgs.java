// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerEnvFromSecretRefArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvFromSecretRefArgs Empty = new ServiceTemplateSpecContainerEnvFromSecretRefArgs();

    /**
     * The Secret to select from.
     * Structure is documented below.
     * 
     */
    @Import(name="localObjectReference")
      private final @Nullable Output<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs> localObjectReference;

    public Output<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs> getLocalObjectReference() {
        return this.localObjectReference == null ? Codegen.empty() : this.localObjectReference;
    }

    /**
     * Specify whether the Secret must be defined
     * 
     */
    @Import(name="optional")
      private final @Nullable Output<Boolean> optional;

    public Output<Boolean> getOptional() {
        return this.optional == null ? Codegen.empty() : this.optional;
    }

    public ServiceTemplateSpecContainerEnvFromSecretRefArgs(
        @Nullable Output<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs> localObjectReference,
        @Nullable Output<Boolean> optional) {
        this.localObjectReference = localObjectReference;
        this.optional = optional;
    }

    private ServiceTemplateSpecContainerEnvFromSecretRefArgs() {
        this.localObjectReference = Codegen.empty();
        this.optional = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvFromSecretRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs> localObjectReference;
        private @Nullable Output<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvFromSecretRefArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.optional = defaults.optional;
        }

        public Builder localObjectReference(@Nullable Output<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs> localObjectReference) {
            this.localObjectReference = localObjectReference;
            return this;
        }
        public Builder localObjectReference(@Nullable ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs localObjectReference) {
            this.localObjectReference = Codegen.ofNullable(localObjectReference);
            return this;
        }
        public Builder optional(@Nullable Output<Boolean> optional) {
            this.optional = optional;
            return this;
        }
        public Builder optional(@Nullable Boolean optional) {
            this.optional = Codegen.ofNullable(optional);
            return this;
        }        public ServiceTemplateSpecContainerEnvFromSecretRefArgs build() {
            return new ServiceTemplateSpecContainerEnvFromSecretRefArgs(localObjectReference, optional);
        }
    }
}
