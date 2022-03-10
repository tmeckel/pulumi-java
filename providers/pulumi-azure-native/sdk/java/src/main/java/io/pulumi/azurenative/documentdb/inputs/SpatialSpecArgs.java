// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.enums.SpatialType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpatialSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpatialSpecArgs Empty = new SpatialSpecArgs();

    /**
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * List of path's spatial type
     * 
     */
    @InputImport(name="types")
      private final @Nullable Input<List<Either<String,SpatialType>>> types;

    public Input<List<Either<String,SpatialType>>> getTypes() {
        return this.types == null ? Input.empty() : this.types;
    }

    public SpatialSpecArgs(
        @Nullable Input<String> path,
        @Nullable Input<List<Either<String,SpatialType>>> types) {
        this.path = path;
        this.types = types;
    }

    private SpatialSpecArgs() {
        this.path = Input.empty();
        this.types = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpatialSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> path;
        private @Nullable Input<List<Either<String,SpatialType>>> types;

        public Builder() {
    	      // Empty
        }

        public Builder(SpatialSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.types = defaults.types;
        }

        public Builder path(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder types(@Nullable Input<List<Either<String,SpatialType>>> types) {
            this.types = types;
            return this;
        }

        public Builder types(@Nullable List<Either<String,SpatialType>> types) {
            this.types = Input.ofNullable(types);
            return this;
        }
        public SpatialSpecArgs build() {
            return new SpatialSpecArgs(path, types);
        }
    }
}
