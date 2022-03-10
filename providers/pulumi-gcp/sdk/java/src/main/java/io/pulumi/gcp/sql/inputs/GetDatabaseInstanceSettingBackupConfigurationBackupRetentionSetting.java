// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting Empty = new GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting();

    @InputImport(name="retainedBackups", required=true)
      private final Integer retainedBackups;

    public Integer getRetainedBackups() {
        return this.retainedBackups;
    }

    @InputImport(name="retentionUnit", required=true)
      private final String retentionUnit;

    public String getRetentionUnit() {
        return this.retentionUnit;
    }

    public GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting(
        Integer retainedBackups,
        String retentionUnit) {
        this.retainedBackups = Objects.requireNonNull(retainedBackups, "expected parameter 'retainedBackups' to be non-null");
        this.retentionUnit = Objects.requireNonNull(retentionUnit, "expected parameter 'retentionUnit' to be non-null");
    }

    private GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting() {
        this.retainedBackups = null;
        this.retentionUnit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer retainedBackups;
        private String retentionUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retainedBackups = defaults.retainedBackups;
    	      this.retentionUnit = defaults.retentionUnit;
        }

        public Builder retainedBackups(Integer retainedBackups) {
            this.retainedBackups = Objects.requireNonNull(retainedBackups);
            return this;
        }

        public Builder retentionUnit(String retentionUnit) {
            this.retentionUnit = Objects.requireNonNull(retentionUnit);
            return this;
        }
        public GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting build() {
            return new GetDatabaseInstanceSettingBackupConfigurationBackupRetentionSetting(retainedBackups, retentionUnit);
        }
    }
}
