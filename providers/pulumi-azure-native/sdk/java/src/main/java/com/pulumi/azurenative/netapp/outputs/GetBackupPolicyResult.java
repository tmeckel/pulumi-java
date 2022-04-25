// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.outputs;

import com.pulumi.azurenative.netapp.outputs.VolumeBackupsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBackupPolicyResult {
    /**
     * @return Daily backups count to keep
     * 
     */
    private final @Nullable Integer dailyBackupsToKeep;
    /**
     * @return The property to decide policy is enabled or not
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return Resource location
     * 
     */
    private final String location;
    /**
     * @return Monthly backups count to keep
     * 
     */
    private final @Nullable Integer monthlyBackupsToKeep;
    /**
     * @return Name of backup policy
     * 
     */
    private final String name;
    /**
     * @return Azure lifecycle management
     * 
     */
    private final String provisioningState;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type
     * 
     */
    private final String type;
    /**
     * @return A list of volumes assigned to this policy
     * 
     */
    private final @Nullable List<VolumeBackupsResponse> volumeBackups;
    /**
     * @return Volumes using current backup policy
     * 
     */
    private final @Nullable Integer volumesAssigned;
    /**
     * @return Weekly backups count to keep
     * 
     */
    private final @Nullable Integer weeklyBackupsToKeep;
    /**
     * @return Yearly backups count to keep
     * 
     */
    private final @Nullable Integer yearlyBackupsToKeep;

    @CustomType.Constructor
    private GetBackupPolicyResult(
        @CustomType.Parameter("dailyBackupsToKeep") @Nullable Integer dailyBackupsToKeep,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("monthlyBackupsToKeep") @Nullable Integer monthlyBackupsToKeep,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("volumeBackups") @Nullable List<VolumeBackupsResponse> volumeBackups,
        @CustomType.Parameter("volumesAssigned") @Nullable Integer volumesAssigned,
        @CustomType.Parameter("weeklyBackupsToKeep") @Nullable Integer weeklyBackupsToKeep,
        @CustomType.Parameter("yearlyBackupsToKeep") @Nullable Integer yearlyBackupsToKeep) {
        this.dailyBackupsToKeep = dailyBackupsToKeep;
        this.enabled = enabled;
        this.id = id;
        this.location = location;
        this.monthlyBackupsToKeep = monthlyBackupsToKeep;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
        this.volumeBackups = volumeBackups;
        this.volumesAssigned = volumesAssigned;
        this.weeklyBackupsToKeep = weeklyBackupsToKeep;
        this.yearlyBackupsToKeep = yearlyBackupsToKeep;
    }

    /**
     * @return Daily backups count to keep
     * 
     */
    public Optional<Integer> dailyBackupsToKeep() {
        return Optional.ofNullable(this.dailyBackupsToKeep);
    }
    /**
     * @return The property to decide policy is enabled or not
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource location
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Monthly backups count to keep
     * 
     */
    public Optional<Integer> monthlyBackupsToKeep() {
        return Optional.ofNullable(this.monthlyBackupsToKeep);
    }
    /**
     * @return Name of backup policy
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Azure lifecycle management
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return A list of volumes assigned to this policy
     * 
     */
    public List<VolumeBackupsResponse> volumeBackups() {
        return this.volumeBackups == null ? List.of() : this.volumeBackups;
    }
    /**
     * @return Volumes using current backup policy
     * 
     */
    public Optional<Integer> volumesAssigned() {
        return Optional.ofNullable(this.volumesAssigned);
    }
    /**
     * @return Weekly backups count to keep
     * 
     */
    public Optional<Integer> weeklyBackupsToKeep() {
        return Optional.ofNullable(this.weeklyBackupsToKeep);
    }
    /**
     * @return Yearly backups count to keep
     * 
     */
    public Optional<Integer> yearlyBackupsToKeep() {
        return Optional.ofNullable(this.yearlyBackupsToKeep);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer dailyBackupsToKeep;
        private @Nullable Boolean enabled;
        private String id;
        private String location;
        private @Nullable Integer monthlyBackupsToKeep;
        private String name;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<VolumeBackupsResponse> volumeBackups;
        private @Nullable Integer volumesAssigned;
        private @Nullable Integer weeklyBackupsToKeep;
        private @Nullable Integer yearlyBackupsToKeep;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyBackupsToKeep = defaults.dailyBackupsToKeep;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.monthlyBackupsToKeep = defaults.monthlyBackupsToKeep;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.volumeBackups = defaults.volumeBackups;
    	      this.volumesAssigned = defaults.volumesAssigned;
    	      this.weeklyBackupsToKeep = defaults.weeklyBackupsToKeep;
    	      this.yearlyBackupsToKeep = defaults.yearlyBackupsToKeep;
        }

        public Builder dailyBackupsToKeep(@Nullable Integer dailyBackupsToKeep) {
            this.dailyBackupsToKeep = dailyBackupsToKeep;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder monthlyBackupsToKeep(@Nullable Integer monthlyBackupsToKeep) {
            this.monthlyBackupsToKeep = monthlyBackupsToKeep;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder volumeBackups(@Nullable List<VolumeBackupsResponse> volumeBackups) {
            this.volumeBackups = volumeBackups;
            return this;
        }
        public Builder volumeBackups(VolumeBackupsResponse... volumeBackups) {
            return volumeBackups(List.of(volumeBackups));
        }
        public Builder volumesAssigned(@Nullable Integer volumesAssigned) {
            this.volumesAssigned = volumesAssigned;
            return this;
        }
        public Builder weeklyBackupsToKeep(@Nullable Integer weeklyBackupsToKeep) {
            this.weeklyBackupsToKeep = weeklyBackupsToKeep;
            return this;
        }
        public Builder yearlyBackupsToKeep(@Nullable Integer yearlyBackupsToKeep) {
            this.yearlyBackupsToKeep = yearlyBackupsToKeep;
            return this;
        }        public GetBackupPolicyResult build() {
            return new GetBackupPolicyResult(dailyBackupsToKeep, enabled, id, location, monthlyBackupsToKeep, name, provisioningState, tags, type, volumeBackups, volumesAssigned, weeklyBackupsToKeep, yearlyBackupsToKeep);
        }
    }
}
