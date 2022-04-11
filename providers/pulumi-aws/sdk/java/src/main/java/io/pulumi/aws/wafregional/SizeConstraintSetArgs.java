// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional;

import io.pulumi.aws.wafregional.inputs.SizeConstraintSetSizeConstraintArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SizeConstraintSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SizeConstraintSetArgs Empty = new SizeConstraintSetArgs();

    /**
     * The name or description of the Size Constraint Set.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    @Import(name="sizeConstraints")
      private final @Nullable Output<List<SizeConstraintSetSizeConstraintArgs>> sizeConstraints;

    public Output<List<SizeConstraintSetSizeConstraintArgs>> getSizeConstraints() {
        return this.sizeConstraints == null ? Codegen.empty() : this.sizeConstraints;
    }

    public SizeConstraintSetArgs(
        @Nullable Output<String> name,
        @Nullable Output<List<SizeConstraintSetSizeConstraintArgs>> sizeConstraints) {
        this.name = name;
        this.sizeConstraints = sizeConstraints;
    }

    private SizeConstraintSetArgs() {
        this.name = Codegen.empty();
        this.sizeConstraints = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SizeConstraintSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<List<SizeConstraintSetSizeConstraintArgs>> sizeConstraints;

        public Builder() {
    	      // Empty
        }

        public Builder(SizeConstraintSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sizeConstraints = defaults.sizeConstraints;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder sizeConstraints(@Nullable Output<List<SizeConstraintSetSizeConstraintArgs>> sizeConstraints) {
            this.sizeConstraints = sizeConstraints;
            return this;
        }
        public Builder sizeConstraints(@Nullable List<SizeConstraintSetSizeConstraintArgs> sizeConstraints) {
            this.sizeConstraints = Codegen.ofNullable(sizeConstraints);
            return this;
        }
        public Builder sizeConstraints(SizeConstraintSetSizeConstraintArgs... sizeConstraints) {
            return sizeConstraints(List.of(sizeConstraints));
        }        public SizeConstraintSetArgs build() {
            return new SizeConstraintSetArgs(name, sizeConstraints);
        }
    }
}
