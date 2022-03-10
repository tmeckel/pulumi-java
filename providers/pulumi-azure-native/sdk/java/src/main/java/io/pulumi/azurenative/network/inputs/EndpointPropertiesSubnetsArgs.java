// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Subnet first address, scope, and/or last address.
 * 
 */
public final class EndpointPropertiesSubnetsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointPropertiesSubnetsArgs Empty = new EndpointPropertiesSubnetsArgs();

    /**
     * First address in the subnet.
     * 
     */
    @InputImport(name="first")
      private final @Nullable Input<String> first;

    public Input<String> getFirst() {
        return this.first == null ? Input.empty() : this.first;
    }

    /**
     * Last address in the subnet.
     * 
     */
    @InputImport(name="last")
      private final @Nullable Input<String> last;

    public Input<String> getLast() {
        return this.last == null ? Input.empty() : this.last;
    }

    /**
     * Block size (number of leading bits in the subnet mask).
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Input<Integer> scope;

    public Input<Integer> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    public EndpointPropertiesSubnetsArgs(
        @Nullable Input<String> first,
        @Nullable Input<String> last,
        @Nullable Input<Integer> scope) {
        this.first = first;
        this.last = last;
        this.scope = scope;
    }

    private EndpointPropertiesSubnetsArgs() {
        this.first = Input.empty();
        this.last = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPropertiesSubnetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> first;
        private @Nullable Input<String> last;
        private @Nullable Input<Integer> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPropertiesSubnetsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.first = defaults.first;
    	      this.last = defaults.last;
    	      this.scope = defaults.scope;
        }

        public Builder first(@Nullable Input<String> first) {
            this.first = first;
            return this;
        }

        public Builder first(@Nullable String first) {
            this.first = Input.ofNullable(first);
            return this;
        }

        public Builder last(@Nullable Input<String> last) {
            this.last = last;
            return this;
        }

        public Builder last(@Nullable String last) {
            this.last = Input.ofNullable(last);
            return this;
        }

        public Builder scope(@Nullable Input<Integer> scope) {
            this.scope = scope;
            return this;
        }

        public Builder scope(@Nullable Integer scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }
        public EndpointPropertiesSubnetsArgs build() {
            return new EndpointPropertiesSubnetsArgs(first, last, scope);
        }
    }
}
