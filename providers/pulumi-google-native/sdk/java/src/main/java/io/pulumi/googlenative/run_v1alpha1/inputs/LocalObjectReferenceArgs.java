// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
 * 
 */
public final class LocalObjectReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalObjectReferenceArgs Empty = new LocalObjectReferenceArgs();

    /**
     * (Optional) Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public LocalObjectReferenceArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private LocalObjectReferenceArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalObjectReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalObjectReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public LocalObjectReferenceArgs build() {
            return new LocalObjectReferenceArgs(name);
        }
    }
}
