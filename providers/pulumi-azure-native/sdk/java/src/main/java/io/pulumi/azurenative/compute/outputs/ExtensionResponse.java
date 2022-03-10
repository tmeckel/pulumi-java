// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CloudServiceExtensionPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExtensionResponse {
    /**
     * The name of the extension.
     * 
     */
    private final @Nullable String name;
    /**
     * Extension Properties.
     * 
     */
    private final @Nullable CloudServiceExtensionPropertiesResponse properties;

    @OutputCustomType.Constructor
    private ExtensionResponse(
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("properties") @Nullable CloudServiceExtensionPropertiesResponse properties) {
        this.name = name;
        this.properties = properties;
    }

    /**
     * The name of the extension.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Extension Properties.
     * 
    */
    public Optional<CloudServiceExtensionPropertiesResponse> getProperties() {
        return Optional.ofNullable(this.properties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable CloudServiceExtensionPropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder properties(@Nullable CloudServiceExtensionPropertiesResponse properties) {
            this.properties = properties;
            return this;
        }
        public ExtensionResponse build() {
            return new ExtensionResponse(name, properties);
        }
    }
}
