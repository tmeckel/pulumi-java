// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cosmos DB Cassandra table cluster key
 * 
 */
public final class ClusterKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterKeyResponse Empty = new ClusterKeyResponse();

    /**
     * Name of the Cosmos DB Cassandra table cluster key
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Order of the Cosmos DB Cassandra table cluster key, only support "Asc" and "Desc"
     * 
     */
    @InputImport(name="orderBy")
      private final @Nullable String orderBy;

    public Optional<String> getOrderBy() {
        return this.orderBy == null ? Optional.empty() : Optional.ofNullable(this.orderBy);
    }

    public ClusterKeyResponse(
        @Nullable String name,
        @Nullable String orderBy) {
        this.name = name;
        this.orderBy = orderBy;
    }

    private ClusterKeyResponse() {
        this.name = null;
        this.orderBy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String orderBy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.orderBy = defaults.orderBy;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder orderBy(@Nullable String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public ClusterKeyResponse build() {
            return new ClusterKeyResponse(name, orderBy);
        }
    }
}
