// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.outputs;

import com.pulumi.azurenative.netapp.outputs.ReplicationObjectResponse;
import com.pulumi.azurenative.netapp.outputs.VolumeBackupPropertiesResponse;
import com.pulumi.azurenative.netapp.outputs.VolumeSnapshotPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumePropertiesResponseDataProtection {
    /**
     * @return Backup Properties
     * 
     */
    private final @Nullable VolumeBackupPropertiesResponse backup;
    /**
     * @return Replication properties
     * 
     */
    private final @Nullable ReplicationObjectResponse replication;
    /**
     * @return Snapshot properties.
     * 
     */
    private final @Nullable VolumeSnapshotPropertiesResponse snapshot;

    @CustomType.Constructor
    private VolumePropertiesResponseDataProtection(
        @CustomType.Parameter("backup") @Nullable VolumeBackupPropertiesResponse backup,
        @CustomType.Parameter("replication") @Nullable ReplicationObjectResponse replication,
        @CustomType.Parameter("snapshot") @Nullable VolumeSnapshotPropertiesResponse snapshot) {
        this.backup = backup;
        this.replication = replication;
        this.snapshot = snapshot;
    }

    /**
     * @return Backup Properties
     * 
     */
    public Optional<VolumeBackupPropertiesResponse> backup() {
        return Optional.ofNullable(this.backup);
    }
    /**
     * @return Replication properties
     * 
     */
    public Optional<ReplicationObjectResponse> replication() {
        return Optional.ofNullable(this.replication);
    }
    /**
     * @return Snapshot properties.
     * 
     */
    public Optional<VolumeSnapshotPropertiesResponse> snapshot() {
        return Optional.ofNullable(this.snapshot);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumePropertiesResponseDataProtection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VolumeBackupPropertiesResponse backup;
        private @Nullable ReplicationObjectResponse replication;
        private @Nullable VolumeSnapshotPropertiesResponse snapshot;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumePropertiesResponseDataProtection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backup = defaults.backup;
    	      this.replication = defaults.replication;
    	      this.snapshot = defaults.snapshot;
        }

        public Builder backup(@Nullable VolumeBackupPropertiesResponse backup) {
            this.backup = backup;
            return this;
        }
        public Builder replication(@Nullable ReplicationObjectResponse replication) {
            this.replication = replication;
            return this;
        }
        public Builder snapshot(@Nullable VolumeSnapshotPropertiesResponse snapshot) {
            this.snapshot = snapshot;
            return this;
        }        public VolumePropertiesResponseDataProtection build() {
            return new VolumePropertiesResponseDataProtection(backup, replication, snapshot);
        }
    }
}
