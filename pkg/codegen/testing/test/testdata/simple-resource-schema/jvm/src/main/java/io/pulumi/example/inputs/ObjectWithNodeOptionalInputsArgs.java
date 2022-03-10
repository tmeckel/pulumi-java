// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectWithNodeOptionalInputsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectWithNodeOptionalInputsArgs Empty = new ObjectWithNodeOptionalInputsArgs();

    @InputImport(name="bar")
      private final @Nullable Input<Integer> bar;

    public Input<Integer> getBar() {
        return this.bar == null ? Input.empty() : this.bar;
    }

    @InputImport(name="foo", required=true)
      private final Input<String> foo;

    public Input<String> getFoo() {
        return this.foo;
    }

    public ObjectWithNodeOptionalInputsArgs(
        @Nullable Input<Integer> bar,
        Input<String> foo) {
        this.bar = bar;
        this.foo = Objects.requireNonNull(foo, "expected parameter 'foo' to be non-null");
    }

    private ObjectWithNodeOptionalInputsArgs() {
        this.bar = Input.empty();
        this.foo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectWithNodeOptionalInputsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> bar;
        private Input<String> foo;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectWithNodeOptionalInputsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bar = defaults.bar;
    	      this.foo = defaults.foo;
        }

        public Builder bar(@Nullable Input<Integer> bar) {
            this.bar = bar;
            return this;
        }

        public Builder bar(@Nullable Integer bar) {
            this.bar = Input.ofNullable(bar);
            return this;
        }

        public Builder foo(Input<String> foo) {
            this.foo = Objects.requireNonNull(foo);
            return this;
        }

        public Builder foo(String foo) {
            this.foo = Input.of(Objects.requireNonNull(foo));
            return this;
        }
        public ObjectWithNodeOptionalInputsArgs build() {
            return new ObjectWithNodeOptionalInputsArgs(bar, foo);
        }
    }
}
