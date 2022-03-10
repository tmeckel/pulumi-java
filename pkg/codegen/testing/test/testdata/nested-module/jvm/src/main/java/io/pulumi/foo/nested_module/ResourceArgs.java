// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.foo.nested_module;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceArgs Empty = new ResourceArgs();

    @InputImport(name="bar")
      private final @Nullable Input<String> bar;

    public Input<String> getBar() {
        return this.bar == null ? Input.empty() : this.bar;
    }

    public ResourceArgs(@Nullable Input<String> bar) {
        this.bar = bar;
    }

    private ResourceArgs() {
        this.bar = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bar;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bar = defaults.bar;
        }

        public Builder bar(@Nullable Input<String> bar) {
            this.bar = Input.ofNullable(bar).asSecret();
            return this;
        }

        public Builder bar(@Nullable String bar) {
            this.bar = Input.ofNullable(bar).asSecret();
            return this;
        }
        public ResourceArgs build() {
            return new ResourceArgs(bar);
        }
    }
}
