// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Define match variables.
 * 
 */
public final class MatchVariableResponse extends io.pulumi.resources.InvokeArgs {

    public static final MatchVariableResponse Empty = new MatchVariableResponse();

    /**
     * The selector of match variable.
     * 
     */
    @InputImport(name="selector")
      private final @Nullable String selector;

    public Optional<String> getSelector() {
        return this.selector == null ? Optional.empty() : Optional.ofNullable(this.selector);
    }

    /**
     * Match Variable.
     * 
     */
    @InputImport(name="variableName", required=true)
      private final String variableName;

    public String getVariableName() {
        return this.variableName;
    }

    public MatchVariableResponse(
        @Nullable String selector,
        String variableName) {
        this.selector = selector;
        this.variableName = Objects.requireNonNull(variableName, "expected parameter 'variableName' to be non-null");
    }

    private MatchVariableResponse() {
        this.selector = null;
        this.variableName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MatchVariableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String selector;
        private String variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(MatchVariableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selector = defaults.selector;
    	      this.variableName = defaults.variableName;
        }

        public Builder selector(@Nullable String selector) {
            this.selector = selector;
            return this;
        }

        public Builder variableName(String variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }
        public MatchVariableResponse build() {
            return new MatchVariableResponse(selector, variableName);
        }
    }
}
