// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.domainregistration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NameIdentifierResponse {
    /**
     * @return Name of the object.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private NameIdentifierResponse(@CustomType.Parameter("name") @Nullable String name) {
        this.name = name;
    }

    /**
     * @return Name of the object.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NameIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(NameIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public NameIdentifierResponse build() {
            return new NameIdentifierResponse(name);
        }
    }
}
