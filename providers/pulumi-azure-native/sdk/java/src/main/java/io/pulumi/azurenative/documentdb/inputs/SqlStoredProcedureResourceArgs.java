// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB SQL storedProcedure resource object
 * 
 */
public final class SqlStoredProcedureResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlStoredProcedureResourceArgs Empty = new SqlStoredProcedureResourceArgs();

    /**
     * Body of the Stored Procedure
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<String> body;

    public Input<String> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Name of the Cosmos DB SQL storedProcedure
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    public SqlStoredProcedureResourceArgs(
        @Nullable Input<String> body,
        Input<String> id) {
        this.body = body;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private SqlStoredProcedureResourceArgs() {
        this.body = Input.empty();
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlStoredProcedureResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> body;
        private Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlStoredProcedureResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.id = defaults.id;
        }

        public Builder body(@Nullable Input<String> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable String body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder id(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }
        public SqlStoredProcedureResourceArgs build() {
            return new SqlStoredProcedureResourceArgs(body, id);
        }
    }
}
