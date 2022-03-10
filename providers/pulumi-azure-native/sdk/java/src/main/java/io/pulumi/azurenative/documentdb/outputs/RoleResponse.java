// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RoleResponse {
    /**
     * The database name the role is applied.
     * 
     */
    private final @Nullable String db;
    /**
     * The role name.
     * 
     */
    private final @Nullable String role;

    @OutputCustomType.Constructor
    private RoleResponse(
        @OutputCustomType.Parameter("db") @Nullable String db,
        @OutputCustomType.Parameter("role") @Nullable String role) {
        this.db = db;
        this.role = role;
    }

    /**
     * The database name the role is applied.
     * 
    */
    public Optional<String> getDb() {
        return Optional.ofNullable(this.db);
    }
    /**
     * The role name.
     * 
    */
    public Optional<String> getRole() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String db;
        private @Nullable String role;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.db = defaults.db;
    	      this.role = defaults.role;
        }

        public Builder db(@Nullable String db) {
            this.db = db;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        public RoleResponse build() {
            return new RoleResponse(db, role);
        }
    }
}
