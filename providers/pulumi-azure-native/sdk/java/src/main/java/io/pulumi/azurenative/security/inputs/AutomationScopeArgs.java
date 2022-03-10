// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A single automation scope.
 * 
 */
public final class AutomationScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationScopeArgs Empty = new AutomationScopeArgs();

    /**
     * The resources scope description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The resources scope path. Can be the subscription on which the automation is defined on or a resource group under that subscription (fully qualified Azure resource IDs).
     * 
     */
    @InputImport(name="scopePath")
      private final @Nullable Input<String> scopePath;

    public Input<String> getScopePath() {
        return this.scopePath == null ? Input.empty() : this.scopePath;
    }

    public AutomationScopeArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> scopePath) {
        this.description = description;
        this.scopePath = scopePath;
    }

    private AutomationScopeArgs() {
        this.description = Input.empty();
        this.scopePath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> scopePath;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.scopePath = defaults.scopePath;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder scopePath(@Nullable Input<String> scopePath) {
            this.scopePath = scopePath;
            return this;
        }

        public Builder scopePath(@Nullable String scopePath) {
            this.scopePath = Input.ofNullable(scopePath);
            return this;
        }
        public AutomationScopeArgs build() {
            return new AutomationScopeArgs(description, scopePath);
        }
    }
}
