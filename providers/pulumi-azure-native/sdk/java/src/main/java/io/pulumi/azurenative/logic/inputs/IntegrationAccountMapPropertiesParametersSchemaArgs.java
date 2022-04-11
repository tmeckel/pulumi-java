// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters schema of integration account map.
 * 
 */
public final class IntegrationAccountMapPropertiesParametersSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountMapPropertiesParametersSchemaArgs Empty = new IntegrationAccountMapPropertiesParametersSchemaArgs();

    /**
     * The reference name.
     * 
     */
    @Import(name="ref")
      private final @Nullable Output<String> ref;

    public Output<String> getRef() {
        return this.ref == null ? Codegen.empty() : this.ref;
    }

    public IntegrationAccountMapPropertiesParametersSchemaArgs(@Nullable Output<String> ref) {
        this.ref = ref;
    }

    private IntegrationAccountMapPropertiesParametersSchemaArgs() {
        this.ref = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountMapPropertiesParametersSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ref;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountMapPropertiesParametersSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ref = defaults.ref;
        }

        public Builder ref(@Nullable Output<String> ref) {
            this.ref = ref;
            return this;
        }
        public Builder ref(@Nullable String ref) {
            this.ref = Codegen.ofNullable(ref);
            return this;
        }        public IntegrationAccountMapPropertiesParametersSchemaArgs build() {
            return new IntegrationAccountMapPropertiesParametersSchemaArgs(ref);
        }
    }
}
