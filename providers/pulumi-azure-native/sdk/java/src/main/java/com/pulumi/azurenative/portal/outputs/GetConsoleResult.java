// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.outputs;

import com.pulumi.azurenative.portal.outputs.ConsolePropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetConsoleResult {
    /**
     * @return Cloud shell console properties.
     * 
     */
    private final ConsolePropertiesResponse properties;

    @CustomType.Constructor
    private GetConsoleResult(@CustomType.Parameter("properties") ConsolePropertiesResponse properties) {
        this.properties = properties;
    }

    /**
     * @return Cloud shell console properties.
     * 
     */
    public ConsolePropertiesResponse properties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsoleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsolePropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsoleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder properties(ConsolePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }        public GetConsoleResult build() {
            return new GetConsoleResult(properties);
        }
    }
}
