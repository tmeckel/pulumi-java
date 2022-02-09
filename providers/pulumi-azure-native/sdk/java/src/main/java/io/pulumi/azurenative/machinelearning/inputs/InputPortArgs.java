// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.enums.InputPortType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InputPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final InputPortArgs Empty = new InputPortArgs();

    @InputImport(name="type")
    private final @Nullable Input<Either<String,InputPortType>> type;

    public Input<Either<String,InputPortType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public InputPortArgs(@Nullable Input<Either<String,InputPortType>> type) {
        this.type = type == null ? Input.ofLeft("Dataset") : type;
    }

    private InputPortArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,InputPortType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InputPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<Either<String,InputPortType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,InputPortType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public InputPortArgs build() {
            return new InputPortArgs(type);
        }
    }
}
