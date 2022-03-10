// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


public final class BackupPlanAdvancedBackupSettingResourceType extends io.pulumi.resources.InvokeArgs {

    public static final BackupPlanAdvancedBackupSettingResourceType Empty = new BackupPlanAdvancedBackupSettingResourceType();

    @InputImport(name="backupOptions", required=true)
      private final Object backupOptions;

    public Object getBackupOptions() {
        return this.backupOptions;
    }

    @InputImport(name="resourceType", required=true)
      private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    public BackupPlanAdvancedBackupSettingResourceType(
        Object backupOptions,
        String resourceType) {
        this.backupOptions = Objects.requireNonNull(backupOptions, "expected parameter 'backupOptions' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private BackupPlanAdvancedBackupSettingResourceType() {
        this.backupOptions = null;
        this.resourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanAdvancedBackupSettingResourceType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object backupOptions;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPlanAdvancedBackupSettingResourceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupOptions = defaults.backupOptions;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder backupOptions(Object backupOptions) {
            this.backupOptions = Objects.requireNonNull(backupOptions);
            return this;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public BackupPlanAdvancedBackupSettingResourceType build() {
            return new BackupPlanAdvancedBackupSettingResourceType(backupOptions, resourceType);
        }
    }
}
