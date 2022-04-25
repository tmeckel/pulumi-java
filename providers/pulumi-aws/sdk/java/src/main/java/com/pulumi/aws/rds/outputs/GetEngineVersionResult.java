// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetEngineVersionResult {
    /**
     * @return The default character set for new instances of this engine version.
     * 
     */
    private final String defaultCharacterSet;
    private final String engine;
    /**
     * @return The description of the database engine.
     * 
     */
    private final String engineDescription;
    /**
     * @return Set of log types that the database engine has available for export to CloudWatch Logs.
     * 
     */
    private final List<String> exportableLogTypes;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String parameterGroupFamily;
    private final @Nullable List<String> preferredVersions;
    /**
     * @return The status of the DB engine version, either available or deprecated.
     * 
     */
    private final String status;
    /**
     * @return Set of the character sets supported by this engine.
     * 
     */
    private final List<String> supportedCharacterSets;
    /**
     * @return Set of features supported by the DB engine.
     * 
     */
    private final List<String> supportedFeatureNames;
    /**
     * @return Set of the supported DB engine modes.
     * 
     */
    private final List<String> supportedModes;
    /**
     * @return Set of the time zones supported by this engine.
     * 
     */
    private final List<String> supportedTimezones;
    /**
     * @return Indicates whether you can use Aurora global databases with a specific DB engine version.
     * 
     */
    private final Boolean supportsGlobalDatabases;
    /**
     * @return Indicates whether the engine version supports exporting the log types specified by `exportable_log_types` to CloudWatch Logs.
     * 
     */
    private final Boolean supportsLogExportsToCloudwatch;
    /**
     * @return Indicates whether you can use Aurora parallel query with a specific DB engine version.
     * 
     */
    private final Boolean supportsParallelQuery;
    /**
     * @return Indicates whether the database engine version supports read replicas.
     * 
     */
    private final Boolean supportsReadReplica;
    /**
     * @return Set of engine versions that this database engine version can be upgraded to.
     * 
     */
    private final List<String> validUpgradeTargets;
    private final String version;
    /**
     * @return The description of the database engine version.
     * 
     */
    private final String versionDescription;

    @CustomType.Constructor
    private GetEngineVersionResult(
        @CustomType.Parameter("defaultCharacterSet") String defaultCharacterSet,
        @CustomType.Parameter("engine") String engine,
        @CustomType.Parameter("engineDescription") String engineDescription,
        @CustomType.Parameter("exportableLogTypes") List<String> exportableLogTypes,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("parameterGroupFamily") String parameterGroupFamily,
        @CustomType.Parameter("preferredVersions") @Nullable List<String> preferredVersions,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("supportedCharacterSets") List<String> supportedCharacterSets,
        @CustomType.Parameter("supportedFeatureNames") List<String> supportedFeatureNames,
        @CustomType.Parameter("supportedModes") List<String> supportedModes,
        @CustomType.Parameter("supportedTimezones") List<String> supportedTimezones,
        @CustomType.Parameter("supportsGlobalDatabases") Boolean supportsGlobalDatabases,
        @CustomType.Parameter("supportsLogExportsToCloudwatch") Boolean supportsLogExportsToCloudwatch,
        @CustomType.Parameter("supportsParallelQuery") Boolean supportsParallelQuery,
        @CustomType.Parameter("supportsReadReplica") Boolean supportsReadReplica,
        @CustomType.Parameter("validUpgradeTargets") List<String> validUpgradeTargets,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("versionDescription") String versionDescription) {
        this.defaultCharacterSet = defaultCharacterSet;
        this.engine = engine;
        this.engineDescription = engineDescription;
        this.exportableLogTypes = exportableLogTypes;
        this.id = id;
        this.parameterGroupFamily = parameterGroupFamily;
        this.preferredVersions = preferredVersions;
        this.status = status;
        this.supportedCharacterSets = supportedCharacterSets;
        this.supportedFeatureNames = supportedFeatureNames;
        this.supportedModes = supportedModes;
        this.supportedTimezones = supportedTimezones;
        this.supportsGlobalDatabases = supportsGlobalDatabases;
        this.supportsLogExportsToCloudwatch = supportsLogExportsToCloudwatch;
        this.supportsParallelQuery = supportsParallelQuery;
        this.supportsReadReplica = supportsReadReplica;
        this.validUpgradeTargets = validUpgradeTargets;
        this.version = version;
        this.versionDescription = versionDescription;
    }

    /**
     * @return The default character set for new instances of this engine version.
     * 
     */
    public String defaultCharacterSet() {
        return this.defaultCharacterSet;
    }
    public String engine() {
        return this.engine;
    }
    /**
     * @return The description of the database engine.
     * 
     */
    public String engineDescription() {
        return this.engineDescription;
    }
    /**
     * @return Set of log types that the database engine has available for export to CloudWatch Logs.
     * 
     */
    public List<String> exportableLogTypes() {
        return this.exportableLogTypes;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String parameterGroupFamily() {
        return this.parameterGroupFamily;
    }
    public List<String> preferredVersions() {
        return this.preferredVersions == null ? List.of() : this.preferredVersions;
    }
    /**
     * @return The status of the DB engine version, either available or deprecated.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Set of the character sets supported by this engine.
     * 
     */
    public List<String> supportedCharacterSets() {
        return this.supportedCharacterSets;
    }
    /**
     * @return Set of features supported by the DB engine.
     * 
     */
    public List<String> supportedFeatureNames() {
        return this.supportedFeatureNames;
    }
    /**
     * @return Set of the supported DB engine modes.
     * 
     */
    public List<String> supportedModes() {
        return this.supportedModes;
    }
    /**
     * @return Set of the time zones supported by this engine.
     * 
     */
    public List<String> supportedTimezones() {
        return this.supportedTimezones;
    }
    /**
     * @return Indicates whether you can use Aurora global databases with a specific DB engine version.
     * 
     */
    public Boolean supportsGlobalDatabases() {
        return this.supportsGlobalDatabases;
    }
    /**
     * @return Indicates whether the engine version supports exporting the log types specified by `exportable_log_types` to CloudWatch Logs.
     * 
     */
    public Boolean supportsLogExportsToCloudwatch() {
        return this.supportsLogExportsToCloudwatch;
    }
    /**
     * @return Indicates whether you can use Aurora parallel query with a specific DB engine version.
     * 
     */
    public Boolean supportsParallelQuery() {
        return this.supportsParallelQuery;
    }
    /**
     * @return Indicates whether the database engine version supports read replicas.
     * 
     */
    public Boolean supportsReadReplica() {
        return this.supportsReadReplica;
    }
    /**
     * @return Set of engine versions that this database engine version can be upgraded to.
     * 
     */
    public List<String> validUpgradeTargets() {
        return this.validUpgradeTargets;
    }
    public String version() {
        return this.version;
    }
    /**
     * @return The description of the database engine version.
     * 
     */
    public String versionDescription() {
        return this.versionDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEngineVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultCharacterSet;
        private String engine;
        private String engineDescription;
        private List<String> exportableLogTypes;
        private String id;
        private String parameterGroupFamily;
        private @Nullable List<String> preferredVersions;
        private String status;
        private List<String> supportedCharacterSets;
        private List<String> supportedFeatureNames;
        private List<String> supportedModes;
        private List<String> supportedTimezones;
        private Boolean supportsGlobalDatabases;
        private Boolean supportsLogExportsToCloudwatch;
        private Boolean supportsParallelQuery;
        private Boolean supportsReadReplica;
        private List<String> validUpgradeTargets;
        private String version;
        private String versionDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEngineVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultCharacterSet = defaults.defaultCharacterSet;
    	      this.engine = defaults.engine;
    	      this.engineDescription = defaults.engineDescription;
    	      this.exportableLogTypes = defaults.exportableLogTypes;
    	      this.id = defaults.id;
    	      this.parameterGroupFamily = defaults.parameterGroupFamily;
    	      this.preferredVersions = defaults.preferredVersions;
    	      this.status = defaults.status;
    	      this.supportedCharacterSets = defaults.supportedCharacterSets;
    	      this.supportedFeatureNames = defaults.supportedFeatureNames;
    	      this.supportedModes = defaults.supportedModes;
    	      this.supportedTimezones = defaults.supportedTimezones;
    	      this.supportsGlobalDatabases = defaults.supportsGlobalDatabases;
    	      this.supportsLogExportsToCloudwatch = defaults.supportsLogExportsToCloudwatch;
    	      this.supportsParallelQuery = defaults.supportsParallelQuery;
    	      this.supportsReadReplica = defaults.supportsReadReplica;
    	      this.validUpgradeTargets = defaults.validUpgradeTargets;
    	      this.version = defaults.version;
    	      this.versionDescription = defaults.versionDescription;
        }

        public Builder defaultCharacterSet(String defaultCharacterSet) {
            this.defaultCharacterSet = Objects.requireNonNull(defaultCharacterSet);
            return this;
        }
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        public Builder engineDescription(String engineDescription) {
            this.engineDescription = Objects.requireNonNull(engineDescription);
            return this;
        }
        public Builder exportableLogTypes(List<String> exportableLogTypes) {
            this.exportableLogTypes = Objects.requireNonNull(exportableLogTypes);
            return this;
        }
        public Builder exportableLogTypes(String... exportableLogTypes) {
            return exportableLogTypes(List.of(exportableLogTypes));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder parameterGroupFamily(String parameterGroupFamily) {
            this.parameterGroupFamily = Objects.requireNonNull(parameterGroupFamily);
            return this;
        }
        public Builder preferredVersions(@Nullable List<String> preferredVersions) {
            this.preferredVersions = preferredVersions;
            return this;
        }
        public Builder preferredVersions(String... preferredVersions) {
            return preferredVersions(List.of(preferredVersions));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder supportedCharacterSets(List<String> supportedCharacterSets) {
            this.supportedCharacterSets = Objects.requireNonNull(supportedCharacterSets);
            return this;
        }
        public Builder supportedCharacterSets(String... supportedCharacterSets) {
            return supportedCharacterSets(List.of(supportedCharacterSets));
        }
        public Builder supportedFeatureNames(List<String> supportedFeatureNames) {
            this.supportedFeatureNames = Objects.requireNonNull(supportedFeatureNames);
            return this;
        }
        public Builder supportedFeatureNames(String... supportedFeatureNames) {
            return supportedFeatureNames(List.of(supportedFeatureNames));
        }
        public Builder supportedModes(List<String> supportedModes) {
            this.supportedModes = Objects.requireNonNull(supportedModes);
            return this;
        }
        public Builder supportedModes(String... supportedModes) {
            return supportedModes(List.of(supportedModes));
        }
        public Builder supportedTimezones(List<String> supportedTimezones) {
            this.supportedTimezones = Objects.requireNonNull(supportedTimezones);
            return this;
        }
        public Builder supportedTimezones(String... supportedTimezones) {
            return supportedTimezones(List.of(supportedTimezones));
        }
        public Builder supportsGlobalDatabases(Boolean supportsGlobalDatabases) {
            this.supportsGlobalDatabases = Objects.requireNonNull(supportsGlobalDatabases);
            return this;
        }
        public Builder supportsLogExportsToCloudwatch(Boolean supportsLogExportsToCloudwatch) {
            this.supportsLogExportsToCloudwatch = Objects.requireNonNull(supportsLogExportsToCloudwatch);
            return this;
        }
        public Builder supportsParallelQuery(Boolean supportsParallelQuery) {
            this.supportsParallelQuery = Objects.requireNonNull(supportsParallelQuery);
            return this;
        }
        public Builder supportsReadReplica(Boolean supportsReadReplica) {
            this.supportsReadReplica = Objects.requireNonNull(supportsReadReplica);
            return this;
        }
        public Builder validUpgradeTargets(List<String> validUpgradeTargets) {
            this.validUpgradeTargets = Objects.requireNonNull(validUpgradeTargets);
            return this;
        }
        public Builder validUpgradeTargets(String... validUpgradeTargets) {
            return validUpgradeTargets(List.of(validUpgradeTargets));
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder versionDescription(String versionDescription) {
            this.versionDescription = Objects.requireNonNull(versionDescription);
            return this;
        }        public GetEngineVersionResult build() {
            return new GetEngineVersionResult(defaultCharacterSet, engine, engineDescription, exportableLogTypes, id, parameterGroupFamily, preferredVersions, status, supportedCharacterSets, supportedFeatureNames, supportedModes, supportedTimezones, supportsGlobalDatabases, supportsLogExportsToCloudwatch, supportsParallelQuery, supportsReadReplica, validUpgradeTargets, version, versionDescription);
        }
    }
}
