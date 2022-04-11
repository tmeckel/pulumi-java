// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.datastream_v1.inputs.MysqlSourceConfigArgs;
import io.pulumi.googlenative.datastream_v1.inputs.OracleSourceConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration of the stream source.
 * 
 */
public final class SourceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceConfigArgs Empty = new SourceConfigArgs();

    /**
     * MySQL data source configuration
     * 
     */
    @Import(name="mysqlSourceConfig")
      private final @Nullable Output<MysqlSourceConfigArgs> mysqlSourceConfig;

    public Output<MysqlSourceConfigArgs> getMysqlSourceConfig() {
        return this.mysqlSourceConfig == null ? Codegen.empty() : this.mysqlSourceConfig;
    }

    /**
     * Oracle data source configuration
     * 
     */
    @Import(name="oracleSourceConfig")
      private final @Nullable Output<OracleSourceConfigArgs> oracleSourceConfig;

    public Output<OracleSourceConfigArgs> getOracleSourceConfig() {
        return this.oracleSourceConfig == null ? Codegen.empty() : this.oracleSourceConfig;
    }

    /**
     * Source connection profile resoource. Format: `projects/{project}/locations/{location}/connectionProfiles/{name}`
     * 
     */
    @Import(name="sourceConnectionProfile", required=true)
      private final Output<String> sourceConnectionProfile;

    public Output<String> getSourceConnectionProfile() {
        return this.sourceConnectionProfile;
    }

    public SourceConfigArgs(
        @Nullable Output<MysqlSourceConfigArgs> mysqlSourceConfig,
        @Nullable Output<OracleSourceConfigArgs> oracleSourceConfig,
        Output<String> sourceConnectionProfile) {
        this.mysqlSourceConfig = mysqlSourceConfig;
        this.oracleSourceConfig = oracleSourceConfig;
        this.sourceConnectionProfile = Objects.requireNonNull(sourceConnectionProfile, "expected parameter 'sourceConnectionProfile' to be non-null");
    }

    private SourceConfigArgs() {
        this.mysqlSourceConfig = Codegen.empty();
        this.oracleSourceConfig = Codegen.empty();
        this.sourceConnectionProfile = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MysqlSourceConfigArgs> mysqlSourceConfig;
        private @Nullable Output<OracleSourceConfigArgs> oracleSourceConfig;
        private Output<String> sourceConnectionProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlSourceConfig = defaults.mysqlSourceConfig;
    	      this.oracleSourceConfig = defaults.oracleSourceConfig;
    	      this.sourceConnectionProfile = defaults.sourceConnectionProfile;
        }

        public Builder mysqlSourceConfig(@Nullable Output<MysqlSourceConfigArgs> mysqlSourceConfig) {
            this.mysqlSourceConfig = mysqlSourceConfig;
            return this;
        }
        public Builder mysqlSourceConfig(@Nullable MysqlSourceConfigArgs mysqlSourceConfig) {
            this.mysqlSourceConfig = Codegen.ofNullable(mysqlSourceConfig);
            return this;
        }
        public Builder oracleSourceConfig(@Nullable Output<OracleSourceConfigArgs> oracleSourceConfig) {
            this.oracleSourceConfig = oracleSourceConfig;
            return this;
        }
        public Builder oracleSourceConfig(@Nullable OracleSourceConfigArgs oracleSourceConfig) {
            this.oracleSourceConfig = Codegen.ofNullable(oracleSourceConfig);
            return this;
        }
        public Builder sourceConnectionProfile(Output<String> sourceConnectionProfile) {
            this.sourceConnectionProfile = Objects.requireNonNull(sourceConnectionProfile);
            return this;
        }
        public Builder sourceConnectionProfile(String sourceConnectionProfile) {
            this.sourceConnectionProfile = Output.of(Objects.requireNonNull(sourceConnectionProfile));
            return this;
        }        public SourceConfigArgs build() {
            return new SourceConfigArgs(mysqlSourceConfig, oracleSourceConfig, sourceConnectionProfile);
        }
    }
}
