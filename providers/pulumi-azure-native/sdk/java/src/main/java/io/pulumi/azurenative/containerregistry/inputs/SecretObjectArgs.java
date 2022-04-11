// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.SecretObjectType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the properties of a secret object value.
 * 
 */
public final class SecretObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretObjectArgs Empty = new SecretObjectArgs();

    /**
     * The type of the secret object which determines how the value of the secret object has to be
     * interpreted.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,SecretObjectType>> type;

    public Output<Either<String,SecretObjectType>> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * The value of the secret. The format of this value will be determined
     * based on the type of the secret object. If the type is Opaque, the value will be
     * used as is without any modification.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public SecretObjectArgs(
        @Nullable Output<Either<String,SecretObjectType>> type,
        @Nullable Output<String> value) {
        this.type = type;
        this.value = value;
    }

    private SecretObjectArgs() {
        this.type = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,SecretObjectType>> type;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(@Nullable Output<Either<String,SecretObjectType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,SecretObjectType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public SecretObjectArgs build() {
            return new SecretObjectArgs(type, value);
        }
    }
}
