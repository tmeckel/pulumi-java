// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.example.inputs.ObjectArgs;
import io.pulumi.example.inputs.ObjectWithNodeOptionalInputsArgs;
import io.pulumi.example.inputs.SomeOtherObjectArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TypeUsesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TypeUsesArgs Empty = new TypeUsesArgs();

    @Import(name="bar")
      private final @Nullable Output<SomeOtherObjectArgs> bar;

    public Output<SomeOtherObjectArgs> getBar() {
        return this.bar == null ? Codegen.empty() : this.bar;
    }

    @Import(name="baz")
      private final @Nullable Output<ObjectWithNodeOptionalInputsArgs> baz;

    public Output<ObjectWithNodeOptionalInputsArgs> getBaz() {
        return this.baz == null ? Codegen.empty() : this.baz;
    }

    @Import(name="foo")
      private final @Nullable Output<ObjectArgs> foo;

    public Output<ObjectArgs> getFoo() {
        return this.foo == null ? Codegen.empty() : this.foo;
    }

    public TypeUsesArgs(
        @Nullable Output<SomeOtherObjectArgs> bar,
        @Nullable Output<ObjectWithNodeOptionalInputsArgs> baz,
        @Nullable Output<ObjectArgs> foo) {
        this.bar = bar;
        this.baz = baz;
        this.foo = foo;
    }

    private TypeUsesArgs() {
        this.bar = Codegen.empty();
        this.baz = Codegen.empty();
        this.foo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypeUsesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SomeOtherObjectArgs> bar;
        private @Nullable Output<ObjectWithNodeOptionalInputsArgs> baz;
        private @Nullable Output<ObjectArgs> foo;

        public Builder() {
    	      // Empty
        }

        public Builder(TypeUsesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bar = defaults.bar;
    	      this.baz = defaults.baz;
    	      this.foo = defaults.foo;
        }

        public Builder bar(@Nullable Output<SomeOtherObjectArgs> bar) {
            this.bar = bar;
            return this;
        }
        public Builder bar(@Nullable SomeOtherObjectArgs bar) {
            this.bar = Codegen.ofNullable(bar);
            return this;
        }
        public Builder baz(@Nullable Output<ObjectWithNodeOptionalInputsArgs> baz) {
            this.baz = baz;
            return this;
        }
        public Builder baz(@Nullable ObjectWithNodeOptionalInputsArgs baz) {
            this.baz = Codegen.ofNullable(baz);
            return this;
        }
        public Builder foo(@Nullable Output<ObjectArgs> foo) {
            this.foo = foo;
            return this;
        }
        public Builder foo(@Nullable ObjectArgs foo) {
            this.foo = Codegen.ofNullable(foo);
            return this;
        }        public TypeUsesArgs build() {
            return new TypeUsesArgs(bar, baz, foo);
        }
    }
}
