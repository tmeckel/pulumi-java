// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datamigration_v1.enums.DatabaseTypeEngine;
import io.pulumi.googlenative.datamigration_v1.enums.DatabaseTypeProvider;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A message defining the database engine and provider.
 * 
 */
public final class DatabaseTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseTypeArgs Empty = new DatabaseTypeArgs();

    /**
     * The database engine.
     * 
     */
    @InputImport(name="engine")
    private final @Nullable Input<DatabaseTypeEngine> engine;

    public Input<DatabaseTypeEngine> getEngine() {
        return this.engine == null ? Input.empty() : this.engine;
    }

    /**
     * The database provider.
     * 
     */
    @InputImport(name="provider")
    private final @Nullable Input<DatabaseTypeProvider> provider;

    public Input<DatabaseTypeProvider> getProvider() {
        return this.provider == null ? Input.empty() : this.provider;
    }

    public DatabaseTypeArgs(
        @Nullable Input<DatabaseTypeEngine> engine,
        @Nullable Input<DatabaseTypeProvider> provider) {
        this.engine = engine;
        this.provider = provider;
    }

    private DatabaseTypeArgs() {
        this.engine = Input.empty();
        this.provider = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatabaseTypeEngine> engine;
        private @Nullable Input<DatabaseTypeProvider> provider;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.engine = defaults.engine;
    	      this.provider = defaults.provider;
        }

        public Builder setEngine(@Nullable Input<DatabaseTypeEngine> engine) {
            this.engine = engine;
            return this;
        }

        public Builder setEngine(@Nullable DatabaseTypeEngine engine) {
            this.engine = Input.ofNullable(engine);
            return this;
        }

        public Builder setProvider(@Nullable Input<DatabaseTypeProvider> provider) {
            this.provider = provider;
            return this;
        }

        public Builder setProvider(@Nullable DatabaseTypeProvider provider) {
            this.provider = Input.ofNullable(provider);
            return this;
        }

        public DatabaseTypeArgs build() {
            return new DatabaseTypeArgs(engine, provider);
        }
    }
}
