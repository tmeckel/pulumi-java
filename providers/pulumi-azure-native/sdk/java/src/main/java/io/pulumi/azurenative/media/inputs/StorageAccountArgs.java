// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.StorageAccountType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StorageAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="type", required=true)
    private final Input<Either<String,StorageAccountType>> type;

    public Input<Either<String,StorageAccountType>> getType() {
        return this.type;
    }

    public StorageAccountArgs(
        @Nullable Input<String> id,
        Input<Either<String,StorageAccountType>> type) {
        this.id = id;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private StorageAccountArgs() {
        this.id = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private Input<Either<String,StorageAccountType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setType(Input<Either<String,StorageAccountType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,StorageAccountType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public StorageAccountArgs build() {
            return new StorageAccountArgs(id, type);
        }
    }
}
