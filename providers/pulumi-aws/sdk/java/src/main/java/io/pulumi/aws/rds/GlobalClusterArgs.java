// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalClusterArgs Empty = new GlobalClusterArgs();

    /**
     * Name for an automatically created database on cluster creation.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Codegen.empty() : this.databaseName;
    }

    /**
     * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Codegen.empty() : this.deletionProtection;
    }

    /**
     * Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Valid values: `aurora`, `aurora-mysql`, `aurora-postgresql`. Defaults to `aurora`. Conflicts with `source_db_cluster_identifier`.
     * 
     */
    @Import(name="engine")
      private final @Nullable Output<String> engine;

    public Output<String> getEngine() {
        return this.engine == null ? Codegen.empty() : this.engine;
    }

    /**
     * Engine version of the Aurora global database.
     * * **NOTE:** When the engine is set to `aurora-mysql`, an engine version compatible with global database is required. The earliest available version is `5.7.mysql_aurora.2.06.0`.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> getEngineVersion() {
        return this.engineVersion == null ? Codegen.empty() : this.engineVersion;
    }

    /**
     * Enable to remove DB Cluster members from Global Cluster on destroy. Required with `source_db_cluster_identifier`.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Codegen.empty() : this.forceDestroy;
    }

    /**
     * The global cluster identifier.
     * 
     */
    @Import(name="globalClusterIdentifier", required=true)
      private final Output<String> globalClusterIdentifier;

    public Output<String> getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
     * 
     */
    @Import(name="sourceDbClusterIdentifier")
      private final @Nullable Output<String> sourceDbClusterIdentifier;

    public Output<String> getSourceDbClusterIdentifier() {
        return this.sourceDbClusterIdentifier == null ? Codegen.empty() : this.sourceDbClusterIdentifier;
    }

    /**
     * Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="storageEncrypted")
      private final @Nullable Output<Boolean> storageEncrypted;

    public Output<Boolean> getStorageEncrypted() {
        return this.storageEncrypted == null ? Codegen.empty() : this.storageEncrypted;
    }

    public GlobalClusterArgs(
        @Nullable Output<String> databaseName,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<String> engine,
        @Nullable Output<String> engineVersion,
        @Nullable Output<Boolean> forceDestroy,
        Output<String> globalClusterIdentifier,
        @Nullable Output<String> sourceDbClusterIdentifier,
        @Nullable Output<Boolean> storageEncrypted) {
        this.databaseName = databaseName;
        this.deletionProtection = deletionProtection;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.forceDestroy = forceDestroy;
        this.globalClusterIdentifier = Objects.requireNonNull(globalClusterIdentifier, "expected parameter 'globalClusterIdentifier' to be non-null");
        this.sourceDbClusterIdentifier = sourceDbClusterIdentifier;
        this.storageEncrypted = storageEncrypted;
    }

    private GlobalClusterArgs() {
        this.databaseName = Codegen.empty();
        this.deletionProtection = Codegen.empty();
        this.engine = Codegen.empty();
        this.engineVersion = Codegen.empty();
        this.forceDestroy = Codegen.empty();
        this.globalClusterIdentifier = Codegen.empty();
        this.sourceDbClusterIdentifier = Codegen.empty();
        this.storageEncrypted = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> databaseName;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<String> engine;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<Boolean> forceDestroy;
        private Output<String> globalClusterIdentifier;
        private @Nullable Output<String> sourceDbClusterIdentifier;
        private @Nullable Output<Boolean> storageEncrypted;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.globalClusterIdentifier = defaults.globalClusterIdentifier;
    	      this.sourceDbClusterIdentifier = defaults.sourceDbClusterIdentifier;
    	      this.storageEncrypted = defaults.storageEncrypted;
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Codegen.ofNullable(databaseName);
            return this;
        }
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Codegen.ofNullable(deletionProtection);
            return this;
        }
        public Builder engine(@Nullable Output<String> engine) {
            this.engine = engine;
            return this;
        }
        public Builder engine(@Nullable String engine) {
            this.engine = Codegen.ofNullable(engine);
            return this;
        }
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = Codegen.ofNullable(engineVersion);
            return this;
        }
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Codegen.ofNullable(forceDestroy);
            return this;
        }
        public Builder globalClusterIdentifier(Output<String> globalClusterIdentifier) {
            this.globalClusterIdentifier = Objects.requireNonNull(globalClusterIdentifier);
            return this;
        }
        public Builder globalClusterIdentifier(String globalClusterIdentifier) {
            this.globalClusterIdentifier = Output.of(Objects.requireNonNull(globalClusterIdentifier));
            return this;
        }
        public Builder sourceDbClusterIdentifier(@Nullable Output<String> sourceDbClusterIdentifier) {
            this.sourceDbClusterIdentifier = sourceDbClusterIdentifier;
            return this;
        }
        public Builder sourceDbClusterIdentifier(@Nullable String sourceDbClusterIdentifier) {
            this.sourceDbClusterIdentifier = Codegen.ofNullable(sourceDbClusterIdentifier);
            return this;
        }
        public Builder storageEncrypted(@Nullable Output<Boolean> storageEncrypted) {
            this.storageEncrypted = storageEncrypted;
            return this;
        }
        public Builder storageEncrypted(@Nullable Boolean storageEncrypted) {
            this.storageEncrypted = Codegen.ofNullable(storageEncrypted);
            return this;
        }        public GlobalClusterArgs build() {
            return new GlobalClusterArgs(databaseName, deletionProtection, engine, engineVersion, forceDestroy, globalClusterIdentifier, sourceDbClusterIdentifier, storageEncrypted);
        }
    }
}
