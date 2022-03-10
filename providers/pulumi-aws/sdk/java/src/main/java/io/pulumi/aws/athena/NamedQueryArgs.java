// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamedQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamedQueryArgs Empty = new NamedQueryArgs();

    /**
     * The database to which the query belongs.
     * 
     */
    @InputImport(name="database", required=true)
      private final Input<String> database;

    public Input<String> getDatabase() {
        return this.database;
    }

    /**
     * A brief explanation of the query. Maximum length of 1024.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The plain language name for the query. Maximum length of 128.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The text of the query itself. In other words, all query statements. Maximum length of 262144.
     * 
     */
    @InputImport(name="query", required=true)
      private final Input<String> query;

    public Input<String> getQuery() {
        return this.query;
    }

    /**
     * The workgroup to which the query belongs. Defaults to `primary`
     * 
     */
    @InputImport(name="workgroup")
      private final @Nullable Input<String> workgroup;

    public Input<String> getWorkgroup() {
        return this.workgroup == null ? Input.empty() : this.workgroup;
    }

    public NamedQueryArgs(
        Input<String> database,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<String> query,
        @Nullable Input<String> workgroup) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.description = description;
        this.name = name;
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.workgroup = workgroup;
    }

    private NamedQueryArgs() {
        this.database = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.query = Input.empty();
        this.workgroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamedQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> database;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<String> query;
        private @Nullable Input<String> workgroup;

        public Builder() {
    	      // Empty
        }

        public Builder(NamedQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.query = defaults.query;
    	      this.workgroup = defaults.workgroup;
        }

        public Builder database(Input<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder database(String database) {
            this.database = Input.of(Objects.requireNonNull(database));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder query(Input<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder query(String query) {
            this.query = Input.of(Objects.requireNonNull(query));
            return this;
        }

        public Builder workgroup(@Nullable Input<String> workgroup) {
            this.workgroup = workgroup;
            return this;
        }

        public Builder workgroup(@Nullable String workgroup) {
            this.workgroup = Input.ofNullable(workgroup);
            return this;
        }
        public NamedQueryArgs build() {
            return new NamedQueryArgs(database, description, name, query, workgroup);
        }
    }
}
